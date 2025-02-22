pipeline {
    agent any
    environment {
        DOCKER_IMAGE_NAME = 'calculator'
        GITHUB_REPO_URL = 'https://github.com/kuldeepchamoli/SPE_MINIPROJECT.git'
        DOCKERHUB_USERNAME = 'kuldeep2026'
        DOCKERHUB_PASSWORD = 'Gurujani@2000'
        LANG = 'en_US.UTF-8'
        LC_ALL = 'en_US.UTF-8'
    }

    stages {
        stage('Check out from the Remote Repository') {
            steps {
                script {
                    git branch: 'main', url: "${GITHUB_REPO_URL}"
                }
            }
        }

        stage('Maven Build') {
                    steps {
                        sh 'mvn clean install'
                    }
                }

        stage('Building Docker Image') {
            steps {
                script {
                    docker.build("${DOCKER_IMAGE_NAME}", '.')
                }
            }
        }

        stage('Login to Dockerhub') {
                    steps {
                        withCredentials([usernamePassword(credentialsId: 'DockerHubCred', passwordVariable: 'DOCKERHUB_PASSWORD', usernameVariable: 'DOCKERHUB_USERNAME')]) {
                            sh "docker login -u ${env.DOCKERHUB_USERNAME} -p ${env.DOCKERHUB_PASSWORD}"
                        }
                    }
                }

        stage('Push the Docker Image from Local') {
            steps {
                script{
                    docker.withRegistry('', 'DockerHubCred') {
                    sh 'docker tag calculator:latest kuldeep2026/calculator:latest'
                    sh 'docker push kuldeep2026/calculator:latest'
                    }
                 }
            }
        }

        stage('Run Ansible Playbook') {
            steps {
                script {
                    ansiblePlaybook(
                        playbook: 'Deploy.yml',
                        inventory: 'inventory.ini'
                     )
                }
            }
        }
    }
    post{
        always{
            mail bcc: '', body: 'Build Status Changed', cc: '', from: '', replyTo: '', subject: 'Build Jenkins Calculator', to: 'kuldeepchamoli889@gmail.com'
        }
    }
}
