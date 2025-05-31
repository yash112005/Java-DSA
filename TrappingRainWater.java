public class TrappingRainWater {
    public static int trappingRainWater ( int[] height){
        if (height == null || height.length == 0) return 0;

        int left = 0, right = height.length - 1;
        int maxLeft = 0, maxRight = 0;
        int water = 0;

        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    water += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    water += maxRight - height[right];
                }
                right--;
            }
        }
        return water;
    }
    public static void main(String[] args) {
            int[] height = {0,4,6,10,7,2,9};
            System.out.println("Trapped Water: " + trappingRainWater(height));

    }
}
