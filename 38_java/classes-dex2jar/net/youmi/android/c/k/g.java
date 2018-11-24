package net.youmi.android.c.k;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

public class g
{
  public static Intent a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    Object localObject = null;
    if (paramString1 != null) {
      if (paramString2 == null) {}
    }
    for (;;)
    {
      try
      {
        if (paramContext.getPackageManager().getPackageInfo(paramString1, 0) != null) {
          paramContext = new Intent();
        }
        paramContext = null;
      }
      catch (Throwable paramContext)
      {
        try
        {
          paramContext.setAction("android.intent.action.VIEW");
          paramContext.setClassName(paramString1, paramString2);
          paramContext.addCategory("android.intent.category.DEFAULT");
          paramContext.setData(Uri.parse(paramString3));
          paramString1 = paramContext;
          if (paramContext == null) {}
          try
          {
            paramString1 = new Intent("android.intent.action.VIEW", Uri.parse(paramString3));
            paramContext = paramString1;
            paramString1.addFlags(268435456);
            return paramString1;
          }
          catch (Throwable paramString1)
          {
            return paramContext;
          }
          paramString2 = localObject;
          try
          {
            paramContext = paramContext.getPackageManager().getLaunchIntentForPackage(paramString1);
            paramString2 = paramContext;
            paramContext.setAction("android.intent.action.VIEW");
            paramString2 = paramContext;
            paramContext.addCategory("android.intent.category.DEFAULT");
            paramString2 = paramContext;
            paramContext.setData(Uri.parse(paramString3));
          }
          catch (Throwable paramContext)
          {
            paramContext = paramString2;
          }
          continue;
          paramContext = paramContext;
          paramContext = null;
          continue;
        }
        catch (Throwable paramString1)
        {
          continue;
        }
        paramContext = null;
      }
    }
  }
  
  public static void a(Context paramContext)
  {
    try
    {
      paramContext.startActivity(new Intent("android.settings.WIRELESS_SETTINGS").addFlags(268435456));
      return;
    }
    catch (Throwable paramContext) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.k.g
 * JD-Core Version:    0.7.0.1
 */