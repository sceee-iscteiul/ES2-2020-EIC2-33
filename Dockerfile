# Source Image name
FROM java:8-jdk-alpine
#
COPY Project/jars/helloworldubuntu.jar /helloworldubuntu.jar
#
#COPY ./build/libs/Project/helloworldubuntu.jar /usr/app/
#WORKDIR /usr/app
#
EXPOSE 8086
#
entrypoint ["java", "-jar", "helloworldubuntu.jar"]

#CMD java -jar helloworldubuntu.jar

