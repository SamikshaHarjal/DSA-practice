class Solution {
    public int firstMissingPositive(int[] nums) {
     Set<Integer>set=new HashSet<>();  
    
     int n=nums.length;
     for(int v:nums){
        if(v>0){
        set.add(v);
        }
     }
     for(int i=1;i<=2147483647;i++){
        if(!set.contains(i)){
            return i;
        }
     }
     return 4;
    }
}