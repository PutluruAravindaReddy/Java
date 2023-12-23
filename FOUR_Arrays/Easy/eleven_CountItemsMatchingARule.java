package FOUR_Arrays.Easy;

import java.util.*;
public class eleven_CountItemsMatchingARule {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the array size of row and column values : ");
        int r=input.nextInt(),c=input.nextInt();

        List<List<String>> items=new ArrayList<>();

        for(int in=0;in<r;in++){
            items.add(new ArrayList<>());
        }

        System.out.print("Enter the items : ");
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++) {
                items.get(i).add(input.next());
            }
        }
        System.out.print("Enter the ruleKey : ");
        String rulekey=input.next();

        System.out.print("Enter the ruleValue : ");
        String ruleValue=input.next();
        System.out.println(countMatches(items,rulekey,ruleValue));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
       int j = 0,count=0;
       if(ruleKey.equals("type")){
            j=0;
        }
        else if(ruleKey.equals("color")){
            j=1;
        }
        else if(ruleKey.equals("name")){
            j=2;
       }
        for (int i=0;i<items.size();i++){
            if(items.get(i).get(j).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
