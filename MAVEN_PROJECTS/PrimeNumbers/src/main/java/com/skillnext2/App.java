package com.skillnext2;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println( "Enter a number: ");
        int b=sc.nextInt();
        boolean isPrime=true;
        if(b<=1) {
        	isPrime=false;
        }
        else {
        	for(int i=2;i<=Math.sqrt(b);i++) {
        		if(b%i==0) {
        			isPrime=false;
        			break;
        		}
        	}
        }
        if(isPrime) {
        	System.out.println(b+" is a prime number");
        }
        else {
        	System.out.println(b+" is not a prime number");
        }
    }
}
