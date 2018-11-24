package net.youmi.android.b.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import net.youmi.android.c.c.g;
import net.youmi.android.c.k.h;

public class a
{
  private static String a;
  private static String b;
  private static String c;
  private static int d = -1;
  private static int e = -1;
  private static String f;
  private static boolean g = false;
  
  static String a()
  {
    try
    {
      String str = g.b("3c7661747e6c7b2d762c7d7c7c", "yKl76nGU1e7a");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  public static String a(Context paramContext)
  {
    try
    {
      if (a == null) {
        a = b.b(paramContext, "CE94557724F842149D690D0E8CBB1CBD", "F1B19978F3D74302BA126760F96262CD", "CBD2998A3D5A4744BF128B91E1410DEA", null);
      }
      for (;;)
      {
        label20:
        return a;
        if (a.length() == 0) {
          a = b.b(paramContext, "CE94557724F842149D690D0E8CBB1CBD", "F1B19978F3D74302BA126760F96262CD", "CBD2998A3D5A4744BF128B91E1410DEA", null);
        }
      }
    }
    catch (Throwable paramContext)
    {
      break label20;
    }
  }
  
  public static void a(Context paramContext, String paramString)
  {
    if (paramString != null) {}
    try
    {
      paramString = paramString.trim();
      if (paramString.length() > 0)
      {
        a = paramString;
        b.a(paramContext, "CE94557724F842149D690D0E8CBB1CBD", "F1B19978F3D74302BA126760F96262CD", paramString, "CBD2998A3D5A4744BF128B91E1410DEA");
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static void a(boolean paramBoolean)
  {
    g = paramBoolean;
  }
  
  public static String b(Context paramContext)
  {
    for (;;)
    {
      try
      {
        if (b != null) {
          return b;
        }
        if (b != null) {
          continue;
        }
        b = b.b(paramContext, "CE94557724F842149D690D0E8CBB1CBD", "A33E523A1CEF496dB37ABD886CBCB005", "C97CE45F9A5A447c98BBB83D88790503", null);
      }
      catch (Throwable paramContext)
      {
        continue;
      }
      return b;
      if (b.length() <= 0) {
        b = b.b(paramContext, "CE94557724F842149D690D0E8CBB1CBD", "A33E523A1CEF496dB37ABD886CBCB005", "C97CE45F9A5A447c98BBB83D88790503", null);
      }
    }
  }
  
  public static void b(Context paramContext, String paramString)
  {
    if (paramString != null) {}
    try
    {
      paramString = paramString.trim();
      if (paramString.length() > 0)
      {
        b = paramString;
        b.a(paramContext, "CE94557724F842149D690D0E8CBB1CBD", "A33E523A1CEF496dB37ABD886CBCB005", paramString, "C97CE45F9A5A447c98BBB83D88790503");
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static boolean b()
  {
    return g;
  }
  
  public static void c(Context paramContext, String paramString)
  {
    if (paramString != null) {}
    try
    {
      paramString = paramString.trim();
      if (paramString.length() > 0)
      {
        f = paramString;
        b.a(paramContext, "CE94557724F842149D690D0E8CBB1CBD", "DD2E1AD5215B757A908C48D980702694", paramString, "B77BA25E94FF190AFD2ABAFACE2F7904");
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static boolean c(Context paramContext)
  {
    boolean bool2 = false;
    try
    {
      String str = a(paramContext);
      paramContext = b(paramContext);
      boolean bool1 = bool2;
      if (str != null)
      {
        bool1 = bool2;
        if (str.length() > 0)
        {
          bool1 = bool2;
          if (paramContext != null)
          {
            int i = paramContext.length();
            bool1 = bool2;
            if (i > 0) {
              bool1 = true;
            }
          }
        }
      }
      return bool1;
    }
    catch (Throwable paramContext) {}
    return false;
  }
  
  public static String d(Context paramContext)
  {
    if ((c != null) || (paramContext == null)) {}
    try
    {
      return c;
    }
    catch (Throwable paramContext)
    {
      label32:
      break label32;
    }
    c = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
    return c;
  }
  
  public static int e(Context paramContext)
  {
    if ((d >= 0) || (paramContext == null)) {}
    try
    {
      return d;
    }
    catch (Throwable paramContext)
    {
      label32:
      break label32;
    }
    d = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
    return d;
  }
  
  public static int f(Context paramContext)
  {
    if (e < 0) {}
    try
    {
      e = h.a(paramContext, a(), 0);
      label17:
      return e;
    }
    catch (Throwable paramContext)
    {
      break label17;
    }
  }
  
  public static String g(Context paramContext)
  {
    try
    {
      if (f == null) {
        f = b.b(paramContext, "CE94557724F842149D690D0E8CBB1CBD", "DD2E1AD5215B757A908C48D980702694", "B77BA25E94FF190AFD2ABAFACE2F7904", null);
      }
      for (;;)
      {
        label20:
        return f;
        if (f.length() <= 0) {
          f = b.b(paramContext, "CE94557724F842149D690D0E8CBB1CBD", "DD2E1AD5215B757A908C48D980702694", "B77BA25E94FF190AFD2ABAFACE2F7904", null);
        }
      }
    }
    catch (Throwable paramContext)
    {
      break label20;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.b.b.a
 * JD-Core Version:    0.7.0.1
 */