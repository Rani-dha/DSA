// Prograam 3: Get Minimum element from stack in O(1) time complexity.
// https://practice.geeksforgeeks.org/problems/get-minimum-element-from-stack/1/?track=ppc-stack&batchId=221#


import java.util.*;

class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}


// } Driver Code Ends


class GfG
{
    int minEle = -1;
    Stack<Integer> s = new Stack<Integer>();
    //If Stack<Integer> s; is only assigned, and you try to push into stack it throws NullPointerException. So must assign properly!!

    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	if( s.isEmpty() == true) // Getting min from empty stack is always -1.
	    return -1;
	return minEle;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	if( s.isEmpty() == true)
	   return -1;
	
	int  top = s.peek();   
	s.pop();
	
	if( top < minEle ){
	    int result = minEle;
	    minEle = 2*minEle - top;
	    return result;
	}
	else 
	   return top;	   
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here
	   if(s.isEmpty() == true){
	     minEle = x;
	     s.push(x);
	   }
	  
	  else{
	    if( x < minEle){
	       s.push(2*x - minEle);
	       minEle = x;
        }
        else
	      s.push(x);
      }	
}
}


/*
Input:
2 1 16 3 2 2 1 50 2 3 2 3 2 3 2 1 27 2 2 3 3 1 30 3 3 3 2 2 2 3 1 23 1 70 1 94 2 2 2 1 74

Its output is:
-1 16 16 -1 50 -1 -1 -1 -1 -1 -1 27 -1 -1 -1 30 30 30 30 -1 -1 -1 94 70 23

*/

