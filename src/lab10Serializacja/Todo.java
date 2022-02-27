package lab10Serializacja;

import com.google.gson.annotations.Expose;

public class Todo {
    @Expose(serialize = false)
    private int userId;
    @Expose
    private int id;
    @Expose
    private String title;
    @Expose(serialize = false)
    private boolean completed;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Todo(int userId, int id, String title, boolean completed) {
        this.userId=userId;
        this.id = id;
        this.title = title;
        this.completed=completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
