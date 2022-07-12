class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int len = 0, right = 0, left = 0;
        while(right < s.length()) {
            if(map.containsKey(s.charAt(right))) 
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            map.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
}