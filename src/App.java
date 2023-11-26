import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static List<Book> books = new ArrayList<>();
    private static List<Person> people = new ArrayList<>();
    private static List<Rental> rentals = new ArrayList<>();
    private static List<Classroom> classrooms = new ArrayList<>();
    private static int nextPersonId = 1;

    public static void listAllBooks() {
        System.out.println("Listing all books:");
        for (Book book : books) {
            System.out.println("[Book  title]:"+book.getTitle());
            System.out.println("[Book AUTHOR]:"+book.getAuthor());
        }
    }

    public static void listAllPeople() {
        System.out.println("Listing all people:");
        for (Person person : people) {
            System.out.println(" [Name ]:"+person.getName());
            System.out.println(" [Age  ] :"+person.getAge());
        }
    }

    public static void createPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the person's name:");
        String name = scanner.nextLine();
        System.out.println("Enter the person's age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter the person's ID");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Has any parent permission? true/false");
        boolean parentPermission= scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Is the person a student or a teacher? (student/teacher):");
        String personType = scanner.nextLine();

        int personId = nextPersonId++; // Assign the next available person ID

        if (personType.equalsIgnoreCase("student")) {
            System.out.println("Enter the student's classroom:");
            String classroom = scanner.nextLine();

            Student student = new Student(personId, name, age, classroom);
            people.add(student);
            System.out.println("Student created succcesfully !");
        } else if (personType.equalsIgnoreCase("teacher")) {
            System.out.println("Enter the teacher's specialization:");
            String specialization = scanner.nextLine();

            Teacher teacher = new Teacher(personId, name, age, specialization);
            people.add(teacher);
            System.out.println("Teacher created succesfully");
        } else {
            System.out.println("Invalid person type.");
        }
    }

    public static void createBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the book's title:");
        String title = scanner.nextLine();
        System.out.println("Enter the book's author:");
        String author = scanner.nextLine();

        Book book = new Book(title, author);
        books.add(book);
        System.out.println("Book created succesfully !");
    }

    public static void createRental() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the person's ID:");
        int personId = scanner.nextInt();

        Person person = findPersonById(personId);
        if (person == null) {
            System.out.println("Person not found.");
            return;
        }

        System.out.println("Enter the book's title:");
        scanner.nextLine(); // Consume the newline character
        String bookTitle = scanner.nextLine();

        Book book = findBookByTitle(bookTitle);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        System.out.println("Enter the rental date:");
        String rentalDate = scanner.nextLine();

        Rental rental = new Rental(rentalDate, book, person);
        rentals.add(rental);
        person.addRental(rental);
        System.out.println("Rental created succesfully !");
    }

    public static void listRentalsForPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the person's ID:");
        int personId = scanner.nextInt();

        Person person = findPersonById(personId);
        if (person == null) {
            System.out.println("Person not found.");
            return;
        }

        System.out.println("Listing rentals for person: " + person.getName());
        for (Rental rental : person.getRentals()) {
            System.out.println("Date : "+rental.getDate()+",Book "+rental.getBook().getTitle()+" by "+rental.getBook().getAuthor());
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