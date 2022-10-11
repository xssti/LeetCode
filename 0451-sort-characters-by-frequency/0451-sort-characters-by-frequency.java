class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) map.put(c, map.get(c)+1);
            else map.put(c, 1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b) -> map.get(b) - map.get(a));
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++) {
            int num = map.get(list.get(i));
            for(int j=0; j<num; j++) sb.append(list.get(i));
        }
        return sb.toString();
    }
}