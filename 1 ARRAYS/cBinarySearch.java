public class cBinarySearch {
    public static int binarysearch(int num[],int key){
        int start =0 , end =num.length-1;  //set the range of search to be searched in
        
        while (start <=end) {  // jbtk chlega tbtk start < end || start = end hojy
            
            int mid = (start + end)/2; 
            
            //comparisons 
            if(num[mid]==key){ //found   // num[mid] means --> element at index mid 
                // remember to use //big bracket //when you point element at specific index
                return mid;
            }
            if(num[mid]<key) { // right side jygi kyuki mid agr chota hai toh usse phele sb chote honge kyuki binary search ka prequiste hai ki voh sorted hota hai
                 start=mid+1 ;//if the middle element is greater than the key, discard the left half
            }
            else { //left
                end = mid-1;   //if the middle element is smaller than the key, discard the right half // therefore piche jyga 
            }

        }
        return -1;   //return -1 if not found
    
    }









    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14};
        int key =10;

        System.out.println("index for key is:"+ binarysearch(arr, key));  // call by reference print krta hai array 
    }
    
}
 
