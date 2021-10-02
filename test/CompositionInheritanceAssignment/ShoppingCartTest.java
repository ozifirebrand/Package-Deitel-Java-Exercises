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
        Item item = new Item();
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
        Item item = new Item();
        Item item2 = new Item();
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
        Item item = new Item();
        //when
        item.statePrice(50);
        //assert
        assertEquals(50, item.displayPrice());
    }

    @Test
    @DisplayName("Test that item has quantity")
    public void testThatItemHasQuantity(){
        //given
        Item item = new Item();
        //when
        item.stateQuantity(5);
        //assert
        assertEquals(5, item.displayQuantity());
    }

    @Test
    @DisplayName("Test that item has quantity and price for computing total")
    public void testThatTotalItemPriceCanBeComputed(){
        //given
        Item item = new Item();
        //when
        item.statePrice(23);
        item.stateQuantity(2);
        //assert
        assertEquals(46, item.computeTotalOfItem());
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
        ArrayList<Item> items = new ArrayList<>();
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        cart.addItemToCart(item1);
        cart.addItemToCart(item2);
        cart.addItemToCart(item3);

        item1.statePrice(34);
        item1.stateQuantity(2);
        item2.statePrice(1);
        item2.stateQuantity(22);
        cart.computeTotalPriceOfItemsInCart();
        assertEquals(90, cart.getTotalPriceOfItemsInCart());
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

}