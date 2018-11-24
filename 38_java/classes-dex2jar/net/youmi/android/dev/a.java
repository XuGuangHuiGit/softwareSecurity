package net.youmi.android.dev;

import android.content.Context;
import net.youmi.android.AdBrowser;
import net.youmi.android.AdReceiver;
import net.youmi.android.AdService;
import net.youmi.android.c.k.b;
import net.youmi.android.c.k.i;

public class a
{
  public static boolean a(Context paramContext)
  {
    if (!i.j(paramContext))
    {
      net.youmi.android.c.e.a.b("Check SmartAd Permission Failure , Please Add \"%s\" To AndroidManifest.xml", new Object[] { "android.permission.GET_TASKS" });
      return false;
    }
    if (!i.i(paramContext))
    {
      net.youmi.android.c.e.a.b("Check SmartAd Permission Failure , Please Add \"%s\" To AndroidManifest.xml", new Object[] { "android.permission.SYSTEM_ALERT_WINDOW" });
      return false;
    }
    return true;
  }
  
  public static boolean b(Context paramContext)
  {
    if (!i.b(paramContext))
    {
      net.youmi.android.c.e.a.b("Check Ad Permission Failure , Please Add \"%s\" To AndroidManifest.xml", new Object[] { "android.permission.INTERNET" });
      return false;
    }
    if (!i.c(paramContext))
    {
      net.youmi.android.c.e.a.b("Check Ad Permission Failure , Please Add \"%s\" To AndroidManifest.xml", new Object[] { "android.permission.READ_PHONE_STATE" });
      return false;
    }
    if (!i.d(paramContext))
    {
      net.youmi.android.c.e.a.b("Check Ad Permission Failure , Please Add \"%s\" To AndroidManifest.xml", new Object[] { "android.permission.ACCESS_NETWORK_STATE" });
      return false;
    }
    if (!i.g(paramContext))
    {
      net.youmi.android.c.e.a.b("Check Ad Permission Failure , Please Add \"%s\" To AndroidManifest.xml", new Object[] { "android.permission.ACCESS_WIFI_STATE" });
      return false;
    }
    if (!i.a(paramContext))
    {
      net.youmi.android.c.e.a.b("Check Ad Permission Failure , Please Add \"%s\" To AndroidManifest.xml", new Object[] { "android.permission.WRITE_EXTERNAL_STORAG" });
      return false;
    }
    return true;
  }
  
  public static boolean c(Context paramContext)
  {
    if (!b.a(paramContext, AdBrowser.class))
    {
      net.youmi.android.c.e.a.b("Check Ad Component Failure , Please Add \"%s\" To AndroidManifest.xml", new Object[] { AdBrowser.class.getName() });
      return false;
    }
    if (!b.b(paramContext, AdService.class))
    {
      net.youmi.android.c.e.a.b("Check Ad Component Failure , Please Add \"%s\" To AndroidManifest.xml", new Object[] { AdService.class.getName() });
      return false;
    }
    if (!b.c(paramContext, AdReceiver.class))
    {
      net.youmi.android.c.e.a.b("Check Ad Component Failure , Please Add \"%s\" To AndroidManifest.xml", new Object[] { AdReceiver.class.getName() });
      return false;
    }
    return true;
  }
  
  public static boolean d(Context paramContext)
  {
    if (!net.youmi.android.b.b.a.c(paramContext)) {}
    while ((!b(paramContext)) || (!c(paramContext))) {
      return false;
    }
    return true;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.dev.a
 * JD-Core Version:    0.7.0.1
 */