class Solution {
    public int maximumGap(int[] nums) {
       if(nums.length<2){
        return 0;
       } 
       Arrays.sort(nums);
       int dif=0;
       int max=0;
       for(int i=0;i<nums.length-1;i++){
        dif=nums[i+1]-nums[i];
        if(dif>max){
            max=dif;
        }
       }
       return max;
    }
}