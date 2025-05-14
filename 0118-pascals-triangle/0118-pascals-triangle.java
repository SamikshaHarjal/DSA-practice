class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>list=new ArrayList<>();
               
        long a=1;
        int count=1;
List<Integer>l0=new ArrayList<>();
l0.add(1);
list.add(l0);

while(count<numRows){ 
           List<Integer>li=new ArrayList<>();
     
 li.add(1);
for(int i=0;i<count;i++){
    a=a*(count-i);
    a=a/(i+1);
    li.add((int)a);
}
list.add(li);

    count++;
}
return list;
    }
}