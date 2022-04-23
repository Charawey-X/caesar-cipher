package ConsoleApp;

import static ConsoleApp.Cipher.encrypt;

public class CmdInterface {
    public static void main(String[] args) {
        String text = "Good boy";
        String ciphered = encrypt(text, 5);
        System.out.println(ciphered);
    }
}
