class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char itr : s.toCharArray()){
            mp.put(itr,mp.getOrDefault(itr,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(mp.entrySet());
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> entry = pq.poll();
            for(int i=0;i<entry.getValue();i++){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}