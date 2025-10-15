package com.tesco.integration.hcm_jda.interview.questions.collectingdatawithstreams;

import java.util.*;
import java.util.stream.Collectors;

public class FindingMinimumAndMaximumInAStreamOfValues {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 8, 9, 20, 78, 90, 87, 66, 45);

        list.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));

        Project p1 = new Project("A", 6);
        Project p2 = new Project("B", 12);
        Project p3 = new Project("C", 8);
        Project p4 = new Project("D", 10);


        Employee e1 = new Employee(1, "John", Arrays.asList(p1, p2),3000l);      // 2 projects, 18 months
        Employee e2 = new Employee(2, "Mary", Arrays.asList(p3),400000l);          // 1 project, 8 months
        Employee e3 = new Employee(3, "Alex", Arrays.asList(p2, p4, p1),789000l);  // 3 projects, 28 months
        Employee e4 = new Employee(4, "Ravi", Arrays.asList(p3, p4, p1),12678909l);  // 3 projects, 24 months
        Employee e5 = new Employee(5, "Ravi", Arrays.asList(p3, p4),12678909l);
        List<Employee> employees = Arrays.asList(e1, e2, e3, e4,e5);

        Comparator<Employee> employeeComparator = Comparator.comparingLong(Employee::getSalary);

        Optional<Employee> max = employees.stream().max(employeeComparator);
        System.out.println(max.get());

        //1
        Optional<Employee> collect = employees.stream().collect(Collectors.maxBy(employeeComparator));

        System.out.println(collect);

//2
        LongSummaryStatistics collect1 = employees.stream().collect(Collectors.summarizingLong(Employee::getSalary));
        System.out.println(collect1+"collect1");



        //spring batch, kafka, aws, java, micro services, spring boot









    }
}
