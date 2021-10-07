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
                slackSend channel: '#jenkins', message: 'Hello There!'
            }
        }
    }
}