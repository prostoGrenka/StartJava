import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int firstNum = in.nextInt();
        System.out.print("Input the second number: ");
        int secondNum = in.nextInt();
        System.out.print("Input the third number: ");
        int thirdNum = in.nextInt();

        System.out.print("totalAllNum = " + firstNum + secondNum + thirdNum);
    }
}