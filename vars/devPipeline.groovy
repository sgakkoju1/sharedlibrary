#!/usr/local/bin groovy

stage('Build') {
            steps {
                script {
                echo "Build Stage"
                }
            }
        }
        
        stage('Test') {
            steps {
                script {
                echo "Test Stage"
                }
            }
        }
