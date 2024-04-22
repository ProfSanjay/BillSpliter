package billsplit;

import java.util.*;

public class Item {
    private String itemName;        // Unique ID 
    private List<String> payees;    // Parties responsible for paying for unique item
    private double amount;          // Cost of item entered by user
    private double discount;        // Discounted value subtracted from amount, if applicable (necessary?)

    public Item(String itemNameString, List<String> payeeList, double itemAmount) {
        this.itemName = itemNameString;
        this.payees = payeeList;
        this.amount = itemAmount;
    }

    public String getItemName() { return this.itemName; }
    public void setItemName(String itemString) { this.itemName = itemString; }

    public List<String> getPayees() { return this.payees; }
    public void setPayees(List<String> payeeList) { this.payees = payeeList; }

    public double getAmount() { return this.amount; }
    public void setAmount(double itemAmount) { this.amount = itemAmount; }

    public double getDiscount() { return this.discount; }
    public void setDiscount(double itemDiscount) { this.discount = itemDiscount; }

}
