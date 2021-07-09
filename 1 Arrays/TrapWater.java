//
//

class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int trappingWater(int height[], int n) { 
        
        // Your code here
        
        int left =0, right = n-1;
        int trappedWater = 0;
        int maxLeft = 0, maxRight =0;
        
        while(left < right){
            if( height[left] <= height[right]){
                if(height[left] >= maxLeft) maxLeft = height[left];
                else trappedWater = maxLeft-height[left];
                
                left++;
            }
            else{
                if(height[right]>= maxRight) maxRight = height[right];
                else trappedWater = maxRight-height[right];
                
                right--;
            }
        }
        
        return trappedWater;
    } 
}
