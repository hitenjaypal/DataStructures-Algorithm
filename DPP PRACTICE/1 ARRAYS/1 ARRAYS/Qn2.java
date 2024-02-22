// This problem is a variant of the classic binary search problem 
// where the array is sorted in ascending order but
// may be rotated at some unknown pivot point. 
// The objective is to find the index of a given Key integer in the array.

//To solve this problem with O(log n) runtime complexity, you can use a modified binary search algorithm. 

public class Qn2{


        public static int search(int[] num, int key) {
            int start = 0;  
            int end = num.length - 1;
            
            while (start <= end) {
                int mid = start + (end - start) / 2;
                
                if (num[mid] == key) {
                    return mid;
                }
                
    
    
                //1
                // Check if the left part is sorted
                if (num[start] <= num[mid]) {
    
                    
                    // Check if the key is within the right half
                    if ( key >= num[start]   && key < num[mid]) {  // Check Krenge ki jo key hai voh oth index se bdi hai and key mid se choti hai if yeh dono condition true hojygi then ki key righr side move kregi 
                        end = mid - 1; // right side move kiya if true
                    } else {
                        start = mid + 1; // left side move kiya if false
                    }
    
    
                //2
                // Check if the right part is sorted
            } else { 
    
                
                // Check if the key is within the left half
                    if (key > num[mid]  && key <= num[end]) {
                        start = mid + 1; // left side move kiya if false
                    } else {
                        end = mid - 1; // right side move kiya if true
                    }
                }
            }
            
            return -1; // key not found
        }
    
        public static void main(String[] args) {
    
            int num[]={2,4,6,8,10,12,14};
            int key =10;
    
            System.out.println("index for key is:"+ search (num, key));  // call by reference print krta hai array 
        }
    }
    