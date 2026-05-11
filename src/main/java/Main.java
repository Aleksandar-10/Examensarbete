import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DogCode dogCode = new DogCode();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nChoose option:");
            System.out.println("1 - Breed to Code");
            System.out.println("2 - Code to Breed");
            System.out.println("3 - Exit");

            String choice = scanner.nextLine();

            if (choice.equals("3")) {
                System.out.println("Program closed.");
                break;
            }

            if (choice.equals("1")) {
                System.out.println("Enter dog breed:");
                String breed = scanner.nextLine();
                System.out.println("Code: " + dogCode.getCode(breed));
            }

            else if (choice.equals("2")) {
                System.out.println("Enter dog code:");
                String code = scanner.nextLine();
                System.out.println("Breed: " + dogCode.getBreed(code));
            }

            else {
                System.out.println("Invalid option");
            }
        }

        scanner.close();
    }
}