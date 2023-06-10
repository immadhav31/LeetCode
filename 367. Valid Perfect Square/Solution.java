class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1 || num==4 || num==9 || num==16 || num==25 || num==36){
            return true;

        }
        for(int i=1;i<=num/6;i++){
            if(i*i==num){
                return true;
            }
        }
        return false; 
    }
}
