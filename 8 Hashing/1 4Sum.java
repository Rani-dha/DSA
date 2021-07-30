// Program: 4Sum
// https://practice.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1#

// Initial Template for Java

import java.io.*;
import java.util.*;

class 4Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        
        int n = arr.length;
        
        Arrays.sort(arr);
        
        if( arr == null || n == 0) return result;
        
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
               int target2 = k - arr[i] - arr[j];
               
               int front = j+1;
               int back = n-1;
               
               while(front < back){
                   
                   int twoSum  = arr[front] + arr[back];
                   if( twoSum < target2 ) front++;
                   
                   else if( twoSum > target2) back--;
                   
                   else {
                       ArrayList<Integer> quad = new ArrayList<>();
                       quad.add(arr[i]);
                       quad.add(arr[j]);
                       quad.add(arr[front]);
                       quad.add(arr[back]);
                       result.add(quad);
                       
                       while ( front <back && arr[front] == quad.get(2) ) front++;
                       
                       while( front < back && arr[back] == quad.get(3)) back--;
                   }
               }
                 while( j+1 < n && arr[j+1] == arr[j]) j++;
            }
             while(i+1<n && arr[i+1] == arr[i]) i++;
        }
        
        return result;
    }
}