package ConsoleApp;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {

    @Test
    public void messageUppercase(){
        String message ="QUICK";
        assertEquals("SWKEM", Cipher.encrypt(message,2));
    }

    @Test
    public void spaceRemains(){
        String message ="THE QUICK";
        assertEquals("UIF RVJDL", Cipher.encrypt(message,1));
    }

    @Test
    public void messageLowercase(){
        String message ="good boy";
        assertEquals("hppe cpz",Cipher.encrypt(message,1));
    }

    @Test
    public void encryptFullMessage(){
        String message ="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", Cipher.encrypt(message,23));
    }

}