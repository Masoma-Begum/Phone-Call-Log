
package Test;

import java.util.Base64;

public class EncodeDecode {
    public static void main(String[] args) {
        // encode data on your side using BASE64
        String str="&@sfdkfjAA";
byte[]   bytesEncoded = Base64.encodeBase64(str .getBytes());
System.out.println("ecncoded value is " + new String(bytesEncoded ));

// Decode data on other side, by processing encoded data
//byte[] valueDecoded= Base64.decodeBase64(bytesEncoded );
//System.out.println("Decoded value is " + new String(valueDecoded));
    }
}
