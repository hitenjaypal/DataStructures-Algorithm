import java.util.*;

public class acreation {
    public static void main(String[] args) {
        // Creating 2D array
        int matrix[][] = new int[3][3];

        // Intialized Variables (Row/Col)
        int n = 3, m = 3; // Both are same int n = matrix.length ,m= matrix[0].length;

        // INPUT 
        // Now we are taking Inputs from the users for our 2 D Matrix
        Scanner sc = new Scanner(System.in);
        // running loops for rows and columns of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Accessing the matrix
                matrix[i][j] = sc.nextInt();
            }
        }

        // OUTPUT
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
                
            }
            System.out.println("");
        }
    }

}
