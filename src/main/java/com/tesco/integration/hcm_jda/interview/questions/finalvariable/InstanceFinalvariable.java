package com.tesco.integration.hcm_jda.interview.questions.finalvariable;

public class InstanceFinalvariable {

    final int x;
    InstanceFinalvariable(){
        x=90;
    }

    public static void main(String[] args) {
        InstanceFinalvariable instanceFinalvariable=new InstanceFinalvariable();
        System.out.println(instanceFinalvariable.x);

    }

}
