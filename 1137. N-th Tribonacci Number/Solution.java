class Solution {
    public int tribonacci(int n) {
        int t0=0,t1=1,t2=1;
        int sum=0;
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            for(int i=3;i<=n;i++){
                sum=t0+t1+t2;
                t0=t1;
                t1=t2;
                t2=sum;
            }            
        }
        return sum;
    }
}
