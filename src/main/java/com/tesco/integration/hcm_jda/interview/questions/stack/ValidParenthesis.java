package com.tesco.integration.hcm_jda.interview.questions.stack;

import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else {
                // If stack is empty or top doesn't match, it's invalid
                if (stack.isEmpty() || stack.pop() != c) return false;
            }
        }

        // Stack must be empty at the end
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "({[]})";
        String s2 = "([)]";
        String s3 = "((()))";
        String s4 = "(((]})";

        System.out.println(isValid(s1)); // true
        System.out.println(isValid(s2)); // false
        System.out.println(isValid(s3)); // true
        System.out.println(isValid(s4)); // false
    }
}
