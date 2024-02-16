public class epairsarray {
    public static void printpairs(int num[]){
        int tp=0;
        for(int i=0;i<num.length;i++){ // iteration hoga start to end 
            int current = num[i]; // will update after iteration //2,4,6,8,10
           for(int j=i+1;j<num.length;j++){  // For Pairing // j is inner loop so it paris the number // eg-> current then i+1 --> 2,4 // Will run till num.length  // i+1 means move forward 
            System.out.print("(" + current + "," + num[j] + ")"); // first current ko place krke then numofj->(num[j]) ko place krdega 
           tp++; 
           }
           System.out.println();
        }
        System.out.println("Total Pairs is:"+tp);
    }





    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        printpairs(num);
    }
}


// The time complexity of code will be 0(n^2)