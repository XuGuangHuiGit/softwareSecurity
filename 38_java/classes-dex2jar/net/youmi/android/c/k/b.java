package net.youmi.android.c.k;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;

public class b
{
  public static boolean a(Context paramContext, Class paramClass)
  {
    if (paramClass == null) {
      return false;
    }
    return a(paramContext, paramClass.getName());
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    try
    {
      paramContext = b(paramContext, paramString);
      return paramContext != null;
    }
    catch (Throwable paramContext) {}
    return false;
  }
  
  public static ActivityInfo b(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (paramString == null)) {}
    for (;;)
    {
      return null;
      try
      {
        paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 1);
        if (paramContext == null) {
          continue;
        }
        paramContext = paramContext.activities;
        if ((paramContext == null) || (paramContext == null)) {
          continue;
        }
        int i = 0;
        while (i < paramContext.length)
        {
          ActivityInfo localActivityInfo = paramContext[i];
          boolean bool = localActivityInfo.name.equals(paramString);
          if (bool) {
            return localActivityInfo;
          }
          i += 1;
        }
        return null;
      }
      catch (Throwable paramContext) {}
    }
  }
  
  public static boolean b(Context paramContext, Class paramClass)
  {
    if (paramClass == null) {
      return false;
    }
    return c(paramContext, paramClass.getName());
  }
  
  public static boolean c(Context paramContext, Class paramClass)
  {
    if (paramClass == null) {
      return false;
    }
    return e(paramContext, paramClass.getName());
  }
  
  public static boolean c(Context paramContext, String paramString)
  {
    try
    {
      paramContext = d(paramContext, paramString);
      return paramContext != null;
    }
    catch (Throwable paramContext) {}
    return false;
  }
  
  public static ServiceInfo d(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (paramString == null)) {}
    for (;;)
    {
      return null;
      try
      {
        paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 4);
        if (paramContext == null) {
          continue;
        }
        paramContext = paramContext.services;
        if ((paramContext == null) || (paramContext == null)) {
          continue;
        }
        int i = 0;
        while (i < paramContext.length)
        {
          ServiceInfo localServiceInfo = paramContext[i];
          boolean bool = localServiceInfo.name.equals(paramString);
          if (bool) {
            return localServiceInfo;
          }
          i += 1;
        }
        return null;
      }
      catch (Throwable paramContext) {}
    }
  }
  
  public static boolean e(Context paramContext, String paramString)
  {
    return f(paramContext, paramString) != null;
  }
  
  public static ActivityInfo f(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (paramString == null)) {}
    for (;;)
    {
      return null;
      try
      {
        paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 2);
        if (paramContext == null) {
          continue;
        }
        paramContext = paramContext.receivers;
        if ((paramContext == null) || (paramContext == null)) {
          continue;
        }
        int i = 0;
        while (i < paramContext.length)
        {
          ActivityInfo localActivityInfo = paramContext[i];
          boolean bool = localActivityInfo.name.equals(paramString);
          if (bool) {
            return localActivityInfo;
          }
          i += 1;
        }
        return null;
      }
      catch (Throwable paramContext) {}
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.k.b
 * JD-Core Version:    0.7.0.1
 */