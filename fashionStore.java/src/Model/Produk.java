package model;
/*
 * Name : Farrel Raihan
 */
public class Produk {
    // Attributes :
    /* ID Produk : 
     * Merk : 
     * Nama : 
     * Kategori : 
     * Harga : 
     * Stok : 
     * Warna :
     * Ukuran : 
     * 
     * Task
     * Dapat mengelola harga
     * Dapat mengelola jumlah Stok
     * Menyimpan Informasi Produk
     * 
     

     */
    String merk;
    String nama;
    String idProduk;
    String kategori;
    Integer harga;
    Integer stok;
    String warna;
    String ukuran;

    public Produk(){}

    public Produk(String merk, String nama, String idProduk, String kategori, Integer harga, Integer stok, String warna, String ukuran) {}

    

    public String getMerk() {
        return this.merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIdProduk() {
        return this.idProduk;
    }

    public void setIdProduk(String idProduk) {
        this.idProduk = idProduk;
    }

    public String getKategori() {
        return this.kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public Integer getHarga() {
        return this.harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getStok() {
        return this.stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getUkuran() {
        return this.ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }



    
}
