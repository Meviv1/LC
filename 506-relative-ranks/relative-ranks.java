class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->score[b]-score[a]);
        String [] arr = new String[score.length];
        for(int i=0;i<score.length;i++){
            pq.add(i);
        }
        int i=0;
        while(!pq.isEmpty()){
            int idx = pq.poll();
            if(i>2){
                arr[idx]=Integer.toString(i+1);
            }else if(i==0){
                arr[idx]="Gold Medal";
            }else if(i==1){
                arr[idx]="Silver Medal";
            }else if(i==2){
                arr[idx]="Bronze Medal";
            }
            i++;
        }
        return arr;
    }
}