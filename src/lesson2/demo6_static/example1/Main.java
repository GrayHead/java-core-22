package lesson2.demo6_static.example1;

public class Main {
    public static void main(String[] args) {
        User vasya = User.getInstance("vasya");
        User petya = User.getInstance("petya");
        System.out.println(petya);
    }
}
