class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    int n=nums.length;
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<n;i++){
        int v=nums[i];
        if(map.containsKey(v)&&i-map.get(v)<=k){
            return true;
        }
        map.put(v,i);
    }
        return false;
    
    }
}