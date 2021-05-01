//  Merge without extra space
//  https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays5135/1/?track=md-arrays&batchId=144#

class Solution {

    public int gapNext(int gap) {
        if (gap <= 1)
            return 0;
        return (gap / 2) + (gap % 2);
    }

    public void merge(int arr1[], int arr2[], int n, int m) {
        // code here
        int gap = (n + m);
        int i, j;
        // for(gap = gapNext(gap); gap > 0; gap = gapNext(gap)){ // both for and while works fine
       
        while ((gap = gapNext(gap)) > 0) {
            for (i = 0; i + gap < n; i++) {
                if (arr1[i] > arr1[i + gap]) {
                    arr1[i] += arr1[i + gap] - (arr1[i + gap] = arr1[i]); // swapping in single line
                }
            }

            for (j = (gap > n) ? gap - n : 0; i < n && j < m; i++, j++) {
                if (arr1[i] > arr2[j]) {
                    arr1[i] += arr2[j] - (arr2[j] = arr1[i]);  // swapping in single line
                }
            }

            if (j < m) {
                for (j = 0; j + gap < m; j++) {
                    if (arr2[j] > arr2[j + gap]) {
                        arr2[j] += arr2[j + gap] - (arr2[j + gap] = arr2[j]);  // swapping in single line
                    }
                }
            }

        }
    }
}