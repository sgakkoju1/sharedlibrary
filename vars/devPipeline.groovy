#!/usr/local/bin groovy

//def call(String name = 'Sridhar Gakkoju') {
            
def call(body) {

pipeline {
            agent any
            stages {
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
            }
}
            
}
