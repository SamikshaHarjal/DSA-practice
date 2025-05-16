class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
    int n=nums.length;
    int []ans=new int[3];//answer array is of size 3          3)
int []sum=new int [n-k+1];//calculates sliding window sum
int wSum=0;//window sum
for(int i=0;i<n;i++){
    wSum+=nums[i];
    if(i>=k-1){
        sum[i-k+1]=wSum;
        wSum-=nums[i-k+1];
    }
} 
int []left=new int[sum.length];//calculates left max sum       1)
int []right=new int[sum.length];//calculates right max sum     2)
int lMax=0,rMax=sum.length-1;//left max index and right max index   
for(int i=0;i<sum.length;i++){ //                              1) from above
    if(sum[i]>sum[lMax]){
        lMax=i;
    }
    left[i]=lMax;
}
for(int i=sum.length-1;i>=0;i--){ //                           2)from above
    if(sum[i]>=sum[rMax]){
        rMax=i;
    }
    right[i]=rMax; 
}
 int maxSum=0; //find max Sum                                 3) from above
for(int mid=k;mid<sum.length-k;mid++){//                      index of mid
int l=left[mid-k],r=right[mid+k];
int totalSum=sum[l]+sum[r]+sum[mid];
if(totalSum>maxSum){
    maxSum=totalSum;
    ans[0]=l;
    ans[1]=mid;
    ans[2]=r;
}
}
return ans;
    }
}