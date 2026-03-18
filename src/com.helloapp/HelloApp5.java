public class HelloApp5 {

    public static void main(String[] args) {

        // Default greeting
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Use enhanced for loop
        StringBuilder names = new StringBuilder();

        for (String name : args) {
            names.append(name).append(", ");
        }

        // Remove last comma and space
        names.setLength(names.length() - 2);

        System.out.println("Hello, " + names + "!");
    }
}