// https://leetcode.com/problems/sudoku-solver/submissions/

class suduko {
       
        public void solveSudoku(char[][] board) {
            if(board == null || board.length == 0)
                return;
            solve(board);
        }
        
        public boolean solve(char[][] board){
            for(int i = 0; i < board.length; i++){
                for(int j = 0; j < board[0].length; j++){
                    if(board[i][j] == '.'){
                        for(char c = '1'; c <= '9'; c++){//trial. Try 1 through 9
                            if(isValid(board, i, j, c)){
                                board[i][j] = c; //Put c for this cell
                                
                                if(solve(board))
                                    return true; //If it's the solution return true
                                else
                                    board[i][j] = '.'; //Otherwise go back
                            }
                        }
                        
                        return false;
                    }
                }
            }
            return true;
        }
        
        private boolean isValid(char[][] board, int row, int col, char c){
            for(int i = 0; i < 9; i++) {
                if(board[i][col] != '.' && board[i][col] == c) return false; //check row
                if(board[row][i] != '.' && board[row][i] == c) return false; //check column
                if(board[3 * (row / 3) + i / 3][ 3 * (col / 3) + i % 3] != '.' && 
    board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false; //check 3*3 block
            }
            return true;
        }
    }

// https://practice.geeksforgeeks.org/problems/solve-the-sudoku-1587115621/1#

//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int grid[][] = new int[9][9];
            for(int i = 0; i < 9; i++)
            {
                for(int j = 0; j < 9; j++)
                grid[i][j] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            if(ob.SolveSudoku(grid) == true)
                ob.printGrid(grid);
            else
                System.out.print("NO solution exists");
            System.out.println();
            
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
        static boolean isSafe(int i,int j,int n,int[][] grid){
        for(int k=0;k<grid.length;k++){
            if(grid[k][j] == n || grid[i][k] == n)
                return false;
        }
        
        
        //int s=(int)Math.sqrt(n);
        int s = 3; //s will be equal to 3
        int rs=i-(i%s);
        int cs=j-(j%s);
        
        
        for(int l=0;l<s;l++){
            for(int m=0;m<s;m++){
                if(grid[l+rs][m+cs] == n)
                    return false;
            }
        }
        return true;
    }
    
    
    
    static boolean SolveSudoku(int grid[][])
    {
        int i=0,j=0;
        int n=grid.length;
        boolean fnd = false;  //flag to indicate if an unassigned location is found
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(grid[i][j] == 0){
                    fnd = true; //mark it as true 
                    break;
                }
            }
            if(fnd) //if flag is true, break
             break;
        }
        
        if(i == n && j==n)
            return true; 
        
        for(int k=1;k<=n;k++){
            if(isSafe(i,j,k,grid)==true){
                grid[i][j]=k; //assign grid[i][j] as k
                if(SolveSudoku(grid)==true)
                    return true;
                grid[i][j]=0;    
            }
        }
        return false;
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        if(SolveSudoku(grid) == true){
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid.length;j++){
                    System.out.print(grid[i][j]+" ");
                }
            }
        }
    }     
}






