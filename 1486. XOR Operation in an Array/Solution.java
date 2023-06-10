class Solution {
    public int xorOperation(int n, int start) {
        int i = start;
        int sum = 0;
        while(n>0){
            sum^=i;
            i+=2;
            n--;
        }
        return sum;
    }
}