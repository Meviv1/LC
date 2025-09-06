class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int itr: nums){
            mp.put(itr,mp.getOrDefault(itr,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(mp.entrySet());
        int ans [] = new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll().getKey();
        }
        return ans;
    }
}