FROM openjdk:21
EXPOSE 8080
ADD target/k8sdeploy.jar k8sdeploy.jar
ENTRYPOINT ["java","-jar","/k8sdeploy.jar"]