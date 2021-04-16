// Program 3: Integer to Roman
// https://leetcode.com/problems/integer-to-roman/

class Solution {
    public String intToRoman(int num) {
        String[] stringRomanSymbol = {"M", "CM", "D","CD", "C", "XC","L", "XL", "X", "IX", "V", "IV", "I"};
        int[]  stringRomanValue  = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5,4,1};
        String result = "";
        for(int i=0; i<stringRomanSymbol.length; i++){
            while( num >= stringRomanValue[i]){
                result += stringRomanSymbol[i];
                num -= stringRomanValue[i];
            }
        }
        return result;
    }
}
