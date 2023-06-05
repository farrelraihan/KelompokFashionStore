package model;
/*
 * Name : Davin Lim
 */

public class Costumer {
    /*
     * Deskripsi :
     * Atribut
     * name : untuk menyimpan nama pelanggan
     * phoneNumber : untuk menyimpan nomor telepon pelanggan
     * email : untuk menyimpan email pelanggan
     * address : untuk menyimpan alamat tempat tinggal pelanggan
     * 
     * Task
     * Costumer bisa membuat order
     */

     String name;
     String phoneNumber;
     String email;
     String address;

    public Costumer() {
    }

    public Costumer(String name, String phoneNumber, String email, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", email='" + getEmail() + "'" +
            ", address='" + getAddress() + "'" +
            "}";
    }
}
