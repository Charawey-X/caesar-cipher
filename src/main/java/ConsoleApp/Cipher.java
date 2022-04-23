package ConsoleApp;

public class Cipher {
    public static String encrypt(String message, int shift){
        if(shift>26){
            shift = shift % 26;
        }
        else if (shift<0) {
            shift =(shift%26)+26;
            
        }

        String cipherText ="";
        int length = message.length();
        return cipherText;
    }
}
