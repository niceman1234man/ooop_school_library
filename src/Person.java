import java.util.ArrayList;
import java.util.List;


public class Person implements Nameable{
     int id;
     String name;
     int age;
     boolean parentPermission;
    private List<Rental> rentals;

    public Person(int id,String name, int age) {
        this.id=id;
        this.name = name != null ? name : "Unknown";
        this.age = age;
        this.parentPermission = true;
        this.rentals = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    private boolean isOfAge() {
        return age >= 18;
    }

    @Override
    public String correctName() {
        return name;
    }
    public List<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);

    }
}

