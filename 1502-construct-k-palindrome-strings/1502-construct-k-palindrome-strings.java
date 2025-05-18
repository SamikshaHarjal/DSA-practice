class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length()<k){ 
            return false;
        }
         int odd = 0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        for(int freq:map.values()){
            if(freq%2!=0){
                odd++;
            }
        }
        return odd<=k;
    }
}