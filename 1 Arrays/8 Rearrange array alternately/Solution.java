//
//


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
