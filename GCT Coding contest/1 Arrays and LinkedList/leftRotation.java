// Left Rotation of array

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */
    private static void reverse(List<Integer> arr, int low, int high){
        while( low<high){
            Collections.swap(arr,low,high);
            low++;
            high--;
        }
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
       reverse(arr,0,d-1);
       reverse(arr, d, arr.size()-1);
       reverse(arr,0,arr.size()-1); 
       
        return arr;
    }

}
