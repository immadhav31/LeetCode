class Solution {
    public int countDigits(int num) {
        int num2 = num;
        int count = 0;
        while(num2>0){
            int rem = num2%10;
            num2 = num2/10;
            if(num%rem==0){
                count++;
            }
        }
        return count;
    }
}