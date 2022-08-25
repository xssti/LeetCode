class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord)     {
        int arraySize = products.length;
        int stringSize = searchWord.length();
        Arrays.sort(products);
        List<List<String>> ans = new ArrayList<>();
        int l = 0;
        int r = arraySize-1;
        for(int i=0; i<stringSize; i++) {
            char c = searchWord.charAt(i);
            while(l <= r && (products[l].length() <= i||products[l].charAt(i) != c )) l++;
            while(l <= r && (products[r].length() <= i||products[r].charAt(i) != c )) r--;
            List<String> subList = new ArrayList<>();
            int length = r - l + 1;
            for(int j=0; j<Math.min(3, length); j++) {
                subList.add(products[l+j]);
            }
            ans.add(subList);
        }
        return ans;
    }
}