package net.youmi.android.offers.b.b.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class i
{
  private static long a(Context paramContext, String paramString)
  {
    try
    {
      long l = paramContext.getSharedPreferences("OFFERSCONFIG1", 0).getLong(paramString, 0L);
      return l;
    }
    catch (Throwable paramContext) {}
    return 0L;
  }
  
  static void a(Context paramContext)
  {
    try
    {
      paramContext.getSharedPreferences("OFFERSCONFIG1", 0).edit().putLong("ws5NDbsV", System.currentTimeMillis()).commit();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  static void b(Context paramContext)
  {
    try
    {
      paramContext.getSharedPreferences("OFFERSCONFIG1", 0).edit().putLong("ws5NDbsV", 0L).commit();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static void c(Context paramContext)
  {
    try
    {
      paramContext.getSharedPreferences("OFFERSCONFIG1", 0).edit().putLong("Td6TAEWf", System.currentTimeMillis()).commit();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  static boolean d(Context paramContext)
  {
    boolean bool = false;
    try
    {
      long l1 = a(paramContext, "ws5NDbsV");
      long l2 = System.currentTimeMillis();
      if (l2 - l1 > 900000L) {
        bool = true;
      }
      return bool;
    }
    catch (Throwable paramContext) {}
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.b.b.c.i
 * JD-Core Version:    0.7.0.1
 */