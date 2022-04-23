package ConsoleApp;

import static ConsoleApp.Cipher.encrypt;
import static ConsoleApp.Decipher.decrypt;

public class CmdInterface {
    public static void main(String[] args) {
        String text = "Good boy";
        String ciphered = encrypt(text, 5);
        String deciphered = decrypt(ciphered, 5);
        System.out.println("Encrypted message: "+ciphered);
        System.out.println("Decrypted message: "+deciphered);
    }
}
