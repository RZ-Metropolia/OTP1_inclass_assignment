pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/RZ-Metropolia/OTP1_inclass_assignment.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
        stage('Publish Coverage Report') {
            steps {
                jacoco()
            }
        }
    }
    post {
        failure {
            echo 'Pipeline failed!'
        }
    }
}
