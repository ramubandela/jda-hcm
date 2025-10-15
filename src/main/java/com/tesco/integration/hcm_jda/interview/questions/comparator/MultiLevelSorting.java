package com.tesco.integration.hcm_jda.interview.questions.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MultiLevelSorting {
    public static void main(String[] args) {

        Project p1 = new Project("A", 6);
        Project p2 = new Project("B", 12);
        Project p3 = new Project("C", 8);
        Project p4 = new Project("D", 10);

        // Employees
        Employee e1 = new Employee(1, "John", Arrays.asList(p1, p2),3000l);      // 2 projects, 18 months
        Employee e2 = new Employee(2, "Mary", Arrays.asList(p3),400000l);          // 1 project, 8 months
        Employee e3 = new Employee(3, "Alex", Arrays.asList(p2, p4, p1),789000l);  // 3 projects, 28 months
        Employee e4 = new Employee(4, "Ravi", Arrays.asList(p3, p4, p1),12678909l);  // 3 projects, 24 months
        Employee e5 = new Employee(4, "Ravi", Arrays.asList(p3, p4),12678909l);

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4,e5);
        Comparator<Employee> employeeComparator = Comparator.comparingLong(Employee::getSalary).thenComparingInt(e -> e.getProjects().size());

        Optional<Employee> max = employees.stream().max(employeeComparator);

        System.out.println(max.get()+"max");
        /*Optional<Employee> collect = employees.stream().collect(Collectors.maxBy(employeeComparator));*/




    }
}
