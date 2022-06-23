class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        if (letters[len-1] <= target || target < letters[0]) return letters[0];
        int L = 0, R = len - 1;
        while (L + 1 < R) {
            int mid = L + (R - L) / 2;
            if (letters[mid] <= target) {
                L = mid;
            } else {
                R = mid;
            }
        }
        return letters[R];
    }
}