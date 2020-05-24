
# Source Image name
from java:8-jdk-alpine
#
add Project/jars/helloworldubuntu.jar helloworldubuntu.jar
#
expose 8085
#
#entrypoint ["java", "-jar", "helloworldubuntu.jar"]
CMD java - jar helloworldubuntu.jar
