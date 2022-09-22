class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length; i++) {
            sb.append(reverse(str[i])+" ");
        }
        return sb.toString().trim();
    }
    public String reverse(String s) {
        return new StringBuffer(s).reverse().toString();
    }
}