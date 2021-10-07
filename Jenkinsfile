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
                echo "---Testing Sending Slack Message---"
                slackSend channel: '#jenkins', message: 'Hello From Jenkinsfile!'

                script{
                    echo "---Dig into slack script---"
                    def slackRunner = load "helpers/slack.groovy"
                    slackRunner.slackNotification()                   
                }
            }
        }
    }
}