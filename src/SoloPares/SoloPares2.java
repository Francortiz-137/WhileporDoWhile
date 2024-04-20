package SoloPares;

import java.util.Scanner;

public class SoloPares2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = entrada.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println(i*2);
        }
    }
}
