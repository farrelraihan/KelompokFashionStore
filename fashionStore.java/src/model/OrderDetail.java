package model;
import java.util.ArrayList;
import java.util.List;

public class OrderDetail {
    private String orderID;
    private ArrayList<Produk> idProduk;
    private int quantity;
    private int hargaSatuan;
    private int hargaTotal;
   
//bingung
    public OrderDetail(String orderID, int quantity, int hargaSatuan){ //int hargaTotal, ArrayList<String> idProduk
        this.orderID = orderID;
        this.idProduk = new ArrayList<>();
        this.quantity = quantity;
        this.hargaSatuan = hargaSatuan;
        this.hargaTotal = quantity * hargaSatuan;
    }
    // public OrderDetail() {
    //     idProduk = new ArrayList<String>();
    //}

    public OrderDetail() {
    }

    public String getOrderID() {
        return this.orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public ArrayList<Produk> getIdProduk() { //how
        return idProduk;
    }

    // public void setIdProduk(ArrayList<String> idProduk) {
    //     this.idProduk = idProduk;
    // }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.hargaTotal = quantity * hargaSatuan;
    }

    public int getHargaSatuan() {
        return this.hargaSatuan;
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
        this.hargaTotal = quantity * hargaSatuan;
    }

    public int getHargaTotal() {
        return this.hargaTotal;
    }

    public void setHargaTotal(int hargaTotal) {
        this.hargaTotal = hargaTotal;
    }

    public void addProduk(Produk produk) {
        idProduk.add(produk);
    }


    @Override
    public String toString() {
        return "{" +
            " orderID='" + getOrderID() + "'" +
            ", idProduk='" + getIdProduk() + "'" +
            ", quantity='" + getQuantity() + "'" +
            ", hargaSatuan='" + getHargaSatuan() + "'" +
            ", hargaTotal='" + getHargaTotal() + "'" +
            "}";
    }
}