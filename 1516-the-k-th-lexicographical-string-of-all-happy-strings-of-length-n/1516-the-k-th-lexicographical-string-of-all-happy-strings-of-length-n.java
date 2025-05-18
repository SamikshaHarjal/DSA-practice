class Solution {
    int n2;
    public String getHappyString(int n, int k) {
       n2=n;
       return dfs(new StringBuilder(),n,k); 
    }
    public String dfs(StringBuilder pref,int n,int k){
        if(n==0){
            return pref.toString();
        }
        int len=pref.length();
        for(char c='a';c<='c';c++){
            if(len>0 && c==pref.charAt(len-1)){
                continue;
            }
            int count=(int)Math.pow(2,n2-len-1);
            if(count>=k){
                return dfs(pref.append(c),n-1,k);
            }
            else{
                k-=count;
            }
        }
        return "";
    }
}