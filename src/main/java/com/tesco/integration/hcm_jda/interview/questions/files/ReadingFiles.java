package com.tesco.integration.hcm_jda.interview.questions.files;

import java.io.File;

public class ReadingFiles {
    public static void main(String[] args) {
        String s="D:\\Desktop";

        File file=new File(s);
        String[] list = file.list();

        for(String files:list){
            System.out.println(files);
        }

    }
}
