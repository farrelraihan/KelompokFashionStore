package model;

public class karyawan {

    /* ID : identifikasi unik setiap
     * Name : untuk menginput nama karyawan
     * Jabatan : untuk menginput jabatan atau posisi karyawan
     * Departemen : berisi didepartemen dimana karyawan bekerja
     * Gaji : untuk menginput gaji / penghasilan karyawan
     * NomorTelepon : untuk menginput nomor telepon karyawan
     */

    String idKaryawan;
    String Name;
    String Jabatan;
    String Departemen;
    int Gaji;
    String NomorTelepon;

    public String getIdKaryawan() {
        return this.idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getJabatan() {
        return this.Jabatan;
    }

    public void setJabatan(String Jabatan) {
        this.Jabatan = Jabatan;
    }

    public String getDepartemen() {
        return this.Departemen;
    }

    public void setDepartemen(String Departemen) {
        this.Departemen = Departemen;
    }

    public int getGaji() {
        return this.Gaji;
    }

    public void setGaji(int Gaji) {
        this.Gaji = Gaji;
    }

    public String getNomorTelepon() {
        return this.NomorTelepon;
    }

    public void setNomorTelepon(String NomorTelepon) {
        this.NomorTelepon = NomorTelepon;
    }
}