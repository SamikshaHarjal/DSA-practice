class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[]min =new int[timePoints.size()];
        for(int i=0;i<min.length;i++){
            String time=timePoints.get(i);
            int h=Integer.parseInt(time.substring(0,2));
            int m=Integer.parseInt(time.substring(3));
        min[i]=h*60+m;
        }
        Arrays.sort(min);
        int minutes=1440;
        for(int i=0;i<min.length-1;i++){
if(min[i+1]-min[i]<minutes){
    minutes=min[i+1]-min[i];
}
        }if((1440-min[min.length-1]+min[0]) <minutes){
            minutes=1440-min[min.length-1]+min[0];
        }
        return minutes;
    }
}