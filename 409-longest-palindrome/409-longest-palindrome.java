class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int sum = 0;
        boolean one = false;
        for(int value : map.values()) {
            int num = value/2;
            sum += num;
            if(value%2 == 1) one = true;
        }
        return sum*2 + (one ? 1 : 0);
    }
}