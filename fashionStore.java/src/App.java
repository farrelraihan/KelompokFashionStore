import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Produk;
import model.Order;
import model.karyawan;
import model.OrderDetail;
import model.Costumer;
import model.Settlement;


public class App {
    static List<Produk> produkList = new ArrayList<>();
    static List<Order> orderList = new ArrayList<>();
    static List<Costumer> costumerList = new ArrayList<>();
    static List<Settlement> settlementList = new ArrayList<>();
    static List<karyawan> karyawanList = new ArrayList<>();


    // static Produk produk[] = new Produk[20];
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
                    System.out.println("11. Exit Program");
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
                        case 11:
                            System.exit(0);
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                    
                    System.out.println(); // Print an empty line for readability
                } while (choice != 12);
                
                scanner.close();
            }

            public static void init(){

                // Order budi = new Order("Budi","0b110",5,"10008","10 Feb 2023","932890324",1000000,1);
                // Order karla = new Order("Karla","0b210",3,"12008","11 Feb 2023","93276760324",500000,1);
                // Order carool = new Order("Carool","0b111",2,"10018","12 Feb 2023","932866524",2000000,1);
           


                Produk AdidasSepatu = new Produk("Adidas", "Ultraboost", "69BCA20", "Sepatu", 870000, 52, "White", "44");
                Produk AdidasBaju = new Produk("Adidas", "Trefoil", "78BXI20", "Baju", 583000, 199, "White", "XXL");
                Produk NikeSepatu = new Produk("Nike", "Dunk Low Retro", "XXA887A", "Sepatu", 1100000, 2, "White", "47");
                // Costumer Salim = new Costumer("Salim", "082160548923", "salim.ariantou@gmail.com", "Jl. Brahrang");
                // Costumer Justin = new Costumer("Justin", "082134517682", "Justin.lo@gmail.com", "Jl. Ahmad Yani");
                // Costumer Farrel = new Costumer("Farrel", "082188653391", "farrel21@gmail.com", "Jl. Setia Budi");

                // Settlement trx1 = new Settlement("FS01","BCA","05062023","0123","Sukses");
                // Settlement trx2 = new Settlement("FS02","QRIS","05062023","0224","Sukses");
                // Settlement trx3 = new Settlement("FS03","Debit","05052023","1130","Gagal");

                karyawan Puan = new karyawan("03081220031", "Puan", "Manajer", "Pemasaran", 4500000, "081260789229");
                karyawan Toni = new karyawan("03081220032", "Toni", "Desainer Fashion", "Design", 7500000, "081360789443");
                karyawan Dandy = new karyawan("03081220033", "Dandy", "Manajer", "Produksi", 8500000, "081260989119");

            }
            // disuruh ubah sistem inputan jadi gunakan array list. refer ke
            // https://chat.openai.com/share/f137db60-fb36-43d8-9847-2d50648cb2f9\

            public static Produk findProdukById(String idProduk) {
        for (Produk produk : produkList) {
            if (produk.getIdProduk().equals(idProduk)) {
                return produk;
            }
        }
        return null;
    }
            public static Costumer findCustomerById(String customerID) {
        for (Costumer customer : costumerList) {
            if (customer.getCustomerID().equals(customerID)) {
                return customer;
            }
        }
        return null;
    }
        public static Order findOrderById(String orderID) { //wait
        for (Order order : orderList) {
            if (order.getOrderID().equals(orderID)) {
                return order;
            }
        }

        return null;
    }
            public static Produk buatProduk() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product Brand: ");
        String merk = scanner.nextLine();
        System.out.print("Enter product Name: ");
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
        
        //arraylist
        Produk newProduk = new Produk(merk, nama, idProduk, kategori, harga, stok, warna, ukuran);
        produkList.add(newProduk);

        return newProduk;
    
     }
        //belum implement gimana agar idProduk disini masuk ke idProduk di OrderDetail 
        //https://chat.openai.com/share/a7a29934-1f94-45be-8842-d55a28376c86
        
        public static void printProduk() { //belum implement gimana agar idProduk disini masuk ke idProduk di OrderDetail 
            for (int i = 0; i < produkList.size(); i++) {
    Produk produk = produkList.get(i);
    System.out.println("Product[" + (i + 1) + "]:");
    System.out.println("Merk: " + produk.getMerk());
    System.out.println("Nama: " + produk.getNama());
    System.out.println("ID Produk: " + produk.getIdProduk());
    System.out.println("Kategori: " + produk.getKategori());
    System.out.println("Harga: " + produk.getHarga());
    System.out.println("Stok: " + produk.getStok());
    System.out.println("Warna: " + produk.getWarna());
    System.out.println("Ukuran: " + produk.getUkuran());
    System.out.println();
}

    }

    
    // private static karyawan[] karyawan = new karyawan[10];

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
    scanner.nextLine();
    System.out.print("Input Nomor Telepon Karyawan: ");
    String NomorTelepon = scanner.nextLine();

    
    // declare newKaryawan as an object of the class karyawan
    // Setelah run, dia auto end. Harus fix agar langsung buka menu lagi.
    karyawan newKaryawan = new karyawan(idKaryawan, Name, Jabatan, Departemen, Gaji, NomorTelepon);
    karyawanList.add(newKaryawan);

    return newKaryawan;
}
public static void printKaryawan() {
    for (int i = 0; i < karyawanList.size(); i++) {
    karyawan karyawan = karyawanList.get(i);
            System.out.println("Karyawan[" + (i + 1) + "]:");
            System.out.println("ID Karyawan: " + karyawan.getIdKaryawan());
            System.out.println("Nama Karyawan: " + karyawan.getName());
            System.out.println("Jabatan Karyawan: " + karyawan.getJabatan());
            System.out.println("Departemen Karyawan: " + karyawan.getDepartemen());
            System.out.println("Gaji Karyawan: " + karyawan.getGaji());
            System.out.println("Nomor Telepon Karyawan: " + karyawan.getNomorTelepon());
            System.out.println();
    }
}
 //ini salah total masih, karena kita belum ubah attribute2 nya semenjak kita buat orderDetail
// edit note atas, done udah diperbaiki.
// static Order order[] = new Order[20];

public static Order buatOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan OrderID: ");
        String orderID = scanner.nextLine();
        System.out.print("Masukkan Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.print("Masukkan Customer Phone Number: ");
        String customerPhoneNumber = scanner.nextLine();
        System.out.print("Masukkan Tanggal Pesanan: ");
        String tanggalPesanan = scanner.nextLine();
        // System.out.print("Masukkan Tanggal Pesanan: ");
        // int hargaTotal = scanner.nextInt();
        // scanner.nextLine(); // consume the newline character
        System.out.print("Masukkan Karyawan: ");
        String karyawan = scanner.next();
        scanner.nextLine();
        // System.out.print("Masukkan Harga: ");
        // int harga = scanner.nextInt();
        // System.out.print("Masukkan Jumlah: ");
        // int jumlah = scanner.nextInt();

        OrderDetail orderDetail = new OrderDetail();
        Produk produk;
        String produkId;
        int quantity;

        do {
            System.out.print("Enter product ID (or 'done' to finish): ");
            produkId = scanner.nextLine();
            if (!produkId.equalsIgnoreCase("done")) {
                produk = findProdukById(produkId);
                if (produk != null) {
                    System.out.print("Enter quantity: ");
                    quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    
                    orderDetail.addProduk(produk, quantity);

                    // orderDetail.addProduk(produk, quantity);
                } else {
                    System.out.println("Product not found. Please try again.");
                }
            }
        } while (!produkId.equalsIgnoreCase("done"));
        
        Order newOrder = new Order(orderID, customerName, customerPhoneNumber, tanggalPesanan, karyawan);
        orderList.add(newOrder);
        
        return newOrder;
    // Find the first empty slot in the array and insert the new product
    // for (int i = 0; i < produk.length; i++) {
    //     if (order[i] == null) {
    //         order[i] = newOrder;
    //         break;
    //     }
    // }
    // return newOrder;

    
}
public static void printOrder() {
    OrderDetail orderDetail = new OrderDetail();

    ArrayList<Produk> idProduk = orderDetail.getIdProduk();
    ArrayList<Integer> quantityList = orderDetail.getQuantityList();

        for (int i = 0; i < orderList.size(); i++) {
    Order order = orderList.get(i);
    System.out.println("Order[" + (i + 1) + "]:");
    System.out.println("Order ID: " + order.getOrderID());
    System.out.println("Nama Customer: " + order.getCustomerName());
    System.out.println("Nomor Telepon Customer: " + order.getCustomerPhoneNumber());
    System.out.println("Tanggal Pesanan: " + order.getTanggalPesanan());
    System.out.println("Total Harga: " + orderDetail.getHargaTotal());
    System.out.println("Karyawan: " + order.getKaryawan());
    // System.out.println("Warna: " + order.getWarna());
    // System.out.println("Ukuran: " + produk.getUkuran());
    System.out.println();
}

    }
// static Costumer costumer[] = new Costumer[20];
public static Costumer buatCostumer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan Customer ID: ");
        String CustomerID = scanner.nextLine();
        System.out.print("Masukkan nomor telepon: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Masukkan email: ");
        String email = scanner.nextLine();
        System.out.print("Masukkan alamat: ");
        String address = scanner.nextLine();
        

        Costumer newCostumer = new Costumer(CustomerID,name,phoneNumber,email,address);
        costumerList.add(newCostumer);

         return newCostumer;
    // Find the first empty slot in the array and insert the new product
    // for (int i = 0; i < customer.length; i++) {
    //     if (costumer[i] == null) {
    //         costumer[i] = newCostumer;
    //         break;
    //     }
    }
    // return newCostumer;

public static void printCostumer() {

for (int i = 0; i < costumerList.size(); i++) {
    Costumer costumer = costumerList.get(i);
            System.out.println("Customer[" + (i + 1) + "]:");
            System.out.println("Nama Customer: " + costumer.getName());
            System.out.println("Customer Phone Number: " + costumer.getPhoneNumber());
            System.out.println("Customer Email: " + costumer.getEmail());
            System.out.println("Alamat Customer: " + costumer.getAddress());
            // System.out.println("Gaji Karyawan: " + costumer.getGaji());
            // System.out.println("Nomor Telepon Karyawan: " + costumer.getNomorTelepon());
            System.out.println();
}
        // for (int j = 0; j < customer.length; j++) {
        //     if (costumer[j] != null) {
        //         System.out.println(costumer[j]);
        //     }
        // }
        // System.out.println();
}
// static Settlement settlement[] = new Settlement[20];
public static Settlement buatSettlement() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Order ID: ");
        String orderID = scanner.nextLine();
        System.out.print("Masukkan Settlement ID: ");
        String settlementID = scanner.nextLine();
        System.out.print("Masukkan Metode Pembayaran: ");
        String metode = scanner.nextLine();
        System.out.print("Masukkan Tanggal Pembayaran: ");
        String tanggalSettlement = scanner.nextLine();
        
        Settlement newSettlement = new Settlement(orderID, settlementID, metode, tanggalSettlement);
        settlementList.add(newSettlement);
        return newSettlement;
        // Settlement newSettlement = new Settlement(idTransaksi,metode,tanggalSettlement,waktuSettlement,status);
    
    // // Find the first empty slot in the array and insert the new product
    // for (int i = 0; i < produk.length; i++) {
    //     if (settlement[i] == null) {
    //         settlement[i] = newSettlement;
    //         break;
 }
    public static void printSettlement() {
    for (int i = 0; i < settlementList.size(); i++) {
    Settlement settlement = settlementList.get(i);
    System.out.println("Settlement[" + (i + 1) + "]:");
    System.out.println("Order ID: " + settlement.getOrderID());
    System.out.println("Settlement ID: " + settlement.getSettlementID());
    System.out.println("Metode: " + settlement.getMetode());
    System.out.println("Tanggal Pembayaran: " + settlement.getTanggalSettlement());
    System.out.println();
    // System.out.println("Total Harga: " + order.getHargaTotal());
    // System.out.println("Karyawan: " + order.getKaryawan());
}
}
}

    

    
