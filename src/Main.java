
public class Main {
    public static void main(String[] args) {
        Person person = new Person("alemayehush",22);
        System.out.println(person.correctName());
        CapitalizedDecorator capitalName = new CapitalizedDecorator(person);
        System.out.println(capitalName .correctName());

        TrimmerDecorator capitalTrimmedName = new TrimmerDecorator(capitalName );
        System.out.println(capitalTrimmedName.correctName());
        
    }
}