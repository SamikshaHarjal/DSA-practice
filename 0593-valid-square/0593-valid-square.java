class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[]arr=new int[6];
        int p12=(p2[0]-p1[0])*(p2[0]-p1[0])+(p2[1]-p1[1])*(p2[1]-p1[1]);
        int p23=(p2[0]-p3[0])*(p2[0]-p3[0])+(p2[1]-p3[1])*(p2[1]-p3[1]);
        int p34=(p4[0]-p3[0])*(p4[0]-p3[0])+(p4[1]-p3[1])*(p4[1]-p3[1]);
        int p41=(p4[0]-p1[0])*(p4[0]-p1[0])+(p4[1]-p1[1])*(p4[1]-p1[1]);
        int p13=(p1[0]-p3[0])*(p1[0]-p3[0])+(p1[1]-p3[1])*(p1[1]-p3[1]);
        int p24=(p2[0]-p4[0])*(p2[0]-p4[0])+(p2[1]-p4[1])*(p2[1]-p4[1]);
        arr[0]=p12;
        arr[1]=p23;
        arr[2]=p34;
        arr[3]=p41;
        arr[4]=p13;
        arr[5]=p24;
        Arrays.sort(arr);
        if(arr[4]!=arr[5]||arr[1]==arr[4]){
            return false;
        }
        
        else{
            for(int i=0;i<2;i++){
                if(arr[i]!=arr[i+1]){
                    return false;
                }
                
            }
        if(arr[0]!=arr[3]){
            return false;
        }
        }
        return true;
    }
}