class Solution {
    public void sortColors(int[] nums) {
        int c0=0,c1=0,c2=0;
        for(int i=0;i<nums.length;i++){
if(nums[i]==0){c0++;}
else if(nums[i]==1){c1++;}
else if(nums[i]==2){c2++;}}
int x=0;
if(c0>0){ x=0;}
if(c0<=0){ x=1;
if(c1<=0){x=2;}
}

for(int i=0;i<nums.length;i++){
    nums[i]=x;
    if(i>=c0-1){
        x=1;
        if(i>=c0+c1-1){
            x=2;
        }
    }
}
        
     
    }
}