package chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    Invoice invoice;

    @BeforeEach
    void setUp() {
        invoice = new Invoice("CO123", "Durex",-3, -1650.06);


    }

    @AfterEach
    void tearDown() {
    }
    @Test
    public void testForPartNumber(){
        assertEquals("CO123", invoice.getPartNumber());
        invoice.setPartNumber("DU123");
        assertEquals("DU123", invoice.getPartNumber());
    }
    @Test
    public void partDescription(){
        assertEquals("Durex", invoice.getPartDescription());
        invoice.setPartDescription("GoldCycle");
        assertEquals("GoldCycle", invoice.getPartDescription());

    }
    @Test
    public void quantityOfItemBeingPurchase(){
        assertEquals(0, invoice.getQuantityOfItemBeingPurchase());
        invoice.setQuantityOfItemBeingPurchase(4);
        assertEquals(4, invoice.getQuantityOfItemBeingPurchase());

    }
    @Test
    public void pricePerItem(){
        assertEquals(0, invoice.getPricePerItem());
        invoice.setPricePerItem(2370.78);
        assertEquals(2370.78, invoice.getPricePerItem());
    }
    @Test
    public void invoiceAmount(){
        invoice.getInvoiceAmount();
        assertEquals(0.0, invoice.getInvoiceAmount());
    }














}












