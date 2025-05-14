class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int x=0;
            for(int i=0;i<nums.length -1;i++){
nums[i+1]=nums[i]^nums[i+1];
x=nums[i+1];
        }return x;


        }
    }
    //last