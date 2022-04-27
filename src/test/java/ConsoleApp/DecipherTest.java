package ConsoleApp;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DecipherTest {

    @Test
    public void messageUppercase(){
        String message ="SWKEM";
        assertEquals("QUICK", Decipher.decrypt(message,2));
    }

    @Test
    public void spaceRemains(){
        String message ="UIF RVJDL";
        assertEquals("THE QUICK", Decipher.decrypt(message,1));
    }

    @Test
    public void messageLowercase(){
        String message ="hppe cpz";
        assertEquals("good boy", Decipher.decrypt(message,1));
    }
    @Test
    public void decryptFullMessage(){
        String message ="QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", Decipher.decrypt(message,23));
    }
}