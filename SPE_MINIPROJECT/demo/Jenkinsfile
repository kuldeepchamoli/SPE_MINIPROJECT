pipeline {
    agent any

    tools {
        maven 'Maven-3.8.8' // Use the exact name set in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                git branch:'main',url: 'https://github.com/kuldeepchamoli/SPE_MINIPROJECT.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
