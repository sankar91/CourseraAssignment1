import java.util.Scanner;
public class EnterPIn {
    public static void main( String[] args )
        {
            Scanner keyboard = new Scanner(System.in);
            int pin = 12345;

            System.out.println("WELCOME TO THE BANK OF SANKAR.");
            System.out.print("ENTER YOUR PIN: ");
            int entry = keyboard.nextInt();
            int a=0;
            while ( entry != pin)
            {
                System.out.println("\nINCORRECT PIN. TRY AGAIN.");
                System.out.print("ENTER YOUR PIN: ");
                entry = keyboard.nextInt();
                a++;
                if(a>2) {
                    System.out.println("Your ATM card has been blocked.");
                }
            }
            System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        }
    }

