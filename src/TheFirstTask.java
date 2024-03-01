import java.util.Scanner;

public class TheFirstTask {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = in.nextInt();

        if(number>0)
        {
            int sumNum = 0;
            for(int i = 0; number >= i; i++)
            {
                int num = number%10;
                number = number/10;

                sumNum += num;
            }
            System.out.print(sumNum + number);
        }
        else
        {
            System.out.print("Error, a number less than zero");
        }
    }
}