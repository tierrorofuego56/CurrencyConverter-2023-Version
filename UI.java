import java.util.Scanner;

public class UI{

    Scanner sc = new Scanner(System.in);

    public static double money = 0;

    public static int conversion = 0;

    public static String startingMenu(){
        return "\n[0]accessMoney\n[1]accessConversion\n[2]setMoney\n[3]setConversion\n[4]convert";
    }

    public static String conversionMenu(){
        return "[0]. U.S Dollars\n[1]. Japanese Yen\n[2]. European Euros\n[3]. Swiss Francs\n[4]. Russian Rubles";
    }

    public static void accessMoney(){
       if(conversion == 0){
        System.out.println("Current value: $" + money);
       }
       else if(conversion == 1){
        System.out.println("Current value: " + money + " yen");
       }
       else if(conversion == 2){
        System.out.println("Current value: " + money + " euros");
       }
       else if(conversion == 3){
        System.out.println("Current value: " + money + " francs");
       }
       else if(conversion == 4){
        System.out.println("Current value: " + money + " rubles");
       }
    }

    public static void setMoney(Scanner sc){
        System.out.println("How much money do you want to convert?");

        double input = sc.nextDouble();

        money = input;

        UI.accessMoney();
    }

    public static void convert(Scanner sc){
        System.out.println("What do you want to convert to?");

        int convert = sc.nextInt();

        if(convert == conversion){
            System.out.println("Same conversion");
        }
        else{
            if(conversion == 0){
                if(convert == 1){
                    conversion = convert;

                    money = money * 144.49;

                    UI.accessMoney();
                }
                else if(convert == 2){
                    conversion = convert;

                    money = money * 0.92;

                    UI.accessMoney();
                }
                else if(convert == 3){
                    conversion = convert;

                    money = money * 0.90;

                    UI.accessMoney();
                }
                else if(convert == 4){
                    conversion = convert;

                    money = money * 89;

                    UI.accessMoney();
                }
            }
            else if(conversion == 1){
                if(convert == 0){
                    conversion = convert;

                    money = money * 0.0069;

                    UI.accessMoney();
                }
                else if(convert == 2){
                    conversion = convert;

                    money = money * 0.0063;

                    UI.accessMoney();
                }
                else if(convert == 3){
                    conversion = convert;

                    money = money * 0.0062;

                    UI.accessMoney();
                }
                else if(convert == 4){
                    conversion = convert;

                    money = money * 0.62;

                    UI.accessMoney();
                }
            }
            else if(conversion == 2){
                if(convert == 0){
                    conversion = convert;

                    money = money * 1.09;

                    UI.accessMoney();
                }
                else if(convert == 1){
                    conversion = convert;

                    money = money * 157.57;

                    UI.accessMoney();

                }
                else if(convert == 3){
                    conversion = convert;

                    money = money * 0.98;

                    UI.accessMoney();
                    
                }
                else if(convert == 4){
                    conversion = convert;

                    money = money * 97.22;

                    UI.accessMoney();
                    
                }

            }
            else if(conversion == 3){
                if(convert == 0){
                    conversion = convert;

                    money = money * 1.12;

                    UI.accessMoney();

                }
                else if(convert == 1){
                    conversion = convert;

                    money = money * 160.73;

                    UI.accessMoney();

                }
                else if(convert == 2){
                    conversion = convert;

                    money = money * 1.02;

                    UI.accessMoney();
                    
                }
                else if(convert == 4){
                    conversion = convert;

                    money = money * 99.53;

                    UI.accessMoney();
                    
                }

            }
            else if(conversion == 4){
                if(convert == 0){
                    conversion = convert;

                    money = money * 0.011;

                    UI.accessMoney();
                }
                else if(convert == 1){
                    conversion = convert;

                    money = money * 1.62;

                    UI.accessMoney();
                }
                else if(convert == 2){
                    conversion = convert;

                    money = money * 0.010;

                    UI.accessMoney();
                }
                else if(convert == 3){
                    conversion = convert;

                    money = money * 0.010;

                    UI.accessMoney();
                }

            }

        }
    }

    public static void accessConversion(){
        if(conversion == 0){
            System.out.println("Current value: U.S Dollar");
        }
        else if(conversion == 1){
            System.out.println("Current value: Japanese Yen");
        }
        else if(conversion == 2){
            System.out.println("Current value: European Euro");
        }
        else if(conversion == 3){
            System.out.println("Current value: Swiss Francs");
        }
        else if(conversion == 4){
            System.out.println("Current value: Russian Ruble");
        }
    }

    public static void setConversion(Scanner sc){
        int convert = sc.nextInt();

        conversion = convert;
    }
}
