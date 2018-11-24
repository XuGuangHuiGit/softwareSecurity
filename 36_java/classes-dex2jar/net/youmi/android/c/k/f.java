package net.youmi.android.c.k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.pm.PackageManager;
import java.util.List;

public class f
{
  public static Intent a(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.getPackageManager();
      if (paramContext != null)
      {
        paramContext = paramContext.getLaunchIntentForPackage(paramString);
        if (paramContext != null)
        {
          paramContext.addFlags(268435456);
          return paramContext;
        }
      }
    }
    catch (Throwable paramContext) {}
    return null;
  }
  
  public static boolean a(Context paramContext, String paramString, int paramInt)
  {
    try
    {
      paramString = Intent.parseUri(paramString, paramInt);
      if (paramString == null) {
        return false;
      }
      List localList = paramContext.getPackageManager().queryIntentActivities(paramString, 0);
      if ((localList != null) && (localList.size() > 0))
      {
        paramString.addFlags(268435456);
        paramContext.startActivity(paramString);
        return true;
      }
    }
    catch (Throwable paramContext) {}
    return false;
  }
  
  public static boolean a(Context paramContext, String paramString1, int paramInt, String paramString2)
  {
    try
    {
      paramString1 = Intent.parseUri(paramString1, paramInt);
      if (paramString1 == null) {
        return false;
      }
      paramString1.addFlags(268435456);
      paramString1 = Intent.createChooser(paramString1, paramString2);
      paramString1.addFlags(268435456);
      paramContext.startActivity(paramString1);
      return true;
    }
    catch (Throwable paramContext) {}
    return false;
  }
  
  public static boolean b(Context paramContext, String paramString)
  {
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (localPackageManager != null)
      {
        paramString = localPackageManager.getLaunchIntentForPackage(paramString);
        if (paramString != null)
        {
          paramString.addFlags(268435456);
          paramContext.startActivity(paramString);
          return true;
        }
      }
    }
    catch (Throwable paramContext) {}
    return false;
  }
  
  public static boolean b(Context paramContext, String paramString, int paramInt)
  {
    try
    {
      paramString = Intent.parseUri(paramString, paramInt);
      if (paramString == null) {
        return false;
      }
      paramContext.startService(paramString);
      return true;
    }
    catch (Throwable paramContext) {}
    return false;
  }
  
  public static boolean b(Context paramContext, String paramString1, int paramInt, String paramString2)
  {
    try
    {
      paramString1 = Intent.parseUri(paramString1, paramInt);
      if (paramString1 != null)
      {
        if (paramString2 != null)
        {
          paramContext.sendBroadcast(paramString1, paramString2);
          return true;
        }
        paramContext.sendBroadcast(paramString1);
        return true;
      }
    }
    catch (Throwable paramContext) {}
    return false;
  }
  
  public static boolean c(Context paramContext, String paramString)
  {
    if (paramContext == null) {}
    for (;;)
    {
      return false;
      try
      {
        if (!i.h(paramContext)) {
          continue;
        }
        Object localObject2 = h.b(paramContext, paramString);
        if (localObject2 == null) {
          continue;
        }
        Object localObject1 = ((a)localObject2).a();
        int i = ((a)localObject2).c();
        String str = ((a)localObject2).b();
        localObject2 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        ((Intent)localObject2).putExtra("android.intent.extra.shortcut.NAME", (String)localObject1);
        ((Intent)localObject2).putExtra("duplicate", false);
        localObject1 = new ComponentName(paramString, str);
        ((Intent)localObject2).putExtra("android.intent.extra.shortcut.INTENT", new Intent("android.intent.action.MAIN").setComponent((ComponentName)localObject1));
        localObject1 = null;
        if (paramContext.getPackageName().equals(paramString)) {
          paramString = paramContext;
        }
        for (;;)
        {
          if (paramString != null) {
            ((Intent)localObject2).putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(paramString, i));
          }
          paramContext.sendBroadcast((Intent)localObject2);
          return true;
          try
          {
            paramString = paramContext.createPackageContext(paramString, 3);
          }
          catch (Throwable paramString)
          {
            paramString = (String)localObject1;
          }
        }
        return false;
      }
      catch (Throwable paramContext) {}
    }
  }
  
  public static boolean c(Context paramContext, String paramString, int paramInt)
  {
    try
    {
      paramString = Intent.parseUri(paramString, paramInt);
      if (paramString == null) {
        return false;
      }
      boolean bool = paramContext.stopService(paramString);
      return bool;
    }
    catch (Throwable paramContext) {}
    return false;
  }
  
  public static boolean d(Context paramContext, String paramString, int paramInt)
  {
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (localPackageManager != null)
      {
        paramString = localPackageManager.getLaunchIntentForPackage(paramString);
        if (paramString != null)
        {
          paramString.addFlags(paramInt);
          paramString.addFlags(268435456);
          paramContext.startActivity(paramString);
          return true;
        }
      }
    }
    catch (Throwable paramContext) {}
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.k.f
 * JD-Core Version:    0.7.0.1
 */