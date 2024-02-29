public class esearchinsortedmatrix {
    public static boolean  searchInSortedMatrix(int[][] matrix , int key){

        // variables intialized 
        int row = 0 , col = matrix[0].length -1 ;

        // logic 

        while (row<matrix.length &&  col >= 0) {  // logic row o se start hogi or col n-1 se toh loop chladi dono ki opp so that work kre
            if ( matrix [row][col] == key ) {  // simple logic for first cond
                System.out.println("found key at ("+row+" , "+col+")");
                return true;
            }

            else if (key < matrix[row][col]) { // logic k < mat --> Left jao(col--) || K > mat --> Bottom jao (row++) 
                col -- ;
            }else {
                row ++ ;
            }
        }
        System.out.println("Key nai Mili");
        return false ;
    }


    public static void main(String[] args) {
        int matrix[][]=
           {{10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}};
            
            int key = 29;
            searchInSortedMatrix(matrix, key);

}
}


// Tc --> O(n+m)