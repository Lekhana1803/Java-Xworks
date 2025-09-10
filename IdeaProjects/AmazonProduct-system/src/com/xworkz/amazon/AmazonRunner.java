package com.xworkz.amazon;

import com.xworkz.amazon.amazon.Amazon;
import com.xworkz.amazon.product.Product;

import java.util.Scanner;
public class AmazonRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of products to add:");
        int size = scanner.nextInt();

        Amazon amazon = new Amazon(size);

        for (int i = 0; i < size; i++) {
            Product product = new Product();

            System.out.println("Enter product id:");
            product.setProductId(scanner.nextInt());

            System.out.println("Enter product name:");
            product.setName(scanner.next());

            System.out.println("Enter category:");
            product.setCategory(scanner.next());

            System.out.println("Enter brand:");
            product.setBrand(scanner.next());

            System.out.println("Enter price:");
            product.setPrice(scanner.nextDouble());

            System.out.println("Enter quantity:");
            product.setQuantity(scanner.nextInt());

            System.out.println("Enter color:");
            product.setColor(scanner.next());

            System.out.println("Enter size:");
            product.setSize(scanner.next());

            System.out.println("Enter weight:");
            product.setWeight(scanner.nextDouble());

            System.out.println("Enter material:");
            product.setMaterial(scanner.next());

            System.out.println("Enter description:");
            product.setDescription(scanner.next());

            System.out.println("Enter rating:");
            product.setRating(scanner.nextDouble());

            System.out.println("Enter reviews:");
            product.setReviews(scanner.nextInt());

            System.out.println("Enter seller:");
            product.setSeller(scanner.next());

            System.out.println("Enter warranty:");
            product.setWarranty(scanner.next());

            System.out.println("Enter manufacture date:");
            product.setManufactureDate(scanner.next());

            System.out.println("Enter expiry date:");
            product.setExpiryDate(scanner.next());

            System.out.println("Is returnable (true/false):");
            product.setReturnable(scanner.nextBoolean());

            System.out.println("Enter offer:");
            product.setOffer(scanner.next());

            amazon.addProduct(product);
        }

        amazon.getAllProducts();
    }
}