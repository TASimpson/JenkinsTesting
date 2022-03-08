public class Messaging {
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

    Messaging(String status, String message) {
        this.status = status;
        this.message = message;
    }
}

return this