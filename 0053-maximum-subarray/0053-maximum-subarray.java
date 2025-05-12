class Solution {
    public int maxSubArray(int[] nums) {
        int maxEnd=-10000;
        int res=-10000;
     for(int v:nums){
        maxEnd=Math.max(v,maxEnd+v);
        res=Math.max(res,maxEnd);
     }
     return res;
    }
}