class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> Sol = new HashMap<>();
        Sol.put('I', 1);
        Sol.put('V', 5);
        Sol.put('X', 10);
        Sol.put('L', 50);
        Sol.put('C', 100);
        Sol.put('D', 500);
        Sol.put('M', 1000);


        int num = Sol.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (Sol.get(s.charAt(i)) >= Sol.get(s.charAt(i + 1))) {
                num += Sol.get(s.charAt(i));
            } else {
                num -= Sol.get(s.charAt(i));
            }
        }
        return num;
    }
}