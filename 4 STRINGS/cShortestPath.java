public class cShortestPath {

    public static float  shortestPath(String path ){

        // Variables Intialized
        int x = 0 , y= 0;

        // Logic 
        for ( int i = 0 ; i < path.length () ; i ++) { 
            char dir = path.charAt(i);   // get the current character from the string  // char ko intialize kiya or path.charAt(i) daaldiya toh ek ek Word mai apne condition daalpye 
           

            // South
            if ( dir ==  'S'){
                y --;
            }
            // North 
            else if (dir == 'N' ) {
                y++;
            // West 
            }
            else if (dir == 'W' ) {
                x--;
            }
            // East 
            else {
                x++;
            }
            
        }

        // Return Logic 
        int x2 = x*x;
        int y2 = y*y;
 
        return (float) Math.sqrt(x2 + y2);  // type Casting because root mai answer point mai aa skta hai toh if int mai lete toh error aata toh float mai fn leleiya or last mai // (float) ese krna pdega 
    }

     public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(shortestPath(path));
    }
}
