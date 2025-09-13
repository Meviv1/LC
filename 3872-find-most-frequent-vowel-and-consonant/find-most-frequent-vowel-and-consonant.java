class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char ch: s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int vowel=0;
        int consonant=0;
        for(char ch='a';ch<='z';ch++){
            if(isVowel(ch)){
                vowel=Math.max(vowel,mp.getOrDefault(ch,0));
            }else{
                consonant=Math.max(consonant,mp.getOrDefault(ch,0));
            }
        }
            return vowel+consonant;
    }
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}