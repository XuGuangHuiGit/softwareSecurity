package net.youmi.android.banner;

import android.content.Context;
import java.util.HashMap;
import net.youmi.android.c.k.i;
import net.youmi.android.dev.a;

public class BannerManager
{
  public static final String PROTOCOLVERSION = "4";
  protected static HashMap a;
  private static int b = 0;
  
  protected static int a()
  {
    return b;
  }
  
  protected static void a(int paramInt)
  {
    b = paramInt;
  }
  
  public static boolean checkBannerAdConfig(Context paramContext)
  {
    return a.d(paramContext);
  }
  
  public static String checkPermissions(Context paramContext)
  {
    String str = "";
    if (!i.b(paramContext)) {
      str = "Lack of android.permission.INTERNET permission!";
    }
    do
    {
      return str;
      if (!i.a(paramContext)) {
        return "Lack of android.permission.WRITE_EXTERNAL_STORAGE permission!";
      }
      if (!i.d(paramContext)) {
        return "Lack of android.permission.ACCESS_NETWORK_STATE permission!";
      }
    } while (i.g(paramContext));
    return "Lack of android.permission.ACCESS_WIFI_STATE permission!";
  }
  
  public static h getBannerObject(int paramInt)
  {
    if (a == null)
    {
      a = new HashMap();
      return null;
    }
    return (h)a.get(Integer.valueOf(paramInt));
  }
  
  public static void setBannerObject(int paramInt, h paramh)
  {
    if (a == null) {
      a = new HashMap();
    }
    a.put(Integer.valueOf(paramInt), paramh);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.banner.BannerManager
 * JD-Core Version:    0.7.0.1
 */