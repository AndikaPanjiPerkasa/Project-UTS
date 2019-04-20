package entity;

public class Perpustakaan{

    private String code;
    private String nama;
    private String penerbit;
    private String tahun;

    public Perpustakaan(String code, String nama, String penerbit, String tahun){
        this.code = code;
        this.nama = nama;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    public boolean equals(Object object){
        Perpustakaan tmp = (Perpustakaan) object;
        return code.equals(tmp.getCode());
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }
}