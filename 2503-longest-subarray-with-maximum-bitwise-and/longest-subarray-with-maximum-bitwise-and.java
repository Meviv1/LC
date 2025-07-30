class Solution {
    public int longestSubarray(int[] nums) {
        int max_val = 0;
        int curr=0;
        int ans=0;
        for(int itr : nums){
            if(max_val<itr){
                max_val=itr;
                ans=0;
                curr=0;
            }
            if(max_val==itr){
                curr++;
            }else{
                curr=0;
            }
            ans = Math.max(ans,curr);
        }
        return ans;
    }
}