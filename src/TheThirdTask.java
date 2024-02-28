import java.util.Scanner;

public class TheFthirdTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dear user, make a number in your mind 1-100, please");
        System.out.println("To communicate, use 0 and 1, please");
        int startNum = 50;


        while (true) {
            System.out.println("Is the number greater than " + startNum + "?");
            int answerPlayer = in.nextInt();

            if(answerPlayer == 0) {
                startNum = startNum / 2;
            }
            if (answerPlayer == 1) {
                startNum = startNum * 3 / 2 + 1;
            }

            System.out.println("Is the number equally  " + startNum + "?");
            answerPlayer = in.nextInt();
            if(answerPlayer == 0) {
                System.out.println("OK  " + startNum + "?");
            }
            if (answerPlayer == 1) {
                System.out.println("ЕБАТЬ " + startNum + "?");
            }
        }
    }
}