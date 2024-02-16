public class aLinearSearch {
        
    public static int linearsearch(int num[],int key) { 
        /* This method can be used to search an integer value within an array using Linear Search Algorithm.
      It takes two parameters:
      1- An Integer Array which contains elements.
      2- The Number we want to find its position/index in the array.
    */

    //logic
        for(int i=0;i<num.length;i++){
            if (key == num[i]){
                return i; //return the index of the element in array that matches with the given number
            }
        }
        return -1;  //Return -1 if no match is found
    }
        

    public static void main(String[] args) {
        int arr [] = {2,4,6,8,10,12,14}; //array to be searched
        int key =12;
        System.out.println(linearsearch(arr,key));//give the number you are looking for  

}
}


// Same Code for Character 

// public class aLinearSearch {
//     public static int linearsearch(char num[],char key){
    
//     for(int i=0;i<num.length;i++){
//                 if (key == num[i]){
//                     return i;
//                 }
//             }
//             return -1; 
//         }
    
    
    
    
    
    
    
//       public static void main(String[] args) {
//         char[] arr = {'d', 'i', 'v', 'c', 'l'};
//         char key = 'd';
//       System.out.println(linearsearch(arr,key));
      
      
//       }
//     }



// The elements in the array should be of type char, but in your array initialization, they are not enclosed in single quotes, which is necessary for characters.

// In Java, characters should be enclosed in single quotes, like 'd', 'i', 'v', 'c', and 'l'.

// In the main method, you are assigning variables without proper initialization. For example, dosa, idli, vada, chai, and lays should be declared as characters by enclosing them in single quotes.

// You are trying to pass characters as integers, which will cause compilation errors. You need to pass characters as characters, not integers.