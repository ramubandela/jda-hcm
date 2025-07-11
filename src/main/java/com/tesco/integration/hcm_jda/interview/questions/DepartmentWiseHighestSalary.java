package com.tesco.integration.hcm_jda.interview.questions;

import java.util.*;
import java.util.stream.Collectors;

public class DepartmentWiseHighestSalary {

    public static void main(String[] args) {

        List<Employe> list=new ArrayList<>();


        Employe employee=new Employe(1,3000,"IT");
        Employe employee1=new Employe(2,6000,"Tech");
        Employe employee2=new Employe(3,10000,"Tech");
        Employe employee3=new Employe(4,9000,"IT");
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.stream().collect(Collectors.groupingBy(Employe::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employe::getSal))));


        //Second highest salary find

        Map<String, Optional<Employe>> secondHighestSalaryByDept = list.stream()
                .collect(Collectors.groupingBy(
                        Employe::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                lists -> lists.stream()
                                        .sorted(Comparator.comparingDouble(Employe::getSal).reversed())
                                        .skip(1) // Skip highest
                                        .findFirst() // Get second highest
                        )
                ));


    }
}
class Employe{
    public Employe(int id, int sal, String department) {
        this.id = id;
        this.sal = sal;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    int id;
    int sal;

    String department;

}