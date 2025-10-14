package com.tesco.integration.hcm_jda.interview.questions.CollectorsMethodsExamples;

import com.tesco.integration.hcm_jda.interview.questions.Employe;

import java.util.*;
import java.util.stream.Collectors;

public class DepartmentWiseSecondHighestSalaryAndNamesOnly {

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

        Map<String, Optional<Employe>> collect = list.stream().collect(Collectors.groupingBy(Employe::getDepartment,
                Collectors.collectingAndThen(Collectors.toList(),
                        elist -> elist.stream().sorted(Comparator.comparingInt(Employe::getSal).reversed()).limit(2).skip(1).findFirst())));
    }
}
