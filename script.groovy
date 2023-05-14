def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-cred', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t sulemanfazal12/demo-app:mvn-app11 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push sulemanfazal12/demo-app:mvn-app11'
    }
} 

def deployApp() {
    echo 'deploying the application..!!!!!!!!!!!!!!!!!'
} 

return this
