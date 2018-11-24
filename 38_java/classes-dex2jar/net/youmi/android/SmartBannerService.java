package net.youmi.android;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import net.youmi.android.smart.SmartBannerManager;

public class SmartBannerService
  extends IntentService
{
  public static int acNextTime = 0;
  public static String cacheActivity;
  public static long cacheActivitySM;
  public static String cachePackage = "";
  public static long cachePackageSM = 0L;
  public static int nextTime = 0;
  
  static
  {
    cacheActivity = "";
    cacheActivitySM = 0L;
  }
  
  public SmartBannerService()
  {
    super("SmartBanner");
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    try
    {
      int i = paramIntent.getExtras().getInt("from");
      if (i == 1)
      {
        SmartBannerManager.ubss(getApplication(), 1);
        return;
      }
      if (i == 0)
      {
        SmartBannerManager.ubss(getApplication(), 0);
        return;
      }
    }
    catch (Throwable paramIntent) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.SmartBannerService
 * JD-Core Version:    0.7.0.1
 */