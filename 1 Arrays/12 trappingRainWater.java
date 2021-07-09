//  12) Trapping rain water
// https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1#

import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}

// } Driver Code Ends



class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int trappingWater(int height[], int n) { 
        
        // Your code here
        
        int left =0, right = n-1;
        int trappedWater = 0;
        int maxLeft = 0, maxRight =0;
        
        while(left <= right){
            if( height[left] <= height[right]){
                if(height[left] >= maxLeft) maxLeft = height[left];
                else trappedWater += maxLeft-height[left];
                
                left++;
            }
            else{
                if(height[right]>= maxRight) maxRight = height[right];
                else trappedWater += maxRight-height[right];
                
                right--;
            }
        }
        
        return trappedWater;
    } 
}


