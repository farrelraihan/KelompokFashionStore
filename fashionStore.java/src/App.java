import java.util.Scanner;
import model.Produk;
import model.Costumer;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Ini adalah kelompok fashion store ASHIAAAAP");
    //disini code menu tampilan awal
    Scanner scanner = new Scanner(System.in);
                int choice;
        
                do {
                    System.out.println("==== Angkasa Fashion Store ====");
                    System.out.println("1. Tambah Produk");
                    System.out.println("2. Tambah Data Customer");
                    System.out.println("3. Tambah Data Sales");
                    System.out.println("4. Cek Inventori");
                    System.out.println("5. Update Data Karyawan");
                    System.out.println("6. Cek Sales");
                    System.out.print("Enter your choice: ");
                    
                    choice = scanner.nextInt();
                    // Masih sementara, belum hasil akhir
                    
                    switch (choice) {
                        case 1:
                            System.out.println("You selected Option 1");
                            break;
                        case 2:
                            System.out.println("You selected Option 2");
                            break;
                        case 3:
                            System.out.println("You selected Option 3");
                            break;
                        case 4:
                            System.out.println("You selected Option 4");
                            break;
                        case  5:
                            System.out.println("You Selected Option 5");
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

                Produk AdidasSepatu = new Produk("Adidas", "Ultraboost", "69BCA20", "Sepatu", 870000, 52, "White", "44");
                Produk AdidasBaju = new Produk("Adidas", "Trefoil", "78BXI20", "Baju", 583000, 199, "White", "XXL");
                Produk NikeSepatu = new Produk("Nike", "Dunk Low Retro", "XXA887A", "Sepatu", 1100000, 2, "White", "47");
                Costumer Salim = new Costumer("Salim", "082160548923", "salim.ariantou@gmail.com", "Jl. Brahrang");
                Costumer Justin = new Costumer("Justin", "082134517682", "Justin.lo@gmail.com", "Jl. Ahmad Yani");
                Costumer Farrel = new Costumer("Farrel", "082188653391", "farrel21@gmail.com", "Jl. Setia Budi");

            }
        }
        
    

    
