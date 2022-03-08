
public class MessagingType {
    public enum SLACK {
        SUCCESS("good", "worked"),
        FAILURE("danger", "didn't work"),
        WARNING("warning", "almost worked");
    }

    public enum JIRA {
        SUCCESS("green", "worked"),
        FAILURE("red", "didn't work"),
        WARNING("orange", "almost worked");
    }

    private final String status;
    private final String message;

    SLACK(String status, String message) {
        this.status = status;
        this.message = message;
    }

    JIRA(String status, String message) {
        this.status = status;
        this.message = message;
    }
}

void build(String type, String message) {
  switch(type) {
      case Messaging.SLACK.SUCCESS:
      case Messaging.JIRA.SUCCESS:
        success(message)
      break;
  }
}

void success(String message) {
  echo "success"
  switch () {
      case Messageing.SLACK
  }
}

void failure() {
  echo "failure"
}

void warning() {
  echo "warning"
}

void sendMessageToJira(String comment) {
    withEnv(['JIRA_SITE=Siemens BRI']) {
        def input = [body: "${env.JIRA_COMMENT_TRIGGERED_BY} *${currentBuild.getBuildCauses().iterator().next().userName}* ${env.JIRA_COMMENT_RESULTED_IN} \n\n ${comment}"]
        jiraAddComment idOrKey: findJiraIssueIdFromBranch(), input: input
    }
}

void sendMessageToSlack(String color, String message, List fields = []) {
    def attachments = [
      [
        mrkdwn_in: ["title", "text"],
        color: color,
        title: "<$BUILD_URL|${env.SLACK_MESSAGE_BUILD_LINK_TEXT}> - ${env.GIT_BRANCH}",
        text: message,
        fields: fields
      ]
    ]

    slackSend(channel: env.SLACK_DEFAULT_CHANNEL, color:"${color}", attachments: attachments)
}
