package data;

public class Asus extends Laptop {

    public Asus(){
        super();
        super.setBrand("Asus");
    }

    public Asus(String nama, String brand, String type, String proc, int core, String os, int ram, int storage, int stock) {
        super(nama, "Asus", proc, core, os, ram, storage, stock);
    }

    public void sloganAsus() {
        System.out.println("============= Asus ==============");
        System.out.println("==== In Search of Incredible ====\n");
    }

    @Override
    public void setRam(int ram) {
        if (ram < 0 ) {
            System.out.println("Ukuran RAM tidak dapat diisi lebih kecil dari nol");
            System.out.println("Ukuran RAM default saat ini adalah 4 GB");
            super.setRam(4);
        }
        else {
            super.setRam(ram);;
        }
    }

    @Override
    public void setCore(int core){
        if(core < 0) {
            System.out.println("Jumlah Core tidak dapat lebih kecil dari nol!");
            System.out.println("Jumlah Core diatur ke default (Dual-Core)");

            super.setCore(2);
        } 
        else {
            super.setCore(core);
        }
    }   
    
    @Override
    public void setStock(int stock){
        if(stock < 0){
            System.out.println("Jumlah Stok Laptop tidak dapat lebih kecil dari nol!");
            System.out.println("Jumlah Stok diatur ke default (0 pcs)");
            super.setStock(0);
        } else {
            super.setStock(stock);
        }
    }
    
//    Posisi Pada Etalase Toko
    public String etalaseToko(){
        int storage = super.getStorage();
        switch(storage) {
            case 1 -> {
                return "Best";
            }
            case 2 -> {
                return "Good";
            }
            case 3 -> {
                return "Middle";
            }
            default -> {
                    return "unidentified";
            }
        }
    }
}