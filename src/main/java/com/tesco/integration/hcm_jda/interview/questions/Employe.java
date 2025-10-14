package com.tesco.integration.hcm_jda.interview.questions;

public class Employe{

    public Employe(){

    }
    public Employe(int id, int sal, String department) {
        this.id = id;
        this.sal = sal;
        this.department = department;
    }
    public Employe(int id, int sal, String department,String name) {
        this.id = id;
        this.sal = sal;
        this.department = department;
        this.name=name;
    }
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    int id;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employe{");
        sb.append("id=").append(id);
        sb.append(", sal=").append(sal);
        sb.append(", department='").append(department).append('\'');
        sb.append('}');
        return sb.toString();
    }

    int sal;

    String department;

}
