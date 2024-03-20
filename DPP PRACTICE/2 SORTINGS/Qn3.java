public class Qn3 {
    

        public static void Insertionsort(int arr[]) {
    
            // Length
            int n = arr.length;
    
            // Outer Loop (from the second element to the last element of array)
            for (int i = 1; i < n; i++) {
                // 1 se kiya kyuki apne ko second ko first or Current ko Previous se Compare
                // krna pdega Remember this shit
    
                // Created @ variable Current and Previous
                int Curr = arr[i];  // We Have Created a temporary Memory  // arr[i] -->allows access to the value stored at a particular index & i --> Stored Indexes 
                int Prev = i - 1;
    
                // Finding out the Correct Position to Insert
                // Now will Run While loop
                while (Prev >= 0 && arr[Prev] < Curr) { // < then Descending Order 
                    // Shift the previous element one position ahead
                    arr[Prev + 1] = arr[Prev]; // Move elements that are greater , by one position ahead
                    Prev--; // piche push kr rahe hai 
    
                }
                // Final Insertion 
                arr[Prev+1] = Curr;
    
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
            Insertionsort(arr);
            printarr(arr);
    
        }
    
    }
    

