import java.util.Scanner;
public class TheFifthTask {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] suits = new String[]{"пики", "трефы", "бубны", "черви"};
        String[] meaning = new String[]{"Шестерка","Семерка","Восьмерка","Девятка","Десятка","Валет","Дама","Король","Туз"};

        while(true){
            System.out.print("Enter suits card from 1 to 4: ");
            int suitsCardPlayer = in.nextInt();
            if(suitsCardPlayer >=1 && suitsCardPlayer <= 4){

                System.out.print("Enter meaning card from 6 to 10: ");
                int meaningCardPlayer = in.nextInt();
                if(meaningCardPlayer >=6 && meaningCardPlayer <= 10){
                    System.out.print(meaning[meaningCardPlayer-1]);
                    System.out.print(" "+suits[suitsCardPlayer-1]);
                    break;
                }
                else{
                    System.out.println("Error, repeat please");
                }
            }
            else{
                System.out.println("Error, repeat please");
            }
        }
        System.exit(0);



    }
}
