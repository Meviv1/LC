class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        int count = 0;
        for(int itr : piles){
            q.add(itr);
        }
        for(int i=0;i<k;i++){
            int a = q.poll();
            q.add((a+1)/2);
        }
        for(int itr : piles){
            count+=q.poll();
        }
        return count;
    }
}