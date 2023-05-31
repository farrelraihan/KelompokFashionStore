package model;

public class Order {

    /*
     * deskripsi
     * Nama            : Untuk menyimpan nama pelanggan
     * NO telp         : Nomor telepon pelanggan
     * ID Produk       : Untuk mentimpan kode produk  yang di order
     * Stok            : Jumlah stok tersisa dari produk ytang di pesan 
     * Tanggal Pesanan : Tanggal ketika pesanan di pesan pelanggan
     * Harga           : Harga dari produk yang di pesan
     * Jumlah          : Jumlah produk yang dipesan 
     * Id pembayaran   : Id pemabayaran dari suatru produk
     */
    String nama;
    String idProduk;
    String stok;
    String idPembayaran;
    int tanggalPesanan;
    int nomorTelepon;
    int harga;
    int jumlah;
    

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

    public String getStok() {
        return this.stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public String getIdPembayaran() {
        return this.idPembayaran;
    }

    public void setIdPembayaran(String idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public int getTanggalPesanan() {
        return this.tanggalPesanan;
    }

    public void setTanggalPesanan(int tanggalPesanan) {
        this.tanggalPesanan = tanggalPesanan;
    }

    public int getNomorTelepon() {
        return this.nomorTelepon;
    }

    public void setNomorTelepon(int nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }


}
