// LeetCode - 242

class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.replaceAll("\\s","").toLowerCase();
        t = t.replaceAll("\\s","").toLowerCase();
        if (s.length() != t.length()) return false;
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for ( int count : freq){
            if (count != 0) return false;
        }
        return true;
    }
}
