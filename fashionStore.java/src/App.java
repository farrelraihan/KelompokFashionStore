import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import model.Customer;
import model.DetailOrder;
import model.Karyawan;
import model.Order;
import model.Produk;
import model.Settlement;

import java.time.LocalTime; // import the LocalTime class
import java.time.format.DateTimeFormatter;

public class App {
    static Scanner scanner = new Scanner(System.in); //tryfix
    static ArrayList<Customer> customerList = new ArrayList<>();
    static ArrayList<Produk> produkList = new ArrayList<>();
    static ArrayList<Karyawan> karyawanList = new ArrayList<>();
    static ArrayList<Order> orderList = new ArrayList<>();
    static ArrayList<DetailOrder> detailOrderList = new ArrayList<>();
    static ArrayList<Settlement> settlementList = new ArrayList<>();
    
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Integer choice = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Karyawan");
            System.out.println("3. Add Produk");
            System.out.println("4. Add Order");
            System.out.println("5. Add Detail Order");
            System.out.println("6. Add Settlement");
            System.out.println("7. View Customer");
            System.out.println("8. View Karyawan");
            System.out.println("9. View Produk");
            System.out.println("10. View Order");
            System.out.println("11. View Detail Order");
            System.out.println("12. View Settlement");
            System.out.println("13. Exit");
            System.out.print("Enter your choice: ");


        if (scanner.hasNextInt()) {
            try {
        choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
    } catch (NoSuchElementException e){
        System.out.println("Invalid choice. Please enter a valid menuAAA option." + e.getMessage());
        scanner.nextLine(); // Consume the invalid input
        continue; // Restart the loop
    }
} else {
        System.out.println("Invalid choice. Please enter a valid menu option.");
        scanner.nextLine(); // Consume the invalid input
        continue; // Restart the loop
    }

            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    addKaryawan();
                    break;
                case 3:
                    addProduk();
                    break;
                case 4:
                    addOrder(); //TRY FIX
                    //scanner.nextLine(); //try fix
                    break;
                case 5:
                    addDetailOrder();
                    break;
                case 6:
                    addSettlement();
                    break;
                case 7:
                    viewCustomer();
                    break;
                case 8:
                    viewKaryawan();
                    break;
                case 9:
                    viewProduk();
                    break;
                case 10:
                    viewOrder();
                    break;
                case 11:
                    viewDetailOrder();
                    break;
                case 12:
                    viewSettlement();
                case 13:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid menu option.");
            }
            //scanner.nextLine(); try fix, original active
        } while (choice != 13);
        scanner.close(); //TRY FIX
    }

public static void init(){

                // Order budi = new Order("Budi","0b110",5,"10008","10 Feb 2023","932890324",1000000,1);
                // Order karla = new Order("Karla","0b210",3,"12008","11 Feb 2023","93276760324",500000,1);
                // Order carool = new Order("Carool","0b111",2,"10018","12 Feb 2023","932866524",2000000,1);
           


                // Produk AdidasSepatu = new Produk("Adidas", "Ultraboost", "69BCA20", "Sepatu", 870000, 52, "White", "44");
                // Produk AdidasBaju = new Produk("Adidas", "Trefoil", "78BXI20", "Baju", 583000, 199, "White", "XXL");
                // Produk NikeSepatu = new Produk("Nike", "Dunk Low Retro", "XXA887A", "Sepatu", 1100000, 2, "White", "47");
                // Costumer Salim = new Costumer("Salim", "082160548923", "salim.ariantou@gmail.com", "Jl. Brahrang");
                // Costumer Justin = new Costumer("Justin", "082134517682", "Justin.lo@gmail.com", "Jl. Ahmad Yani");
                // Costumer Farrel = new Costumer("Farrel", "082188653391", "farrel21@gmail.com", "Jl. Setia Budi");

                // Settlement trx1 = new Settlement("FS01","BCA","05062023","0123","Sukses");
                // Settlement trx2 = new Settlement("FS02","QRIS","05062023","0224","Sukses");
                // Settlement trx3 = new Settlement("FS03","Debit","05052023","1130","Gagal");

                // karyawan Puan = new karyawan("03081220031", "Puan", "Manajer", "Pemasaran", 4500000, "081260789229");
                // karyawan Toni = new karyawan("03081220032", "Toni", "Desainer Fashion", "Design", 7500000, "081360789443");
                // karyawan Dandy = new karyawan("03081220033", "Dandy", "Manajer", "Produksi", 8500000, "081260989119");

            }

public static void addCustomer() { //Menambahkan data customer ke dalam customerList
        Scanner scanner = new Scanner(System.in);

        try{
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();
        System.out.print("Enter customer address: ");
        String address = scanner.nextLine();

        // Create a new Customer object and add it to the customerList ArrayList
        Customer customer = new Customer(name, phoneNumber, email, address);
        customerList.add(customer);
        System.out.println("Customer added successfully!");
    } catch (NoSuchElementException e){
        System.out.println("Error occurred while adding customer: " + e.getMessage());
    }
}
    public static void viewCustomer() { //Cetak seluruh Customer yang ada pada customerList
        if (customerList.isEmpty()) {
            System.out.println("No Customer found.");
        } else {
            System.out.println("--------------------------------------------------------");
            System.out.println("Available Customers:");
            System.out.println("--------------------------------------------------------");
            System.out.printf("| %-5s | %-20s | %-15s |\n", "No", "Customer Name", "Phone Number");
    
            for (int i = 0; i < customerList.size(); i++) {
            Customer customer = customerList.get(i);
            System.out.printf("| %-5d | %-20s | %-15s |\n", (i + 1), customer.getCustomerName(), customer.getCustomerPhoneNumber());
            }
    
        System.out.println("--------------------------------------------------------");}
    }


    public static void addOrder() { //try fix  original nothing inside
    //Scanner scanner = new Scanner(System.in); //try fix  // Menambahkan Data Orderan, dengan mengassign Customer dan Karyawan untuk orderan yang dilakukan.

    LocalTime localTime = LocalTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    String tanggalPesanan = localTime.format(formatter);
    int index = orderList.size() + 1;

    String orderID = "OR" + String.format("%03d", index); // Assuming a maximum of 999 Orders

    viewCustomer();

    // Prompt for customer selection
    System.out.print("Select a customer: ");
    int selectedCustomerIndex;
    
    try {
    //if (scanner.hasNextInt()) {
        selectedCustomerIndex = scanner.nextInt();
    } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a valid integer.");
        scanner.nextLine();
        return;
    }

    if (selectedCustomerIndex < 1 || selectedCustomerIndex > customerList.size()) {
        System.out.println("Invalid customer selection.");
        scanner.close();
        return;
    }

    Customer selectedCustomer = customerList.get(selectedCustomerIndex - 1);
    String customerName = selectedCustomer.getCustomerName();
    String customerPhoneNumber = selectedCustomer.getCustomerPhoneNumber();

    viewKaryawan();

    scanner.nextLine(); // Consume the newline character after reading the integer

    System.out.print("Enter the ID of the karyawan: ");
    String selectedKaryawanID = scanner.nextLine(); //TRY FIX
    //scanner.nextLine(); //trying fix add nextline convert up to next
    String karyawanName = " ";

    // Find the karyawan in the karyawanList based on the ID
    Karyawan selectedKaryawan = null;
    for (Karyawan karyawan : karyawanList) {
        if (karyawan.getIdKaryawan().equals(selectedKaryawanID)) {
            selectedKaryawan = karyawan;
            break;
        }
    }

    if (selectedKaryawan != null) {
        // Retrieve selected karyawan data
        karyawanName = selectedKaryawan.getNamaKaryawan();
    } else {
        System.out.println("Invalid karyawan ID.");
        //scanner.close();
        return;
    }
    
    //scanner.nextLine(); //fix error //edit: doesnt work.
    Integer hargaTotal = null;

    Order order = new Order(orderID, customerName, customerPhoneNumber, tanggalPesanan, hargaTotal, karyawanName);

    order.setOrderID(orderID);
    order.setKaryawan(karyawanName);
    order.setDetailOrderList(new ArrayList<>()); //trying fix latest
    // Add the order to the orderList
    orderList.add(order);
    System.out.println("Order added successfully!");

   // scanner.close();
}

public static void viewOrder() { // Mencetak Order yang tersedia pada orderList
    if (orderList.isEmpty()) {
        System.out.println("No Order found.");
    } else {
        System.out.println("--------------------------------------------------------");
        System.out.println("Available Orders:");
        System.out.println("--------------------------------------------------------");
        System.out.printf("| %-8s | %-20s | %-15s | %-15s | %-15s | %-12s |\n",
                "Order ID", "Customer Name", "Phone Number", "Tanggal Pesanan", "Karyawan", "Total Price");

        for (Order order : orderList) {
            System.out.printf("| %-8s | %-20s | %-15s | %-15s | %-15s | %-12d |\n",
                    order.getOrderID(), order.getCustomerName(),
                    order.getCustomerPhoneNumber(), order.getTanggalPesanan(),
                    order.getKaryawan(), order.getHargaTotal());
        }

        System.out.println("--------------------------------------------------------");
    }
}

    public static void addProduk() { //Menambahkan data produk
    Scanner scanner = new Scanner(System.in);
    
    try{
    System.out.print("Enter product brand: ");
    String merkProduk = scanner.nextLine();
    System.out.print("Enter product name: ");
    String namaProduk = scanner.nextLine();
    System.out.print("Enter product category: ");
    String kategoriProduk = scanner.nextLine();
    System.out.print("Enter product price: ");
    int hargaProduk = scanner.nextInt();
    System.out.print("Enter product stock: ");
    int stokProduk = scanner.nextInt();
    scanner.nextLine(); // Consume the newline character
    System.out.print("Enter product color: ");
    String warnaProduk = scanner.nextLine();
    System.out.print("Enter product size: ");
    String ukuranProduk = scanner.nextLine();

    // Generate the Produk ID based on the index of the ArrayList
    int index = produkList.size() + 1;
    String idProduk = "PK" + String.format("%03d", index); // Assuming a maximum of 999 Produk
    

    // Create a new Produk object and set its properties
    Produk produk = new Produk(idProduk, merkProduk, namaProduk, kategoriProduk, hargaProduk, stokProduk, warnaProduk, ukuranProduk);
    produk.setIdProduk(idProduk);
    // Add the produk to the ArrayList
    produkList.add(produk);
    
    System.out.println("Produk added successfully!");
 } catch (Exception e){
    System.out.println("Error occurred while adding product: " + e.getMessage());
    }
}

public static void viewProduk() { // Mencetak Seluruh Produk yang tersedia pada produkList
    if (produkList.isEmpty()) {
        System.out.println("No Produk found.");
    } else {
        System.out.println("Produk List:");
        System.out.println("--------------------------------------------------------");
        System.out.printf("| %-5s | %-10s | %-20s | %-15s | %-15s | %-10s | %-10s |\n",
                "ID", "Brand", "Nama Produk", "Harga Satuan", "Stok Produk", "Warna", "Ukuran");

        for (Produk produk : produkList) {
            System.out.printf("| %-5s | %-10s | %-20s | %-15d | %-15d | %-10s | %-10s |\n",
                    produk.getIdProduk(), produk.getMerkProduk(), produk.getNamaProduk(),
                    produk.getHargaProduk(), produk.getStokProduk(), produk.getWarnaProduk(),
                    produk.getUkuranProduk());
        }

        System.out.println("--------------------------------------------------------");
    }
}

public static void addKaryawan() { //Menambahkan data karyawan
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Karyawan Name: ");
        String namaKaryawan = scanner.nextLine();
        System.out.print("Enter Karyawan Phone Number: ");
        String nomorTeleponKaryawan = scanner.nextLine();
        System.out.print("Enter Karyawan Jabatan: ");
        String jabatan = scanner.nextLine();
        System.out.print("Enter Karyawan Departemen: ");
        String departemen = scanner.nextLine();
        System.out.print("Enter Karyawan Gaji: ");
        String gaji = scanner.nextLine();

        // Generate the Karyawan ID based on the index of the ArrayList
        int index = karyawanList.size() + 1;
        String idKaryawan = "KR" + String.format("%03d", index); // Assuming a maximum of 999 karyawan

        // Create a new Karyawan object and add it to the karyawanList ArrayList
        Karyawan karyawan = new Karyawan(idKaryawan, namaKaryawan, nomorTeleponKaryawan, jabatan, departemen, gaji);
        karyawan.setIdKaryawan(idKaryawan);
        karyawanList.add(karyawan);
        
        System.out.println("Karyawan added successfully!");
    }

    public static void viewKaryawan() { //Cetak seluruh daftar karyawan yang tersedia pada karyawanList
        if (karyawanList.isEmpty()) {
            System.out.println("No karyawan found.");
        } else {
            System.out.println("Karyawan List:");
        System.out.println("--------------------------------------------------------");
        System.out.println("Available Karyawan:");
        System.out.println("--------------------------------------------------------");
        System.out.printf("| %-5s | %-20s | %-15s | %-10s |\n", "ID", "Nama", "Jabatan", "Departemen");

        for (int i = 0; i < karyawanList.size(); i++) {
            Karyawan karyawan = karyawanList.get(i);
            System.out.printf("| %-5s | %-20s | %-15s | %-10s |\n", karyawan.getIdKaryawan(), karyawan.getNamaKaryawan(), karyawan.getJabatan(), karyawan.getDepartemen());
        }

        System.out.println("--------------------------------------------------------");
    }
        
    }
    public static void addDetailOrder() { //Menambahkan Detil pada Order yang sudah ada
        viewOrder();
    
        System.out.print("Enter the Order ID: ");
        String orderID = scanner.nextLine();
        viewProduk();
    
        // Find the order in the orderList based on the ID
        Order selectedOrder = null;
        for (Order order : orderList) {
            if (order.getOrderID().equals(orderID)) {
                selectedOrder = order;
                break;
            }
        }
    
        if (selectedOrder != null) {
            boolean addMoreProducts = true;
    
            while (addMoreProducts) {
                System.out.print("Enter the product ID: ");
                String productID = scanner.nextLine();
                System.out.print("Enter the quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();
    
                // Retrieve the product information from the produkList based on the ID
                Produk selectedProduk = null;
                for (Produk produk : produkList) {
                    if (produk.getIdProduk().equals(productID)) {
                        selectedProduk = produk;
                        break;
                    }
                }
    
                if (selectedProduk != null) {
                    // Calculate the total price for the detail order
                    int hargaSatuan = selectedProduk.getHargaProduk();
                    int hargaTotal = hargaSatuan * quantity;
    
                    // Create a new DetailOrder object
                    DetailOrder detailOrder = new DetailOrder(orderID, productID, quantity, hargaSatuan, hargaTotal);
    
                    // Add the detail order to the order's detail order list
                    
                    selectedOrder.getDetailOrderList().add(detailOrder);
                    
                    int orderTotal = selectedOrder.getHargaTotal() != null ? selectedOrder.getHargaTotal() : 0;
                    selectedOrder.setHargaTotal(orderTotal + hargaTotal); //fix latest error emergency
                   // selectedOrder.setHargaTotal(selectedOrder.getHargaTotal() + hargaTotal);
    
                    System.out.println("Detail order added successfully!");
    
                    System.out.print("Do you want to add more products? (Y/N): ");
                    String choice = scanner.nextLine();
                    addMoreProducts = choice.equalsIgnoreCase("Y");
                } else {
                    System.out.println("Invalid product ID.");
                }
            }
        } else {
            System.out.println("Invalid Order ID. Order not found.");
        }
    }
    
public static void viewDetailOrder() { //Fungsi untuk mengeprint Detail Order
    viewOrder();

    System.out.print("Enter the Order ID: ");
    String orderID = scanner.nextLine();

    // Find the order in the orderList based on the ID
    Order selectedOrder = null;
    for (Order order : orderList) {
        if (order.getOrderID().equalsIgnoreCase(orderID)) {
            selectedOrder = order;
            break;
        }
    }

    if (selectedOrder != null) {
        List<DetailOrder> detailOrderList = selectedOrder.getDetailOrderList();

        if (detailOrderList.isEmpty()) {
            System.out.println("No detail orders found for the given Order ID.");
        } else {
            System.out.println("--------------------------------------------------------");
            System.out.println("Detail Orders:");
            System.out.println("--------------------------------------------------------");
            System.out.printf("| %-8s | %-10s | %-8s | %-12s | %-10s |\n",
                    "Order ID", "Product ID", "Quantity", "Unit Price", "Total Price");

            for (DetailOrder detailOrder : detailOrderList) {
                System.out.printf("| %-8s | %-10s | %-8d | %-12d | %-10d |\n",
                        detailOrder.getOrderID(), detailOrder.getIdProduk(),
                        detailOrder.getQuantity(), detailOrder.getHargaSatuan(),
                        detailOrder.getHargaTotal());
            }

            System.out.println("--------------------------------------------------------");
        }
    } else {
        System.out.println("Invalid Order ID. Order not found.");
    }
}

public static Customer findCustomerByNameAndPhoneNumber(String name, String phoneNumber) {
        for (Customer customer : customerList) {
            if (customer.getCustomerName().equals(name) && customer.getCustomerPhoneNumber().equals(phoneNumber)) {
                return customer;
            }
        }
        return null;
    }

public static Produk findProductByName(String name) {
        for (Produk product : produkList) {
            if (product.getProductName().equals(name)) {
                return product;
            }
        }
        return null;
    }
 public static Order findOrderByID(String orderID) {
        for (Order order : orderList) {
            if (order.getOrderID().equals(orderID)) {
                return order;
            }
        }
        return null;
    }
public static String generateOrderID() {
        int nextOrderNumber = orderList.size() + 1;
        return "ORD-" + String.format("%04d", nextOrderNumber);
    }

public static void addSettlement() { //Menambahkan data Settlement
    viewOrder();

    System.out.print("Enter the Order ID: ");  
    String orderID = scanner.nextLine();

        // Find the order in the orderList based on the ID
        Order selectedOrder = null;
        for (Order order : orderList) {
            if (order.getOrderID().equals(orderID)) {
                selectedOrder = order;
                break;
            }
        }

        if (selectedOrder != null) {
            System.out.print("Enter the Settlement Status (Pending/Completed): ");
            String status = scanner.nextLine();

            // Validate the status
            if (status.equalsIgnoreCase("Pending") || status.equalsIgnoreCase("Completed")) {
                System.out.print("Enter the Settlement Method: ");
                String method = scanner.nextLine();

                Settlement settlement = new Settlement(orderID, status, method);
                settlementList.add(settlement);
                // Perform any necessary operations with the settlement object, such as adding it to a list or saving it to a database

                System.out.println("Settlement added successfully!");
            } else {
                System.out.println("Invalid status! The status should be either 'Pending' or 'Completed'.");
            }
        } else {
            System.out.println("Order not found!");
        }
    }

    public static void viewSettlement(){ //Fungsi untuk melihat data Settlement yang telah ada. 
        //viewDetailOrder();
        if (settlementList.isEmpty()) { //INI CODE BUAT BISA PILIH MAU INDEX YANG MANA DI PRINT
        System.out.println("No Settlement found.");
    } else {
        System.out.println("--------------------------------------------------------");
        System.out.println("Settlements:");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < settlementList.size(); i++) {
            Settlement settlement = settlementList.get(i);
            System.out.println((i + 1) + ". Order ID: " + settlement.getOrderID()); //Mengeprint Index dan Order ID nya.
        }

        System.out.println("--------------------------------------------------------"); //Memilih Index keberapa yang ingin di view
        System.out.print("Enter the Index of the settlement to view: ");
        int settlementNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (settlementNumber >= 1 && settlementNumber <= settlementList.size()) {
            Settlement settlement = settlementList.get(settlementNumber - 1);
            System.out.println("--------------------------------------------------------");
            System.out.println("Settlement Details:");
            System.out.println("--------------------------------------------------------");
            System.out.println("Order ID: " + settlement.getOrderID());
            System.out.println("Settlement Status: " + settlement.getStatus());
            System.out.println("Settlement Method: " + settlement.getMetode());
            System.out.println("----------------------------------------");
        } else {
            System.out.println("Invalid settlement number.");
        }
    }

//         if (settlementList.isEmpty()){ //INI BUAT AUTO PRINT ALL SETTLEMENTS TANPA PILIH
//             System.out.println("No settlements found!");
//         } else {
//             System.out.println("--------------------------------------------------------");
//             System.out.println("Settlements:");
//             System.out.println("--------------------------------------------------------");
        
//             for (Settlement settlement : settlementList) {
//                 System.out.println("Order ID: " + settlement.getOrderID());
//                 System.out.println("Settlement Status: " + settlement.getStatus());
//                 System.out.println("Settlement Method: "+ settlement.getMetode());
//               //System.out.println("Total Settlement: " + DetailOrder.getHargaTotal());
//                 System.out.println("----------------------------------------");
//     }
// }
    }
}
