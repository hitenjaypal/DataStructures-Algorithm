import java.util.*;

public class abasic{


    // void Function 
    public static void update(int marks[]){
        //logic
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }

    public static void main(String args[]) {
        int marks[]= {97, 98, 99};
        update(marks); // call krdiya ab niche function chalega update hokr ek ek print krega hehehe

        //print our marks 
        for(int i=0; i<marks.length; i++) {  // apne ne direct call nai kiya kyuki array ko ek ek krek call krna hota hai // therefore callorprint krne ke liye direct loop daaldi 
            //use only when apne ko ek ek krke  print karna hai 
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}