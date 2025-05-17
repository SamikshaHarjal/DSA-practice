class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<nums.length;i++){
if(st.isEmpty()||nums[st.peek()]>nums[i]){st.push(i);}
        }
        int wid=0;
        
            for(int i=nums.length-1;i>0;i--){
                while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
            wid=Math.max(wid,i-st.peek());
            st.pop();
        }}
        
        return wid;
    }
}