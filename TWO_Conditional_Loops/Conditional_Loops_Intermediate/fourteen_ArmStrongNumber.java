package TWO_Conditional_Loops.Conditional_Loops_Intermediate;

//Armstrong Number In Java

import java.util.Scanner;

public class fourteen_ArmStrongNumber {

    public static boolean UsingSubstring(String numberinString,int number){
        double sum=0;

        for (int i=0;i<numberinString.length();i++){

            String each=numberinString.substring(i,i+1);
            int integerEach= Integer.parseInt(each);
            sum=sum+Math.pow(integerEach,numberinString.length());
        }
        if(number==sum){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean UsingNumbers(String numberinString,int number){
        double sum=0;
        int numberduplicate=number;

        for (int i=0;i<numberinString.length();i++){
            int last=numberduplicate%10;
            sum=sum+Math.pow(last,numberinString.length());
            numberduplicate=numberduplicate/10;
        }
        if(number==sum){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number= input.nextInt();
        String numberinString=Integer.toString(number);

        System.out.println("In which do you want to do this problem :\n1.Using Substrings\n2.By diving number and getting last digit");
        int method= input.nextInt();

        switch(method){
            case 1:
                if(UsingSubstring(numberinString,number) ){
                    System.out.println("Entered number is an Armstrong Number");
                }
                else{
                    System.out.println("Enter number is not Armstrong");
                }
                break;
            case 2:
                if(UsingNumbers(numberinString,number) ){
                    System.out.println("Entered number is an Armstrong Number");
                }
                else{
                    System.out.println("Enter number is not Armstrong");
                }
                break;
        }


    }
}
