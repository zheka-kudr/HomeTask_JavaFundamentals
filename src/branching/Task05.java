package branching;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ");
        int a = sc.nextInt();
        System.out.print("Enter b ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(b + " is less");
        } else if (a < b) {
            System.out.println(a + " is less");
        } else {
            System.out.println("a = b");
        }
    }
}
