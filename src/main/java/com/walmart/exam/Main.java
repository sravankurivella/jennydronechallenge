package com.walmart.exam;

import java.io.IOException;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        OrderRepository repository = new OrderRepository();
        repository.readOrdersFromFile(Paths.get("/Users/sravan/Downloads/inputorders.txt"));
    }
}
