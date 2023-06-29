package model;
import java.util.ArrayList;

public class OrderDetail extends Order{
    private String orderID;
    private ArrayList<String> idProduk;
    private int quantity;
    private int hargaSatuan;
    private int hargaTotal;
   
//bingung
    public OrderDetail() {
        idProduk = new ArrayList<String>();
    }

    public String getOrderID() {
        return this.orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public ArrayList<String> getIdProduk() { //how
        return this.idProduk;
    }

    public void setIdProduk(ArrayList<String> idProduk) {
        this.idProduk = idProduk;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getHargaSatuan() {
        return this.hargaSatuan;
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public int getHargaTotal() {
        return this.hargaTotal;
    }

    public void setHargaTotal(int hargaTotal) {
        this.hargaTotal = hargaTotal;
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