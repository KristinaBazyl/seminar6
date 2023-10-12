package org.example.srp2;

import java.util.Scanner;

public class OrderScaner {
    private Scanner scanner;

    public OrderScaner() {
        this.scanner = new Scanner(System.in);
    }
    protected String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
