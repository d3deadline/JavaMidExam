package data;
import java.util.Scanner;

public class LaptopApp {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.println("========= SILAHKAN MASUKKAN DATA LAPTOP =========="); 

    System.out.print("Nama                        : ");
    String nama = input.nextLine();
    System.out.print("Brand                       : ");
    String brand = input.nextLine();
    System.out.print("Nama Processor              : ");
    String proc = input.nextLine();
    System.out.print("Jumlah Core Pada Processor  : "); 
    int core = input.nextInt(); input.nextLine();
    System.out.print("Sistem Operasi              : ");
    String os = input.nextLine();
    System.out.print("Ukuran RAM Dalam GB         : ");
    int ram = input.nextInt(); input.nextLine();
    System.out.println("\nSilahkan Pilih Jenis Storage!\n1. SSD.M2\n2. SSD SATA\n3. HDD\n");
    System.out.print("Jenis Storage               : ");
    int storage = input.nextInt(); input.nextLine();
    System.out.print("Stock                       : ");
    int stock = input.nextInt(); input.nextLine();

    Laptop dataLaptop = new Laptop(nama, brand, proc, core, os, ram, storage, stock);
    dataLaptop.getData();
}
}
