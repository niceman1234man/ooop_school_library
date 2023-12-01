import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class App {
    private static List<Book> books = new ArrayList<>();
    private static List<Person> people = new ArrayList<>();
    private static List<Rental> rentals = new ArrayList<>();
    private static List<Classroom> classrooms = new ArrayList<>();
    private static int nextPersonId = 1;

    public static void listAllBooks() {
        out.println("Listing all books:");
        for (Book book : books) {
            out.println("[Book  title]:"+book.getTitle());
            out.println("[Book AUTHOR]:"+book.getAuthor());
        }
    }

    public static void listAllPeople() {
        out.println("Listing all people:");
        for (Person person : people) {
            out.println(" [Name ]:"+person.getName());
            out.println(" [Age  ] :"+person.getAge());
        }
    }

    public static void createPerson() {
        Scanner scanner = new Scanner(System.in);
        out.println("Enter the person's name:");
        String name = scanner.nextLine();
        out.println("Enter the person's age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        out.println("Enter the person's ID");
        int id = scanner.nextInt();
        scanner.nextLine();
        out.println("Has any parent permission? true/false");
        boolean parentPermission= scanner.nextBoolean();
        scanner.nextLine();
        out.println("Is the person a student or a teacher? (student/teacher):");
        String personType = scanner.nextLine();

        int personId = nextPersonId++; // Assign the next available person ID

        if (personType.equalsIgnoreCase("student")) {
            out.println("Enter the student's classroom:");
            String classroom = scanner.nextLine();

            Student student = new Student(personId, name, age, classroom);
            people.add(student);
            out.println("Student created succcesfully !");
        } else if (personType.equalsIgnoreCase("teacher")) {
            out.println("Enter the teacher's specialization:");
            String specialization = scanner.nextLine();

            Teacher teacher = new Teacher(personId, name, age, specialization);
            people.add(teacher);
            out.println("Teacher created succesfully");
        } else {
            out.println("Invalid person type.");
        }
    }

    public static void createBook() {
        Scanner scanner = new Scanner(System.in);
        out.println("Enter the book's title:");
        String title = scanner.nextLine();
        out.println("Enter the book's author:");
        String author = scanner.nextLine();

        Book book = new Book(title, author);
        books.add(book);
        out.println("Book created succesfully !");
    }

    public static void createRental() {
        Scanner scanner = new Scanner(System.in);
        out.println("Enter the person's ID:");
        int personId = scanner.nextInt();

        Person person = findPersonById(personId);
        if (person == null) {
            out.println("Person not found.");
            return;
        }

        out.println("Enter the book's title:");
        scanner.nextLine(); // Consume the newline character
        String bookTitle = scanner.nextLine();

        Book book = findBookByTitle(bookTitle);
        if (book == null) {
            out.println("Book not found.");
            return;
        }

        out.println("Enter the rental date:");
        String rentalDate = scanner.nextLine();

        Rental rental = new Rental(rentalDate, book, person);
        rentals.add(rental);
        person.addRental(rental);
        out.println("Rental created succesfully !");
    }

    public static void listRentalsForPerson() {
        Scanner scanner = new Scanner(System.in);
        out.println("Enter the person's ID:");
        int personId = scanner.nextInt();

        Person person = findPersonById(personId);
        if (person == null) {
            out.println("Person not found.");
            return;
        }

        out.println("Listing rentals for person: " + person.getName());
        for (Rental rental : person.getRentals()) {
            out.println("Date : "+rental.getDate()+",Book "+rental.getBook().getTitle()+" by "+rental.getBook().getAuthor());
        }
    }

    private static Person findPersonById(int personId) {
        for (Person person : people) {
            if (person.getId() == personId) {
                return person;
            }
        }
        return null;
    }

    private static Book findBookByTitle(String bookTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                return book;
            }
        }
        return null;
    }
}