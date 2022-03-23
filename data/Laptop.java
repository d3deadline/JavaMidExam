package data;

public class Laptop {
    private String nama, brand, proc, os;
    private int stock, core, ram, storage;

    // Overloading
    public Laptop() {

    }

    // Overloading Laptop
    public Laptop(String nama, String brand, String proc, int core, String os, int ram, int storage, int stock) {
        this.nama = nama;
        this.brand = brand;
        this.proc = proc;
        this.core = core;
        this.os = os;
        this.ram = ram;
        this.storage = storage;
        this.stock = stock;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setProc(String proc) {
        this.proc = proc;
    }
    public void setCore(int core) {
        this.core = core;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNama() {
        return nama;
    }
    public String getBrand() {
        return brand;
    }
    public String getProc() {
        return proc;
    }
    public int getCore() {
        return core;
    }
    public String getOs() {
        return os;
    }
    public int getRam() {
        return ram;
    }
    public int getStorage() {
        return storage;
    }
    public int getStock() {
        return stock;
    }

    public void getData() {
        System.out.println("\n================== DATA LAPTOP ==================="); 
        System.out.println("Nama                            : " + nama); 
        System.out.println("Brand                           : " + brand); 
        System.out.println("Nama Processor                  : " + proc); 
        System.out.println("Jumlah Core Pada Processor      : " + core); 
        System.out.println("Sistem Operasi                  : " + os); 
        System.out.println("Ukuran RAM Dalam GB             : " + ram); 
        System.out.println("Jenis Storage                   : " + storage); 
        System.out.println("Stock                           : " + stock); 
    }
}
