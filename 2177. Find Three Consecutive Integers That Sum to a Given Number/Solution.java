class Solution {
    public long[] sumOfThree(long num) {
        long arr[] = new long[0];
        long n = num/3;
        if(num%3==0){
            arr = new long[]{n-1,n,n+1};
            return arr;
        }
        return new long[0];
    }
}