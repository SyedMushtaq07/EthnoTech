// To calculate current Bill

import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units: ");
        int units = sc.nextInt();
        int bill = 0;
        if (units <= 250) {
            bill = 0;
        } else {
            bill = units - 250;
            bill = bill*5;
        }
        System.out.println("Bill Amount: " + bill);
        sc.close();
    }
}