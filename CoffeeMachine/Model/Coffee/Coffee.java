package Model.Coffee;

public class Coffee {
    private String name;
    private double basePrice;
    private int size;
    private int extras;

    public Coffee(String name, double basePrice, int size, int extras) {
        this.name = name;
        this.basePrice = basePrice;
        this.size = size;
        this.extras = extras;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getExtras() {
        return extras;
    }

    public void setExtras(int extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", basePrice=" + basePrice +
                ", size=" + size +
                ", extras=" + extras +
                '}';
    }
}
