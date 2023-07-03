class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                ans.append(Character.toLowerCase(ch));
            }
        }
        int left = 0;
        int right = ans.length() - 1;
        while (left < right){
            if (ans.charAt(left) != ans.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
