package usta.sistemas;

import java.util.Scanner;

public class Main {
    /*
      Name:Harrizon Alexander Soler Galindo
      Date: 30/03/20
      Description: This software manage four variables with math operations
    */

    public static void main(String[] args) {
	int x,y;
	double m,n;
	Scanner keyboard = new Scanner(System.in);

        System.out.println("Type the value for x (Integer)");
        x = keyboard.nextInt();

        System.out.println("Type the value for y (Integer)");
        y = keyboard.nextInt();

        System.out.println("Type the value for m (Double)");
        m = keyboard.nextDouble();

        System.out.println("Type the value for n (Double)");
        n = keyboard.nextDouble();

        System.out.println("The variable x is "+x);
        System.out.println("The varialbe y is "+y);
        System.out.println("The variable m is "+m);
        System.out.println("The variable n is "+n);
        System.out.println("The sum X+Y is "+(x+y));
        System.out.println("The subtraction X-Y is "+(x-y));
        System.out.println("The product X*Y is "+(x*y));
        System.out.println("The relation X/Y is "+(x/y));
        System.out.println("The rest X%Y is "+(x%y));
        System.out.println("The sum M+N is "+(m+n));
        System.out.println("The substraction M-N is "+(m-n));
        System.out.println("The product M*N is "+(m*n));
        System.out.println("The quotient M/N is "+(m/n));
        System.out.println("The rest M%N is " + (m%n));
        System.out.println("The sum X+N is "+(x+n));
        System.out.println("The rest Y%M is "+(y%m));
        System.out.println("The double of x is "+(x*2)+", of y is "+(y*2));
        System.out.println("The double of m is "+(m*2)+", of n is "+(n*2));
        System.out.println("The sum of the 4 variables is "+(x+y+m+n));
        System.out.println("The product of the 4 variables is "+(x*y*m*n));

    }
}
