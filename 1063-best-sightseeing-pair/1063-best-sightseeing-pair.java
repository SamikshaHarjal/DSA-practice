class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxVal=0;
        int max=values[0];//initially => values[i]+i        
        for(int j=1;j<values.length;j++){
           if(maxVal<max+values[j]-j){
            maxVal=max+values[j]-j;
           } //maxVal=values[i]+i+values[j]-j
            if(max<values[j]+j){
                max=values[j]+j;//max=values[j]+j=values[i]+i
        }}        
        return maxVal;
    }
}



//Old code
//class Solution {
//    public int maxScoreSightseeingPair(int[] values) {
//        int maxVal=0;
//        int max=values[0];//initially => values[i]+i        
//        for(int j=1;j<values.length;j++){
//            maxVal = Math.max(maxVal,max+values[j]-j);//maxVal=values[i]+i+values[j]-j
//            max= Math.max(max,values[j]+j);//max=values[j]+j=values[i]+i
//       }        
//        return maxVal;
//    }
//}