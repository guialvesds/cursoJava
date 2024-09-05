package application;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // inserimos um número interio
        double[] vect = new double[n]; // O vetor recebe o número digitando e cria a quantidade de vetores

    // Percorremos o vetor e inserimos o valor em cada campo
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }


        double result = 0.0;
        for (int i = 0; i < n; i++) {
            result += vect[i];
        }
        double avr = result / n;

        System.out.printf("AVERAGE HEIGTH = %.2f%n", avr);

        sc.close();

    }
}
