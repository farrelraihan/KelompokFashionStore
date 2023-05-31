package model;

/*
 * Name : Owen
 * NIM : 03081220045
 */
public class Settlement {
    /*
     * Transaction ID : Transaksi Pembayaran
     * Method : Metode Pembayaran
     * Date : Tanggal Transaksi Pembayaran
     * Time : Waktu Transaksi Pembayaran
     * Status : Status Transaksi Pembayaran
     * 
     */

    String idTransaksi;
    String metode;
    Integer tanggalSettlement;
    Integer waktuSettlement;
    String status;


    public String getIdTransaksi() {
        return this.idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getMetode() {
        return this.metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    public Integer getTanggalSettlement() {
        return this.tanggalSettlement;
    }

    public void setTanggalSettlement(Integer tanggalSettlement) {
        this.tanggalSettlement = tanggalSettlement;
    }

    public Integer getWaktuSettlement() {
        return this.waktuSettlement;
    }

    public void setWaktuSettlement(Integer waktuSettlement) {
        this.waktuSettlement = waktuSettlement;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
