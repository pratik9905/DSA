package codeEveryday;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubArry {
    public static void main(String[] args) {
        String val = "abcabcbb";
        System.out.println("Length of Longest Sub Array is "+longestsubArray(val));
    }

    public static int longestsubArray(String val) {

        if(val==null || val.length() ==0){
            return 0;
        }

        int left=0;

        int maxLenght=0;

        Map<Character, Integer> map = new HashMap<>();

        for(int right=0;right<val.length();right++){
            char currentChar = val.charAt(right);
            if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
                left=map.get(currentChar)+1;
            }
            map.put(currentChar, right);
            maxLenght = Math.max(maxLenght, right - left + 1);
            
        }
        
        return maxLenght;
    }

    //Different Approach...

    //  public boolean isUnique(String s,int start, int end){
    //     Set<Character> chrSet = new HashSet<>();
    //     for(int i=start;i<end;i++){

    //         char currentChr = s.charAt(i);

    //         if(chrSet.contains(currentChr)){
    //             return false;
    //         }
    //         chrSet.add(currentChr);
    //     }
    //     return true;
    // }
    // public int lengthOfLongestSubstring(String s) {
    //     int n = s.length();
    //     int len = 0;
    //     for(int i=0;i<n;i++){
    //         for(int j=1;j<=n;j++){
    //             if(isUnique(s,i,j)){
    //                 len=Math.max(len,j-i);
    //             }
    //         }
    //     }
    //     return len;
    // }
}
