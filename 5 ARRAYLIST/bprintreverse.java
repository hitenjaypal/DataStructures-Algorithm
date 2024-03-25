import java.util.ArrayList;

// size(for Iteration) --> Get(for printing)
// [ (Size mai se nikal na // it is thoda diff than other loops term but we have to rememeber this ) ]
public class bprintreverse {
    public static void reverse(ArrayList<Integer> list) {
        for (int i = list.size()-1; i >= 0; i--){
            System.out.println(list.get(i) + " ");
    }
    System.out.println();
}

public static void main(String args[]) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    reverse(list);
}
}