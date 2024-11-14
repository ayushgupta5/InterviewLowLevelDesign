package Service.Inventory;

public class InventoryService implements IInventoryService {
    @Override
    public void updateStock() {
        System.out.println("Updating the Stocks");
    }

    @Override
    public void checkStock() {
        System.out.println("Checking the Stocks");
    }

    @Override
    public void restock() {
        System.out.println("Doing the Re-Stocks");
    }
}
