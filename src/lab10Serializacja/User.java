package lab10Serializacja;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

public class User {
    @Expose
    private int id;
    @Expose
    private String name;
    @Expose
    private String username;
    @Expose
    private String email;
    @Expose
    private Company company;

    @Expose
    private List<Todo> done = new ArrayList<>();
    @Expose
    private List<Todo> stillTodo = new ArrayList<>();


    public User(int id, String name, String username, String email, Company company) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.company= company;
    }

    public List<Todo> getDone() {
        return done;
    }

    public void setDone(List<Todo> done) {
        this.done = done;
    }

    public List<Todo> getStillTodo() {
        return stillTodo;
    }

    public void setStillTodo(List<Todo> stillTodo) {
        this.stillTodo = stillTodo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
