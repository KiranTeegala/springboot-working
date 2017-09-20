FROM java:8
EXPOSE 9090:9090
ADD /target/springboot-docker.jar springboot-docker.jar 
ENTRYPOINT ["java","-jar","springboot-docker.jar "]
