import java.util.Objects;
import java.util.Scanner;

//Реализовать простой калькулятор

public class Calc {

    public static void main(String[] args) {

        String[] array = userNums();
        String oper = array[0];
        int a = Integer.parseInt(array[1]);
        int b = Integer.parseInt(array[2]);
        int result = 0;

        if(Objects.equals(oper, "+")) {
            result = a + b;
        }
        else if (Objects.equals(oper, "-")) {
            result = a - b;
        }
        else if (Objects.equals(oper, "*")) {
            result = a * b;
        }
        else if (Objects.equals(oper, "/")) {
            result = a / b;
        }
        else {
            System.out.println("Incorrect data!");
        }

        System.out.printf("%d %s %d = %d \n", a, oper, b, result).toString();
    }


    public static String[] userNums() {
        String[] numArr = new String[3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number A: ");
        String a = scan.nextLine();
        System.out.println("Choose an arithmetic operation \n('+', '-', '*', '/'. Input bellow:  ");
        String operation = scan.nextLine();
        System.out.println("Input number B: ");
        String b = scan.nextLine();
        scan.close();
        numArr[0] = operation;
        numArr[1] = a;
        numArr[2] = b;

        return numArr;
    }


}