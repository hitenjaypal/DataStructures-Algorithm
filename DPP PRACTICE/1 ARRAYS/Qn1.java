// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinc
// Whenever there is sum for that output is in true/False then use BooLean 

import java.util.*;

public class Qn1 {
    public static boolean Duplicate(int num[]){
        // Variable Intialize 
        int n = num.length;

        // Main Logic 
        // We'll Run Two Loops for Finding Twice Appear Element 
        // This Loop is for when you have to compare  the element with all other elements 
        for (int i=0;i<n;i++){
            for(int j = i+1; j<n;j++){
                // Condition for Checking  If the Number is Present at Least Two Times in Array 

                if (num[i]==num[j]){
                    return true;
                }
                }
            }
            return false;
        }
    

    public static void main(String[] args) {
        int num[] = {1,2,1,3};
        System.out.println(Duplicate(num));
    }
    
}
