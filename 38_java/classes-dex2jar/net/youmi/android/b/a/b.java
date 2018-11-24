package net.youmi.android.b.a;

import android.content.Context;
import android.os.Build;
import java.util.Properties;
import net.youmi.android.c.b.c;
import net.youmi.android.c.b.d;
import net.youmi.android.c.c.e;
import net.youmi.android.c.c.g;

public class b
{
  private static String d = ;
  private String a = "";
  private String b = "";
  private String c = "";
  private String e;
  private boolean f = false;
  
  public b(Context paramContext)
  {
    this.a = net.youmi.android.c.a.c(paramContext);
    this.b = net.youmi.android.c.a.d(paramContext);
    int i;
    if (this.a == null)
    {
      this.a = "";
      i = 1;
    }
    for (;;)
    {
      int j;
      if (this.b == null)
      {
        this.b = "";
        j = 1;
      }
      for (;;)
      {
        label79:
        if ((i != 0) && (j != 0)) {}
        for (;;)
        {
          try
          {
            this.c = net.youmi.android.c.a.a(paramContext);
            i = this.c.length();
            if (i != 0) {
              break label286;
            }
            i = 1;
          }
          catch (Throwable localThrowable1)
          {
            i = 0;
            continue;
            this.e = a(a.a(e.a(this.a + this.b + this.c + d).substring(7, 25)));
            continue;
          }
          j = k;
          if (i != 0) {}
          try
          {
            this.c = net.youmi.android.c.a.e(paramContext);
            i = this.c.length();
            if (i != 0) {
              break label281;
            }
            i = m;
          }
          catch (Throwable localThrowable2)
          {
            j = k;
            continue;
            label281:
            i = 0;
            continue;
          }
          j = i;
          if (j != 0)
          {
            this.e = a(a.a(a(paramContext).substring(7, 25)));
            this.f = g();
            return;
            if (this.a.length() != 0) {
              break label296;
            }
            i = 1;
            break;
            if (this.b.length() != 0) {
              break label291;
            }
            j = 1;
            break label79;
          }
          label286:
          i = 0;
        }
        label291:
        j = 0;
      }
      label296:
      i = 0;
    }
  }
  
  private static String a(String paramString)
  {
    int i = 0;
    int j = 0;
    for (;;)
    {
      try
      {
        if (j < paramString.length())
        {
          char c1 = paramString.charAt(j);
          int k;
          if (j % 2 == 0)
          {
            k = a.a(c1) * 2;
            i = i + (k & 0x3F) + (k >> 6);
          }
          else
          {
            k = a.a(c1);
            i += k * k;
          }
        }
        else
        {
          i &= 0x3F;
          if (i == 0) {
            return paramString + "0";
          }
          String str = paramString + Character.toString(a.b(64 - i));
          return str;
        }
      }
      catch (Throwable localThrowable)
      {
        return paramString;
      }
      j += 1;
    }
  }
  
  private static String f()
  {
    try
    {
      String str = g.b("4040724c5d4f565a6a42005a622f5d7f", "android");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  private boolean g()
  {
    try
    {
      if ((!"unknown".equals(Build.BOARD)) || (!"generic".equals(Build.DEVICE))) {
        break label38;
      }
      bool = "generic".equals(Build.BRAND);
      if (!bool) {
        break label38;
      }
    }
    catch (Throwable localThrowable1)
    {
      try
      {
        boolean bool;
        label38:
        do
        {
          String str;
          do
          {
            str = Build.MODEL;
            if (str == null) {
              break;
            }
            str = str.trim().toLowerCase();
          } while (str.equals("sdk"));
          bool = str.equals("google_sdk");
        } while (bool);
        return false;
      }
      catch (Throwable localThrowable2) {}
    }
    return true;
    return true;
  }
  
  public String a()
  {
    return this.e;
  }
  
  String a(Context paramContext)
  {
    str2 = null;
    try
    {
      localProperties = c.a(paramContext, "DD5E8CD46CF94B22BAAD68AB06710752");
      if (localProperties.containsKey("46C02DF8DF4C4C18A578C63449C7F64D")) {
        str2 = (String)localProperties.get("46C02DF8DF4C4C18A578C63449C7F64D");
      }
      str1 = str2;
      if (str2 == null)
      {
        str2 = e.a(net.youmi.android.c.a.b() + net.youmi.android.c.a.d() + d.a(2147483647) + System.currentTimeMillis() + net.youmi.android.c.a.c() + d);
        str1 = str2;
        if (str2 == null) {}
      }
    }
    catch (Throwable paramContext)
    {
      Properties localProperties;
      label115:
      return "";
    }
    try
    {
      localProperties.put("46C02DF8DF4C4C18A578C63449C7F64D", str2);
      c.a(paramContext, localProperties, "DD5E8CD46CF94B22BAAD68AB06710752");
      str1 = str2;
    }
    catch (Throwable paramContext)
    {
      str1 = str2;
      break label115;
    }
    paramContext = str1;
    if (str1 == null) {
      paramContext = e.a(Build.MODEL);
    }
    return paramContext;
  }
  
  public String b()
  {
    return this.c;
  }
  
  public String c()
  {
    return this.b;
  }
  
  public String d()
  {
    return this.a;
  }
  
  public boolean e()
  {
    return this.f;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.b.a.b
 * JD-Core Version:    0.7.0.1
 */