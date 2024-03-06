
public class fprintLargestString {
    
    public static void main(String[] args) {
        String fruits [] = {"apple","mango","banana"}; // Created String Array

        String largest = fruits[0]; 

        for ( int i =1 ; i < fruits.length ; i++)  {

            if (largest.compareTo(fruits[i]) < 0){  // largest < fruits[0] toh badi wali str ko largets mai store krdo
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
