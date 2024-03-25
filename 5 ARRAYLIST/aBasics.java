import java.util.ArrayList;



public class aBasics {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();


        // Add Operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);// [1, 2, 3, 4]

        // Get Operation 
        System.out.println(list.get(0));  // 1

        // Delete Operation 
        list.remove(1); // 1 is index 
        System.out.println(list);   //[1, 3, 4]\


        // Set or Modify Operation 
        list.set(0,2);
        System.out.println(list);     //[2, 3, 4]


        // Contains Operation 
        list.set(0,2);
        System.out.println(list.contains(3)); // false
        System.out.println(list.contains(4)); // true


        // Size of list 
        System.out.println(list.size());      // 3


        //Iteration 
        for (int i = 0; i < list.size(); i++) {  // list.size means the number of elements in arrayList
            System.out.print(list.get(i)+" ");
        }// 2 3 4
        
        System.out.println();
    }
 
    }
    
