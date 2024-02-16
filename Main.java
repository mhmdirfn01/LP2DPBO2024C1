import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat list untuk menyimpan objek Shirt
        List<Shirt> shirts = new ArrayList<>();

        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Loop untuk memasukkan detail dari 3 kemeja
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Shirt " + (i + 1));
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Brand: ");
            String brand = scanner.next();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Size: ");
            String size = scanner.next();
            System.out.print("Material: ");
            String material = scanner.next();
            System.out.print("Gender: ");
            String gender = scanner.next();
            System.out.print("Color: ");
            String color = scanner.next();
            System.out.print("Sleeve Type: ");
            String sleeveType = scanner.next();

            // Membuat objek Shirt dan menambahkannya ke list
            Shirt shirt = new Shirt(id, name, brand, price, size, material, gender, color, sleeveType);
            shirts.add(shirt);
        }

        // Menampilkan header tabel
        System.out.println("\nList of Shirts:");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-5s | %-15s | %-15s | %-8s | %-4s | %-10s | %-8s | %-5s | %-15s\n",
                "ID", "Name", "Brand", "Price", "Size", "Material", "Gender", "Color", "Sleeve Type");
        System.out.println("-------------------------------------------------------------");

        // Menampilkan data kemeja dalam bentuk tabel
        for (Shirt shirt : shirts) {
            System.out.printf("%-5d | %-15s | %-15s | %-8.2f | %-4s | %-10s | %-8s | %-5s | %-15s\n",
                    shirt.idProduct, shirt.name, shirt.brand, shirt.price, shirt.size, shirt.material, shirt.gender,
                    shirt.color, shirt.sleeveType);
        }

        // Menutup scanner
        scanner.close();
    }
}

// Kelas dasar untuk objek Product
class Product {
    int idProduct;
    String name;
    String brand;
    double price;

    // Konstruktor untuk menginisialisasi objek Product
    public Product(int idProduct, String name, String brand, double price) {
        this.idProduct = idProduct;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }
}

// Kelas turunan Clothing dari Product
class Clothing extends Product {
    String size;
    String material;
    String gender;

    // Konstruktor untuk menginisialisasi objek Clothing
    public Clothing(int idProduct, String name, String brand, double price, String size, String material, String gender) {
        super(idProduct, name, brand, price);
        this.size = size;
        this.material = material;
        this.gender = gender;
    }
}

// Kelas turunan Shirt dari Clothing
class Shirt extends Clothing {
    String color;
    String sleeveType;

    // Konstruktor untuk menginisialisasi objek Shirt
    public Shirt(int idProduct, String name, String brand, double price, String size, String material, String gender, String color, String sleeveType) {
        super(idProduct, name, brand, price, size, material, gender);
        this.color = color;
        this.sleeveType = sleeveType;
    }
}
