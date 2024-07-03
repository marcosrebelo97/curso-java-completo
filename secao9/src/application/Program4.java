package application;

import java.util.TreeMap;
import java.util.Map;

public class Program4 {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Marcos");
        cookies.put("email", "marcos@gmail.com");

        System.out.println("Contains 'email' key: " + cookies.containsKey("email"));
        System.out.println("Size" + cookies.size());

        cookies.remove("email");
        cookies.put("email", "marcos22@gmail.com");

        System.out.println("All cookies:");
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
