class Solution {
    public int findTheLongestSubstring(String s) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int count=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count=count^(1<<((int)(s.charAt(i)-'a')));
            }
            if(map.containsKey(count)){
                max=Math.max(max,i-map.get(count));
            
            }
            else{
                map.put(count,i);
            }
        }
        return max;
    }
}