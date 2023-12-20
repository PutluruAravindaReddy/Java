package FOUR_Arrays.Easy;

import java.util.Scanner;

public class ten_CheckSentenceIsPangram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a string : ");
        String sentence=input.next();

        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        char ch='a';
        for(int i=0;i<26;i++){
                if(sentence.contains(String.valueOf(ch))){
                    ch++;
                }
                else{
                    return false;
                }
        }
        return true;
    }
}
