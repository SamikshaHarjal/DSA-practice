class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
      int d=0,x=0,y=0,i,m=0,c,t;
      for(i=0;i<commands.length;i++){
        if(commands[i]==-2){
            d=(d+1)%4;
        }
        else if(commands[i]==-1){
            if(d>0){
                d--;
            }
            else {d=3;}
            
        }
        else{
            if(d==0){
                t=y;
                y+=commands[i];
                for(int j=0;j<obstacles.length;j++){
                    if(obstacles[j][0]==x){
                        if(y>=obstacles[j][1]&& obstacles[j][1]-1>=t){
                            y=obstacles[j][1]-1;
                        }
                    }
                }
            }
            else if(d==3){
                t=x;
                x+=commands[i];
                  for(int j=0;j<obstacles.length;j++){
                    if(obstacles[j][1]==y){
                        if(x>=obstacles[j][0]&& obstacles[j][0]-1>=t){
                            x=obstacles[j][0]-1;
                        }
                    }
                }
            }else if(d==2){
                t=y;
                y-=commands[i];
                  for(int j=0;j<obstacles.length;j++){
                    if(obstacles[j][0]==x){
                        if(y<=obstacles[j][1]&& obstacles[j][1]+1<=t){
                            y=obstacles[j][1]+1;
                        }
                    }
                }
            }
            else if(d==1){
                t=x;
                x-=commands[i];
                  for(int j=0;j<obstacles.length;j++){
                    if(obstacles[j][1]==y){
                        if(x<=obstacles[j][0]&& obstacles[j][0]+1<=t){
                            x=obstacles[j][0]+1;
                        }
                    }
                }
            }
c=(x*x)+(y*y);
if(m<c){m=c;}

        }
      }  
      return m;
    }
}