// Here's a brief explanation of the bubble sort algorithm:

// Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
// The pass through the list is repeated until the list is sorted.
// Each pass through the list places the next largest element in its proper place.

public class Qn1 {

    public static void bubblesort(int arr[]) {
        //  get the length of array
        int n = arr.length;

        // Loop for Outer
        // not only length
        // Yeh lagane se Index mai convert krdeta hai
        for (int turn = 0; turn < n - 1; turn++) { // n-1 turns li // Yaad Rakh  // 4 turns li thi 

            // Loop for inner
            for (int j = 0; j < (n - 1) - turn; j++) { // (- turn) se dheme dheme turn aage hota jyga
                // for(int j = 0; j=<arr.length-2-turn;j++){ // Both are same just =//is the
                // differemce = then n-2 // < is then n-1

                // Compare Adjacent element if j > j+1 then Swapping
                if (arr[j] < arr[j + 1]) { // If current element is greater than next one then swap them

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    // Created a Void Function for Printing the arr or Above Logic
    public static void printarr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        bubblesort(arr);
        printarr(arr);
    }

}