// Dry Run 

// Imagine do Alg Height ki Building ke bichme pani bhara hai
// 1.Create Leftmax bound Auxilary Array  
// 2.Create Rightmax bound Auxilary Array 
// 3.Loop Run 
// 4.Water Level = min (Leftmax Bound , Rightmax Bound)
// 5.Trapped Water = WaterLevel - Height[i]


import java.util.*;

public class TrappedWater {
    public static int Rainwater(int height[]){

        int n = height.length;

        
        // Create Leftmax bound Auxilary Array 
        // Oth Index toh Pehla Se Hi Rehta Hai
        // Toh apne loop Ist INdex se run krenge for LEftmax bound
        int Leftmax[] = new int [n];
        Leftmax[0] = height[0]; 
        for (int i =1; i < n ; i++){
            Leftmax[i] = Math.max(Leftmax[i-1],height[i]); // Compare krega aaju baju ki building jo bdi hogi voh print hogi
        }


        // Create Rightmax bound Auxilary Array 
        // n-1 th Index toh Pehla Se Hi hoga 
        int Rightmax[] = new int [n];
        Rightmax[n-1] = height[n-1];
        for (int i=n-2; i>=0;i--){
            Rightmax[i]= Math.max(Rightmax[i+1],height[i]);
        }

        // Loop 
        // Water Level = min (Leftmax Bound , Rightmax Bound)
        // Trapped Water = WaterLevel - Height[i]
        int Trappedwater = 0;
        for (int i =0 ;i<n ; i++ ){
        int WaterLevel = Math.min(Leftmax[i] , Rightmax[i]);
        Trappedwater = Trappedwater + WaterLevel - height[i];
        }
        return  Trappedwater;
    }



    public static void main(String[] args) {
        int height[]= {4,2,0,6,3,2,5};
        System.out.println(Rainwater(height));
        
    }
    
}
