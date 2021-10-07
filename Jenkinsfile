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
                def COLOR_MAP = ['SUCCESS': 'good', 'FAILURE': 'danger',]

                echo "---Testing Sending Slack Message---"
                slackSend channel: '#jenkins', color: COLOR_MAP[currentBuild.currentResult], message: "*${currentBuild.currentResult}:* Job ${env.JOB_NAME} build ${env.BUILD_NUMBER} by Tania Simpson \n More info at: ${env.BUILD_URL}"
             
            }
        }
    }
}