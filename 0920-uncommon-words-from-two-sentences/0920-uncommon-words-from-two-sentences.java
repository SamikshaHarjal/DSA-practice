class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
       List<String>words=new ArrayList<>();
       String str=s1+" "+s2;
       String[] arr=str.split(" ");
       List<String>temp=new ArrayList<>();
       for(int i=0;i<arr.length;i++){
        if(!words.contains(arr[i])){
            words.add(arr[i]);
        }
        else{
            temp.add(arr[i]);
            words.remove(arr[i]);
        }

       }words.removeAll(temp);
       return words.toArray(new String[0]);
    }
}