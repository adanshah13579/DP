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
class Customer {
    private String name;
    
    public Customer(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

class OrderItem {
    private String product;
    
    public OrderItem(String product) {
        this.product = product;
    }
    
    public String getProduct() {
        return product;
    }
}

class Order {
    private Customer customer;
    private List<OrderItem> items = new ArrayList<>();
    
    public Order(Customer customer) {
        this.customer = customer;
    }
    
    public void addItem(OrderItem item) {
        items.add(item);
    }
    
    public void printOrder() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Items:");
        for (OrderItem item : items) {
            System.out.println(item.getProduct());
        }
    }
}

public class with_grasp{

    public static void main(String[] args) {
        Customer customer = new Customer("John Doe");
        Order order = new Order(customer);
        order.addItem(new OrderItem("Product A"));
        order.addItem(new OrderItem("Product B"));
        
        order.printOrder();
    }
}

