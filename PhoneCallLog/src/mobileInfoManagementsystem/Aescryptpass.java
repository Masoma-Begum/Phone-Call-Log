
package mobileInfoManagementsystem;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import mobileinforeferclass.AESCrypt;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

 public class Aescryptpass {
   
      public  static String encrypt(String value) throws Exception
    {
        String mypass="(?=.*[0-9])";
       return mypass;
               
    }
      /*
      ^                 # start-of-string
(?=.*[0-9])       # a digit must occur at least once
(?=.*[a-z])       # a lower case letter must occur at least once
(?=.*[A-Z])       # an upper case letter must occur at least once
(?=.*[@#$%^&+=])  # a special character must occur at least once
(?=\S+$)          # no whitespace allowed in the entire string
.{8,}             # anything, at least eight places though
$                 # end-of-string
      ("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")
      */
      
//    private static final String ALGORITHM = "AES";
//    private static final String KEY = "1Hbfh667adfDEJ78";
    
//  public  static String encrypt(String value) throws Exception
//    {
//        Key key = generateKey();
//        Cipher cipher = Cipher.getInstance(AESCrypt.ALGORITHM);
//        cipher.init(Cipher.ENCRYPT_MODE, key);
//        byte [] encryptedByteValue = cipher.doFinal(value.getBytes("utf-8"));
//        String encryptedValue64 = new BASE64Encoder().encode(encryptedByteValue);
//        return encryptedValue64;
//               
//    }
//    public static String decrypt(String value) throws Exception
//    {
//        Key key = generateKey();
//        Cipher cipher = Cipher.getInstance(AESCrypt.ALGORITHM);
//        cipher.init(Cipher.DECRYPT_MODE, key);
//        byte [] decryptedValue64 = new BASE64Decoder().decodeBuffer(value);
//        byte [] decryptedByteValue = cipher.doFinal(decryptedValue64);
//        String decryptedValue = new String(decryptedByteValue,"utf-8");
//        return decryptedValue;
//                
//    }
    
    private static Key generateKey() throws Exception 
    {
        Key key = new SecretKeySpec(AESCrypt.KEY.getBytes(),AESCrypt.ALGORITHM);
        return key;
    }
//      public static void main(String[] args) {
//        try {
//        String password = "1";
//            System.out.println("plain pass="+password);
//        String encryptedPassword = AESCrypt.encrypt(password);
//            System.out.println("encrypted pass="+encryptedPassword);
//        String decryptedPassword = AESCrypt.decrypt(encryptedPassword);    
//                System.out.println("decrypted pass="+decryptedPassword);
//        } catch(Exception e) { System.out.println("bug"+e.getMessage()); }
//    }
}

