package com.walmart.exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class OrderRepository {

    public List<Order> readOrdersFromFile(Path path) throws IOException {
        List<Order> orders = new ArrayList<>();
        List<String> lines = Files.readAllLines(path);
        lines.forEach(line -> {
            orders.add(createOrderFromLine(line));
        });
        return orders;
    }

    private Order createOrderFromLine(String line) {
        System.out.println("Reading Order Line " + line);
        Order order = new Order();
        String[] params = line.split(" ");
        System.out.println(params[0] + ", " + params[1] + ", " + params[2]);
        order.setOrderId(params[0]);

        String[] time = params[2].split(":");
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getDefault());
        cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(time[0]));
        cal.set(Calendar.MINUTE, Integer.parseInt(time[1]));
        cal.set(Calendar.SECOND, Integer.parseInt(time[2]));
        order.setOrderTime(cal.getTime());

        Coordinate longitude = new Coordinate();
        Coordinate latitude = new Coordinate();

        String[] directions = params[1].split("(?<=\\d)(?=\\D)|(?=\\d)(?<=\\D)");
        longitude.setDirection(directions[0]);
        longitude.setNumber(Integer.parseInt(directions[1]));
        latitude.setDirection(directions[2]);
        latitude.setNumber(Integer.parseInt(directions[3]));

        Address address = new Address();
        address.setLongitude(longitude);
        address.setLatitude(latitude);
        order.setAddress(address);

        System.out.println("Read Order " + order.toString());

        return order;
    }


}
