class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int v:nums){
            if(set.contains(v)){
                return v;
            }
            else{
                set.add(v);
            }
        }
        return -1;
    }
}