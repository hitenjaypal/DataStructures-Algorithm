import java.util.*;

public class bLargestElement {
    
    public static int getlargest(int num[]) {

        int largest = Integer.MIN_VALUE; // Initializing the variable with minimum possible integer value ( it is -∞) // will compare with other element and update at last the largest element will print 
        // int smallest = Integer.MAX_VALUE; // Initializing the variable with maximum possible integer value ( it is +∞) // will compare with other element and update at last the smallest element will print 
       
         for(int i=0; i<num.length;i++) {
            if (largest < num[i]){
            // if (smallest > num[i]){
            
                largest=num[i];
            } 
        }
        return  largest;
        // return smallest;

    }

    public static void main(String args[]) {
        int num[] = {2,4,8,10,12};
        System.out.println("largest value is:" + getlargest(num));
    }
}
