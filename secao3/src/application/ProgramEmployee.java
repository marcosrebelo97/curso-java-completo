package application;

import entities.Employee;
import entities.Rent;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i+1) + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (position(list, id)){
                System.out.println("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null){
            System.out.println("This id does not exists!!!");
        } else {
            System.out.println("Enter the porcentage: ");
            double porcentage = sc.nextDouble();
            emp.increaseSalary(porcentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee obj : list){
            System.out.println(obj);
        }

        sc.close();
    }

    public static boolean position (List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
