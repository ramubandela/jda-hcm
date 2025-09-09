package com.tesco.integration.hcm_jda.interview.questions.designpatterns;

public class FactoryDesignPattern {
    public static void main(String[] args) {

    }


    public Vehicle getVehicle(String type) {
        if(type.equals("auto")){
            return null;
        }
        return null;
    }
}

interface Vehicle{
public abstract int numberOfWheels();

}
class Lorry implements Vehicle {

    int numberOfWheels;

    @Override
    public int numberOfWheels() {
        return 6;
    }
}
    class Auto implements Vehicle{

        int numberOfWheels;

        @Override
        public int numberOfWheels() {
            return 3;
        }
}