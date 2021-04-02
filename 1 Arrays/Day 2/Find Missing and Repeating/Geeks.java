//  Program 3 : 

// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        
        // Naive Approach
        int res[] = new int[2];
        int freq[] = new int[n];
        for(int i=0 ; i<n; i++)
           freq[arr[i]-1]++;  
           
        // Calculating the frequency of numbers in array   
       
        for(int i=0; i<n;i++){
           if(freq[i] == 2) // when frequency equals to 2, it is the repeating number.
              res[0] = i+1;
            
            if(freq[i] == 0)// when frequency equals to 0, it is the missing number.
              res[1] = i+1;              
        }
        return res;

        /**
         * Optimal Solution
        
        int[] ans = new int[2];
        int i;
        for (i = 0; i < n; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                ans[0] = abs_val;
        }
        for (i = 0; i < n; i++) {
            if (arr[i] > 0) ans[1] = i + 1;
        }
        return ans;

        Explanation:
            Traverse the array. 
            While traversing, use the absolute value of every element as an index and make the value at this index as negative to mark it visited.
            If something is already marked negative then this is the repeating element.
            To find missing, traverse the array again and look for a positive value.

         */

    }
}