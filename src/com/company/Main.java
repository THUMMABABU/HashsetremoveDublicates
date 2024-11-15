package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);              //2
                                                            //id :1 firstName : babu lastName thumma
        System.out.println("enter the n numbers added");
        int n=sc.nextInt();
        HashSet<Employee> employeesSet =new HashSet<>();
        for(int i=0;i<n;i++){
            System.out.println("enter the id");
            String id= sc.next();
            System.out.println("enter the  first Name");
            String firstName=sc.next();
            System.out.println("enter the lastname");
            String lastName=sc.next();
            System.out.println("enter the phone number:");
            String phoneNumber=sc.next();
            Employee someEmply = new Employee(id,firstName,lastName,phoneNumber);
            employeesSet.add(someEmply);
        }
        System.out.println((employeesSet.size()));
        for (Employee employee : employeesSet) {
            System.out.println(employee);
        }

    }

}









