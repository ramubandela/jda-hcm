package com.tesco.integration.hcm_jda.interview.questions;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Paypall {

    //find the third highest salary
    public static void main(String[] args) {
        //1. Local  variable usage in lambda expression
     /*  String s="";

        List.of(1,2,3,4).stream().map(x->s=s+x).collect(Collectors.toList());*/

//2. how many times each character in String
        /*String s="ramuhelllo123@rtyr";
        IntStream chars = s.chars();
        Map<Character, Long> collect = chars.mapToObj(c -> (char) c).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        collect.forEach((x,y)->System.out.println(x+"  "+y));*/



//3. how many times in a given word each word present
/*
        String s="ramu rahul raja ramu ramana rahul hello vijay vinay";

        String[] s1 = s.split(" ");

        Map<String, Long> collect = Arrays.stream(s1).collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        collect.forEach((x,y)->System.out.println(x+" "+y));*/
//4. Example program to sort and find the third highest salary of employee.

       /* List<Employee> employees = new ArrayList<>();

        Employee ramu = new Employee(1, "ramu", 200);
        Employee rahul = new Employee(2, "rahul", 300);
        Employee raja = new Employee(3, "raja", 400);
        Employee rajesh = new Employee(6, "rajesh", 400);
        Employee remo = new Employee(4, "remo", 500);
        Employee test = new Employee(5, "test", 600);


        employees.add(ramu );
        employees.add( rahul);
        employees.add(raja );
        employees.add(remo );
        employees.add(test );
        employees.add(rajesh );
        Optional<Employee> first = employees.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Comparator.comparing(Employee::getName)).reversed()).skip(2).findFirst();

        System.out.println(first.get()+"first");*/

 //5. Method reference in java?
        //Below is the constructor reference

       /* Supplier<Employee> supplier = Employee::new;
        supplier.get();

        Function<Integer, Employee> function = Employee::new;
        function.apply(1);

        BiFunction<Integer, String, Employee> f2 = Employee::new;
        Employee e3 = f2.apply(101, "Ramu");*/


//6. reverse map by values

       /* HashMap<Integer, String> hm=new HashMap<>();
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");
        hm.put(4,"four");

        HashMap<Integer, String> collect1 = hm.entrySet().stream().sorted(Comparator.comparing(entry -> entry.getValue())).collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(), (v1, v2) -> v1, LinkedHashMap::new));
        System.out.println(collect1+"collect1...");*/

//7. fltamap example

      /*  List<String> hello = List.of("hello", "how", "are");
        List<String> collect1 = hello.stream().map(x -> x.split("")).flatMap(y -> Arrays.stream(y)).collect(Collectors.toList());
        System.out.println(collect1+"collect1");
        // without flatmap

        List<Stream<String>> collect2 = hello.stream().map(x -> x.split("")).map(y -> Arrays.stream(y)).collect(Collectors.toList());

        System.out.println(collect2+"collect2");*/

//8. reduce example in java

    /*    List<Integer> integers = List.of(1, 2, 3, 100, 8, 90, 10, 900);
        Integer reduce = integers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduce+"reduce");  */

 //9. intern method Example
        // from the heap memory  object reference will be pointed to SCP

        String string=new String("test");
        String string2="test";

        System.out.println(string2==string);
        //But
        System.out.println(string.intern()==string2);

//10 Stream count example

    }
}



class Employee{
    public Employee() {
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
