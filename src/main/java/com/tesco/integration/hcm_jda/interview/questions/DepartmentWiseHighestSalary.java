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
  /*      list.stream().collect(Collectors.groupingBy(Employe::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employe::getSal))));


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
                ));*/


        Map<String, List<Employe>> collect = list.stream().collect(Collectors.groupingBy(x -> x.department));
      //  Map<String, List<Employe>> collect1 = collect;

        List<Employe> secondHighest=new ArrayList<>();

        Employe e=new Employe();
        collect.forEach((k, v)->
                {
                    List<Employe> collect2 = v.stream().sorted(Comparator.comparingInt(Employe::getSal).reversed()).limit(2).skip(1).collect(Collectors.toList());
                    secondHighest.addAll(collect2);
               System.out.println(collect2+"collect2");
               Employe employe = collect2.get(1);
              System.out.println(employe);

                }
                );

       // System.out.println(collect1);

        //ollect.entrySet().stream().sorted(Comparator.comparingInt(e->e.get)).limit(2)

        Map<String, List<Employe>> collect2 = list.stream().collect(Collectors.groupingBy(x -> x.getDepartment()));
       // System.out.println("map"+collect2);


        collect2.forEach((k, v)->{

            Optional<Employe> first = v.stream().sorted(Comparator.comparingInt(Employe::getSal).reversed()).skip(1).limit(1).findFirst();
            System.out.println("first"+first);
        });

        list.stream().collect(Collectors.groupingBy(Employe::getDepartment,
                Collectors.collectingAndThen(
                        Collectors.toList(),
                        empList ->empList .stream().sorted(Comparator.comparingInt(Employe::getSal).reversed()).skip(1).findFirst()
                )
                )
        );


    }
}
