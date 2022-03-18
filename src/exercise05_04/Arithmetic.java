package exercise05_04;
import java.util.*;

public class Arithmetic {
    public static void main (String[] args){
        int number1, number2;
        Scanner keyboard = new Scanner(System.in);

        number1 = keyboard.nextInt();
        number2 = keyboard.nextInt();

        int sum = number1 + number2;
        int minus = number1 - number2;
        int multiply = number1 * number2;
        int divide = number1 / number2;
        int rest = number1 - divide;

        System.out.println("De som van beiden getallen = " + sum);
        System.out.println("Het verschil van beide getallen = " + minus);
        System.out.println("het product van beide getallen = " + multiply);
        System.out.println("de deling van beide getallen = " + divide);
        System.out.println("de rest van de deling van beide getallen = " + rest);

        //unaire operatoren
        int uni1 = number1;
            uni1++;
        int uni2 = number1;
            ++uni2;
        int uni3 = number1;
            uni3--;
        int uni4 = number1;
            --uni4;

        System.out.println("number1++ = " + uni1);
        System.out.println("++number1 = " + uni2);
        System.out.println("number1-- = " + uni3);
        System.out.println("--number1 = " + uni4);


        keyboard.close();


    }
}
