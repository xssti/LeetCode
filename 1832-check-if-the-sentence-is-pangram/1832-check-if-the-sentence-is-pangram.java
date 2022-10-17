class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] arr = sentence.toCharArray();
        Set<Character> set = new HashSet<>();
        for(char c : arr) set.add(c);
        if(set.size() < 26) return false;
        return true;
    }
}