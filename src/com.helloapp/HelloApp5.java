import java.util.Scanner;

public class HelloApp5 {

    public static void main(String[] args) {

        StringBuilder namesBuilder = new StringBuilder();

        // Case 1: If command-line arguments are provided
        if (args.length > 0) {
            for (String name : args) {
                if (namesBuilder.length() > 0) {
                    namesBuilder.append(", ");
                }
                namesBuilder.append(name);
            }
        } else {
            // Case 2: Take input from user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter names separated by space (or press Enter for default): ");
            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                namesBuilder.append("World");
            } else {
                String[] names = input.split("\\s+");
                for (String name : names) {
                    if (namesBuilder.length() > 0) {
                        namesBuilder.append(", ");
                    }
                    namesBuilder.append(name);
                }
            }

            scanner.close();
        }

        // Final Output
        System.out.println("Hello, " + namesBuilder.toString() + "!");
    }
}