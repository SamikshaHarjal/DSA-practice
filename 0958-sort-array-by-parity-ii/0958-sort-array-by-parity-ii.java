class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int []odd=new int [nums.length/2];
        int []even=new int [nums.length/2];
        int k1=0;int k2=0;
        for(int i=0;i<nums.length;i++){
if(nums[i]%2==0){
    even[k2++]=nums[i];
}
else{
    odd[k1++]=nums[i];
}
        }
        k1=0;
        k2=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=even[k1++];
            }
            else{
                nums[i]=odd[k2++];
            }
        }
        return nums;
    }
    
}