package com.skillnext2;

public class App 
{
    public static void main(String[] args) 
    {
        String s = "Sir";

        if (isPalindrome(s)) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String s) {
        if (s == null) return false;

        String clean = s.replaceAll("\\s+", "").toLowerCase();
        return new StringBuilder(clean).reverse().toString().equals(clean);
    }
}
