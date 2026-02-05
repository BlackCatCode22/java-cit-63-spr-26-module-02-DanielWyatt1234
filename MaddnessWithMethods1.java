// MaddnessWithMethods.java
// 2/5/26

import java.util.Scanner;

public class MaddnessWithMethods1 {

    public static void main(String[] args) {

        int userNum = getAnIntFromTheUser();
        System.out.println("You entered: " + userNum);

        float f1 = 10.5f;
        float f2 = 20.3f;
        compareTwoInts(f1, f2);

        int total = sumTwoInts(15, 25);
        System.out.println("The sum of 15 and 25 is: " + total);
    }
    public static int getAnIntFromTheUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        return sc.nextInt();
    }
    public static void compareTwoInts(float num1, float num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
    public static int sumTwoInts(int a, int b) {
        return a + b;
    }
}