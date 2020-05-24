
# Source Image name
from openjdk:8
#
add Project/jars/helloworldubuntu.jar helloworldubuntu.jar
#
expose 8085
#
entrypoint ["java", "-jar", "helloworldubuntu.jar"]
