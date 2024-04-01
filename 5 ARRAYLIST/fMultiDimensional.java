import java.util.ArrayList;

public class fMultiDimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>(); // Create a multidimensional arraylist
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // this is how you add other list to main one
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }

        System.out.println(mainList); // Will Print Main List in Single Line after That we have to print this in proper Dimensional so below Logic is Exist 

        // Printing all Numbers
        // Nested Loops 

        // Created one CurrentList AL so that Printing Happens
        // Main List to CurrList to Printing Elements 
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i); // Ek Al banya jo main list se lyga sb
           
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + "");
            }
            System.out.println();
        }

    }
}
