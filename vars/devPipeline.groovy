#!/usr/local/bin groovy

def call(String name = 'Sridhar Gakkoju') {
            
//def call (body) {
//    def configParameters = [:]
//    body.resolveStrategy = Closure.DELEGATE_FIRST
//    body.delegate = configParameters
//    body()

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
            
} // end for call statement
