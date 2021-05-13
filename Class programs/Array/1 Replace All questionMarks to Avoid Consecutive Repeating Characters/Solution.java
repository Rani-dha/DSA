// Program 1: 1576. Replace All ?'s to Avoid Consecutive Repeating Characters
// https://leetcode.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/submissions/

class Solution {
    public String modifyString(String s) {
        char chars[] = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if( chars[i] == '?'){
                for(char replaceChar = 'a'; replaceChar <= 'c'; replaceChar++ ){
                  boolean prev = ( i-1 == -1) || (chars[i-1] != replaceChar );
                  boolean next = ( i+1 == s.length()) || (chars[i+1] != replaceChar);
                  if( prev && next){
                      chars[i] = replaceChar;
                      break;
                  }
                }    
            }
        }
        return new String(chars); // must use new String(chars), don't use toString() method.
    }
}