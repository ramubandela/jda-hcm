package com.tesco.integration.hcm_jda.interview.questions.groupby;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesbyDepartment {
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


//group by department wise

        Map<String, List<Employe>> collect = list.stream().collect(Collectors.groupingBy(Employe::getDepartment));
        System.out.println(collect);
// //group by department wise and return only names by using collectingAndThen

        Map<String, List<String>> collect1 = list.stream().collect(Collectors.groupingBy(Employe::getDepartment, Collectors.collectingAndThen(Collectors.toList(), tolIst -> tolIst.stream().map(x -> x.getName()).collect(Collectors.toList()))));
        System.out.println(collect1);

        //group by department wise and return only names by using mapping

        Map<String, List<String>> collect2 = list.stream().collect(Collectors.groupingBy(Employe::getDepartment, Collectors.mapping(x -> x.getName(), Collectors.toList())));
        System.out.println(collect2);

        //Count Employees per Department
        Map<String, Long> collect3 = list.stream().collect(Collectors.groupingBy(Employe::getDepartment, Collectors.counting()));
        System.out.println(collect3);

        //department wise total salary
        Map<String, Integer> collect4 = list.stream().collect(Collectors.groupingBy(Employe::getDepartment, Collectors.collectingAndThen(Collectors.toList(), tolist -> tolist.stream().mapToInt(x -> x.getSal()).sum())));
        System.out.println(collect4+"collect4");

        Map<String, Integer> collect6 = list.stream().collect(Collectors.groupingBy(Employe::getDepartment, Collectors.summingInt(Employe::getSal)));
        System.out.println(collect6+"collect6 Total department");

//Average Salary per Department
        Map<String, Double> collect5 = list.stream().collect(Collectors.groupingBy(Employe::getDepartment, Collectors.averagingInt(Employe::getSal)));
        System.out.println(collect5+"collect5 average");

     //   Count and Sum Together (in One Grouping)

        Map<String, Map<String, Double>> result = list.stream()
                .collect(Collectors.groupingBy(
                        Employe::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                tolist -> {
                                    double total = tolist.stream().mapToDouble(Employe::getSal).sum();
                                    double avg = tolist.stream().mapToDouble(Employe::getSal).average().orElse(0);
                                    Map<String, Double> map = new HashMap<>();
                                    map.put("Total", total);
                                    map.put("Average", avg);
                                    return map;
                                }
                        )
                ));

        System.out.println(result);


        //Group by Department, then Further by Salary Range

        Map<String, Map<String, List<Employe>>> nestedGroup = list.stream()
                .collect(Collectors.groupingBy(
                        Employe::getDepartment,
                        Collectors.groupingBy(e -> {
                            if (e.getSal() > 8000) return "High";
                            else if (e.getSal() > 6000) return "Medium";
                            else return "Low";
                        })
                ));

        System.out.println(nestedGroup);


    }
}
