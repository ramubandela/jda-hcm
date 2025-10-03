package com.tesco.integration.hcm_jda.faang.strings;

public class PrintFirstAppearCharacter {
    public static void main(String[] args) {

        String input ="aaaaaBbbbCCcccc";

        boolean[] isSean=new boolean[26];
        StringBuffer  stringBuffer=new StringBuffer();


        for(Character ch:input.toCharArray()){
            String ss=""+ch;
            Character chh=ss.toLowerCase().charAt(0);
            if(!isSean[chh-'a']){
                stringBuffer.append(ch);
                isSean[chh-'a']=true;
            }
        }
        System.out.println(stringBuffer);
    }
}
