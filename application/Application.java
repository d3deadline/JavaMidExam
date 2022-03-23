package application;
import data.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String nama, brand, proc, os;
        int stock, core, ram, storage;
        
//        Scanner
        Scanner input = new Scanner(System.in);
        
        Asus a441u = new Asus();
        Acer nitro = new Acer();
        
        
//        a441u.getAllLaptopData();
        a441u.sloganAsus();

//        Untuk test Asus a441u
        System.out.println("========= SILAHKAN MASUKKAN DATA LAPTOP =========="); 
        System.out.print("Nama                            : ");
        nama = input.nextLine();
        System.out.print("Brand                           : ");
        brand = input.nextLine();
        System.out.print("Nama Processor                  : ");
        proc = input.nextLine();
        System.out.print("Jumlah Core Pada Processor      : "); 
        core = input.nextInt(); input.nextLine();
        System.out.print("Sistem Operasi                  : ");
        os = input.nextLine();
        System.out.print("Ukuran RAM Dalam GB             : ");
        ram = input.nextInt(); input.nextLine();
        System.out.println("\nSilahkan Pilih Jenis Storage !\n1. SSD.M2\n2. SSD SATA\n3. HDD\n");
        System.out.print("Jenis Storage (Gunakan Angka !) : ");
        storage = input.nextInt(); input.nextLine();
        System.out.print("Stock                           : ");
        stock = input.nextInt(); input.nextLine();
        a441u.setNama(nama);
        a441u.setProc(proc);
        a441u.setCore(core);
        a441u.setOs(os);
        a441u.setRam(ram);
        a441u.setStorage(storage);
        a441u.setStock(stock);
        a441u.getData();
        System.out.println("Store Position " + a441u.getNama() + 
                " adalah " + a441u.etalaseToko());
        System.out.println("==========================================\n\n");
                

//        nitro.getAllLaptopData();
        nitro.sloganAcer();
        
//        Untuk test Acer Nitro
        System.out.println("========= SILAHKAN MASUKKAN DATA LAPTOP =========="); 
        System.out.print("Nama                            : ");
        nama = input.nextLine();
        System.out.print("Brand                           : ");
        brand = input.nextLine();
        System.out.print("Nama Processor                  : ");
        proc = input.nextLine();
        System.out.print("Jumlah Core Pada Processor      : "); 
        core = input.nextInt(); input.nextLine();
        System.out.print("Sistem Operasi                  : ");
        os = input.nextLine();
        System.out.print("Ukuran RAM Dalam GB             : ");
        ram = input.nextInt(); input.nextLine();
        System.out.println("\nSilahkan Pilih Jenis Storage !\n1. SSD.M2\n2. SSD SATA\n3. HDD\n");
        System.out.print("Jenis Storage (Gunakan Angka !) : ");
        storage = input.nextInt(); input.nextLine();
        System.out.print("Stock                           : ");
        stock = input.nextInt(); input.nextLine();
        System.out.println("");
        nitro.setNama(nama);
        nitro.setProc(proc);
        nitro.setCore(core);
        nitro.setOs(os);
        nitro.setRam(ram);
        nitro.setStorage(storage);
        nitro.setStock(stock);
        nitro.getData();
        System.out.println("Store Position " + nitro.getNama() + 
                " adalah " + nitro.etalaseToko());
        System.out.println("==========================================");       
        
    }
}