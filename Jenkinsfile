def COLOR_MAP = [
    'SUCCESS': 'good', 
    'FAILURE': 'danger',
]

pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                echo "---Testing---"
            }
        }
        stage('Slack it!') {
            steps {
                script{
                    echo "---Dig into slack script---"
                    mainJenkinsFile = load "helpers/slack.groovy"
                    mainJenkinsFile.runJob()                   
                }
            }
        }
    }
}