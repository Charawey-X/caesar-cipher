package ConsoleApp;

import java.util.Scanner;

import static ConsoleApp.Cipher.encrypt;
import static ConsoleApp.Decipher.decrypt;

public class CmdInterface {
    public static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        /*
         * Test:
         *String text = "Good boy";
         *String ciphered = encrypt(text, 5);
         *String deciphered = decrypt(ciphered, 5);
         *System.out.println("Encrypted message: "+ciphered);
         *System.out.println("Decrypted message: "+deciphered);
         *
         */
        System.out.println( "+-------------------------------------+" );
        System.out.println( "|                                     |" );
        System.out.println( "|            CAESAR CIPHER            |" );
        System.out.println( "|                                     |" );
        System.out.println( "|             CHOOSE ONE:             |" );
        System.out.println( "|                                     |" );
        System.out.println( "|           (1) Encryption            |" );
        System.out.println( "|           (2) Decryption            |" );
        System.out.println( "|                                     |" );
        System.out.println( "|        To choose Encryption:        |" );
        System.out.println( "|               ENTER 1               |" );
        System.out.println( "|        To choose Decryption:        |" );
        System.out.println( "|               ENTER 2               |" );
        System.out.println( "|                                     |" );
        System.out.println( "+-------------------------------------+" );

        System.out.println("");

        System.out.print("ENTER: ");
        int choice = scanner.nextInt();
        if (choice ==1){
            System.out.println("               ENCRYPTION              ");
        } else if (choice==2) {
            System.out.println("               DECRYPTION              ");
        }
        else {
            System.out.println("            CHOICE IS INVALID          ");
        }


    }
}
