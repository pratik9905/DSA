package codeEveryday;
import java.util.ArrayList;
import java.util.List;

public class FindWordContainsChar {
    public static void main(String[] args) {
        String[] str = {"abc","bcd","aaaa","cbc"};
        char x= 'a';
        System.out.println(findWordsContaining(str,x));
    }

    public static List<Integer> findWordsContaining(String[] str, char x){
        int n=str.length;
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(str[i].contains(String.valueOf(x)))
             ls.add(i);
        }
        return ls;
    }
    
}
