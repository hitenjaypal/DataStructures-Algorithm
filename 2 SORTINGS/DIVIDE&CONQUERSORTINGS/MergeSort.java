// In the parameters of a function you state the name of a variable that you will use in the rest of your function. But this variable is not supposed to be defined earlier in the code

public class MergeSort {

    // We'll Create a Recursive Fn
    public static void mergesort (int arr[],int si , int ei){  // you can use these parameters by passing in fn without initialized them in main fn to Perform the Sorting Task.
        // base case 
        if (si>=ei){ // agar si>ei then niche jakr mid krega then element sorted ho jb tk chlega //  it means that the segment being considered is either empty (when si equals ei) or invalid (when si is greater than ei)
            return;
        }
        // Find Mid of elements 
        int mid = si +(ei-si)/2; // or (si+ei)/2;
        mergesort(arr,si,mid);// Call merge sort for left half // left part divide hogya
        mergesort(arr,mid+1,ei);// Call merge sort for right half // right part divide hogya imagine the flow chart of this problem

        // jb upr ki dono hojyga then apne arrange krne ke liye merge ko call krenge toh voh individual element ko temp mai sorted order mai store krega 
        merge(arr, si, mid, ei);    
    }




    // Created a Function for sorted the individual elements 
    // By storing them in temp array then at last 
    // Temp = arr[i] (temp ko arr mai store krdenege)
    public static void merge(int arr[], int si , int mid, int ei){ // mid jyga smja 


        //left(0,3)=4 right(4,6)=3 -> 6-0 = 6 answer dega pr apna 7 aata hai because of oth Indexing therefore we add 1
        int temp[]= new int[ei-si+1];  // Creating a temporary array with size equal to that of original array
        int i = si; // Iterator for left part for traversing 
        int j = mid+1; // Iterator for right part for traversing
        int k=0; //Iterator for final merged array (For Temp Array)


        //Logic of this loop
        // Agar left part wala element chota hai toh usse temp mai store krdo nai toh right wala chota hai toh usse temp mai store krdo 
        while(i<=mid && j<=ei) { // Above Variables Dhek bhai 
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++; // For moving on  next index
        } else {
            temp[k] = arr[j];
            j++ ; // For moving on  next index
        }
        
        k++; // For moving on  next index
    }
    

    // Bche hue elements ke liye LOGIC // manlo while mai ek condition puri hogyi but ek baki hai uskeliye 
    // Left Part
    while (i<=mid){ 
        temp[k++] = arr[i++]; // kn kiya bs upr ki conditions ko combine krke ek mai likhdiya  // [k++] -> K ki current value ko lelega and usse increment kdega 
    }

    // Right Part 
    while(j<=ei){
        temp[k++]= arr[j++];
    }


    // Final // Copy Temp to Original Array 
    for (k = 0, i=si ; k<temp.length ; k++, i++) {
        arr[i] = temp[k];
    }


    }

    // Created a void function for printing the array elements.
    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "");

        }
        System.out.println();
    }

     
    public static void main(String[] args) {
        int arr [] = {6,3,9,5,2,8};
        mergesort(arr, 0, arr.length-1);
        printarr(arr);

    }
}


//The Time Complexity of this Sorting Algo is O(logn)



// Your Java code implements the merge sort algorithm to sort an array of integers. Here's a breakdown of how your code works:

//1- The printarr method simply prints the elements of the array.

//2- The mergesort method is the recursive function that performs the merge sort algorithm. It takes an array arr, and two indices si and ei representing the starting and ending indices of the subarray to be sorted.

//3- Inside the mergesort method, if the base case si >= ei is met, the function returns. Otherwise, it calculates the mid index and recursively calls mergesort on the left and right halves of the array. Finally, it calls the merge method to merge the sorted halves.

//4- The merge method takes four parameters: the array arr, and the starting (si), middle (mid), and ending (ei) indices of the subarrays to be merged. It merges the two subarrays by comparing elements and storing them in a temporary array temp. Then, it copies the elements of temp back to the original array.

//5- In the main method, an array is initialized, mergesort is called to sort the array, and then the sorted array is printed using the printarr method.

