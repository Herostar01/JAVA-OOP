import java.util.ArrayList;

public class TestOrders {

    public static void main(String[] args) {
    
        //APP Variables
        Item testItem = new Item();

        // Menu items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 4.0;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 9.5;

        Item item3 = new Item();
        item3.name = "coffee";
        item3.price = 3.0;

        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 3.5;
    
        // Order variables -- order1, order2 etc.

        Order order1 = new Order();
        System.out.println(order1.total);
        order1.name = "Chinduri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    
        // adding item1 to order2 item list
        order2.items.add(item1);
        order2.total += item1.price;

        // order a capa for order 3
        order3.items.add(item4);
        order3.total += item4.price;

        // order 4 needs  a latte
        order4.items.add(item2);
        order4.total += item2.price; //adds price to total
        
        //Chinduri's order is now ready
        order1.ready = true;

        // Sam ordered more drinks 
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price * 4;

        //Jim's order is now ready
        order2.ready = true;

        // testing the code
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);

    }
}
