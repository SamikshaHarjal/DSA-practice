class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0){
            return 0;
        }
        int maxCount=1;
        char []arr=s.toCharArray();
        for(int i=0;i<n;i++){
            List<Character>li=new ArrayList<>();
            int max=0;
            for(int j=i;j<n;j++){
                if(li.contains(arr[j])){
maxCount=Math.max(max,maxCount);
break;
                }
                max++;
                li.add(arr[j]);
maxCount=Math.max(max,maxCount);
            }
        }
        return maxCount;
    }
}