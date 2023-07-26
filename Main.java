import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Money Converter!\nWhat do you want to do?");

        System.out.println(UI.startingMenu());

        int choice = sc.nextInt();

        while(choice < 5 && choice >= 0){
            switch(choice){
                case 0:
                UI.accessMoney();

                System.out.println("Choose another?");

                System.out.println(UI.startingMenu());

                choice = sc.nextInt();

                break;
                case 1:

                UI.accessConversion();

                System.out.println("Choose another?");

                System.out.println(UI.startingMenu());

                choice = sc.nextInt();

                break;
                case 2:

                UI.setMoney(sc);

                System.out.println("Choose another?");

                System.out.println(UI.startingMenu());

                choice = sc.nextInt();

                break;
                case 3:
                
                System.out.println("What currency do you want to change to, keeping previous value?");

                System.out.println(UI.conversionMenu());

                UI.setConversion(sc);

                System.out.println("Choose another?");

                System.out.println(UI.startingMenu());

                choice = sc.nextInt();

                break;

                case 4:

                System.out.println(UI.conversionMenu());

                UI.convert(sc);

                System.out.println("Choose another?");

                System.out.println(UI.startingMenu());

                choice = sc.nextInt();

                break;
            }
        }


        sc.close();
    }
    
}
