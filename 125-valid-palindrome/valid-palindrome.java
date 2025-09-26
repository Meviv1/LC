class Solution {
    public boolean isPalindrome(String s) {
        String output = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i=0;
        int j=output.length()-1;
        while(i<j){
            if(output.charAt(i)!=output.charAt(j)){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}