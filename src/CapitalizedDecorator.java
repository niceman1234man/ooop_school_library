public class CapitalizedDecorator extends Decorator{


    public CapitalizedDecorator(Nameable nameable) {
        super(nameable);
    }
    public String correctName() {
        String name = nameable.correctName();
        return name.toUpperCase();  //capitalized the name
    }
}
