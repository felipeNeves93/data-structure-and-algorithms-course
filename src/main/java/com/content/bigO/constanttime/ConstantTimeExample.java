package com.content.bigO.constanttime;

public class ConstantTimeExample {
    public static void main(String[] args) {
        // This is an example of constant time execution.
        // It doesnt matter the value of the inputs, it will
        // Only execute one instruction, meaning, it will be
        // a constant time. O(1)
        System.out.println(sum(5, 5));
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}
