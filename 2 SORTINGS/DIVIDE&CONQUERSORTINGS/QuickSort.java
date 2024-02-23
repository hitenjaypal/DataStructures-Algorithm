public class QuickSort {

    // Function for only printing the elements
    public static void printarr(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }



    // Recursive Function for Logic 
    public static void quicksort(int arr[],int si, int ei){
        // Base Case
        if (si >= ei){
         return;
    }
    // Last element as Pivot
    int pIdx= partition(arr,si,ei);
    
    // Recursively calling function on left of pivot and right of pivot
    quicksort(arr,si,pIdx-1); // left (p-1 mtlb left part pivot se phele ka)
    quicksort(arr,pIdx+1,ei); // Right (p+1 mtlb pivot se aage ka part RIGHT )
    }



    // Parti
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; //pivot liya array ka last element
        int i = si-1;  // Jagah banana we have understand this concept isme apne -1 lete hai then pivot se choti ko aageplace krte hai 

        
        // Below logic mai esa hai ki agar apna i pivot se chota hoga toh voh aage aayga (i++) then value jo choti hogi usse swap krdega 
        for (int j =si; j<ei;j++){
            if (arr[j] <= pivot){
                i++;

                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp ;
            }
        }
        i++;
        // //////
        int temp = pivot;
        arr[ei] = arr[i]; // yeh nai likhna hai pivot = arr[i] --> kyuki pivot toh variable hai apne ko index ko swap krna hia isiliye 
        arr[i] = temp ;
    
        return i; //returning the index of pivot after placing it at its correct position in sorted array.

    }




    public static void main (String[] args) {
        int arr [] = {6,3,9,8,2,5};
        quicksort(arr, 0,  arr.length - 1);
        printarr(arr);
    }
    

}
