public class User {
    private String name;
    private int userId;

    public User(int userId, String name) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    public String toString() {
        return "User ID: " + userId + ", Name: " + name;
    }
}
