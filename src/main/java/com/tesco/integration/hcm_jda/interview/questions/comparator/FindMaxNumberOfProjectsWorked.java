package com.tesco.integration.hcm_jda.interview.questions.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxNumberOfProjectsWorked {
    public static void main(String[] args) {

       /* Given a list of employees where each employee has an ID, name, and a list of projects
        (each with a name and duration in months), write a Java program to find the employee
        who has worked on the most projects; if multiple employees are tied,
        return the one with the longest total project duration, and
        if still tied, return any one of them.*/

        Project p1 = new Project("A", 6);
        Project p2 = new Project("B", 12);
        Project p3 = new Project("C", 8);
        Project p4 = new Project("D", 10);

        // Employees
        Employee e1 = new Employee(1, "John", Arrays.asList(p1, p2));      // 2 projects, 18 months
        Employee e2 = new Employee(2, "Mary", Arrays.asList(p3));          // 1 project, 8 months
        Employee e3 = new Employee(3, "Alex", Arrays.asList(p2, p4, p1));  // 3 projects, 28 months
        Employee e4 = new Employee(4, "Ravi", Arrays.asList(p3, p4, p1));  // 3 projects, 24 months

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4);

        // Comparator Logic
        Comparator<Employee> comparator = Comparator
                .comparingInt((Employee e) -> e.getProjects().size())
                .thenComparingInt(e -> e.getProjects().stream()
                        .mapToInt(Project::getDurationInMonths)
                        .sum());

        // Find Employee with most projects and longest total duration
        Employee bestEmployee = employees.stream()
                .collect(Collectors.maxBy(comparator))
                .orElse(null);

        System.out.println("Employee with most projects and longest duration:");
        System.out.println(bestEmployee);
    }
}
