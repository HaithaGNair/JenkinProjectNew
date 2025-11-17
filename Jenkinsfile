pipeline {
    agent any

    tools {
        maven 'Maven-3.9'
    }

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Package') {
            steps {
                echo "Build and Test Completed!"
            }
        }
    }

    post {
        failure {
            echo "Pipeline Failed!"
        }
        success {
            echo "Pipeline Successful!"
        }
    }
}
