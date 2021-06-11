//11 Rotate by 90 degree anticlockwise 
// https://practice.geeksforgeeks.org/problems/rotate-by-90-degree0356/1#

//Initial Template for Java

import java.util.*; 
import java.io.*;
import java.lang.*;

class DriverClass
{
	public static void main(String[] args) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    arr[i][j] = sc.nextInt();
            
            GFG g = new GFG();
            g.rotate(arr);
            printMatrix (arr);
        }
	} 
	
	static void printMatrix(int arr[][]) 
	{ 
		for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr[0].length; j++) 
				System.out.print(arr[i][j] + " "); 
			System.out.println(""); 
		} 
	} 
}// } Driver Code Ends


//User function Template for Java

class GFG
{
    static void transpose(int a[][],int n){
        for(int i=0;i<n;i++){
            for(int j=i; j<n;j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
    static void reverseColumns(int a[][], int n){
        for(int i=0;i<n;i++){
            for(int j=0, k =n-1; j<k; j++,k--){
                int temp = a[j][i];
                a[j][i] = a[k][i];
                a[k][i] = temp;
            }
        }
    }
    static void rotate(int matrix[][]) 
    {
        // Code Here
        transpose(matrix, matrix[0].length);
        reverseColumns(matrix, matrix[0].length);
    }
}
