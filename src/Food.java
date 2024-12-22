public abstract class Food {
    protected String productName = null;
    Food(String name){
        this.productName = name;
    }

    public void consume()
    {
        System.out.println(productName + " was eaten");
    }
    public String toString() {
        return productName;
    }

}
