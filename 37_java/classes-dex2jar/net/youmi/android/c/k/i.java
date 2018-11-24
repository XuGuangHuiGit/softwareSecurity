package net.youmi.android.c.k;

import android.content.Context;
import android.os.Build.VERSION;

public class i
{
  public static boolean a(Context paramContext)
  {
    try
    {
      if (Build.VERSION.SDK_INT < 4) {
        return true;
      }
      boolean bool = a(paramContext, "android.permission.WRITE_EXTERNAL_STORAGE");
      return bool;
    }
    catch (Throwable paramContext) {}
    return false;
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    try
    {
      int i = paramContext.checkCallingOrSelfPermission(paramString);
      if (i == -1) {
        return false;
      }
    }
    catch (Throwable paramContext) {}
    return true;
  }
  
  public static boolean b(Context paramContext)
  {
    return a(paramContext, "android.permission.INTERNET");
  }
  
  public static boolean c(Context paramContext)
  {
    return a(paramContext, "android.permission.READ_PHONE_STATE");
  }
  
  public static boolean d(Context paramContext)
  {
    return a(paramContext, "android.permission.ACCESS_NETWORK_STATE");
  }
  
  public static boolean e(Context paramContext)
  {
    return a(paramContext, "android.permission.ACCESS_FINE_LOCATION");
  }
  
  public static boolean f(Context paramContext)
  {
    return a(paramContext, "android.permission.ACCESS_COARSE_LOCATION");
  }
  
  public static boolean g(Context paramContext)
  {
    return a(paramContext, "android.permission.ACCESS_WIFI_STATE");
  }
  
  public static boolean h(Context paramContext)
  {
    return a(paramContext, "com.android.launcher.permission.INSTALL_SHORTCUT");
  }
  
  public static boolean i(Context paramContext)
  {
    return a(paramContext, "android.permission.SYSTEM_ALERT_WINDOW");
  }
  
  public static boolean j(Context paramContext)
  {
    return a(paramContext, "android.permission.GET_TASKS");
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.k.i
 * JD-Core Version:    0.7.0.1
 */