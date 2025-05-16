class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target)return true;
            else if(nums[mid] == nums[right])right--;
            else if(nums[mid] == nums[left])left++;

            else if(nums[mid] < nums[right]){
                if(nums[mid] < target && target <= nums[right]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
            else{
                if(target < nums[mid] && nums[left] <= target){
                    right = mid-1;
                }
            else{
                left = left +1;
            }
            }
        }
        return false;
    }

}