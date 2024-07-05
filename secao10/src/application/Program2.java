package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program2 {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Cama", 500.00));
        list.add(new Product("Ventilador", 300.00));
        list.add(new Product("Adaptador", 50.00));

        double min = 100.0;
        list.removeIf(p -> p.getPrice() >= min);

        for (Product p : list){
            System.out.println(p);
        }

    }
}
