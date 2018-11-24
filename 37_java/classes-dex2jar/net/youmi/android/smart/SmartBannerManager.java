package net.youmi.android.smart;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import java.util.List;
import net.youmi.android.SmartBannerActivity;
import net.youmi.android.SmartBannerService;

public class SmartBannerManager
{
  protected static final void a(Context paramContext)
  {
    new Thread(new e(paramContext, d(paramContext))).start();
  }
  
  protected static void a(Context paramContext, int paramInt)
  {
    try
    {
      paramContext = paramContext.getSharedPreferences("DdGsdW3fe80WEfD", 0).edit();
      paramContext.putInt("lpc", paramInt);
      paramContext.commit();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  protected static final void a(Context paramContext, long paramLong)
  {
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    Intent localIntent = new Intent(paramContext, SmartBannerService.class);
    localIntent.putExtra("from", 0);
    paramContext = PendingIntent.getService(paramContext, 111509, localIntent, 134217728);
    localAlarmManager.cancel(paramContext);
    localAlarmManager.setRepeating(0, System.currentTimeMillis() + paramLong, 3000L, paramContext);
  }
  
  private static List b(PackageManager paramPackageManager)
  {
    Intent localIntent = new Intent("android.intent.action.MAIN", null);
    localIntent.addCategory("android.intent.category.LAUNCHER");
    return paramPackageManager.queryIntentActivities(localIntent, 0);
  }
  
  protected static final void b(Context paramContext)
  {
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    Intent localIntent = new Intent(paramContext, SmartBannerService.class);
    localIntent.putExtra("from", 1);
    paramContext = PendingIntent.getService(paramContext, 111510, localIntent, 134217728);
    localAlarmManager.cancel(paramContext);
    localAlarmManager.set(0, System.currentTimeMillis(), paramContext);
  }
  
  protected static final void c(Context paramContext)
  {
    ((AlarmManager)paramContext.getSystemService("alarm")).cancel(PendingIntent.getService(paramContext, 111509, new Intent(paramContext, SmartBannerService.class), 134217728));
  }
  
  public static boolean checkSmartBannerAdConfig(Context paramContext)
  {
    if (!net.youmi.android.dev.a.d(paramContext)) {}
    while (!net.youmi.android.dev.a.a(paramContext)) {
      return false;
    }
    if (!net.youmi.android.c.k.b.b(paramContext, SmartBannerService.class))
    {
      net.youmi.android.c.e.a.b("Check Ad Component Failure , Please Add \"%s\" To AndroidManifest.xml", new Object[] { SmartBannerService.class.getName() });
      return false;
    }
    if (!net.youmi.android.c.k.b.a(paramContext, SmartBannerActivity.class))
    {
      net.youmi.android.c.e.a.b("Check Ad Component Failure , Please Add \"%s\" To AndroidManifest.xml", new Object[] { SmartBannerActivity.class.getName() });
      return false;
    }
    return true;
  }
  
  protected static net.youmi.android.smart.a.b d(Context paramContext)
  {
    try
    {
      paramContext = net.youmi.android.smart.a.b.b(paramContext);
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return null;
  }
  
  protected static int e(Context paramContext)
  {
    try
    {
      int i = paramContext.getSharedPreferences("DdGsdW3fe80WEfD", 0).getInt("lpc", 5);
      return i;
    }
    catch (Throwable paramContext) {}
    return 5;
  }
  
  public static void init(Context paramContext)
  {
    a(paramContext);
  }
  
  public static void show(Context paramContext)
  {
    if (checkSmartBannerAdConfig(paramContext)) {
      b(paramContext);
    }
  }
  
  public static void ubss(Context paramContext, int paramInt)
  {
    b.a(paramContext, paramInt);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.smart.SmartBannerManager
 * JD-Core Version:    0.7.0.1
 */