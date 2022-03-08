def COLOR_MAP = ['SUCCESS': 'good', 'FAILURE': 'danger',]

pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                echo "---Testing---"
                script {
                    def here = load "helpers/message_type.groovy"
                    echo "did this work ${here.Messages.MessageType.SLACK}"                    
                }
            }
        }
        // stage('Slack it!') {
        //     steps {
                

        //         echo "---Testing Sending Slack Message---"
        //         slackSend channel: '#jenkins', color: COLOR_MAP[currentBuild.currentResult], message: "*${currentBuild.currentResult}:* Job ${env.JOB_NAME} build ${env.BUILD_NUMBER} by Tania Simpson \n More info at: ${env.BUILD_URL}"
             
        //     }
        // }
    }
}