package FIVE_String_Builders;

public class TEN_Number_Of_Strings_That_Appear_As_substring {
    public static void main(String[] args) {
        String[] patterns = {"a","a","a"};
        String word = "ab";
        System.out.println(numOfStrings( patterns, word));
    }
    public static int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String s : patterns){
            if(word.contains(s)){
                count++;
            }
        }
        return count;
//             or
//        int count=0;
//        for (int i=0;i< patterns.length;i++){
//            int len=patterns[i].length();
//            int j=0;
//            while(j+len <= word.length()){
//                String sub=word.substring(j,j+len);
//                if(patterns[i].equals(sub)){
//                     count++;
//                     break;
//                }
//                j++;
//            }
//        }
//        return count;
    }
}
