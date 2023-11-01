# 采用java官方镜像做为构建镜像
FROM maven:3.6.0-jdk-8-slim AS build

# 设置应用工作目录
WORKDIR /app

# 将所有文件拷贝到容器中
COPY . .

# 编译项目
RUN mvn -s settings.xml -pl core,user clean package

# 采用java官方镜像做为运行时镜像
FROM openjdk:8

# 设置应用工作目录
WORKDIR /app

# 将构建产物拷贝到运行时的工作目录中
COPY --from=build /app/user/target/user.jar ./

# 暴露端口
# 此处端口必须与构建小程序服务端时填写的服务端口和探活端口一致，不然会部署失败
EXPOSE 19083

# 设置时区
RUN ln -snf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && \
    echo Asia/Shanghai > /etc/timezone

# 运行启动命令
CMD java -jar user.jar

