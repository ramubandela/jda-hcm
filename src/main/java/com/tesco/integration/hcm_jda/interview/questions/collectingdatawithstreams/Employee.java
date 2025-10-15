package com.tesco.integration.hcm_jda.interview.questions.collectingdatawithstreams;



import java.util.List;

class Employee {
    private int id;
    private String name;
    private List<Project> projects;

    public Long getSalary() {
        return salary;
    }

    private Long salary;

    public Employee(int id, String name, List<Project> projects) {
        this.id = id;
        this.name = name;
        this.projects = projects;
    }

    public Employee(int id, String name, List<Project> projects,Long salary) {
        this.id = id;
        this.name = name;
        this.projects = projects;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", projects=").append(projects);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
