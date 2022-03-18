package exercise05_07;

public class Logische {
    public static void main (String[] args){
        int number1 = 3;
        int number2 = 30;

        boolean value1 = number1 < 5;
        boolean value2 = ++number2 > 10;

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println(("value1 && value2 = ") + (value1 && value2));
        System.out.println(("value1 || value2 = ") + (value1 || value2));
        System.out.println(("!value1 = ") + (!value1));
        System.out.println(("!value2 = ") + (!value2));
    }
}
