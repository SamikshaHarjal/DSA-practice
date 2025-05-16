class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int []len=new int[n],prev=new int[n];
        Arrays.fill(len,1);
        Arrays.fill(prev,-1);
        int maxLen=0,maxIdx=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]%nums[i]==0 && len[j]<len[i]+1){
                    len[j]=len[i]+1;
                    prev[j]=i;
                }
            }
            if(len[i]>maxLen){
                maxLen=len[i];
                maxIdx=i;
            }
        }
        List<Integer>res=new ArrayList<>();
        for(int j=maxIdx;j!=-1;j=prev[j]){
            res.add(nums[j]);
        }
        Collections.reverse(res);
        return res;
    }
}