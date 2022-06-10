pipeline {
    agent any

    stages {
      stage('build') {
        steps {
            withMaven(maven: 'maven3') {
               sh 'mvn clean install'
            }
        }
      }
      
        stage ('Test') {
            steps { 
                sh 'make check || true'
                junit '**/target/*.xml'
            }
        }

    }
}
