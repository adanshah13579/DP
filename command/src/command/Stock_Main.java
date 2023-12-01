/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

/**
 *
 * @author skytech laptop store
 */
public class Stock_Main {
    public static void main(String[] args) {
       Stock abcStock = new Stock();

       BuyStock buyStockOrder = new BuyStock(abcStock);
       SellStock sellStockOrder = new SellStock(abcStock);

       Broker broker = new Broker();
       broker.takeOrder(buyStockOrder);
       broker.takeOrder(sellStockOrder);

       broker.placeOrders();
    } 
}