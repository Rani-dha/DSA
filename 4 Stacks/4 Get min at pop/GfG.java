// Program 4: Get min at pop
// https://practice.geeksforgeeks.org/problems/get-min-at-pop/1/?track=Java-Collections-Stack&batchId=318

//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class getMin
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Taking all the testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //Taking total number of elements
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            //adding all the elements to the array
            for(int i = 0; i < n; i++)
              arr[i] = sc.nextInt();
             
            //calling _push method of class GetMin 
            //and storing the result in a new Stack
            Stack<Integer>mys = new GetMin()._push(arr,n);
            
            //calling _getMinAtPop method of class GetMin
            new GetMin()._getMinAtPop(mys);
        }
    }
}// } Driver Code Ends


//User function Template for Java


class GetMin
{
    //Function to push all the elements into the stack.
    public static Stack<Integer> _push(int arr[],int n)
    {
        // your code here
        Stack<Integer> ms = new Stack<Integer>();
        Stack<Integer> as = new Stack<Integer>();
        ms.push(arr[0]);
        as.push(arr[0]);
        for(int i=1;i<n; i++){
            ms.push(arr[i]);
            if( ms.peek() <= as.peek() )
                as.push(arr[i]);
            else 
                as.push(as.peek());
        }        
        return as;
    }
    
    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s)
    {
        while(!s.isEmpty())
          System.out.print( s.pop() + " ");
          //ms.pop();  
          
          System.out.println();
        
    }
}

/* 
Input: 
N = 7
A = {1 6 43 1 2 0 5}
Output: 
0 0 1 1 1 1 1
Explanation: 
After pushing the elements to the stack, 
the stack will be 5->0->2->1->43->6->1. 
Now, poping the elements from the stack:
popping 5: min in the stack is 0. popped 5
popping 0: min in the stack is 0. popped 0
popping 2: min in the stack is 1. popped 2
popping 1: min in the stack is 1. popped 1
popping 43: min in the stack is 1. 
            popped 43
popping 6: min in the stack is 1. popped 6
popping 1: min in the stack is 1. popped 1.
*/