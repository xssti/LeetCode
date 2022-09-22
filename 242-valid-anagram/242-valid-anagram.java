class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        String newS = new String(sCharArray);
        String newT = new String(tCharArray);
        return newS.equals(newT);
    }
}