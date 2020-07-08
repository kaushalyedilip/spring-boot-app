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

        stage('compile') {
              steps {
                 withAWS(region:'us-east-1') {
                     s3Upload(file:'/Users/dilipkaushalye/Documents/Projects/beacon-server/client-config
                 /cns-client.json', bucket:'springboard-example',
                     path:'path/to/target/file.txt')
                 }
              }
        }

//         stage('test') {
//             steps {
//                 withMaven(maven: 'Maven-3.5.4') {
//                   sh 'mvn deploy'
//                 }
//             }
//         }


    }
}