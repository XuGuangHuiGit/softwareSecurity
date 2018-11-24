package net.youmi.android.c.h;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import net.youmi.android.c.k.i;

public class b
{
  public static String a(Context paramContext)
  {
    try
    {
      if (i.d(paramContext))
      {
        paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if ((paramContext != null) && (paramContext.isAvailable()))
        {
          if (paramContext.getType() == 0)
          {
            paramContext = paramContext.getExtraInfo();
            if (paramContext == null) {
              break label83;
            }
            String str = paramContext.trim().toLowerCase();
            paramContext = str;
            if (str.length() <= 25) {
              break label81;
            }
            return str.substring(0, 25);
          }
          return "wifi";
        }
      }
    }
    catch (Throwable paramContext)
    {
      paramContext = "";
    }
    label81:
    return paramContext;
    label83:
    return "";
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.h.b
 * JD-Core Version:    0.7.0.1
 */