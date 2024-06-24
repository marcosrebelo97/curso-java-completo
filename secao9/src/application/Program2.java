package application;

import entities.Client;

public class Program2 {
    public static void main(String[] args) {

        Client c1 = new Client("Marcos", "marcos@gmail.com");
        Client c2 = new Client("Rita", "rita@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        //System.out.println(c1 == c2);
    }
}
