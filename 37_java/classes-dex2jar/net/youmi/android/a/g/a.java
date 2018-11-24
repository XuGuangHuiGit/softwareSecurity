package net.youmi.android.a.g;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import net.youmi.android.c.c.g;
import net.youmi.android.c.k.k;

public final class a
  extends net.youmi.android.c.f.a
{
  private static a a;
  private static a b;
  private static a c;
  private static a d;
  private static a e;
  private static a f;
  
  private a(File paramFile, long paramLong1, long paramLong2)
  {
    super(paramFile, paramLong1, paramLong2);
  }
  
  public static a a(Context paramContext)
  {
    if (d == null) {}
    try
    {
      d = new a(paramContext.getFilesDir(), -1L, -1L);
      label26:
      return d;
    }
    catch (Throwable paramContext)
    {
      break label26;
    }
  }
  
  public static a a(Context paramContext, int paramInt)
  {
    if (a == null) {}
    try
    {
      a = new a(c(".CCFFFA1D25C44B08BC24C3C6D8D6666F"), 314572800L, 432000000L);
      label27:
      return a(paramContext, a, a(paramContext), paramInt, 104857600L);
    }
    catch (Throwable localThrowable)
    {
      break label27;
    }
  }
  
  private static a a(Context paramContext, a parama1, a parama2, int paramInt, long paramLong)
  {
    switch (paramInt)
    {
    }
    do
    {
      for (;;)
      {
        return parama1;
        boolean bool;
        try
        {
          if (!k.a()) {
            return parama2;
          }
        }
        catch (Throwable paramContext) {}
      }
      bool = k.a(paramContext, paramLong);
    } while (bool);
    return parama2;
    return parama1;
  }
  
  private static String b()
  {
    try
    {
      String str = g.b("4d480b14580d560751585c", "I176py7D");
      return str;
    }
    catch (Throwable localThrowable) {}
    return ".cache";
  }
  
  public static a b(Context paramContext)
  {
    if (e == null) {}
    try
    {
      e = new a(paramContext.getCacheDir(), -1L, -1L);
      label26:
      return e;
    }
    catch (Throwable paramContext)
    {
      break label26;
    }
  }
  
  public static a b(Context paramContext, int paramInt)
  {
    if (b == null) {}
    try
    {
      b = new a(c(".CCA9582BC81E888EA674F157E5540CF8"), -1L, -1L);
      label27:
      return a(paramContext, b, c(paramContext), paramInt, 52428800L);
    }
    catch (Throwable localThrowable)
    {
      break label27;
    }
  }
  
  private static File c(String paramString)
  {
    try
    {
      paramString = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + b() + "/" + paramString);
      return paramString;
    }
    catch (Throwable paramString) {}
    return null;
  }
  
  public static a c(Context paramContext)
  {
    if (f == null) {}
    try
    {
      f = new a(paramContext.getDir("databases", 0), -1L, -1L);
      label29:
      return f;
    }
    catch (Throwable paramContext)
    {
      break label29;
    }
  }
  
  public static a c(Context paramContext, int paramInt)
  {
    if (c == null) {}
    try
    {
      c = new a(c(".C2655DBDD5C7328BA5EF149B2A8261A0"), 104857600L, 2592000000L);
      label27:
      return a(paramContext, c, b(paramContext), paramInt, 10485760L);
    }
    catch (Throwable localThrowable)
    {
      break label27;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.g.a
 * JD-Core Version:    0.7.0.1
 */