import java.util.Scanner;
import java.util.Random;
public class TheSecondTask {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int numComp =  rand.nextInt(1,9);

        System.out.print("Enter any number to start the game, enter zero to exit: ");
        int numPlayer = in.nextInt();

        while(true)
        {
            if(numPlayer != 0)
            {
                if(numPlayer == numComp)
                {
                    System.out.println("You win!!!");
                    System.out.println("Good bye");
                    System.exit(0);
                }
                else if(numPlayer > numComp)
                {
                    System.out.println("The hidden number is less");
                    numPlayer = in.nextInt();
                    continue;
                }
                else if(numPlayer < numComp)
                {
                    System.out.println("The hidden number is bigger");
                    numPlayer = in.nextInt();
                    continue;
                }
            }
            else
            {
                System.out.println("Good bye");
                System.exit(0);
            }
        }

    }
}

