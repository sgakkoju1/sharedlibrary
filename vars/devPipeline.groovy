#!/usr/local/bin groovy

//def call(String name = 'Sridhar Gakkoju') {
            
def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

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
            
}// end for call statement
