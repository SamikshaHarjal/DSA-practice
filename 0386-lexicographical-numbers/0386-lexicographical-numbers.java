class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer>li=new ArrayList<>();
        int cur=1;
        for(int i=0;i<n;i++){
           li.add(cur);
            if(n>=10*cur){
                cur=cur*10;
            }
            else{
                while(cur%10==9||cur>=n){
                    cur=cur/10;
                }
                cur+=1;
            }
        }
        return li;
    }
}