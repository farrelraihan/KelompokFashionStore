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