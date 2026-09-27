package Initial_learning;

import java.util.Scanner;

public class TakingInput {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for firstNum:");
        int first = sc.nextInt();

        System.out.println("Enter the value for secondNum:");
        int second = sc.nextInt();

        int ans = first + second;
        System.out.println(ans);

        sc.close();
    }
}
