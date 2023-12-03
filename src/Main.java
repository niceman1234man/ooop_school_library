
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            out.println("Please choose your option:");
            out.println("1. List all books");
            out.println("2. List all people");
            out.println("3. Create a person");
            out.println("4. Create a book");
            out.println("5. Create a rental");
            out.println("6. List rentals for a person");
            out.println("0. Quit");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

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
                    out.println("you choose Invalid option. Please try again.");
            }
        }
    }
}