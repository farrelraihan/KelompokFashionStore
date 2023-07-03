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
    // String nama;
    // String idProduk;    
    // int stok;
    // String idPembayaran;
    // String tanggalPesanan;
    // String nomorTelepon;
    // int harga;
    // int jumlah;

    String orderID;
    String customerName; //ni ambil dari Customer.java
    String customerPhoneNumber; //ni ambil dari Customer.java
    String tanggalPesanan; 
    int hargaTotal; 
    String karyawan; 


    public Order() {
    }

    public Order(String orderID, String customerName, String customerPhoneNumber, String tanggalPesanan, int hargaTotal, String karyawan) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.tanggalPesanan = tanggalPesanan;
        this.hargaTotal = hargaTotal;
        this.karyawan = karyawan;
    }

    public String getOrderID() {
        return this.orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getTanggalPesanan() {
        return this.tanggalPesanan;
    }

    public void setTanggalPesanan(String tanggalPesanan) {
        this.tanggalPesanan = tanggalPesanan;
    }

    public int getHargaTotal() {
        return this.hargaTotal;
    }

    public void setHargaTotal(int hargaTotal) {
        this.hargaTotal = hargaTotal;
    }

    public String getKaryawan() {
        return this.karyawan;
    }

    public void setKaryawan(String karyawan) {
        this.karyawan = karyawan;
    }

    @Override
    public String toString() {
        return "{" +
            " orderID='" + getOrderID() + "'" +
            ", customerName='" + getCustomerName() + "'" +
            ", customerPhoneNumber='" + getCustomerPhoneNumber() + "'" +
            ", tanggalPesanan='" + getTanggalPesanan() + "'" +
            ", hargaTotal='" + getHargaTotal() + "'" +
            ", karyawan='" + getKaryawan() + "'" +
            "}";
    }

    

    // public Order(String nama,String idProduk, int stok, String idPembayaran,String tanggalPesanan,String nomorTelepon,int harga,int jumlah){
        
    //     this.nama = nama;
    //     this.idProduk = idProduk;
    //     this.stok = stok;
    //     this.idPembayaran = idPembayaran;
    //     this.tanggalPesanan = tanggalPesanan;
    //     this.nomorTelepon = nomorTelepon;
    //     this.harga = harga;
    //     this.jumlah = jumlah;
    // }
    // public Order() {
        
    // }

    // public String getNama() {
    //     return this.nama;
    // }

    // public void setNama(String nama) {
    //     this.nama = nama;
    // }

    // public String getIdProduk() {
    //     return this.idProduk;
    // }

    // public void setIdProduk(String idProduk) {
    //     this.idProduk = idProduk;
    // }

    // public int getStok() {
    //     return this.stok;
    // }

    // public void setStok(int stok) {
    //     this.stok = stok;
    // }

    // public String getIdPembayaran() {
    //     return this.idPembayaran;
    // }

    // public void setIdPembayaran(String idPembayaran) {
    //     this.idPembayaran = idPembayaran;
    // }

    // public String getTanggalPesanan() {
    //     return this.tanggalPesanan;
    // }

    // public void setTanggalPesanan(String tanggalPesanan) {
    //     this.tanggalPesanan = tanggalPesanan;
    // }

    // public String getNomorTelepon() {
    //     return this.nomorTelepon;
    // }

    // public void setNomorTelepon (String nomorTelepon) {
    //     this.nomorTelepon = nomorTelepon;
    // }

    // public int getHarga() {
    //     return this.harga;
    // }

    // public void setHarga(int harga) {
    //     this.harga = harga;
    // }

    // public int getJumlah() {
    //     return this.jumlah;
    // }

    // public void setJumlah(int jumlah) {
    //     this.jumlah = jumlah;
    // }

    // @Override
    // public String toString() {
    //     return "|" +
    //         " " + getNama() + "\t|" +
    //         " " + getIdProduk() + "\t|" +
    //         " " + getStok() + "\t|" +
    //         " " + getIdPembayaran() + "\t|" +
    //         " " + getTanggalPesanan() + "\t|" +
    //         " " + getNomorTelepon() + "\t|" +
    //         " " + getHarga() + "\t|" +
    //         " '" + getJumlah() + "\t|" +
    //         "";
    // }



}
