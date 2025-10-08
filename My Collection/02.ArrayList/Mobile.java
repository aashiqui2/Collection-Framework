public class Mobile implements Comparable<Mobile> {
    String model;
    int price;
    int storage; // in GB
    boolean is5G;

    public Mobile(String model, int price, int storage, boolean is5G) {
        this.model = model;
        this.price = price;
        this.storage = storage;
        this.is5G = is5G;
    }

    @Override
    public int compareTo(Mobile other) {
        //? Sort by price in ascending order
        // return this.price - other.price;

        //? Sort by price in descending order
        return other.price-this.price;
    }

    @Override
    public String toString() {
        return model + " " + storage + "GB ₹" + price + " 5G:" + is5G;
    }
}

