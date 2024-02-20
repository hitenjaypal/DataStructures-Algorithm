// Print Maximum SubArray

// By Kadane's Algo 
// Kadane's Algorithm is a dynamic programming technique used to find the maximum subarray sum within a given array of numbers.
// The Algorithm handles positive and negative numbers very efficiently, isme yeh negative value jo hogi usse neglect krdega starting mai aaygi voh 
// isme yeh negative ko neglact krke zero krdeta hai starting mai or aage positive number carry krta hai jbtk value positive rhegi jbtk aage bhdega

// This Approach is the optimal approach for this problem 

public class cMaxSubArray {
    public static void Kadanes(int num[]){

        // Variable Intialize
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        //Logic 

        for(int i=0;i<num.length;i++){
            cs = cs + num[i];

            //Logic for Negative Numbers 
            if (cs<0){
                cs=0;
            }
            //Logic for Comparison  // -∞ vs num[i]
            ms = Math.max(ms, i);
        }
        System.out.println("The maximum subarray sum is: " + ms);

    }


    // The Time Complexity of this code is O(n)

    public static void main(String[] args) {
        int  num [] = {-2,-3,4,-1,-2,1,5,-3};
        Kadanes(num);
    }
    
}
