package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        f_menu(1);
        f_parcel();
    }

    public static void f_menu(int op) {
        switch (op) {
            case 1:
                System.out.println("-------------------------");
                System.out.println("│      Parcelsoft       │");
                System.out.println("│ By: Harrizon Soler    │");
                System.out.println("-------------------------");

                System.out.println("Prices/Grams" +
                        "\n1.North America $11.0" +
                        "\n2. Central America $10.0" +
                        "\n3.South America $12.0" +
                        "\n4.Europe $24.0" +
                        "\n5.Asia $27.0 \n");
                break;
            case 2:
                System.out.println("Up to 10 kg is worth 10 dollars (base price)" +
                        "\nFrom 11 kg to 30 kg is worth 17 dollars (base price)" +
                        "\nFrom 30 kg to 60 kg is worth 24 dollars (base price)" +
                        "\nMore than 60 kg is worth 30 dollars (base price)");
                break;
        }
    }

    public static void f_parcel() {
        Scanner keyboard = new Scanner(System.in);
        int op, tp1, price[] = {11, 10, 12, 14, 27}, base[] = {10, 17, 24, 30};
        String place[] = {"North America", "Central America", "South America", "Europe", "Asia"};

        System.out.println("Type an option:");
        op = keyboard.nextInt();

        f_error(op, 5);

        f_menu(2);

        System.out.println("Type the weight of the object to ship (Integer):");
        tp1 = keyboard.nextInt();

        System.out.println("The cost for the shipping services for " + place[op - 1] + " is " + (price[op - 1] + base[(compare(tp1) - 1)])+" dollars");
    }

    public static int compare(int tp) {
        if (tp < 10) {
            tp = 1;
        } else if (tp >= 10 && tp < 30) {
            tp = 2;
        } else if (tp >= 30 && tp < 60) {
            tp = 3;
        } else if (tp >= 60) {
            tp = 4;
        }
        return tp;
    }

        public static int f_error ( int op, int fin){
            Scanner keyboard = new Scanner(System.in);
            while (op < 1 || op > fin) {
                System.err.println("ERROR, The input must be less than " + fin + " retry:");
                op = keyboard.nextInt();
            }
            return op;
        }
    }
