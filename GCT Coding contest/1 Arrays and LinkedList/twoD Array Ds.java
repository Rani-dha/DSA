// 2D array Ds
class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
        int maxResult = Integer.MIN_VALUE;
        int r=arr.size();
        int c= arr.get(0).size();
        for(int i=0;i<r-2;i++){
            for(int j=0; j<c-2;j++){
                int cur = arr.get(i).get(j)+ arr.get(i).get(j+1) + arr.get(i).get(j+2) + arr.get(i+1).get(j+1) + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                maxResult = Math.max(cur, maxResult);
            }
        }
        return maxResult;
    }

}

// Sample Input

// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 2 4 4 0
// 0 0 0 2 0 0
// 0 0 1 2 4 0
// Sample Output

// 19
// Explanation

// The hourglass with the maximum sum (19) is:

// 2 4 4
//   2
// 1 2 4
