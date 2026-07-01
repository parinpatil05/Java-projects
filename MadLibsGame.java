import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get words from the user
        System.out.print("Enter an adjective: ");
        String adjective1 = scanner.nextLine();

        System.out.print("Enter a noun: ");
        String noun1 = scanner.nextLine();

        System.out.print("Enter a plural noun: ");
        String pluralNoun = scanner.nextLine();

        System.out.print("Enter a celebrity: ");
        String celebrity = scanner.nextLine();

        System.out.print("Enter a past-tense verb: ");
        String verbPast = scanner.nextLine();

        System.out.print("Enter a number: ");
        String number = scanner.nextLine();

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Print the completed Mad Lib story
        System.out.println("\n--- Your Custom Mad Lib ---");
        System.out.println("It was a " + adjective1 + " day at the zoo. " +
                "I went to see the " + noun1 + ", but instead, " +
                "I found " + number + " " + pluralNoun + " eating " +
                celebrity + " and they all " + verbPast + "!");
    }
}
