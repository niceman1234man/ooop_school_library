public class TrimmerDecorator extends Decorator{

    public TrimmerDecorator(Nameable nameable) {

        super(nameable);
    }
    public String correctName() {
        String name = nameable.correctName();
        if (name.length() > 10) {
            return name.substring(0, 10);// shorten the name whose is length greater than 10
        }
        return name;
    }
}
