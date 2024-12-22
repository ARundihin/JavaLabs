public class Milk extends Food
{
    private String fat;

    public Milk()
    {
        super("Milk");
    }

    public Milk(String fat)
    {
        super("Milk");
        this.fat = fat;
    }

    @Override
    public void consume()
    {
        System.out.println(this + " was drunk");
    }

    @Override
    public String toString() {
        return "'" + fat + "' " + super.toString();
    }
}
