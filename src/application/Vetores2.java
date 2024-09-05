package application;

import entites.ProductsVector;

import java.util.Locale;
import java.util.Scanner;

public class Vetores2 {

    public static void main(String[] Args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ProductsVector[] vect = new ProductsVector[n]; // chamada da entidade productVector

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine(); // para consumir o nextInt inserido acima.
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new ProductsVector(name, price);
        }

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPrice();
        }

        double res = soma / n;

        System.out.printf("AVERAGE PRICE = %.2f%n", res);
    }
}
