// Print sub arrays 
// Means a continuous Part of array 
import java.util.*;


public class fprintsubarray{
    public static void subarray(int num[]){

        for (int i=0; i<=num.length;i++){  //  outer loop to fix the starting index of the sub-array

            for (int j=i; j<=num.length;j++) {  // Inner loop

                for(int k=i;k<j;k++){  // Increasing the length of the SubArray by using 'K'

                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int num[]= {2,4,6,8,10};
        subarray(num);
    }
}
