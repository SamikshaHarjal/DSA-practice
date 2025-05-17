class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();int count=0;
        int l=0;//left pointer
        int []arr=new int[3];
                for(int i=0;i<n;i++){//i= right pointer
           arr[s.charAt(i)-'a']++;
while(arr[0]>0&& arr[1]>0 && arr[2]>0){
    count+=n-i;//count will be from current index i or right pointer to total length
    arr[s.charAt(l)-'a']--;//remove element from left to move sliding window
    l++;
}
        }
        return count;
    }
}