


class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length -1;
        int t;
        
        while(mid <= high){
            switch( nums[mid]){
                case 0: {
                    t = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = t;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }    
                case 2: {
                    t = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = t;
                    high--;
                    break;
                }    
            }
        }
        
    }
}