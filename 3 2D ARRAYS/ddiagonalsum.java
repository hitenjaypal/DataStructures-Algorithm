public class ddiagonalsum {

   

    public static int diasum (int matrix[][]) {

        // BRUTE FORCE APPROACH 
            // logic 
            int sum = 0;
        //loops for  rows and columns

        // for (int i = 0 ; i < matrix.length ; i++) {
        //     for (int j = 0 ; j < matrix[0].length ; j++){   // Col o se hi start ho isiliye mat[0] use kiya 
                
        //         // if(i==j){
        //         //     sum = sum + matrix[i][j];
        //         // }
        //         // else if (i + j == matrix.length-1) {
        //         //     sum = sum + matrix[i][j];

        //         // }

        //         // or 

        //         if (i == j || i + j == matrix.length - 1) {
        //             sum += matrix[i][j];
        //         }

        //     }
        // }



        // OPTIMAL SOLUTION 
        for (int i = 0 ; i < matrix.length ; i++) {
            //pd
            sum = sum + matrix[i][i];   //sum of diagonals from top left to bottom right

            // sd
            if(i!=matrix.length-i-1){ // Condition so that middle wala element do baar add na hojy 
                sum+=matrix[i][matrix.length-i-1]; // i + j = n-1 --> j = n-1-i; so we get the element at that index in column
               }
           
    }
    return sum ;
    }
   
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}};

            int answer = diasum(matrix);
            System.out.println(answer);
    }
}
