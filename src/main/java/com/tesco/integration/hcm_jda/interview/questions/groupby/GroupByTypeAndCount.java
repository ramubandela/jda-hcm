package com.tesco.integration.hcm_jda.interview.questions.groupby;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByTypeAndCount {
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

        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Employe::getDepartment, Collectors.counting()));
        System.out.println(collect);

        Map<String, List<Employe>> collect1 = list.stream().collect(Collectors.groupingBy(Employe::getDepartment));
        System.out.println(collect1);






    }
}
