
def dockeruser = "sene12345"
def imagename = "helloworldubuntu"
def container = "helloworldubuntuContainer"
node {
   echo 'Building Apache Docker Image'

stage('Git Checkout') {
    git 'https://github.com/sceee-iscteiul/ES2-2020-EIC2-33.git'
    }
    
stage('Build Docker Imagae'){
     powershell "docker build -t  ${imagename} ."
    }
   
   stage ('Runing Container to test built Docker Image'){
    powershell "docker run -d -p 80:8086 --name ${container}  ${imagename}"
    }

}
 
