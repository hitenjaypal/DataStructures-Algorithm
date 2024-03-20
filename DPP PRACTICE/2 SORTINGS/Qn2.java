public class Qn2 {
    public static void SelectionSort(int[] arr) {    
        // length
        int n = arr.length;

        // Loops for Counting Outer Loops Turns
        for (int i = 0; i < n-1 ; i++) {


            /* Inner Loop is used to find the minimum element in the array */
            // Unsorted Part se Mininum dhundna hai
            // The loop starts from the index that comes immediately after i, which is often used in algorithms to handle comparisons or operations within certain ranges of elements.

            // It finds the index of the minimum element in the unsorted portion.
            int MinPos = i; // Current ko min maana
            for (int j = i + 1 ; j < n; j++) { // Remember : we start from i+1 because we have already considered the first 'i' elements, so we compare ith element with all other.
                if (arr[MinPos] < arr[j]) { // if isko less krdu toh decreasing order mai print krega 
                    MinPos = j; // Update if our current element is greater then j
                }
            }
            // Swapping Bhar se ki hai Outer
            // Swap the found minimum element with the first element

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

