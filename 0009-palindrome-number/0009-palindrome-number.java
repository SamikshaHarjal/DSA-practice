class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        List<Integer>li=new ArrayList<>();
        while(x!=0){
int a=x%10;
li.add(a);
x/=10;
        }
        int l=0,r=li.size()-1;
        while(l<r){
            if(li.get(l)!=li.get(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}