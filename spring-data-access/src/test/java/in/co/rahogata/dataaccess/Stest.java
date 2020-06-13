package in.co.rahogata.dataaccess;

import java.util.Base64;

import org.junit.jupiter.api.Test;

public class Stest {

    @Test
    public void base64Test() {
        byte[] data = new byte[4];
        System.out.println(Base64.getEncoder().encodeToString(data));
    }
}
