
# Source Image name
from openjdk:8
#
add C:\Users\Bruno\git\proj_es2\Project\target\helloworldubuntu.jar helloworldubuntu.jar
#
expose 8085
#
entrypoint ["java", "-jar", "helloworldubuntu.jar"]
