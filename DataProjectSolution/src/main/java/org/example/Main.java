package org.example;

public class Main {
    public static void main(String[] args) {
        Employee milan = new Employee("647173,Mr.,Milan,F,Krawczyk,M,milan.krawczyk@hotmail.com,4/4/1980,1/19/2012,123681");
        Employee jeff = milan.createEmployee("647173,Mr.,Milan,F,Krawczyk,M,milan.krawczyk@hotmail.com,4/4/1980,1/19/2012,123681");
        System.out.println(milan.toString());
        System.out.println(jeff.toString());
    }
}