class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]={-1,-1};
        int l=0,r=nums.length-1;
        boolean exists=false;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                exists=true;
                break;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        if(exists){
            res[0]=ls(target,nums);
            res[1]=rs(target,nums);
            
        }
        return res;
    }
    public int ls(int target,int []arr){
        int res=-1;
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                res=mid;
                r=mid-1;
            }
            else if(arr[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
       
        return res;
    }
       public int rs(int target,int []arr){
        int res=-1;
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                res=mid;
               l=mid+1;
            }
            else if(arr[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        
        return res;
    }
}