class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0;
        int num;
        for(int i=0;i<columnTitle.length();i++){
            num = (int) columnTitle.charAt(i) - 64;
            sum = sum*26 + num;
        }
        return sum;
    }
}
