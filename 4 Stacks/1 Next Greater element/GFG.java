// Program 1: Next Greater element in a array.
// https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1/?track=md-stack&batchId=144#

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}



// } Driver Code Ends





class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        
        Deque<Long> stack = new ArrayDeque<Long>();
        long l[] =  new long[n];
        l[n-1] = -1;
        stack.push(arr[n-1]);
        
        for( int i= n-2; i>=0; i--){
            while( stack.isEmpty() == false && stack.peek() <= arr[i] ) //Remove the elements which is smaller than the current element.
              stack.pop();
            
            l[i]  = (stack.isEmpty() ? -1 : stack.peek()); // If there is no next greater element than add as -1 else add the Next Greater element.
            stack.push(arr[i]); //Finally push the current element  into the stack.
        }
        
        return l;
        
    } 
}