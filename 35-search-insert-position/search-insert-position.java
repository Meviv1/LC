class Solution {
    public int searchInsert(int[] nums, int target) {
        int st =0;
        int en = nums.length;
        while(st<en){
            int mid = st+(en-st)/2;
            if(nums[mid]>=target){
                en= mid;
            }
        
            else{
                st=mid+1;
            }
        }
        return st;
    }
}