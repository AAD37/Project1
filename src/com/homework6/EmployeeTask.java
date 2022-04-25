package com.homework6;

public class EmployeeTask {
    final int id = 5;
    final String firstName = "Jane";
    final String lastName = "Doe";

    private double salary;

    public String getName(){
        return firstName + ' ' + lastName;
    }

    public static void main(String[] args){
        Employee myEmployee = new Employee();
        System.out.println(myEmployee.getName());


    }

}
