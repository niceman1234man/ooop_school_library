public class Decorator implements Nameable{
    protected Nameable nameable;

    public Decorator(Nameable nameable) {//accepts correct name

        this.nameable = nameable;
    }

    @Override
    public String correctName() {
         return nameable.correctName();
    }
}
