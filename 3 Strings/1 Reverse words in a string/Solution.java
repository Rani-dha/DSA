// Program 1:
//

class Solution {
    public String reverseWords(String s) {
        String result[] = s.split("\\s+");
        String ans = "";
        for(int i= result.length - 1; i>=0; i--){
             ans += result[i] + " ";    
        }
        return ans.trim();        
    }
}