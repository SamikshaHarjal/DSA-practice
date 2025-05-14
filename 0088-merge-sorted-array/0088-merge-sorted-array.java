class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=m+n-1;//end of array nums1 ptr
        int i=m-1;//nums1 ptr till its initailly filled
        int j=n-1;//end of nums 2 ptr
 while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];//filling array from the back
            } else {
                nums1[k--] = nums2[j--];
            }
        }
         while (j >= 0) {
            nums1[k--] = nums2[j--];//if nums2 isnt empty fill nums 1 with nums 2
        }
       
    }
}