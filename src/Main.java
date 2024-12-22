public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Food[] breakfast = new Food[10];
        int foodCounter = 0;
        int milkCounter = 0;
        int appleCounter = 0;
        String[] var5 = args;
        int var6 = args.length;

        int var7;
        for(var7 = 0; var7 < var6; ++var7) {
            String arg = var5[var7];
            String[] parts = arg.split("/");
            if (parts[0].equals("Milk")) {
                breakfast[foodCounter] = new Milk(parts[1]);
                ++milkCounter;
            }

            if (parts[0].equals("Apple")) {
                breakfast[foodCounter] = new Apple(parts[1]);
                ++appleCounter;
            }

            ++foodCounter;
        }

        System.out.println("List of products:");
        System.out.println("Milk: " + milkCounter);
        System.out.println("Apple: " + appleCounter);
        System.out.println("List of consumed products:");
        Food[] var10 = breakfast;
        var6 = breakfast.length;

        for(var7 = 0; var7 < var6; ++var7) {
            Food product = var10[var7];
            if (product == null) {
                break;
            }

            product.consume();
        }

    }
}