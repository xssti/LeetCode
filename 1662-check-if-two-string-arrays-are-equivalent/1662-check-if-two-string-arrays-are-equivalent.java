class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String s : word1) {
            sb1.append(s);
        }
        for(String st : word2) {
            sb2.append(st);
        }
        System.out.println(sb1);
        System.out.println(sb2);
        return sb1.compareTo(sb2) == 0; 
    }
}