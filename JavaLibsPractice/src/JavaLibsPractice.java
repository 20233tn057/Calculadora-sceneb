import java.util.Scanner;

public class JavaLibsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User inputs
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("What is your favorite food? ");
        String food = sc.nextLine();

        System.out.print("Enter a city: ");
        String city = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Clear buffer

        System.out.print("Enter your favorite animal: ");
        String animal = sc.nextLine();

        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();

        System.out.print("Enter a decimal number (double): ");
        double weight = sc.nextDouble();

        System.out.print("Enter a profession: ");
        sc.nextLine(); // Clear buffer
        String profession = sc.nextLine();

        System.out.print("Enter a color: ");
        String color = sc.nextLine();

        System.out.print("What is your favorite superpower? ");
        String power = sc.nextLine();

        // Use input in a question
        System.out.println("\n" + name + ", did you know there's a " + food + " restaurant in " + city + "?");

        // Do math with int and double
        int doubleAge = age * 2;
        double weightInKg = weight * 0.4536;

        // Final story
        System.out.println("\n--- Your personalized story ---");
        System.out.println("Once upon a time, there was a " + profession + " named " + name + " who lived in " + city + ".");
        System.out.println("At " + age + " years old, they dreamed of having the power of " + power + ".");
        System.out.println("Every day, they ate " + food + " with their " + animal + " colored " + color + ".");
        System.out.println("One day, they found a magic number: " + number + ", which transported them to the future.");
        System.out.println("There, they discovered they would be " + doubleAge + " years old and weigh " + weightInKg + " kg.");
        System.out.println("And so, a new adventure began...");

        sc.close();
    }
}
