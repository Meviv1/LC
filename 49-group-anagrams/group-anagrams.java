class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp = new HashMap<>();
        for(String s : strs){
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            List<String> ans = mp.getOrDefault(key,new ArrayList<>());
            ans.add(s);
            mp.put(key,ans);
        }
        return new ArrayList<>(mp.values());
    }
}