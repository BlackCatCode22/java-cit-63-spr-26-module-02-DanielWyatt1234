// ReversedStrings.java
// 2/1/26

import java.util.Scanner;

public class ReversedStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String str = sc.nextLine();

        String reversedString = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            reversedString += str.charAt(i);
        }
        System.out.println("Reversed String: " + reversedString);
    }
}