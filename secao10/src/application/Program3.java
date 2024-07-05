package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program3 {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Cama", 500.00));
        list.add(new Product("Ventilador", 300.00));
        list.add(new Product("Adaptador", 50.00));


        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        names.forEach(System.out::println);

    }
}
