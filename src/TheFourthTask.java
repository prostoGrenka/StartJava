import java.util.Scanner;

public class TheFourthTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");

        int number = in.nextInt();
        int numAmstrong = 0;
        int total = 0;

        for(int g = 1; g <= number; g++) {
            int workNumber = g;
            String strNum=Integer.toString(workNumber);
            numAmstrong = 0;
            while(workNumber > 0){
                for(int j = strNum.length(); j > 0; j--){
                    int digit = 0;
                    digit = workNumber % 10;

                    numAmstrong += Math.pow(digit, strNum.length());

                    workNumber = workNumber/10;
                }
                if (g == numAmstrong) {
                    total += 1;
                    System.out.println(g + " Total found: " + total);
                }
            }

        }
    }
}
