// Find duplicate rows in a binary matrix 
// Problem: https://practice.geeksforgeeks.org/problems/find-duplicate-rows-in-a-binary-matrix/1

class Solution
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        //code here
        ArrayList<Integer> dupRows = new ArrayList<>();
    HashSet<String> hs = new HashSet<>();
    for(int i=0;i<m;i++){
        String str = "";
        for(int j=0;j<n;j++)
            str += String.valueOf(matrix[i][j]);
        
        if( !hs.contains(str))
            hs.add(str);
        else
             dupRows.add(i);
    }    
    return dupRows;
    }
}


// Input:
// R = 4, C = 3
// matrix[][] = {{ 1, 0, 0},
//               { 1, 0, 0},
//               { 1, 0, 0},
//               { 0, 0, 0}}
// Output: 
// 1 2 
// Explanation:
// Row 1 and Row 2 are duplicates of Row 0. 

