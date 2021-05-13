//
//

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