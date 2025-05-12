class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []arr= new int [2];
     ArrayList<Integer>li=new ArrayList<>();
      for(int i=0;i<nums.length;i++){
        int v=nums[i];
        int u=target-v;
        
        if(li.contains(u)){
        arr[0]=li.indexOf(u);
        arr[1]=i;
        break;
        }
        li.add(v);
        
      }
        return arr;
    }
}