package net.youmi.android;

import android.content.Context;
import net.youmi.android.dev.AppUpdateInfo;
import net.youmi.android.dev.CheckAppUpdateCallBack;
import net.youmi.android.dev.OnlineConfigCallBack;
import net.youmi.android.dev.b;
import net.youmi.android.dev.c;
import net.youmi.android.dev.e;

public final class AdManager
{
  private static AdManager b;
  private static boolean c = true;
  private Context a;
  
  private AdManager(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
  }
  
  public static AdManager getInstance(Context paramContext)
  {
    try
    {
      if (b != null) {
        break label40;
      }
      if (paramContext == null) {
        throw new NullPointerException("context is null");
      }
    }
    finally {}
    b = new AdManager(paramContext);
    label40:
    paramContext = b;
    return paramContext;
  }
  
  public static boolean getTipsDisplayOnNotificationAfterInstall()
  {
    return c;
  }
  
  public static void setTipsDisplayOnNotificationAfterInstall(boolean paramBoolean)
  {
    c = paramBoolean;
  }
  
  public void asyncCheckAppUpdate(CheckAppUpdateCallBack paramCheckAppUpdateCallBack)
  {
    try
    {
      new c(this.a, paramCheckAppUpdateCallBack).start();
      return;
    }
    catch (Throwable paramCheckAppUpdateCallBack)
    {
      net.youmi.android.c.e.a.a(paramCheckAppUpdateCallBack);
    }
  }
  
  public void asyncGetOnlineConfig(String paramString, OnlineConfigCallBack paramOnlineConfigCallBack)
  {
    try
    {
      new e(this.a, paramOnlineConfigCallBack, paramString).start();
      return;
    }
    catch (Throwable paramString)
    {
      net.youmi.android.c.e.a.a(paramString);
    }
  }
  
  @Deprecated
  public AppUpdateInfo checkAppUpdate()
  {
    try
    {
      AppUpdateInfo localAppUpdateInfo = b.b(this.a);
      return localAppUpdateInfo;
    }
    catch (Throwable localThrowable)
    {
      net.youmi.android.c.e.a.a(localThrowable);
    }
    return null;
  }
  
  @Deprecated
  public String getOnlineConfig(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = net.youmi.android.a.e.a.a.a(this.a, paramString1, paramString2);
      return paramString1;
    }
    catch (Throwable paramString1) {}
    return paramString2;
  }
  
  public void init(String paramString1, String paramString2, boolean paramBoolean)
  {
    try
    {
      net.youmi.android.b.b.a.a(this.a, paramString1);
      net.youmi.android.b.b.a.b(this.a, paramString2);
      net.youmi.android.b.b.a.a(paramBoolean);
      net.youmi.android.d.c.a.a(this.a);
      return;
    }
    catch (Throwable paramString1) {}
  }
  
  public void setEnableDebugLog(boolean paramBoolean)
  {
    net.youmi.android.c.e.a.a(paramBoolean);
  }
  
  public AppUpdateInfo syncCheckAppUpdate()
  {
    try
    {
      AppUpdateInfo localAppUpdateInfo = b.b(this.a);
      return localAppUpdateInfo;
    }
    catch (Throwable localThrowable)
    {
      net.youmi.android.c.e.a.a(localThrowable);
    }
    return null;
  }
  
  public String syncGetOnlineConfig(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = net.youmi.android.a.e.a.a.a(this.a, paramString1, paramString2);
      return paramString1;
    }
    catch (Throwable paramString1)
    {
      net.youmi.android.c.e.a.a(paramString1);
    }
    return paramString2;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.AdManager
 * JD-Core Version:    0.7.0.1
 */