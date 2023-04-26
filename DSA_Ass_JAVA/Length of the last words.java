class Solution {
    public int lengthOfLastWord(String s) {
        int cnt=0;
        s=s.trim();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                cnt=0;
                continue;
            }
            else{
                cnt++;

            }

        }
        return cnt;
    }
}
