package application;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class Program4 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 6, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        int soma = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Soma = " + soma);
    }
}
