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

    String orderID;
    String settlementID;
    String metode;
    String tanggalSettlement;
    // String waktuSettlement;


    public Settlement() {
    }

    public Settlement(String orderID, String settlementID, String metode, String tanggalSettlement) {
        this.orderID = orderID;
        this.settlementID = settlementID;
        this.metode = metode;
        this.tanggalSettlement = tanggalSettlement;
    }

    public String getOrderID() {
        return this.orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getSettlementID() {
        return this.settlementID;
    }

    public void setSettlementID(String settlementID) {
        this.settlementID = settlementID;
    }

    public String getMetode() {
        return this.metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    public String getTanggalSettlement() {
        return this.tanggalSettlement;
    }

    public void setTanggalSettlement(String tanggalSettlement) {
        this.tanggalSettlement = tanggalSettlement;
    }

    @Override
    public String toString() {
        return "{" +
            " orderID='" + getOrderID() + "'" +
            ", settlementID='" + getSettlementID() + "'" +
            ", metode='" + getMetode() + "'" +
            ", tanggalSettlement='" + getTanggalSettlement() + "'" +
            "}";
    
    }

    
    // String status;

    // public Settlement() {
    // }

    // public Settlement(String idTransaksi, String metode, String tanggalSettlement, String waktuSettlement, String status) {
    //     this.settlementID = settlementID;
    //     this.metode = metode;
    //     this.tanggalSettlement = tanggalSettlement;
    //     this.waktuSettlement = waktuSettlement;


    //     this.status = status;
    }


    // public String getIdTransaksi() {
    //     return this.idTransaksi;
    // }

    // public void setIdTransaksi(String idTransaksi) {
    //     this.idTransaksi = idTransaksi;
//     }

//     public String getMetode() {
//         return this.metode;
//     }

//     public void setMetode(String metode) {
//         this.metode = metode;
//     }

//     public String getTanggalSettlement() {
//         return this.tanggalSettlement;
//     }

//     public void setTanggalSettlement(String tanggalSettlement) {
//         this.tanggalSettlement = tanggalSettlement;
//     }

//     public String getWaktuSettlement() {
//         return this.waktuSettlement;
//     }

//     public void setWaktuSettlement(String waktuSettlement) {
//         this.waktuSettlement = waktuSettlement;
//     }

//     // public String getStatus() {
//     //     return this.status;
//     // }

//     // public void setStatus(String status) {
//     //     this.status = status;
//     // }


    

//     @Override
//     public String toString() {
//         return "{" +
//             " idTransaksi='" + getIdTransaksi() + "'" +
//             ", metode='" + getMetode() + "'" +
//             ", tanggalSettlement='" + getTanggalSettlement() + "'" +
//             ", waktuSettlement='" + getWaktuSettlement() + "'" +
//             "}";
//     }

// }
