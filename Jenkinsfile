pipeline {
    agent { label 'win-agent1'}

    stages {
        stage('Build git maven repo') {
            steps {
                checkout changelog: false, poll: false, scm: scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/HashBob/Temp.git']])
                bat 'mvn clean install'

            }
        }
        stage('Building docker image'){
            steps{
                bat 'docker build -t shreyasbobde01/temp-jenkins-test .'
            }
        }
        stage('Publishing docker image'){
            steps{
                withCredentials([string(credentialsId: '72ba35cd-fbbd-4bf7-830a-d1d520bf1580', variable: 'dockerpass')]) {
                    bat 'docker push shreyasbobde01/temp-jenkins-test'
                }

            }
        }

    }
}
