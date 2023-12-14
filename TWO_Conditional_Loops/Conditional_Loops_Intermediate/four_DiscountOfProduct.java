package TWO_Conditional_Loops.Conditional_Loops_Intermediate;
//Calculate Discount Of Product

import java.util.Scanner;
public class four_DiscountOfProduct {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the total price of product: ");
        int price= input.nextInt();

        System.out.print("Enter the discount offered: ");
        int discount= input.nextInt();

        double discount_price=(double)(price*discount)/100;

        double final_price= price-discount_price;

        System.out.print("Total price after discount is : " + final_price);

    }
}
