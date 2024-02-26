public class cspirallmatrix {

    public static void main(String args[]){


        // Created matrix with the values
        int matrix[][]={{1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}};


        // Intialized Variables 
        int startcol=0;
        int startrow=0;
        int endcol=matrix[0].length-1; // Update to consider columns
        int endrow=matrix.length-1; // Update to consider rows



        // Main Logic

        while(startrow<=endrow && startcol<=endcol){ // Condition Logic is Important 
            // Top row
            for(int j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            startrow++;
            
            // Right column
            for(int i=startrow;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            endcol--;
            
            // Bottom row
            if(startrow<=endrow){  // Condition Remember for Not Repeat the element  // because hmne top ko change kia hia eg last mai top++ kiya hai tioh kya pta ab top bottom se pdha hogya ho similiarly for left 
                for(int j=endcol;j>=startcol;j--){
                    System.out.print(matrix[endrow][j]+" ");
                }
                endrow--;
            }
            
            // Left column
            if(startcol<=endcol){  // Condition Remember for Not Repeat the element 
                for(int i=endrow;i>=startrow;i--){
                    System.out.print(matrix[i][startcol]+" ");
                }
                startcol++;
            }
        }
    }
}
