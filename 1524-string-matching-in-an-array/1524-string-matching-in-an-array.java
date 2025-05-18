class Solution {
    public List<String> stringMatching(String[] words) {
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int j=0;j<words.length;j++){
                if(j==i){
                   continue;
                }else{
String s1=words[j];
if(s.contains(s1)){
    set.add(s1);
}
}
            }
        }
        
        List<String>li=new ArrayList<>(set);
        return li;

    }
}