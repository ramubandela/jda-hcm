package com.tesco.integration.hcm_jda.interview.questions.groupby;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByDepartmentAndFindMaxSalary {
    public static void main(String[] args) {
        List<Employe> list=new ArrayList<>();


        Employe employee=new Employe(1,3000,"IT","raja");
        Employe employee1=new Employe(2,6000,"Tech","ramana");
        Employe employee2=new Employe(3,10000,"Tech","ranga");
        Employe employee3=new Employe(4,9000,"IT","Roja");
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        Comparator<Employe> employeComparator = Comparator.comparingInt(Employe::getSal);

        Map<String, Optional<Employe>> collect = list.stream().collect(Collectors.groupingBy(Employe::getDepartment, Collectors.maxBy(employeComparator)));

        System.out.println(collect);

    }
}
