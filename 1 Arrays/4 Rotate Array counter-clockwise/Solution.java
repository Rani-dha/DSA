// Program 4:https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1/

class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        
        //Approach 1:     

        d = d%n; //If the rotation is greater than size of the array, it's enough to rotate for d%n times.
        int temp[] = new int[d];

        // 1) Store the first d elements in a temporary array.
        for(int i=0; i<d;i++)
            temp[i] = arr[i];
        
        // 2) Shift rest of the elements of arr[] towards left.
        for(int i=0; i< n-d; i++)
            arr[i] = arr[i+d];
            
        // 3) Store back the d elements in the same order.
        for(int i=n-d,j=0; i<n; i++,j++) 
              arr[i] = temp[j];      
            
    }
}


/**
    // Approach 2 reversal of array.
    // 1) Reverse first d elements in the array starting from first index.
    // 2) Reverse the next (n-d) elemets left in the array.
    // 3) Reverse the whole array. 


class Solution
{
    //Function to reverse any part of the array.
    static void rvereseArray(int arr[], int start, int end) 
    { 
        int temp; 

        while (start < end) { 
            //Swapping values at start index and end index.
            temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp;
            //Updating the values of start and end.
            start++; 
            end--; 
        } 
    }
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        //First reversing d elements from starting index.
        rvereseArray(arr, 0, d-1);
        //Then reversing the last n-d elements.
        rvereseArray(arr, d, n - 1); 
        //Finally, reversing the whole array.
        rvereseArray(arr, 0, n - 1); 
    }
}
 
 */



