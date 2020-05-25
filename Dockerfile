
# Source Image name
FROM java:8-jdk-alpine
#
ADD Project/jars/helloworldubuntu.jar helloworldubuntu.jar
#
EXPOSE 8086
#
entrypoint ["java", "-jar", "Project/jars/helloworldubuntu.jar"]

#CMD java -jar helloworldubuntu.jar

