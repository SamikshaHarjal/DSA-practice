class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            long mul=1;
for(int j=i;j<nums.length;j++){
mul*=nums[j];
if(mul>2147483647){
    break;
}
max=Math.max(max,(int)mul);
}
        }
        return max;
    }
}