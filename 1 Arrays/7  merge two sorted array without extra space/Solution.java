//  Merge without extra space
//  https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays5135/1/?track=md-arrays&batchId=144#

class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        // code here
        
         // code here
        int gap =  (n+m)/2 +  (n+m)%2 ;
        while( gap > 1){
            int i,j,k;
            for( i = 0; i+gap < n; i++){
                if( arr1[i] > arr1[i+gap]){
                    arr1[i] += arr1[i+gap] - ( arr1[i+gap] = arr1[i]);
                }
            }
            
            for( j=0; i<n && j <m; i++,j++){
                    if( arr1[i] > arr2[j]){
                    arr1[i] += arr2[j] - ( arr2[j] = arr1[i]);
                }
            }
            
            for( k=0; (k+gap) < m; k++ ){
                if( arr2[k] > arr2[k+gap]){
                    arr2[k] += arr2[k+gap] - ( arr2[k+gap] = arr2[k]);
                } 
            }
            
            gap = (gap/2) + (gap%2);
        }
    }
}