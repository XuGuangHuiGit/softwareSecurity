package net.youmi.android.b.a;

import net.youmi.android.c.b.d;
import net.youmi.android.c.c.e;

public class a
{
  static final char[] a = "0123456789ABCDEF".toCharArray();
  private static final char[] b = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-".toCharArray();
  private static int[] c = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 };
  
  public static final int a(char paramChar)
  {
    return "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-".indexOf(paramChar);
  }
  
  public static final String a(int paramInt)
  {
    try
    {
      Object localObject = new StringBuilder(paramInt);
      int i = 0;
      while (i < paramInt)
      {
        int j = Math.abs(d.a(b.length));
        int k = b.length;
        ((StringBuilder)localObject).append(b[(j % k)]);
        i += 1;
      }
      localObject = ((StringBuilder)localObject).toString();
      return localObject;
    }
    catch (Throwable localThrowable) {}
    return "abcd";
  }
  
  public static final String a(String paramString)
  {
    int k = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder((k << 1) / 3);
    int i = 0;
    if (i < k)
    {
      label37:
      int m;
      if (i + 3 < k)
      {
        j = i + 3;
        m = Integer.parseInt(paramString.substring(i, j), 16);
        if (m >= 64) {
          break label100;
        }
      }
      label100:
      for (int j = 0;; j = m >>> 6)
      {
        j = (byte)j;
        localStringBuilder.append(b[j]);
        localStringBuilder.append(b[(m & 0x3F)]);
        i += 3;
        break;
        j = k;
        break label37;
      }
    }
    return localStringBuilder.toString();
  }
  
  public static final String a(byte[] paramArrayOfByte, String paramString, int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = paramString.getBytes();
    byte[] arrayOfByte = new byte[localObject.length + paramArrayOfByte.length];
    System.arraycopy(localObject, 0, arrayOfByte, 0, localObject.length);
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, localObject.length, paramArrayOfByte.length);
    localObject = e.a(arrayOfByte).substring(9, 18);
    int k = ((String)localObject).length();
    int i = 0;
    int m;
    if (i < 9)
    {
      m = i + 3;
      j = m;
      if (m > k) {
        j = k;
      }
      m = Integer.parseInt(((String)localObject).substring(i, j), 16);
      if (m < 64) {}
      for (j = 0;; j = m >>> 6)
      {
        localStringBuilder.append(b[j]);
        localStringBuilder.append(b[(m & 0x3F)]);
        i += 3;
        break;
      }
    }
    localObject = localStringBuilder.toString();
    paramString = e.a((String)localObject + paramString);
    int j = 0;
    k = 0;
    while (k < 26)
    {
      j <<= 1;
      i = j;
      if (paramString.charAt(k) > '7') {
        i = j + 1;
      }
      k += 1;
      j = i;
    }
    i = j;
    if (j < 67) {
      i = 67;
    }
    if ((i & 0x1) == 0)
    {
      j = i - 1;
      k = j;
      label275:
      if (k > 0)
      {
        j = 0;
        label283:
        if (j >= c.length) {
          break label657;
        }
        if (k % c[j] != 0) {
          break label436;
        }
      }
    }
    label520:
    label657:
    for (j = 0;; j = 1)
    {
      int i1;
      if (j != 0)
      {
        localStringBuilder.delete(0, localStringBuilder.length());
        paramString = paramString.getBytes();
        i1 = paramString.length;
        int i2 = paramArrayOfByte.length;
        j = 0;
        m = 0;
        while (m < i2)
        {
          int i3 = paramArrayOfByte[m];
          n = j + 1;
          i3 = (byte)(paramString[j] ^ i3);
          j = n;
          if (n >= i1) {
            j = 0;
          }
          localStringBuilder.append(a[((i3 & 0xF0) >>> 4)]);
          localStringBuilder.append(a[(i3 & 0xF)]);
          m += 1;
        }
        j = i - 2;
        break;
        label436:
        j += 1;
        break label283;
      }
      k -= 2;
      break label275;
      paramArrayOfByte = localStringBuilder.toString();
      localStringBuilder.delete(0, localStringBuilder.length());
      int n = paramArrayOfByte.length();
      localStringBuilder.append(b[(n % 3)]);
      m = 0;
      j = i;
      i = m;
      if (i < n)
      {
        if (i + 3 < n)
        {
          m = i + 3;
          i1 = Integer.parseInt(paramArrayOfByte.substring(i, m), 16);
          if (i1 >= 64) {
            break label623;
          }
        }
        label623:
        for (m = 0;; m = i1 >>> 6)
        {
          m = (byte)m;
          j = j * k + paramInt & 0x3F;
          localStringBuilder.append(b[(m + j & 0x3F)]);
          j = k * j + paramInt & 0x3F;
          localStringBuilder.append(b[(i1 + j & 0x3F)]);
          i += 3;
          break;
          m = n;
          break label520;
        }
      }
      return (String)localObject + localStringBuilder.toString();
    }
  }
  
  public static final char b(int paramInt)
  {
    try
    {
      if ((paramInt < b.length) && (paramInt > -1))
      {
        char c1 = b[paramInt];
        return c1;
      }
    }
    catch (Throwable localThrowable) {}
    return '0';
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.b.a.a
 * JD-Core Version:    0.7.0.1
 */