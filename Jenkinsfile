#!/usr/bin/env groovy

library identifier: 'jenkins-shared-library@master', retriever: modernSCM(
        [$class: 'GitSCMSource',
         remote: 'https://github.com/sulemanfazal12/jenkins-shared-library',
         credentialsId: 'jenkins-githib-tokens'
        ]
)


def gv

pipeline {
    agent any
    tools {
        maven 'maven-3.9.2'
    }
    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage("build jar") {
            steps {
                script {
                    buildJar()
                }
            }
        }
        stage("build and push image") {
            steps {
                script {
                    buildImage 'nanajanashia/demo-app:jma-3.0'
                    dockerLogin()
                    dockerPush 'nanajanashia/demo-app:jma-3.0'
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}
