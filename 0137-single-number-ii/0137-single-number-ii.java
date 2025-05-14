class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],2);
            }
        }
        for(int x:map.keySet()){
         if(map.get(x)==1){
return x;
         }
        }
        return 0;
    }
}