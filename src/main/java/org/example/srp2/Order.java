package org.example.srp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {


    private String clientName;
    private String product;
    private int qnt;
    private double price;

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return price;
    }

    public Order(){

    }

    public Order(String clientName, String product, int qnt, double price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;

    }

    public void inputFromConsole(OrderScaner orderScaner){
        clientName = orderScaner.prompt("Client name: ");
        product = orderScaner.prompt("Product: ");
        qnt = Integer.parseInt(orderScaner.prompt("Quantity: "));
        price = Double.parseDouble(orderScaner.prompt("Price: "));
    }

}
