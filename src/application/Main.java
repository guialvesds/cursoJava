package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Products;

class Product {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        Products product = new Products();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
//        System.out.print("Quantity in Stock: ");
//        int quantity = sc.nextInt();

        Products product = new Products(name, price);

        product.setName("Computador");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Updated price: " + product.getPrice());
        System.out.println("Updated quantity: " + product.getQuantity());

        System.out.println();
        System.out.println("Product data: " + product.toString());

        System.out.println();
        System.out.println("Enter the number of product to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product.toString());

        System.out.println();
        System.out.println("Enter the number of product to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        ;

        System.out.println();
        System.out.println("Removed data: " + product.toString());

        sc.close();
    }
}
