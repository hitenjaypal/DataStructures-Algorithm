//Given n non-negative integers representing an elevation map where the width of each bar is 1,
// compute how much water it can trap after raining

public class Qn4 {

    public static int trap(int[] height) {

        int n = height.length;

        // left max bound
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
        }

        // right max bound
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i > 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], height[i]);

        }
        // loop run
        // min of left and right = WL
        // TW = WL - Height

        int tw = 0;
        for (int i = 0; i < n; i++) {
            int wl = Math.min(leftmax[i], rightmax[i]);
            tw = (tw + wl) - height[i];
        }
        return tw;
    }

    public static void main(String[] args) {
        int[] height = { 0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(height));
    }

}