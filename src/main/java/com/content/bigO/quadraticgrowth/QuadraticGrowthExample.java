package com.content.bigO.quadraticgrowth;

public class QuadraticGrowthExample {
    public static void main(String... args) {
        var n = 9;

        // The quadratic growth consists of nested loops.
        // The following example shows one loop inside of another
        // where for each iteration of i, the j loop wil execute 10 times
        // The complexity will be O(n^2)
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n; j++) {
                System.out.println("value of i: " + i + " Value of j: " + j);
            }
        }
    }
}
