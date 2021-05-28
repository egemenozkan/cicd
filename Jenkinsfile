pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
               echo "Building ${env.BUILD_ID} on ${env.JENKINS_URL}"
               sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}