// Rearrange array alternately
// https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1/?track=md-arrays&batchId=144#


class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(int arr[], int n){
        
        
        int max = n-1, min = 0,i;
        int m = arr[max]+1;
        for( i=0; i<n; i++){
            arr[i] = arr[i] + ( (i%2 == 0) ? (arr[max--]%m *m ) : arr[min++]%m *m );
        }
        
        for ( i=0; i<n; i++)
           arr[i] /= m;
        
    }
    
}


/* Input:
N = 11
arr[]={10,20,30,40,50,60,70,80,90,100,110}
Output:110 10 100 20 90 30 80 40 70 50 60
Explanation: Max element = 110, min = 10, 
second max = 100, second min = 20, and 
so on... Modified array is : 
110 10 100 20 90 30 80 40 70 50 60.  */
