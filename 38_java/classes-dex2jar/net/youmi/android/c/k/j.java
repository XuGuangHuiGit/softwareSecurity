package net.youmi.android.c.k;

import android.content.Context;
import android.telephony.TelephonyManager;

public class j
{
  public static boolean a(Context paramContext)
  {
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext != null)
      {
        int i = paramContext.getNetworkType();
        if (i != 0) {
          return true;
        }
      }
    }
    catch (Throwable paramContext) {}
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.k.j
 * JD-Core Version:    0.7.0.1
 */