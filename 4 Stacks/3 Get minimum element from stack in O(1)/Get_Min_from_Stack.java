//
//


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
	if( s.isEmpty() == true)
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

