class Solution {
    public int[] arrayRankTransform(int[] arr) {
       
        Map<Integer,Integer>map=new HashMap<>();
        int[]sorted=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sorted[i]=arr[i];
        }
        Arrays.sort(sorted);
        int count=1;
        for(int i=0;i<sorted.length;i++){
             if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], count);
                count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}