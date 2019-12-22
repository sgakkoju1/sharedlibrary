#!/usr/local/bin groovy

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
