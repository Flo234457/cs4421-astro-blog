import java.util.Scanner;
public class vending {
    public static void main(String[] args) {
    int userInput = 0;
    double balance = 5;
    Scanner scanner = new Scanner(System.in);
    do {
       System.out.println("\n--- MENU --- \n1. Buy chips: €1.50\n2 Buy Soda (€2.00\n3. Check Balance\n4. Exit Vending Machine\n" );
       System.out.println("Pls select a number");
        userInput = scanner.nextInt();
        switch (userInput) {
      case 1:
        System.out.println("Purchase chips");
        break;
      case 2:
        System.out.println("Purchase a soda");
        break;
        }
        if (balance >= 2){
            if (userInput == 1){
                balance = balance-2;
                System.out.println("Your balmce is now " + balance);
            }
        } else{
            System.out.println("Balnce too low");
        }
if (balance >= 1.50){
            if (userInput == 1){
                balance = balance-1.50;
                System.out.println("Your balmce is now " + balance);
            }
        }else{
            System.out.println("Balnce too low");
        }
        
      
    }
    while (userInput  != 4);  
    
  }
}
  

