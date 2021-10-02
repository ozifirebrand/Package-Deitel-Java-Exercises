package CompositionInheritanceAssignment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    @DisplayName("Test that item can be added to cart")
    public void testThatUserCanAddItemToCart(){
        //given
        ShoppingCart cart = new ShoppingCart();
        Item item = new Item("Tea", 10, 1);
        ArrayList<Item> items = new ArrayList<>();
        //when
        cart.addItemToCart(item);
        items.add(item);
        //assert
        assertEquals(items, cart.getItemsInCart());
    }


    @Test
    @DisplayName("Test that items can be added to cart")
    public void testThatCanAddItemsToCart(){
        //given
        ShoppingCart cart = new ShoppingCart();
        ArrayList<Item> items = new ArrayList<>();
        Item item = new Item("Ope", 10, 1);
        Item item2 = new Item("Sugar", 4, 13);
        //when
        cart.addItemToCart(item);
        cart.addItemToCart(item2);
        items.add(item); items.add(item2);
        //assert
        assertEquals(items, cart.getItemsInCart());
    }

    @Test
    @DisplayName("Test that item has price")
    public void testThatItemHasPrice(){
        //given
        Item item = new Item("Yoghurt", 50, 1);
        //when
        item.statePrice(50);
        //assert
        assertEquals(50, item.displayPrice());
    }

    @Test
    @DisplayName("Test that item has quantity")
    public void testThatItemHasQuantity(){
        //given
        Item item = new Item("Sleepy John", 65, 5);
        //when
        //assert
        assertEquals(5, item.displayQuantity());
    }

    @Test
    @DisplayName("Test that item has quantity and price for computing total")
    public void testThatTotalItemPriceCanBeComputed(){
        //given
        Item item = new Item("John", 23, 2);
        //when
        item.computeTotalOfItem();
        //assert
        assertEquals(46, item.displayTotalOfItem());
    }

    @Test
    @DisplayName("Test that user can pay")
    public void testThatUserCanPayWithCard(){
        //given
        User person = new User();
        //when
        person.payForItem(569);
        //assert
        assertEquals(569, person.getAmountPaidByUser());
    }

    @Test
    @DisplayName("Test that total of all items purchased can be computed")
    public void testTheTotalOfItemsInCart(){
        //given
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("Ready", 34, 2);
        Item item2 = new Item("Scrabble", 1, 22);
        Item item3 = new Item("Toma the legend", 5, 1);
        cart.addItemToCart(item1);
        cart.addItemToCart(item2);
        cart.addItemToCart(item3);
        cart.computeTotalPriceOfItemsInCart();
        assertEquals(95, cart.getTotalPriceOfItemsInCart());
    }

    @Test
    @DisplayName("Test that user can pay with verve card")
    public void testThatPaymentIsThroughVerve(){
        //given
        User person = new User();
        //when
        person.payWith(CardType.VERVE);
        //assert
        assertSame(CardType.VERVE, person.paidWith());

    }

    @Test
    @DisplayName("Test that user can pay with visa card")
    public void testThatPaymentIsThroughVisaCard(){
        //given
        User person = new User();
        //when
        person.payWith(CardType.VISA_CARD);
        //assert
        assertSame(CardType.VISA_CARD, person.paidWith());
    }

    @Test
    @DisplayName("Test that user can pay with America express")
    public void testThatPaymentIsThroughAmericaExpress(){
        //given
        User person = new User();
        //when
        person.payWith(CardType.AMERICA_EXPRESS);
        //assert
        assertSame(CardType.AMERICA_EXPRESS, person.paidWith());
    }
    @Test
    @DisplayName("User has many billing information")
    public void testThatUserHasManyBillingInformation(){
        //given
        User person = new User();
        ArrayList<BillingInformation> billingInformation = new ArrayList<>();
        //when
        person.giveBillingInformation(new BillingInformation());
        billingInformation.add(new BillingInformation());
        //assert
        assertEquals( billingInformation , person.getBillingInformation());
    }

    @Test
    @DisplayName("Test that user has a name")
    public void testUserHasAName(){
        //given
        User person = new User();
        //when
        person.setName("Onuoha");
        //assert
        assertEquals("Onuoha", person.getName());
    }

    @Test
    @DisplayName("Test that product is a grocery")
    public void testThatProductIsAGrocery(){
        //given
        Product product = new Product();
        //when
        product.setProductCategory(ProductCategory.GROCERIES);
        //assert
        assertEquals(ProductCategory.GROCERIES, product.getProductCategory());
    }

    @Test
    @DisplayName("Test that product category is electronics")
    public void testProductCategoryIsElectronics(){
        //given
        Product product = new Product();
        //when
        product.setProductCategory(ProductCategory.ELECTRONICS);
        //assert
        assertEquals(ProductCategory.ELECTRONICS, product.getProductCategory());
    }

    @Test
    @DisplayName("Test that items in cart can be displayed  with their prices")
    public void testThatItemsInCartCanBeDisplayed(){
        //given
        ShoppingCart cart = new ShoppingCart();
        //when
        Item item1 = new Item("Garri package", 34, 2);
        Item item2 = new Item("Legacy by Nnari", 500, 1);
        Item item3 = new Item("Ajewole the movie", 12, 3);
        Item item4 = new Item("Omo", 10, 12);
        cart.addItemToCart(item1);
        cart.addItemToCart(item2);
        cart.addItemToCart(item3);
        cart.addItemToCart(item4);
        System.out.println(cart);
    }

    @Test
    @DisplayName("Test that total of all items can be displayed")
    public void testThatTotalCanBeDisplayedForItemsInCart(){
        //given
        ShoppingCart cart = new ShoppingCart();
        //when
        Item item1 = new Item("Garri package", 34, 2);
        Item item2 = new Item("Legacy by Nnari", 500, 1);
        Item item3 = new Item("Ajewole the movie", 12, 3);
        Item item4 = new Item("Omo", 10, 12);
        cart.addItemToCart(item1);
        cart.addItemToCart(item2);
        cart.addItemToCart(item3);
        cart.addItemToCart(item4);
        cart.computeTotalPriceOfItemsInCart();
        //assert
        assertEquals( 724, cart.getTotalPriceOfItemsInCart());
    }

}