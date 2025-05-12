class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            while(i>0 && nums[i]==nums[i-1]&&i<nums.length-1){
                i++;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
               int a=nums[i];
                int b=nums[j],c=nums[k];
if((a+b+c)<0){
  j++;
}
else if((a+b+c)>0){
    k--;
}
else{
     ArrayList<Integer>li=new ArrayList<>();
    li.add(a);
    li.add(b);
    li.add(c);
    res.add(li);
    j++;
    while(nums[j]==nums[j-1]&& j<k){
        j++;
    }
}
            }
        }
        return res;
    }
}