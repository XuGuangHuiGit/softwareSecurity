package net.youmi.android.c.c;

import java.io.ByteArrayOutputStream;
import net.youmi.android.c.b.a;

public class g
{
  public static String a(String paramString1, String paramString2)
  {
    int i = 0;
    if (paramString1 == null) {
      return "";
    }
    Object localObject = paramString1;
    String str;
    try
    {
      str = paramString1.trim();
      localObject = str;
      paramString1 = str;
      if (str.length() == 0) {
        return "";
      }
    }
    catch (Throwable paramString1)
    {
      paramString1 = (String)localObject;
      if (paramString2 == null) {
        return "";
      }
      if (paramString2.length() == 0) {
        return "";
      }
      localObject = new StringBuilder();
    }
    for (;;)
    {
      int k;
      try
      {
        paramString2 = e.a(paramString2);
        paramString2 = (e.a(paramString2.substring(12)) + e.a(paramString2.substring(0, 20))).getBytes("UTF-8");
        paramString1 = paramString1.getBytes("UTF-8");
        k = paramString2.length;
        int m = paramString1.length;
        j = 0;
        if (i < m)
        {
          str = Integer.toHexString((paramString1[i] ^ paramString2[j]) & 0xFF);
          if (str == null)
          {
            ((StringBuilder)localObject).append("00");
          }
          else
          {
            str = str.trim();
            if (str.length() == 1)
            {
              ((StringBuilder)localObject).append("0");
              ((StringBuilder)localObject).append(str);
            }
          }
        }
      }
      catch (Throwable paramString1) {}
      return ((StringBuilder)localObject).toString();
      if (str.length() == 0) {
        ((StringBuilder)localObject).append("00");
      } else {
        ((StringBuilder)localObject).append(str);
      }
      int j = (j + 1) % k;
      i += 1;
    }
  }
  
  public static String b(String paramString1, String paramString2)
  {
    int i = 0;
    if (paramString1 == null) {}
    label34:
    do
    {
      for (;;)
      {
        return null;
        String str = paramString1;
        try
        {
          paramString1 = paramString1.trim();
          str = paramString1;
          j = paramString1.length();
          if (j != 0) {
            str = paramString1;
          }
        }
        catch (Throwable paramString1)
        {
          int j;
          int k;
          int m;
          char c1;
          char c2;
          break label34;
        }
      }
    } while ((paramString2 == null) || (paramString2.length() == 0));
    paramString1 = new ByteArrayOutputStream();
    try
    {
      paramString2 = e.a(paramString2);
      paramString2 = (e.a(paramString2.substring(12)) + e.a(paramString2.substring(0, 20))).getBytes("UTF-8");
      k = paramString2.length;
      m = str.length();
      j = 0;
      while (i < m)
      {
        c1 = str.charAt(i);
        c2 = str.charAt(i + 1);
        paramString1.write((byte)((byte)(a.a(c1) << 4 | a.a(c2)) ^ paramString2[j]));
        j = (j + 1) % k;
        i += 2;
      }
      paramString1 = new String(paramString1.toByteArray(), "UTF-8");
      return paramString1;
    }
    catch (Throwable paramString1)
    {
      return null;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.c.g
 * JD-Core Version:    0.7.0.1
 */