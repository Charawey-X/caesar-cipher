package ConsoleApp;

import static ConsoleApp.Cipher.encrypt;
import static ConsoleApp.Decipher.decrypt;

public class CmdInterface {
    public static void main(String[] args) {
        String text = "Ltti gtd";
        String ciphered = decrypt(text, 5);
        System.out.println(ciphered);
    }
}
