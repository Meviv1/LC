class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int count = 0;
        int prefix = 0;
        mp.put(0,1);
        for(int itr : nums){
            prefix+=itr;
            if(mp.containsKey(prefix-k)){
                count+=mp.get(prefix-k);
            }
            mp.put(prefix,mp.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}