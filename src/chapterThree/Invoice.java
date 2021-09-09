package chapterThree;

public class Invoice{

    private String partNumber;
    private String partDescription;
    private int quantityOfItemBeingPurchase;
    private double pricePerItem;

    public Invoice(String partNumber,String partDescription, int quantityOfItemBeingPurchase, double pricePerItem){
        this.partDescription = partDescription;
        this.partNumber = partNumber;
        if(pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        }
        if(quantityOfItemBeingPurchase > 0) {
            this.quantityOfItemBeingPurchase = quantityOfItemBeingPurchase;
        }

    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantityOfItemBeingPurchase() {
        return quantityOfItemBeingPurchase;
    }

    public void setQuantityOfItemBeingPurchase(int quantityOfItemBeingPurchase) {
        if(quantityOfItemBeingPurchase > 0) {
            this.quantityOfItemBeingPurchase = quantityOfItemBeingPurchase;
        }

    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if(pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        }
    }

    public double getInvoiceAmount() {
        double invoiceAmount;
        invoiceAmount = pricePerItem * quantityOfItemBeingPurchase;
        return invoiceAmount;
    }

}
