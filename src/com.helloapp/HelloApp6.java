public class HelloApp6 {

    public static void main(String[] args) {

        // If no arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Build greeting string
        String result = "Hello, ";

        // Enhanced for loop to append names
        for (String name : args) {
            result += name + ", ";
        }

        // Remove trailing ", " using substring
        result = result.substring(0, result.length() - 2);

        // Print final output
        System.out.println(result);
    }
}