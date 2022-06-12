package lesson2.demo6_static.example1;

public class User {
    private static User instance;
    private String name;

    private User(String name) {
        this.name = name;
    }

    public static User getInstance(String name) {
        if (instance == null) {
            instance = new User(name);
        }
        return instance;

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
