class Solution {
    public boolean isValid(String s) {

Stack<Character>st=new Stack();
for(int i=0;i<s.length();i++){
char c=s.charAt(i);
if(c=='('){
    st.push(')');
}
else if(c=='['){
    st.push(']');
}
else if(c=='{'){
    st.push('}');
}

else if (c == ')' || c == ']' || c == '}') {
if (st.isEmpty() || st.pop() != c) {
    return false;
   
   
}

}

}
if(st.isEmpty()){
  return true;
}
return false;

}}