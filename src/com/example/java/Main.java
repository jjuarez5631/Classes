package com.example.java;

public class Main {

    public static void main(String[] args) {
        //instantiates the class with information for each employee
	    Employee employee1 = new Employee("Mike N Ike", 1, 3);
        Employee employee2 = new Employee("Reese Pieces", 2, 1);
        Employee employee3 = new Employee("Baby Ruth", 3, 2);

        //display the information that was created for each employee.
        employee1.printAll();
        System.out.println("\n");
        employee2.printAll();
        System.out.println("\n");
        employee3.printAll();

    }


}
