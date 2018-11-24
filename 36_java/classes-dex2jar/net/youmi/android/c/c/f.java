package net.youmi.android.c.c;

import java.security.Key;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

public class f
{
  public static String a(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    try
    {
      paramString1 = new String(a.a(a(paramString1.getBytes(), paramString2, paramArrayOfByte)), "UTF-8");
      return paramString1;
    }
    catch (Throwable paramString1) {}
    return null;
  }
  
  private static Key a(String paramString)
  {
    paramString = new PBEKeySpec(paramString.toCharArray());
    return SecretKeyFactory.getInstance("PBEWITHMD5andDES").generateSecret(paramString);
  }
  
  public static byte[] a()
  {
    byte[] arrayOfByte = new byte[8];
    new Random().nextBytes(arrayOfByte);
    return arrayOfByte;
  }
  
  public static byte[] a(byte[] paramArrayOfByte1, String paramString, byte[] paramArrayOfByte2)
  {
    paramString = a(paramString);
    paramArrayOfByte2 = new PBEParameterSpec(paramArrayOfByte2, 100);
    Cipher localCipher = Cipher.getInstance("PBEWITHMD5andDES");
    localCipher.init(1, paramString, paramArrayOfByte2);
    return localCipher.doFinal(paramArrayOfByte1);
  }
  
  public static String b(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    try
    {
      paramString1 = new String(b(a.b(paramString1.getBytes()), paramString2, paramArrayOfByte));
      return paramString1;
    }
    catch (Throwable paramString1) {}
    return null;
  }
  
  public static byte[] b(byte[] paramArrayOfByte1, String paramString, byte[] paramArrayOfByte2)
  {
    paramString = a(paramString);
    paramArrayOfByte2 = new PBEParameterSpec(paramArrayOfByte2, 100);
    Cipher localCipher = Cipher.getInstance("PBEWITHMD5andDES");
    localCipher.init(2, paramString, paramArrayOfByte2);
    return localCipher.doFinal(paramArrayOfByte1);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.c.f
 * JD-Core Version:    0.7.0.1
 */