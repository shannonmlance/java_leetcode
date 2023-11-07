package main.java.com.shannonmlance.theLeetcodeBeginnersGuide.challengeProblems;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

/*    Given an integer n, return a string array answer (1-indexed) where:
answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.

Example 1:
Input: n = 3
Output: ["1","2","Fizz"]

Example 2:
Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]

Example 3:
Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]

Constraints:
1 <= n <= 104 */

    public static List<String> fizzBuzz1(int n) {
        List<String> solution = new ArrayList<>();
        int i = 1;
        while (i <= n) {
            String s = "";
            if (i % 3 == 0) {
                s += "Fizz";
            }
            if (i % 5 == 0) {
                s += "Buzz";
            }
            if (s == "") {
                s = String.valueOf(i);
            }
            solution.add(i - 1, s);
            i++;
        }
        return solution;
    }

    public static List<String> fizzBuzz2(int n) {
        List<String> solution = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            String s = "";
            if (i % 3 == 0) {
                s += "Fizz";
            }
            if (i % 5 == 0) {
                s += "Buzz";
            }
            if (s == "") {
                s = String.valueOf(i);
            }
            solution.add(i - 1, s);
        }
        return solution;
    }
}
