class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        int []res=new int[n]; 
        for(int i=0;i<n;i++){
           res[i]=bit1Count(arr[i])*10001+arr[i];//since range is till 10000
        }
        Arrays.sort(res);//sort by freq
        for(int i=0;i<n;i++){
            res[i]%=10001;
        }
        return res;

    }
    public int bit1Count(int n){
        int count=0;
        while(n!=0){
            count+=(n&1);
            n>>=1;
        }
        return count;
    }
}