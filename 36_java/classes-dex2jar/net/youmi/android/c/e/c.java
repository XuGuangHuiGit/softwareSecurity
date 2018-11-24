package net.youmi.android.c.e;

import java.util.Hashtable;

public class c
{
  private static Hashtable a = new Hashtable();
  
  public static String a()
  {
    try
    {
      String str = String.valueOf(System.currentTimeMillis());
      a(str);
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  public static void a(String paramString)
  {
    try
    {
      if (a == null) {
        a = new Hashtable();
      }
      long l = System.currentTimeMillis();
      a.put(paramString, Long.valueOf(l));
      return;
    }
    catch (Throwable paramString) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.e.c
 * JD-Core Version:    0.7.0.1
 */