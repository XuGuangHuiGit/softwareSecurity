package net.youmi.android.c.b;

public class a
{
  public static final char[] a = "0123456789abcdef".toCharArray();
  private static final char[] b = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-".toCharArray();
  
  public static byte a(char paramChar)
  {
    try
    {
      i = Character.toLowerCase(paramChar);
      return (byte)"0123456789abcdef".indexOf(i);
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        int i = paramChar;
      }
    }
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramArrayOfByte.length * 2);
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      localStringBuilder.append(a[((paramArrayOfByte[i] & 0xF0) >>> 4)]);
      localStringBuilder.append(a[(paramArrayOfByte[i] & 0xF)]);
      i += 1;
    }
    return localStringBuilder.toString();
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.b.a
 * JD-Core Version:    0.7.0.1
 */