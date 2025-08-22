package com.tesco.integration.hcm_jda.mphasis;

public class Test {
    public static void main(String[] args) {


        System.out.println("1");
        Test helloWorld = new Test();
        helloWorld.getMethod();
    }
             Test(){
                System.out.println(" 2");
            }
            {
                System.out.println(" 3");
            }
            static{
                System.out.println(" 4");
            }
            public void getMethod(){
                System.out.println(" 5");
            }

}
