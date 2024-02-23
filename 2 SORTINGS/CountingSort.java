// Remember the Concept of this problem 

public class CountingSort {

    // 1st

    // Counting function banaya hai
    // jo frequency Count krega for that we have to find range so that we can count then sorted 
    public static void countingsort (int arr[]){
        
        // For Range ki kaha tk jaat hai so we have use largest element for finding
        // Then largest nikal denge then real logic lgega 
        int largest = Integer.MIN_VALUE;
        for ( int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }


        //2nd

        // Real Logic for count
        // We will Iterate on original array for count the element  at index i
        int count [] = new int [largest+1]; // Created a count array in that we will store  // +1 means zero ko bhi count krrre jhai // zero se largest trk jana hai 
        for (int i =0; i < arr.length ; i++) {
            count[arr[i]]++; // 
        }


        //3rd
        
        // Final Sorting Fun 
        // Isme Hm Count array pr iterate krenge
        int j = 0;  // original 0 se start krdia 
        for (int i=0; i < count.length ; i++ ) {
            while (count [i] > 0) {  // Jbtk count ki value zero nai hojati jbtk hm original mai daalte rhenege // as mam explained in concept video 
                arr[j] = i;
                j++;  // aage bdho 
                count[i]--; // eg 2 se 1 then 0 jbtk zero na ho
         
            }
    }
}


    // Created a Void Function for Printing the arr or Above Logic 
    public static void printarr(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]  + " ");
        
        }
}



    public static void main(String[] args) {
        int arr [] = {1,4,1,3,2,4,3,7};
        countingsort(arr);
        printarr(arr);
    }
    
}
