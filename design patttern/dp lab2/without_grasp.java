/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp_lb_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fa20-bse-036
 */
class NonPrincipledOrder {
    private String customerName;
    private List<String> items = new ArrayList<>();
    
    public NonPrincipledOrder(String customerName) {
        this.customerName = customerName;
    }
    
    public void addItem(String item) {
        items.add(item);
    }
    
    public void printOrder() {
        System.out.println("Customer: " + customerName);
        System.out.println("Items:");
        for (String item : items) {
            System.out.println(item);
        }
    }
}

public class without_grasp {

    public static void main(String[] args) {
        NonPrincipledOrder order = new NonPrincipledOrder("John Doe");
        order.addItem("Product A");
        order.addItem("Product B");
        
        order.printOrder();
    }
}

