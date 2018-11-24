package net.youmi.android.c.b;

public class e
{
  public static String a()
  {
    return "javascript:";
  }
  
  public static boolean a(String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return true;
      try
      {
        int i = paramString.trim().length();
        if (i != 0) {
          return false;
        }
      }
      catch (Throwable paramString) {}
    }
    return true;
  }
  
  public static String b(String paramString)
  {
    if (paramString != null) {
      try
      {
        paramString = paramString.trim();
        int i = paramString.length();
        if (i > 0) {
          return paramString;
        }
      }
      catch (Throwable paramString) {}
    }
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.b.e
 * JD-Core Version:    0.7.0.1
 */