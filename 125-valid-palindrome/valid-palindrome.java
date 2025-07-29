class Solution {
    public boolean isPalindrome(String s) {
        String changed = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i=0;
        int j=changed.length()-1;
        while(i<j){
            if(changed.charAt(i)!=changed.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}