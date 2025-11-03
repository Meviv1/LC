class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Integer> pq = new  PriorityQueue<>((a,b)->nums[a]-nums[b]);
        for(int i=0;i<nums.length;i++){
            pq.add(i);
        }
        int [] arr = new int[k];
        for(int i=0;i<nums.length;i++){
            if(pq.size()>k){
                pq.poll();
            }
        }

        ArrayList<Integer> list = new ArrayList<>(pq);
        Collections.sort(list);
        for(int i=0;i<k;i++){
            arr[i]=nums[list.get(i)];
        }
        return arr;
    }
}