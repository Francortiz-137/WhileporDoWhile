package SumaImpares;

import java.util.Scanner;

public class SumaImparLimite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero limite inferior: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese un numero limite superior: ");
        int num2 = sc.nextInt();
        int suma = 0;

        for(int i = num1; i < num2; i++){
            if(i % 2 != 0){
                suma += i;
            }
        }
        System.out.println("La suma es: " + suma);
    }
}
