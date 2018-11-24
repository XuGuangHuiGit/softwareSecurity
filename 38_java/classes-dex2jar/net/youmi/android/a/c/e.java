package net.youmi.android.a.c;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.WebStorage.QuotaUpdater;
import net.youmi.android.a.k.a.b;

class e
  extends d
{
  e(b paramb)
  {
    super(paramb);
  }
  
  static e b(b paramb)
  {
    try
    {
      paramb = new e(paramb);
      return paramb;
    }
    catch (Throwable paramb) {}
    return null;
  }
  
  public void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    try
    {
      paramQuotaUpdater.updateQuota(2L * paramLong2);
      return;
    }
    catch (Throwable paramString1) {}
  }
  
  public void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    try
    {
      Activity localActivity = this.a.h();
      if (localActivity != null) {}
      try
      {
        new AlertDialog.Builder(localActivity).setIcon(17301659).setTitle("提示").setMessage(String.format("站点 %s 想获得您的位置信息,是否允许?", new Object[] { paramString })).setPositiveButton("允许本次", new h(this, paramCallback, paramString)).setNeutralButton("总是允许", new g(this, paramCallback, paramString)).setNegativeButton("拒绝", new f(this, paramCallback, paramString)).create().show();
        for (;;)
        {
          label97:
          super.onGeolocationPermissionsShowPrompt(paramString, paramCallback);
          return;
          paramCallback.invoke(paramString, true, false);
        }
      }
      catch (Throwable localThrowable)
      {
        break label97;
      }
      return;
    }
    catch (Throwable paramString) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.c.e
 * JD-Core Version:    0.7.0.1
 */