pipeline {

    agent any

    stages {
        stage('compile') {
           steps {
              withMaven(maven: 'Maven-3.5.4') {
                 sh 'mvn clean compile'
              }
           }
        }

        stage('test') {
            steps {
                withMaven(maven: 'Maven-3.5.4') {
                  sh 'mvn deploy'
                }
            }
        }

    }
}