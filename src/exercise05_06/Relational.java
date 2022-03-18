package exercise05_06;

import java.util.Scanner;

public class Relational {
    public static void main (String[] args){
        Scanner keyboard = new Scanner (System.in);
        int number1, number2;

        System.out.println("number1");
        number1 = keyboard.nextInt();

        System.out.println("number2");
        number2 = keyboard.nextInt();

        boolean kleinerdan = number1 < number2;
        boolean kleindergelijk = number1 <= number2;
        boolean groterdan = number1 > number2;
        boolean grotergelijk = number1 >= number2;
        boolean gelijk = number1 == number2;
        boolean verschillend = number1 != number2;

        System.out.println("number1 < number2 = " + kleinerdan);
        System.out.println("number1 <= number2 = " + kleindergelijk);
        System.out.println("number1 > number2 = " + groterdan);
        System.out.println("number1 >= number2 = " + grotergelijk);
        System.out.println("number1 == number2 = " + gelijk);
        System.out.println("number1 != number2 = " + verschillend);
    }




}
