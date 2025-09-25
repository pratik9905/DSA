public class reverse_word {
    public static void main(String[] args) {
        String  str = "Hello World!";
        System.out.println(reverseWord(str));
    }






    public static String reverseWord(String s){
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            String newString = "";
            for (int i=word.length()-1;  i>=0; i--) {
                newString+=word.charAt(i);
            }
            sb.append(newString+" ");

        }
        return sb.toString().trim();
    }
}

