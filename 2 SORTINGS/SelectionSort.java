public class SelectionSort {
    public static void SelectionSort(int[] arr) {
        // length
        int n = arr.length;

        // Loops for Counting Outer Loops Turns
        for (int i = 0; i < n-1 ; i++) {
            // Declaring Min Position Variable for Comaparing with other elements
            int MinPos = i; // Current ko min maana

            /* Inner Loop is used to find the minimum element in the array */
            // Unsorted Part se Mininum dhundna hai
            for (int j = i + 1; j < n; j++) { // i+1 mtlb unsorted mai jyga aage toh sorted hoga
                if (arr[MinPos] > arr[j]) { // if isko less krdu toh decreasing order mai print krega 
                    MinPos = j; // Update if our current element is greater then j
                }
            }
            // Swapping in outer loop Bhar se hi
            // Inner loop mai dhunda minimum usse swap krdia easy bc
            int temp = arr[MinPos];
            arr[MinPos] = arr[i];
            arr[i] = temp;
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
        int arr[] = { 5, 4, 1, 3, 2 };
        SelectionSort(arr);
        printarr(arr);


    }

}
