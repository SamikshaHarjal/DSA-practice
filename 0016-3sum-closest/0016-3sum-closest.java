class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest=100000,n=nums.length;
        Arrays.sort(nums);
      
for(int i=0;i<n;i++){
int l=i+1,r=n-1;
while(l<r){
    int sum=nums[i]+nums[l]+nums[r];
    if(Math.abs(sum-target)<Math.abs(closest-target)){
            closest=sum;
        }
    if(sum==target){
        return target;
    }
    else if(nums[i]+nums[l]+nums[r]>target){
        r--;
    }
    else{
        l++;
    }
}
}
return closest;
    }
}