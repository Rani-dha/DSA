// Program 2: Row  with max 1's
// https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1/?category[]=Arrays&category[]=Arrays&difficulty[]=1&page=1&query=category[]Arraysdifficulty[]1page1category[]Arrays#

// Time complexity: O(n+m)
// Aux space : O(n)

//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int BinarySearch( int arr[], int left, int right){
        if( right >= left){
            int mid = left + (right-left)/2;
            if((mid == 0 ||arr[mid-1] == 0 ) && arr[mid] == 1 )
               return mid;
             
            else if( arr[mid] == 0)
                return  BinarySearch(arr, mid+1, right);
            
            else 
                return BinarySearch(arr,left, mid-1 );
        }
        return -1;
    }
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int maxRow = -1, max =-1, index;
        for(int i=0; i<n;i++){
            index =BinarySearch(arr[i], 0, m-1);
            if( index != -1 && m-index > max){
                max = m-index;
                maxRow = i;
            }
        }
        return maxRow;
    }
}

// Input: 
// N = 4 , M = 4
// Arr[][] = {{0, 1, 1, 1},
//            {0, 0, 1, 1},
//            {1, 1, 1, 1},
//            {0, 0, 0, 0}}
// Output: 2
// Explanation: Row 2 contains 4 1's (0-based
// indexing).