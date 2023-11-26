
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("Please choose an option:");
            System.out.println("1. List all books");
            System.out.println("2. List all people");
            System.out.println("3. Create a person");
            System.out.println("4. Create a book");
            System.out.println("5. Create a rental");
            System.out.println("6. List rentals for a person");
            System.out.println("0. Quit");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume thenewline character

            switch (option) {
                case 1:
                    App.listAllBooks();
                    break;
                case 2:
                    App.listAllPeople();
                    break;
                case 3:
                    App.createPerson();
                    break;
                case 4:
                    App.createBook();
                    break;
                case 5:
                    App.createRental();
                    break;
                case 6:
                    App.listRentalsForPerson();

                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}