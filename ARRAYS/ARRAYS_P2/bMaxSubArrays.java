// Print Maximum SubArray

// Prefix Approach better than Brute Force Approach 

import java.util.*;

public class bMaxSubArrays {

    public static void MaxSubarray(int num[]) {

        // Variables Intialization
        int currentsum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        // Logic 1
        // Calculating Prefix

        prefix[0] = num[0]; // Beacause apne loop 1 se chalayenge kyuki
                            // 0th index mai same rakhna hai
                            // kyuki aage jakr // 0th mai 1st index add krke aage badhna hai

        // Loop For Prefix
        for (int i = 1; i < num.length; i++) {
            prefix[i] = prefix[i - 1] + num[i]; // Prefix mai phele wale element se current ko add krdenege toh next mai aayga
        } 

        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;

                currentsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (MaxSum < currentsum) { // Max sum mai -∞ se compare krega jo pdha hoga voh aayga
                    MaxSum = currentsum;
                }

            }

        }
        System.out.print("The maximum Subarray is: " + MaxSum);

    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        MaxSubarray(num);
    }

}


// Now the time Complexity of this code will o (n^2)