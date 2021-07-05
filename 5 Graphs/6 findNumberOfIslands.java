//
//

import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends




class Solution
{
    //Function to find the number of islands.
    public int numIslands(char[][] grid)
    {
        // Code here
        if( grid == null || grid.length == 0) return 0;
        int numOfIslands = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == '1'){
                    numOfIslands += dfs(grid,i,j);
                }
            }
        }
        return numOfIslands;
    }
    
    public int dfs(char grid[][],int i,int j){
if( i<0 || i >= grid.length || j<0 || j >= grid[i].length || grid[i][j] != '1')
            return 0; 
            
        grid[i][j] = '2';    
        dfs(grid, i+1, j);
        dfs(grid, i-1,j);
        dfs(grid, i,j+1);
        dfs(grid, i,j-1);
      
        // diagonal traversal
        dfs(grid, i+1,j+1); //downward-right side traversal
        dfs(grid, i-1,j-1); //upward-left side traversal
        dfs(grid, i+1,j-1); //downward-left side traversal
        dfs(grid, i-1,j+1); //upward-right side traversal
        
        return 1;
    }
}
