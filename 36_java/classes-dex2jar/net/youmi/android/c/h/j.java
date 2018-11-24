package net.youmi.android.c.h;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import net.youmi.android.c.k.i;

public class j
{
  public static boolean a(Context paramContext)
  {
    if (!i.b(paramContext)) {
      return false;
    }
    return b(paramContext);
  }
  
  public static boolean b(Context paramContext)
  {
    if (!i.d(paramContext)) {
      return true;
    }
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext != null)
      {
        boolean bool = paramContext.isAvailable();
        if (bool) {
          return true;
        }
      }
    }
    catch (Throwable paramContext) {}
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.h.j
 * JD-Core Version:    0.7.0.1
 */