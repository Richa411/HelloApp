import java.util.Scanner;

public class HelloApp4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        if (name.trim().isEmpty()) {
            System.out.println("Hello World");
        } else {
            System.out.println("Hello " + name);
        }
    }
}