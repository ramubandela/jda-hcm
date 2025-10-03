package com.tesco.integration.hcm_jda.faang.arrays;

public class AddTwoNumbers {
    public static void main(String[] args) {

String num="113";
String num2="77";

int i=num.length()-1;
int j=num2.length()-1;
int carry=0;

StringBuffer sb=new StringBuffer();

while(i>=0 || j>=0 || carry !=0){
    int sum=carry;
    if(i>=0){
sum=sum+num.charAt(i)-'0';
i--;
    }
    if(j>=0){
        sum=sum+num2.charAt(j)-'0';
        j--;
    }
sb.append(sum%10);
    carry=sum/10;

}

System.out.println(sb.reverse());
    }
}
