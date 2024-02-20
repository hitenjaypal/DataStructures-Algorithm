import java.util.*;

//reverse array

public class dReverseArray {

    public static void reversearray (int num[]) {
        //logic
        int first=0, last = num.length-1;

        while(first < last) {

            //swap // use classical code for swapping 
            int temp= num[last];
             num[last] = num[first];
             num[first] = temp;


             first++;
             last--;
        }
    }



    public static void main(String[] args) {
        int num [] = {1,2,3,4,5};
        reversearray(num);
    

    for(int i=0; i<num.length; i++){
        System.out.print(num[i]+" ");
    }
    System.out.println();
    }
}
