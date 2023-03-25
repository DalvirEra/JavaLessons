import java.util.Scanner;

public class Main {
    static public void main (String[] args){
        System.out.println("Введите n: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(Triangular(num));
        System.out.println(Factorial(num));
        scanner.close();
    }

    static double Triangular(int n){
        return (0.5*n*(n+1));
    }
    static int Factorial(int n){
        int fact = 1;
        for (int i = 1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
}
