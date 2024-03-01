import java.util.Scanner;
public class TheSixthTask {

    public static void  main(String args[]) {
        Scanner in = new Scanner(System.in);

        String[] color = new String[]{"Зеленый", "Красный", "Желтый", "Белый", "Голубой"};
        String[] animal = new String[]{"крысы", "коровы", "тигра", "зайца", "дракона", "змеи", "лошади", "овцы", "обезьяны", "петуха", "собаки", "свиньи"};

        int idAnimal = -4;
        int idColor = -4;
        while (true) {
            System.out.println("Enter year: ");
            int year = in.nextInt();
            if (year >= 4) {
                while (year > 0) {
                    idColor += 1;
                    if(idColor == 5){
                        idColor = 0;
                    }
                    idAnimal += 1;
                    if(idAnimal == 12){
                        idAnimal = 0;
                    }
                    year--;
                }
            }
            else {
                System.out.print("Error, the calculation starts from the 4th year n. e.");
            }

            System.out.print("Year: " + color[idColor] + " ");
            System.out.print(animal[idAnimal]);

            break;
        }
        System.exit(0);
    }
}
