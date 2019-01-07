#基础镜像
FROM fabric8/java-jboss-openjdk8-jdk
#表示容器访问宿主机目录 /tmp
VOLUME /tmp
#将宿主机文件系统指定目录的文件复制到容器的指定目录下
ADD alipay-bill-tool-1.0-SNAPSHOT.jar app.jar
#执行命令
ENTRYPOINT ["java","-jar","app.jar"]