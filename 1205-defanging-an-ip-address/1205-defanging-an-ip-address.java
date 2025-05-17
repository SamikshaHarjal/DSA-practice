class Solution {
    public String defangIPaddr(String address) {
return address.replace(".","[.]");
    }
}
 //       String s="";
  //      for(int i=0;i<address.length();i++){
//            if(address.charAt(i)=='.'){
//s+='[';
//s+='.';
//s+=']';
 //           }
 //           else{
  //              s+=address.charAt(i);
  //          }
 //       }
 //       return s;