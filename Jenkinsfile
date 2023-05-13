#!/usr/bin/env groovy

pipeline {
    agent none
    environment {
        NEW_VERSION = '1.3.0'
    }
    stages {
        
        stage('test') {
            steps {
                script {
                    echo "Testing the application..."
                }
            }
        }
        stage('build') {
            when{
                expression {
                    BRANCH_NAME == 'master'
                }
            }
            steps {
                script {
                    echo "Builing version of ${NEW_VERSION}"
                }
            }
        }
        stage('deploy') {
            when{
                expression {
                    BRANCH_NAME == 'master'
                }
            }
            steps {
                script {
                    echo "Deploying the application..."
                }
            }
        }
    }
}
