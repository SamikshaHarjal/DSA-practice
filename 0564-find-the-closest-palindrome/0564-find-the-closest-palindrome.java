class Solution {
    public String nearestPalindromic(String n) {
       int len = n.length();
        int leftLen = len%2==0 ? len/2 : len/2+1;

        long leftHalf = Long.valueOf(n.substring(0,leftLen));
        boolean isEven = len%2==0;

        List<Long>possibleValues = new ArrayList<>();
        //case 1
        possibleValues.add(util(leftHalf,isEven));
        //case 2
        possibleValues.add(util(leftHalf+1,isEven));
        //case 3
        possibleValues.add(util(leftHalf-1,isEven));
        //case 4
        possibleValues.add((long)Math.pow(10,len-1)-1);
        //case 5
        possibleValues.add((long)Math.pow(10,len)+1);

        long diff=Long.MAX_VALUE,res=0,num = Long.valueOf(n);
        for(long val : possibleValues){
            if(val==num) continue;
            if(Math.abs(val-num)<diff){
                diff =  Math.abs(val-num);
                res=val;
            }else if(Math.abs(val-num)==diff){
                res = Math.min(res,val);
            }
        }

        return String.valueOf(res);
    }

    private long util(long leftHalf, boolean isEven){
        long res = leftHalf;
        if(!isEven){
            leftHalf = leftHalf/10;
        }

        while(leftHalf>0){
            res=res*10+(leftHalf%10);
            leftHalf /= 10;
        }

        return res;
    }
}