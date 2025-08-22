package com.tesco.integration.hcm_jda.interview.questions;

public class ApexionInterviewProblem {

    public static void main(String[] args) {


    /*    There is an array A consisting of N integers. What is the maximum sum of two integers from A that have common  first and last digits?  If there are no two integers that have common  first and last digits, the function should return −1.

        Examples:

        1. Given A = [130, 191, 10, 200], the function should return 140. The only integers in A that share first and last digits are 130 and 10.

        2. Given A = [405, 45, 300, 300], the function should return 600. There are two pairs of integers that share first and last digits: (405, 45) and (300, 300). The sum of the two 300s is bigger than the sum of 405 and 45.

        3. Given A = [30, 909, 3190, 99, 3990, 9009], the function should return 9918.*/


       // A = [130, 191, 10, 200]

        int a[]={130, 190, 10, 200};

        int max=0;

        for(int i=0;i<a.length-1;i++){

            String value=new String(""+a[i]);
            String value2=new String(""+a[i+1]);
            String[] split = value.split("");
            String[] split1 = value2.split("");

            for(int k=0;k<split.length;k++){
                System.out.println("k.."+split[k]);
            }

            System.out.println("value"+value);
            System.out.println(split[0]+"split[0]");
            System.out.println(split[0]==split1[0]);

            if(split[0].equals(split1[0]) && split[split.length-1].equals(split1[split1.length-1])) {

                int sum;
                sum =Integer.parseInt(value)+Integer.parseInt(value2);

                if(sum>max){
                    max=sum;
                }
            }

        }

        System.out.println("Second max"+max);

    }
}
