import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // class Shipping
        //main()
        //num itemPrice
        //num shippingCost
        //num totalPrice
        //output "Enter the price of your item: "
        //input itemPrice
        //if itemPrice >= 100 then
        //shippingCost = 0
        //output "Shipping is free"
        //else
        //shippingCost = itemPrice * 0.02
        //end if
        //totalPrice = itemPrice + shippingCost
        //output "Shipping cost: " + shippingCost
        //output "Total price: " + totalPrice
        //return
        //end class

        double itemPrice = 0;
        double shippingCost = 0;
        double totalPrice = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of your item: ");

        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();

            if (itemPrice >= 100) {
                shippingCost = 0;
                System.out.println("Shipping is free");
            }
            else {
                shippingCost = itemPrice * 0.02;
            }

            totalPrice = itemPrice + shippingCost;

            System.out.println("Shipping cost: " + shippingCost);
            System.out.println("Total price: " + totalPrice);
        } else {
            String trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
        }
    }
}