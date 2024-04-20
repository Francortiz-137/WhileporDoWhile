package SumaImpares;

import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = entrada.nextInt();
        int suma = 0;

        for(int i = 0; i < num; i++){
            if(i % 2 != 0){
                suma += i;
            }
        }
        System.out.println("La suma es: " + suma);
    }
}
