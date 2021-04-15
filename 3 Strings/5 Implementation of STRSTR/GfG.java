// Program 5: Implementation of STRSTR
// https://practice.geeksforgeeks.org/problems/implement-strstr/1

/**
 * 
 * A simple solution is to one by one check every index of s1. For every index,
 * check if s2 is present. O(n*m)
 * 
 * For the efficient solution, we can use KMP algorithm Time complexity O(n+m) Z
 * algorithm Rabin-Karp Algorithm
 * 
 * 
 */

 // 1. Brute force approach

 class GfG
{
	
	int strstr(String s, String x) {
	    
	    // if target string is empty
        if (x.length() == 0){
            return 0;
        } 
        
        // brute force solution to iterate over the string
        // and check if characters matches or not,
        for (int i = 0; i < s.length(); i ++){ 
            if (i + x.length() > s.length()){
                return -1;
            }
            
            for (int j = 0; j < x.length(); j ++){
                
                // if characters doesn't matches, then continue till
                // you traversed whole string
                if ( s.charAt(i + j) == x.charAt(j) ){
                    if (j == (x.length() -1)){ // if string is found, then return the starting index of the match
                        return i;
                    }
                }
                else{
                    break;
                }
             }
        }
        
    // if string is not found, then return -1    
        return -1;
    }
}