class Solution {
    public int numTilePossibilities(String tiles) {
        int []freq=new int[26];
        for(int i=0;i<tiles.length();i++){
            char c=tiles.charAt(i);
            freq[c-'A']++;//freq array
        }
        return bt(freq);
    }
    public int bt(int []freq){
        int count=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                freq[i]--;
                count+=1+bt(freq);//premutation using backtrack;
                freq[i]++;
            }
        }
        return count;
    }
}