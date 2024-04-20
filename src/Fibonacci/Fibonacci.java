package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        int f_0 = 0, f_1 = 1;
        int f;
        System.out.println(f_0);
        System.out.println(f_1);
        for (int i = 2; i <= n; i++) {
            f = f_0 + f_1;
            f_0 = f_1;
            f_1 = f;
            System.out.println(f);
        }
    }
}
