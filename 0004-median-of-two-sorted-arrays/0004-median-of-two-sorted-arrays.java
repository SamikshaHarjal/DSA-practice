class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int x=nums1.length+nums2.length;
     int[]arr=new int[x];
    
   int k=0;
     for(int i=0;i<nums1.length;i++){
        arr[k++]=nums1[i];
     }  
     for(int j=0;j<nums2.length;j++){
        
        arr[k++]=nums2[j];
      
     }
    Arrays.sort(arr);
    x=arr.length;
if(x%2==0){
    int m1=x/2 -1;
    int m2=x/2;
    return((double)arr[m1]+(double)arr[m2])/2.0;
    }
return arr[x/2];

    }
}