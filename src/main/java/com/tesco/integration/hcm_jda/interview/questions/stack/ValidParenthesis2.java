package com.tesco.integration.hcm_jda.interview.questions.stack;

import java.util.Stack;

public class ValidParenthesis2 {
    public static void main(String[] args) {

        String s="()";

        boolean validParenthesis = isValidParenthesis(s);

        System.out.println("validParenthesis"+validParenthesis);
    }

    private static boolean isValidParenthesis(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
stack.push(')');
            }else if(ch=='{'){
                stack.push('}');
            }else if(ch=='['){
                stack.push(']');
            }else{
if(stack.isEmpty() || stack.pop() !=ch){
    return  false;
}
            }
        }

        return stack.isEmpty();
    }
}
