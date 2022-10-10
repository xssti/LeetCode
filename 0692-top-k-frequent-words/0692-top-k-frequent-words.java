class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<words.length; i++) {
            if(map.containsKey(words[i])) map.put(words[i], map.get(words[i])+1);
            else map.put(words[i], 1);
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> 
        map.get(a).equals(map.get(b)) ? a.compareTo(b) : map.get(b) - map.get(a));
        return list.subList(0, k);
    }
}