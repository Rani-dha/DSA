// Program 4: 

class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        
        //Approach 1:
        
        // 1) Store the first d elements in a temporary array.
        // 2) Shift rest of the elements of arr[] towards left.
        // 3) Store back the d elements in the same order.


        d = d%n; //If the rotation is greater than size of the array, it's enough to rotate for d%n times.
        int temp[] = new int[d];
        for(int i=0; i<d;i++)
            temp[i] = arr[i];
        
        for(int i=0; i< n-d; i++)
            arr[i] = arr[i+d];
            
        for(int i=n-d,j=0; i<n; i++,j++) 
              arr[i] = temp[j];
            
    }
}