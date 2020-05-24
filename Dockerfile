
# Source Image name
from openjdk:8
#
add target/helloworldubuntu.jar
#
expose 8085
#
entrypoint ["java", "-jar", "helloworldubuntu.jar"]
