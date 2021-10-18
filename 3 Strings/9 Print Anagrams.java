// Print Anagrams Together
// https://practice.geeksforgeeks.org/problems/print-anagrams-together/1

class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        List<List<String>> anagram = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        
        for(String curr : string_list){
            char[]  chars = curr.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(!hm.containsKey(sorted))
                hm.put(sorted, new ArrayList<>());
            hm.get(sorted).add(curr);    
        }
        
        anagram.addAll(hm.values());
        return anagram;
    }
}

// Input:
// N = 5
// words[] = {act,god,cat,dog,tac}
// Output: 
// god dog
// act cat tac
// Explanation:
// There are 2 groups of
// anagrams "god", "dog" make group 1.
// "act", "cat", "tac" make group 2.

