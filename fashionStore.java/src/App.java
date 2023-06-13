import java.util.Scanner;
import model.Produk;
import model.Order;
import model.karyawan;

import model.Costumer;
import model.Settlement;
public class App {
    static Produk produk[] = new Produk[20];
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Ini adalah kelompok fashion store ASHIAAAAP");
    //disini code menu tampilan awal
    Scanner scanner = new Scanner(System.in);
                int choice;
        
                do {
                    System.out.println("==== Angkasa Fashion Store ====");
                    System.out.println("1. Tambah Data Produk");
                    System.out.println("2. Cetak Data Produk");
                    System.out.println("3. Tambah Data Karyawan");
                    System.out.println("4. Cetak Data Karyawan");
                    System.out.println("5. Tambah Data Order");
                    System.out.println("6. Cetak Data Order");
                    System.out.println("7. Tambah Data Customer");
                    System.out.println("8. Cetak Data Customer");
                    System.out.println("9. Tambah Data Settlement");
                    System.out.println("10. Cetak Data Settlement");
                    System.out.print("Enter your choice: ");
                    
                    choice = scanner.nextInt();
                    // Masih sementara, belum hasil akhir
                    
                    switch (choice) {
                        case 1:
                            buatProduk();
                            break;
                        case 2:
                            printProduk();
                            break;
                        case 3:
                            buatKaryawan();
                            break;
                        case 4:
                            printKaryawan();
                            break;
                        case  5:
                            buatOrder();
                            break;
                        case  6:
                            printOrder();
                            break;
                        case  7:
                            buatCostumer();
                            break;
                        case  8:
                            printCostumer();
                            break;
                        case  9:
                            buatSettlement();
                            break;
                        case  10:
                            printSettlement();
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                    
                    System.out.println(); // Print an empty line for readability
                } while (choice != 4);
                
                scanner.close();
            }

            public static void init(){

                Order budi = new Order("Budi","0b110",5,"10008","10 Feb 2023","932890324",1000000,1);
                Order karla = new Order("Karla","0b210",3,"12008","11 Feb 2023","93276760324",500000,1);
                Order carool = new Order("Carool","0b111",2,"10018","12 Feb 2023","932866524",2000000,1);
           


                Produk AdidasSepatu = new Produk("Adidas", "Ultraboost", "69BCA20", "Sepatu", 870000, 52, "White", "44");
                Produk AdidasBaju = new Produk("Adidas", "Trefoil", "78BXI20", "Baju", 583000, 199, "White", "XXL");
                Produk NikeSepatu = new Produk("Nike", "Dunk Low Retro", "XXA887A", "Sepatu", 1100000, 2, "White", "47");
                Costumer Salim = new Costumer("Salim", "082160548923", "salim.ariantou@gmail.com", "Jl. Brahrang");
                Costumer Justin = new Costumer("Justin", "082134517682", "Justin.lo@gmail.com", "Jl. Ahmad Yani");
                Costumer Farrel = new Costumer("Farrel", "082188653391", "farrel21@gmail.com", "Jl. Setia Budi");

                Settlement trx1 = new Settlement("FS01","BCA","05062023","0123","Sukses");
                Settlement trx2 = new Settlement("FS02","QRIS","05062023","0224","Sukses");
                Settlement trx3 = new Settlement("FS03","Debit","05052023","1130","Gagal");

                karyawan Puan = new karyawan("03081220031", "Puan", "Manajer", "Pemasaran", 4500000, "081260789229");
                karyawan Toni = new karyawan("03081220032", "Toni", "Desainer Fashion", "Design", 7500000, "081360789443");
                karyawan Dandy = new karyawan("03081220033", "Dandy", "Manajer", "Produksi", 8500000, "081260989119");

            }
             public static Produk buatProduk() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String merk = scanner.nextLine();
        System.out.print("Enter product variant: ");
        String nama = scanner.nextLine();
        System.out.print("Enter product ID: ");
        String idProduk = scanner.nextLine();
        System.out.print("Enter product category: ");
        String kategori = scanner.nextLine();
        System.out.print("Enter product price: ");
        int harga = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.print("Enter product stock: ");
        int stok = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter product color: ");
        String warna = scanner.nextLine();
        System.out.print("Enter product size: ");
        String ukuran = scanner.nextLine();
        

        Produk newProduk = new Produk(merk, nama, idProduk, kategori, harga, stok, warna, ukuran);
    
    // Find the first empty slot in the array and insert the new product
    for (int i = 0; i < produk.length; i++) {
        if (produk[i] == null) {
            produk[i] = newProduk;
            break;
        }
    }
    
    return newProduk;
}
public static void printProduk() {
        for (int j = 0; j < produk.length; j++) {
            if (produk[j] != null) {
                System.out.println(produk[j]);
            }
        }
        System.out.println();
    }

    
    private static karyawan[] karyawan = new karyawan[10];

public static karyawan buatKaryawan(){

    Scanner scanner = new Scanner(System.in);
    System.out.print("Input ID Karyawan: ");
    String idKaryawan = scanner.nextLine();
    System.out.print("Input Nama Karyawan: ");
    String Name = scanner.nextLine();
    System.out.print("Input Jabatan Karyawan: ");
    String Jabatan = scanner.nextLine();
    System.out.print("Input Departemen Karyawan: ");
    String Departemen = scanner.nextLine();
    System.out.print("Input Gaji Karyawan: ");
    Integer Gaji = scanner.nextInt(); 
    System.out.print("Input Nomor Telepon Karyawan: ");
    String NomorTelepon = scanner.nextLine();

    
    // declare newKaryawan as an object of the class karyawan
    karyawan newKaryawan = new karyawan(idKaryawan, Name, Jabatan, Departemen, 0, NomorTelepon);

    for (int i = 0; i < karyawan.length; i++) {
        if (karyawan[i] == null) {
            karyawan[i] = newKaryawan;
            break;
        }
    }
    return newKaryawan;
}
public static void printKaryawan() {
    for (int j = 0; j < karyawan.length; j++) {
        if (karyawan[j] != null) {
            System.out.println("Employee[" + j + "]:");
            System.out.println("ID Karyawan: " + karyawan[j].getIdKaryawan());
            System.out.println("Nama Karyawan: " + karyawan[j].getName());
            System.out.println("Jabatan Karyawan: " + karyawan[j].getJabatan());
            System.out.println("Departemen Karyawan: " + karyawan[j].getDepartemen());
            System.out.println("Gaji Karyawan: " + karyawan[j].getGaji());
            System.out.println("Nomor Telepon Karyawan: " + karyawan[j].getNomorTelepon());
            System.out.println();
    }
}
}
static Order order[] = new Order[20];
public static Order buatOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan ID Produk: ");
        String idProduk = scanner.nextLine();
        System.out.print("Masukkan Stok: ");
        int stok = scanner.nextInt();
        System.out.print("Masukkan ID Pembayaran: ");
        String idPembayaran = scanner.nextLine();
        System.out.print("Masukkan Tanggal Pesanan: ");
        String tanggalPesanan = scanner.nextLine();
        scanner.nextLine(); // consume the newline character
        System.out.print("Masukkan Nomor Telepon: ");
        String nomorTelepon = scanner.next();
        scanner.nextLine();
        System.out.print("Masukkan Harga: ");
        int harga = scanner.nextInt();
        System.out.print("Masukkan Jumlah: ");
        int jumlah = scanner.nextInt();
        

        Order newOrder = new Order(nama,idProduk,stok,idPembayaran,tanggalPesanan,nomorTelepon,harga,jumlah);
    
    // Find the first empty slot in the array and insert the new product
    for (int i = 0; i < produk.length; i++) {
        if (order[i] == null) {
            order[i] = newOrder;
            break;
        }
    }
    return newOrder;
}
public static void printOrder() {
        for (int j = 0; j < produk.length; j++) {
            if (order[j] != null) {
                System.out.println(order[j]);
            }
        }
        System.out.println();
    }
static Costumer costumer[] = new Costumer[20];
public static Costumer buatCostumer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan nomor telepon: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Masukkan email: ");
        String email = scanner.nextLine();
        System.out.print("Masukkan alamat: ");
        String address = scanner.nextLine();
        

        Costumer newCostumer = new Costumer(name,phoneNumber,email,address);
    
    // Find the first empty slot in the array and insert the new product
    for (int i = 0; i < produk.length; i++) {
        if (costumer[i] == null) {
            costumer[i] = newCostumer;
            break;
        }
    }
    return newCostumer;
}
public static void printCostumer() {
        for (int j = 0; j < produk.length; j++) {
            if (costumer[j] != null) {
                System.out.println(costumer[j]);
            }
        }
        System.out.println();
}
static Settlement settlement[] = new Settlement[20];
public static Settlement buatSettlement() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ID transaksi: ");
        String idTransaksi = scanner.nextLine();
        System.out.print("Masukkan metode pembayaran: ");
        String metode = scanner.nextLine();
        System.out.print("Masukkan tanggal: ");
        String tanggalSettlement = scanner.nextLine();
        System.out.print("Masukkan waktu: ");
        String waktuSettlement = scanner.nextLine();
        System.out.print("Masukkan status: ");
        String status = scanner.nextLine();

        Settlement newSettlement = new Settlement(idTransaksi,metode,tanggalSettlement,waktuSettlement,status);
    
    // Find the first empty slot in the array and insert the new product
    for (int i = 0; i < produk.length; i++) {
        if (settlement[i] == null) {
            settlement[i] = newSettlement;
            break;
        }
    }
    return newSettlement;
}
public static void printSettlement() {
        for (int j = 0; j < produk.length; j++) {
            if (settlement[j] != null) {
                System.out.println(settlement[j]);
            }
        }
        System.out.println();
}
}

    

    
