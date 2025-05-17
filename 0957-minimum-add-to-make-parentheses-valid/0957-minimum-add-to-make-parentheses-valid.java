class Solution {
    public int minAddToMakeValid(String s) {
           Stack<Character>st=new Stack<>();
     int count=0;
     int len=s.length();
     for(int i=0;i<len;i++){
        if(s.charAt(i)=='('){
            st.push(')');
        }
        else{
            if (st.isEmpty() || st.pop() !=s.charAt(i) ) {
    count++;
   
   
}
        }

     }
     return st.size()+count;

    }
}