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
        for (int i=0; i<length;i++){
            char ch = message.charAt(i);
            if (Character.isAlphabetic(ch)){
                if (Character.isLowerCase(ch)){
                    char c =(char)(ch+shift);
                    if (c > 'z'){
                        cipherText+=(char)(ch -(26-shift));
                    }
                    else {
                        cipherText+=c;
                    }
                }
                else if (Character.isUpperCase(ch)) {
                    char c =(char)(ch+shift);
                    if (c > 'Z'){
                        cipherText+=(char)(ch -(26-shift));
                    }
                    else {
                        cipherText+=c;
                    }

                }

            }
            else {
                cipherText+=ch;
            }
        }
        return cipherText;
    }
}
