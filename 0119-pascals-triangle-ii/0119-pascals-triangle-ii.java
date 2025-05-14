class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>li=new ArrayList<>();
        long a=1;
 li.add(1);
for(int i=0;i<rowIndex;i++){
    a=a*(rowIndex-i);
    a=a/(i+1);
    li.add((int)a);
}
return li;
    }
}