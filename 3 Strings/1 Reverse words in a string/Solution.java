// Program 1: Reverse words in a String
//  https://leetcode.com/problems/reverse-words-in-a-string/

class Solution {
    public String reverseWords(String s) {
        String result[] = s.split("\\s+"); // Splits the words with one or more spaces
        String ans = "";
        for(int i= result.length - 1; i>=0; i--){
             ans += result[i] + " ";    
        }
        return ans.trim();  // to remove trailing space       
    }
}

/**
 * Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
Example 4:

Input: s = "  Bob    Loves  Alice   "
Output: "Alice Loves Bob"
Example 5:

Input: s = "Alice does not even like bob"
Output: "bob like even not does Alice"
 */