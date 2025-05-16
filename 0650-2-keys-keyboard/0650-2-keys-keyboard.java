class Solution {
    public int minSteps(int n) {
        if (n==1){
            return 0;
        }
        int o=0;
        int p=1;
        int c=0;
        while(p!=n){
            if(n%p==0){
                c=p;
                o++;
            }
            p+=c;
            o++;
        }
        return o;
    }
}