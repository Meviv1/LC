class Solution {
    public int findMiddleIndex(int[] nums) {
        int [] arr = new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]+nums[i];
        }
        for(int i=nums.length-2;i>=0;i--){
            nums[i]=nums[i+1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==arr[i]){
                return i;
            }
        }
        return -1;
    }
}