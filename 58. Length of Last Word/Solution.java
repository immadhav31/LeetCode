class Solution {
    public int lengthOfLastWord(String s) {
        int wordlen = 0;
        boolean lastword = false;
        String trimmed = s.trim();
        int slen = trimmed.length();
        for(int i=slen-1;i>=0;i--){
            char c = trimmed.charAt(i);
            if(c!=' '){
                wordlen++;
            }
            else{
                break;
            }
        }
        return wordlen;
    }
}