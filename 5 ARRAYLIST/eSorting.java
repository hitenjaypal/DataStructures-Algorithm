import java.util.ArrayList;
import java.util.Collections;

public class eSorting {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(1);

        // Ascending Order 
        Collections.sort(list); // This is direct method for Sorting
        System.out.println(list);

        // Descending Order 
        Collections.reverse(list); // This is indirect method to sort in descending order
        System.out.println(list);

}
}