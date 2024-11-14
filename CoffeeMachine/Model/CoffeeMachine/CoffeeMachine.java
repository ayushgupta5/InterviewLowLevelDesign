package Model.CoffeeMachine;

public class CoffeeMachine {
    private int waterLevel;
    private int coffeeBeansLevel;
    private int milkLevel;
    private int sugarLevel;
    private String inventory;

    public CoffeeMachine(int waterLevel, int coffeeBeansLevel, int milkLevel, int sugarLevel, String inventory) {
        this.waterLevel = waterLevel;
        this.coffeeBeansLevel = coffeeBeansLevel;
        this.milkLevel = milkLevel;
        this.sugarLevel = sugarLevel;
        this.inventory = inventory;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }

    public int getCoffeeBeansLevel() {
        return coffeeBeansLevel;
    }

    public void setCoffeeBeansLevel(int coffeeBeansLevel) {
        this.coffeeBeansLevel = coffeeBeansLevel;
    }

    public int getMilkLevel() {
        return milkLevel;
    }

    public void setMilkLevel(int milkLevel) {
        this.milkLevel = milkLevel;
    }

    public int getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(int sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "waterLevel=" + waterLevel +
                ", coffeeBeansLevel=" + coffeeBeansLevel +
                ", milkLevel=" + milkLevel +
                ", sugarLevel=" + sugarLevel +
                ", inventory='" + inventory + '\'' +
                '}';
    }
}
