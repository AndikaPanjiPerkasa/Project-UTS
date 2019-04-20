import entity.*;
import service.*;
import java.util.*;

public class aplikasi{

    private  static ServicePerpustakaan service;
    private static Scanner scanner;

    public static void main(String[] args) {
        service = new ServicePerpustakaan();

        int opsi = 5;
        do {
            cetakMenu();
            scanner = new Scanner(System.in);
            try {
                opsi = scanner.nextInt();
            }catch (Exception e){
                System.out.println("Tolong dicek inputnya");
                opsi = 0;
            }
//            opsi = scanner.nextInt();
            prosesMenu(opsi);
        }while (opsi != 5) ;
    }

    private static void prosesMenu(int opsi){
        switch (opsi){
            case 1:
                tambahData();
                break;
            case 2:
                ubahData();
                break;
            case 3:
                hapusData();
                break;
            case 4:
                service.cetakData();
                break;
        }
    }
    private static void hapusData(){
        System.out.println("\n Form Hapus Data");
        scanner = new Scanner(System.in);
        System.out.println("CODE     : ");
        String code = scanner.nextLine();
        service.hapusData(code);
    }

    private static void ubahData(){
        String code,nama,penerbit,tahun;
        System.out.println("\n Form Ubah Data");
        scanner = new Scanner(System.in);
        System.out.println("CODE        : ");
        code = scanner.nextLine();
        System.out.println("NAMA BUKU   : ");
        nama = scanner.nextLine();
        System.out.println("PENERBIT    : ");
        penerbit = scanner.nextLine();
        System.out.println("TAHUN       : ");
        tahun = scanner.nextLine();
        service.ubahData(new Perpustakaan(code,nama,penerbit,tahun));
    }
    private static void tambahData(){
        String code,nama,penerbit,tahun;
        System.out.println("\n Form Tambah Data");
        scanner = new Scanner(System.in);
        System.out.println("CODE        : ");
        code = scanner.nextLine();
        System.out.println("NAMA BUKU   : ");
        nama = scanner.nextLine();
        System.out.println("PENERBIT    : ");
        penerbit = scanner.nextLine();
        System.out.println("TAHUN       : ");
        tahun = scanner.nextLine();
        simpanDataBaru(new Perpustakaan(code,nama,penerbit,tahun));
    }

    private static void simpanDataBaru(Perpustakaan pps){
        service.tambahData(pps);
    }

    private static void cetakMenu(){
        System.out.println("\n-----Aplikasi CRUD PERPUSTAKAAN-----");
        System.out.println("1. TAMBAH DATA");
        System.out.println("2. UBAH DATA");
        System.out.println("3. HAPUS DATA");
        System.out.println("4. TAMPILKAN DATA");
        System.out.println("5. KELUAR");
        System.out.println("----------------------------");
        System.out.println("Pilihan > ");
    }
}