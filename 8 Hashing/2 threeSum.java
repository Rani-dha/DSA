// 2) ThreeSum
// https://leetcode.com/problems/3sum/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplet = new ArrayList<>();
       Arrays.sort(nums);
        int n = nums.length;

       for(int i=0;i<n-2;i++){
           if( i==0 || i>0 && nums[i] != nums[i-1] ){
            int target = 0 - nums[i];
           int lo =i+1, hi = n-1;
           while( lo<hi){
               int twosum = nums[lo] +nums[hi];               
               if ( twosum < target) lo++;
               else if(twosum > target) hi--;  
               else if( twosum == target){
                    List<Integer> cur = new ArrayList<Integer>();
                    triplet.add(Arrays.asList(nums[i],nums[lo], nums[hi]));
                  
                   while(lo<hi && nums[lo] == nums[lo+1]) lo++;
                   while(lo<hi && nums[hi] == nums[hi-1])hi--;
                  lo++;
                  hi--;
               }
           }
           }
       }
       return triplet;
    }
}


// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]

// Input: nums = [0]
// Output: []

// Input: nums = []
// Output: []
