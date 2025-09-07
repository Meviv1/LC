class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> mp = new HashMap<>();
        for(String itr:words){
            mp.put(itr,mp.getOrDefault(itr,0)+1);
        }
        List<String> list = new ArrayList<>();
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a,b)->{
            if(!(a.getValue().equals(b.getValue()))){
                return b.getValue()-a.getValue();
            }else{
                return a.getKey().compareTo(b.getKey());
            }
        });
        pq.addAll(mp.entrySet());
        for(int i=0;i<k&& !pq.isEmpty();i++){
            list.add(pq.poll().getKey());
        }
        return list;
    }
}