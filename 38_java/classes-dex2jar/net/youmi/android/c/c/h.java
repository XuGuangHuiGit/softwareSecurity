package net.youmi.android.c.c;

import java.net.URLEncoder;

public class h
{
  public static String a(String paramString)
  {
    try
    {
      String str = URLEncoder.encode(paramString, "UTF-8");
      paramString = str;
      if (str.indexOf("+") > -1) {
        paramString = str.replace("+", "%20");
      }
      return paramString;
    }
    catch (Throwable paramString) {}
    return "";
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.c.h
 * JD-Core Version:    0.7.0.1
 */