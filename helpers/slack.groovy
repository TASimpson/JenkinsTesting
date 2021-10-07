def runJob() {
    pipeline {
        agent any
        stages {
            stage('Sending Slack Message From Groovy File') {
                steps {
                    echo "---Testing Sending Slack Message---"
                    slackSend channel: '#jenkins', message: 'Hello Again!'
                }
            }
        }
        
        post {
            failure {
                echo "Job Failed"
            }
        }
    }

}

return this