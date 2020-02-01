package coding.challenge.vending.machine;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class VendingMachine implements Selector {

    private Inventory<Coin> coinInventory = new Inventory<>();
    private Inventory<Item> itemInventory = new Inventory<>();
    
    private int totalSales;    
    private int currentBalance;
    
    private Item currentItem;

    public VendingMachine() {
        initMachine();
    }   
    
    @Override
    public int checkPrice(Item item) { return 0; }

    @Override
    public void insertCoin(Coin coin) {}

    @Override
    public Map<Item, List<Coin>> getItemAndChange() { 
        return Collections.singletonMap(currentItem, collectChange()); 
    }

    @Override
    public List<Coin> refund() { return null; }

    @Override
    public void reset() {}
    
    private void initMachine() {
        // init machine with coins and items
    }
    
    private Item collectItem() { return null; }
    private List<Coin> collectChange() { return null; }
    private boolean isFullPaid() { return false; }
    private List<Coin> getChange(int amount) { return null; }
    private boolean hasSufficientChange() { return false; }
    private boolean hasSufficientChangeForAmount(long amount) { return false; }
    private void updateCoinInventory(List<Coin> change) {}
    private void updateItemInventory(List<Item> item) {}  

    public long getTotalSales() {
        return totalSales;
    }

    public long getCurrentBalance() {
        return currentBalance;
    }
        
}
