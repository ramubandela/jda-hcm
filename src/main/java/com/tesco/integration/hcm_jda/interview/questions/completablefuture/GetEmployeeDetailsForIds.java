package com.tesco.integration.hcm_jda.interview.questions.completablefuture;



import com.tesco.integration.hcm_jda.interview.questions.Employe;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetEmployeeDetailsForIds {

    // here it is Goldman sachs internal round interview question
    // I have list of employee ids and want to get the employee details for the same.

    static  Map<Integer, Employe> hm=new LinkedHashMap<>();

    public static void main(String[] args) {
        Employe employee=new Employe(1,3000,"IT");
        Employe employee1=new Employe(2,6000,"Tech");
        Employe employee2=new Employe(3,10000,"Tech");
        Employe employee3=new Employe(4,9000,"IT");

        hm.put(employee.getId(),employee);
        hm.put(employee1.getId(),employee1);
        hm.put(employee2.getId(),employee2);
        hm.put(employee3.getId(),employee3);

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<CompletableFuture<Employe>> collect = list.stream().map(x -> CompletableFuture.supplyAsync(() -> getEmployee(x))).collect(Collectors.toList());
        List<Employe> collect1 = collect.stream().map(x -> x.join()).collect(Collectors.toList());
        System.out.println(collect1);

    }

    public static Employe getEmployee(Integer id){
        return hm.get(id);
    }
}
