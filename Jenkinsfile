
def dockeruser = "sene12345"
def imagename = "ubuntu:16"
def container = "apache2"
node {
   echo 'Building Apache Docker Image'

stage('Git Checkout') {
    git 'https://github.com/sceee-iscteiul/ES2-2020-EIC2-33.git'
    }
    
stage('Build Docker Imagae'){
     powershell "docker build -t  ${imagename} ."
    }
    
stage('Stop Existing Container'){
     powershell "docker stop ${container}"
    }
    
stage('Remove Existing Container'){
     powershell "docker rm ${container}"
    }
    
stage ('Runing Container to test built Docker Image'){
    powershell "docker run -dit --name ${container} -p 80:80 ${imagename}"
    }
    
stage('Tag Docker Image'){
    powershell "docker tag ${imagename} ${env.dockeruser}/ubuntu:16.04"
    }

stage('Docker Login and Push Image'){
    withCredentials([usernamePassword(credentialsId: '9aecdb86-c78a-46a5-9583-2ddae3514688', passwordVariable: 'dockerpasswd', usernameVariable: 'dockeruser')]) {
    powershell "docker login -u ${dockeruser} -p ${dockerpasswd}"
    }
    powershell "docker push ${dockeruser}/ubuntu:16.04"
    }

}
