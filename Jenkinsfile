
def dockeruser = "sene12345"
def imagename = "helloworldubuntu"
def container = "helloworldubuntuContainer"

node {
   echo 'Building Apache Docker Image'


stage('Git Checkout') {
    git 'https://github.com/sceee-iscteiul/ES2-2020-EIC2-33.git'
    }
    
    
stage('Build Docker Imagae'){
     powershell "docker build -f Dockerfile -t  ${imagename} ."
    }
   
   
  /** stage('Stop Existing Container'){
     powershell "docker stop ${container}"
    }
    
    
stage('Remove Existing Container'){
     powershell "docker rm ${container}"
    }**/
   
   
   stage ('Runing Container to test built Docker Image'){
    powershell "docker run -dit -p 96:8086 --name ${container}  ${imagename}"
    }

}
 
