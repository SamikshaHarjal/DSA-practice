class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count0=0;
        int mul=1;
        for(int v:nums){
if(v==0){
    count0++;
}
else{
    mul*=v;
}
        }
        if(count0>1){
            Arrays.fill(nums,0);
            return nums;
        }
        if(count0==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    nums[i]=mul;
                }
                else{
                    nums[i]=0;
                }
                
            }
            return nums;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=mul/nums[i];
        }
        return nums;
    }
}