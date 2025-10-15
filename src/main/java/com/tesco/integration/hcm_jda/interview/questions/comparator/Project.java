package com.tesco.integration.hcm_jda.interview.questions.comparator;

class Project {
    private String name;
    private int durationInMonths;

    public Project(String name, int durationInMonths) {
        this.name = name;
        this.durationInMonths = durationInMonths;
    }

    public String getName() {
        return name;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    @Override
    public String toString() {
        return name + "(" + durationInMonths + " months)";
    }
}

