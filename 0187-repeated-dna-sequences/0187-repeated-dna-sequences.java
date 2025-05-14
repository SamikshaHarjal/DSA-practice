class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String>li=new HashSet<>();
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<s.length()-9;i++){
            
            String s1=s.substring(i,i+10);
            if(li.contains(s1)){
                set.add(s1);   
            }
            li.add(s1);
        }
        
        return new ArrayList(set);
    }
}