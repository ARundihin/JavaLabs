public class Apple extends Food {
    private String size;
    public Apple(String size) {
        super("Apple");
        this.size = size;
    }

    @Override
    public void consume() {
        System.out.println(this + " was eaten");
    }

    @Override
    public String toString() {
        return "'" + size + "' " + super.toString();
    }
}