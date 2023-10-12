package org.example.srp2;

public class Program {
    public static void main(String[] args) {
        Order order = new Order();
        OrderSaveToJson orderSaveToJson = new OrderSaveToJson(order);
        OrderScaner orderScaner = new OrderScaner();

        order.inputFromConsole(orderScaner);
        orderSaveToJson.saveToJson();
    }
}
