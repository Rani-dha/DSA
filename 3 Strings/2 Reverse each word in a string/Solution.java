//
//

class Solution
{
   
    String reverseWords(String S)
    {

         String res = "";
         Stack<Character> stack = new Stack<Character>();
         for(int i=0 ; i<S.length(); i++){
             
             if(Character.compare(S.charAt(i),'.') != 0) // s1.compareTo(s2) used to compare strings, when you use equals() it shows deferencing error 
                 stack.push(S.charAt(i));       // Character.compare(char1, char2) used to compare characters. 
                                                // if 0 then char1 equals to char2, greater than > 0 if char1 > char2, less than < 0 if char1< char2 
             
             else {
                // While size is changed in each step. So it must be stored in a variable to avoid incorrect output.
                // Reference: https://stackoverflow.com/questions/20557212/stack-pop-loop-does-not-pop-all-elements
                int stackSize = stack.size(); 
                for(int j=1; j<= stackSize; j++)
                         res += stack.pop();
                
                if( i != S.length()) // Without this line it shows error to Optimize the code
                    res += ".";  
             }
         }
         // To add  the reverse of last word here much -> hcum
         int e = stack.size();
         for(int j=1; j<= e; j++)
            res += stack.pop();

         return res;
    }
}

/**
 * Example 1:

Input:
        S = "i.like.this.program.very.much"
Output: 
        i.ekil.siht.margorp.yrev.hcum

Explanation: 
        The words "i", "like", "this", "program", "very", "much" are all reversed.

 */