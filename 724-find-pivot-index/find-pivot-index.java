class Solution {
    public int pivotIndex(int[] nums){
        int sum=0,leftSum=0,rightSum=0;
        for(int itr: nums){
            sum+=itr;
        }
        for(int i=0;i<nums.length;i++){
            rightSum=sum-leftSum-nums[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}