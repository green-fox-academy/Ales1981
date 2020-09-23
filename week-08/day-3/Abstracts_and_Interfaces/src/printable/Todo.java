package printable;

public class Todo implements Printable {
    private String task = "Buy milk.";
    private String priority = "high";
    private boolean isDone = true;

    @Override
    public void printAllFields() {
        System.out.println("Task: " + task + " | Priority: " + priority + " | Done: " + isDone);
    }
}
