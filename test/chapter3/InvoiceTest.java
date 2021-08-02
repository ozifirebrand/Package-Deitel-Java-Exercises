package chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvoiceTest {

    // given
    // when
    // assert


    @Test


        public void testNumber(){
        Invoice invoice = new Invoice();
        invoice.setNumber("86");
        assertEquals("86", invoice.getNumber());
        //System.out.println(invoice.getNumber());
    }

    @Test
    public void testDescription(){
        Invoice invoice = new Invoice();
        invoice.setDescription("Buyern Munich");
        assertEquals("Buyern Munich", invoice.getDescription());
        //System.out.printf("Buyern Munich. %s. Barca %s", invoice.getDescription(), invoice.getDescription() );
    }

    @Test
    public void testQuantity(){
        Invoice invoice = new Invoice();
        invoice.setQuantity(213);
        assertEquals(213, invoice.getQuantity());
    }

    @Test
    public void testPricePerItem(){
        Invoice invoice = new Invoice();
        invoice.setPricePerItem(45.32);
        assertEquals(45.32, invoice.getPricePerItem());
    }

    @Test
    public void testAmount(){
        Invoice invoice = new Invoice();
        invoice.setQuantity(5);
        invoice.setPricePerItem(4.5);
        assertEquals(22.5, invoice.getInvoiceAmount(22.5));
    }

    @Test
    public void testDiscount(){
        Invoice invoice = new Invoice();
        invoice.getInvoiceAmount(35);
        assertEquals(17.5, invoice.getDiscount(35));
    }

}