class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,area=0,max=0;
        while(i<j){
if(height[i]>height[j]){
    area=height[j]*(j-i);
    j--;
}
else{
    area=height[i]*(j-i);
    i++;
}
if(area>max){
    max=area;
}
        }
        return max;
    }
}