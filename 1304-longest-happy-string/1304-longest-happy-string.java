class Solution {
    public String longestDiverseString(int a, int b, int c) {
       int curA=0,curB=0,curC=0,max=a+b+c;//cur= current no of char a/b/c;max=maximumLength of the string possible
       int i=0;//i is counter to measure the length of the string building
       StringBuilder s=new StringBuilder();
       while(i<max){//i should be strictly less than the max length
        if(curA!=2 && a>=b &&a>=c || a>0 && (curB==2||curC==2)){//it doesnt allow 'a' to be repeated more than twice
        //using the most occuring char
            s.append('a');//add a to the string
            curA++;//inc the curA value to check if it's exceeding 2
            curB=0;//as char 'a' is added as the current, curB and curC is set to 0 ;
            curC=0;
            a--;//reducing the no. of 'a'
        }
        else if(curB!=2 && b>=a &&b>=c || b>0 && (curA==2||curC==2)){
            s.append('b');
            curB++;
            curA=0;
            curC=0;
            b--;
        }
          else if(curC!=2 && c>=a &&c>=b || c>0 && (curA==2||curB==2)){
            s.append('c');
            curC++;
            curA=0;
            curB=0;
            c--;
        }
        i++;//incrementing the length of the string after adding a char
       } 
       return s.toString();
    }
}