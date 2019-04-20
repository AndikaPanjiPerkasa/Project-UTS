package service;

import entity.*;
import java.util.*;

public class ServicePerpustakaan{

    private static List<Perpustakaan> data = new LinkedList<Perpustakaan>();

    public void tambahData(Perpustakaan pps){
        ServicePerpustakaan.data.add(pps);
        System.out.println("Data Telah Disimpan\n");
    }

    public void ubahData(Perpustakaan pps){
        int result = data.indexOf(pps);
        if (result >= 0){
            data.set(result,pps);
            System.out.println("Data Telah Berubah\n");
        }else {
            System.out.println("Datanya Tidak Ada!\n");
        }
    }

    public void hapusData(String code){
        int idx = data.indexOf(new Perpustakaan(code,"","",""));
        if (idx >= 0){
            data.remove(idx);
            System.out.println("Data Telah Terhapus!");
        }else {
            System.out.println("Datanya Tidak Ada!\n");
        }
    }

    public void cetakData(){
        System.out.println("\n--- cetak data");
        int i=1;
        for (Perpustakaan pps : data){
            System.out.println("data ke-" + i++);
            System.out.println("    CODE        :" + pps.getCode());
            System.out.println("    NAMA BUKU   :" + pps.getNama());
            System.out.println("    PENERBIT    :" + pps.getPenerbit());
            System.out.println("    TAHUN       :" + pps.getTahun());
            System.out.println("\n");

        }
    }
}