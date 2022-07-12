class Solution {
    public boolean isSubsequence(String s, String t) {
        int len = 0;
        if(s.length() == 0) return true;
        for(int i=0; i<t.length(); i++) {
            if(t.charAt(i) == s.charAt(len)) len++;
            if(len == s.length()) return true;
        }
        return false;
    }
}