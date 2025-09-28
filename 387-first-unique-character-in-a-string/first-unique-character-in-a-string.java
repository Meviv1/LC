class Solution {
    public int firstUniqChar(String s) {
        // LinkedHashMap<Character,Integer> mp = new LinkedHashMap<>();
        // for(int i=0;i<s.length();i++){
        //     mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        // }
        // for(int i=0;i<s.length();i++){
        //     if(mp.get(s.charAt(i))==1)
        //     return i;
        // }
        // return -1;
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}