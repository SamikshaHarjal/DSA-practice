class Solution {
    public int trap(int[] height) {
        if(height.length==0) return 0;
    int left=0,right=height.length-1,maxLeft=0,maxRight=0;//left ptr and right ptr
    int total=0;//water int the bucket
    while(left<right){
        if(height[left]<height[right]){//if current>max we cant occupy and update max otherwise occupy
            if(height[left]>maxLeft){
                maxLeft=height[left];
            }
            else{
                total+=maxLeft-height[left];
            } 
            left++;
        }
        else{
              if(height[right]>maxRight){//if current>max we cant occupy and update max otherwise occupy
                maxRight=height[right];
            }
            else{
                total+=maxRight-height[right];
            } 
            right--;
        }
    }    
    return total;
    }
}