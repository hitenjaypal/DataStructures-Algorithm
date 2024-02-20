// Print Maximum SubArray

//Brute Force Approach 

import java.util.*;

public class aMaxSubArray {
    public static void MaxsubArray(int num[]) {
        // Intialized Variables
        int currentsum = 0;
        int Maxsum = Integer.MIN_VALUE;

        // Logic
        //For sub arrays  starting from index i to n-1
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                currentsum = 0;
                for (int k = i; k <= j; k++) { // yaha = daalna pdega 
                   
                   
                    // Yaha pr apne ko print nai krna hai subarray ki tarah apne ko maxsubarray
                    // chiye so 
                    
                   
                    // Logic Below // Calculate Subaarays 
                    currentsum = currentsum + num[k]; // current sum mai add krke update krdega yeh logic
                }
                System.out.println(currentsum); // Just for next sum so that yaha tk logic is clear

              
                // logic 2
                if (Maxsum < currentsum) { // Max sum mai -∞ se compare krega jo pdha hoga voh aayga
                    Maxsum = currentsum;
                }

            }

        }
        System.out.print("The maximum Subarray is: " + Maxsum);
    }



    public static void main(String[] args) {
        int num[] = { 1, -2, 6, -1, 3 };
        MaxsubArray(num);
    }
}



// Time Complexity of this code is 
// Here three Nested Loops are here so the time complexity will o(n^3)
// So it is bad approach  to use nested loops in such cases where we can avoid them by using other data structures or algorithms</
