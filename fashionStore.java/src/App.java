import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Ini adalah kelompok fashion store ASHIAAAAP");
    //disini code menu tampilan awal
    Scanner scanner = new Scanner(System.in);
                int choice;
        
                do {
                    System.out.println("==== Menu ====");
                    System.out.println("1. Option 1");
                    System.out.println("2. Option 2");
                    System.out.println("3. Option 3");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                    
                    choice = scanner.nextInt();
                    
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
                            System.out.println("Exiting the program...");
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                    
                    System.out.println(); // Print an empty line for readability
                } while (choice != 4);
                
                scanner.close();
            }
        }
        
    //aku buat class costumer - davin

    
