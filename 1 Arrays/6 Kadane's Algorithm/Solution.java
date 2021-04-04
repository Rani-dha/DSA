// Program 6: https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1/

class Solution{
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        int maxEndHere = 0, maxSoFar = Integer.MIN_VALUE;
        
        //Iterating over the array.
	    for(int i=0; i<n; i++){
	        
	        //Updating max sum till current index.
	        maxEndHere+=arr[i];
	        //Storing max sum so far by choosing maximum between max 
            //sum so far and max sum till current index.
	        if(maxSoFar < maxEndHere)
                 maxSoFar = maxEndHere;
	        
	        //If max sum till current index is negative, we do not need to add
            //it to result so we update it to zero.
	        if(maxEndHere<0)
	            maxEndHere=0;

        }
         //returning the result.   
        return maxSoFar;
    }
}

