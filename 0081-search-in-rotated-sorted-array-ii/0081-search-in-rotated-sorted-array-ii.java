class Solution {
    public boolean search(int[] nums, int target) {
        int i=0;int j=nums.length-1;
        if(nums.length==1){
            return nums[0]==target;
        }
        while(i<=j){
            if(nums[i]==target||nums[j]==target){
                return true;
            }
            i++;
            j--;
        }
        return false;
    }
}