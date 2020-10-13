public class Task {

    String taskName;
    String description;
    boolean priority;
    Person person;

    public Task(String taskName, String description, boolean priority, Person person) {
        this(taskName, description);
        this.priority = priority;
        this.person = person;
    }

    public Task(String taskName, String description, boolean priority) {
        this(taskName, description);
        this.priority = priority;
    }

    public Task(String taskName, String description) {
        this.taskName = taskName;
        this.description = description;
    }

    public Task() {
    }

    boolean highPriority(int a) {
        if (a > 0) {
            return true;
        }
        return false;
    }

    boolean mediumPriority(int a) {

        if (a == 0) {
            return true;
        }
        return false;
    }

    boolean lowPriority(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    public void showInfo(String taskName, String description, boolean priority) {
        this.taskName = taskName;
        this.description = description;
        this.priority = priority;
        System.out.println(taskName + " " + description + " " + " " + priority);
    }

    public void showInfo() {
        System.out.println(taskName + " " + description + " " + " " + priority);
    }

    public void showInfo(String taskName, String description) {
        System.out.println(taskName + " " + description);
    }

}
