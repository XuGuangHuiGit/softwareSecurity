package net.youmi.android.c.k;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

public class h
{
  public static int a(Context paramContext, String paramString, int paramInt)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      int i = paramInt;
      if (paramContext != null)
      {
        paramContext = paramContext.metaData;
        i = paramInt;
        if (paramContext != null)
        {
          paramContext = paramContext.get(paramString);
          i = paramInt;
          if (paramContext != null)
          {
            paramContext = paramContext.toString();
            i = paramInt;
            if (paramContext != null)
            {
              double d = Double.parseDouble(paramContext.trim());
              i = (int)d;
            }
          }
        }
      }
      return i;
    }
    catch (Throwable paramContext) {}
    return paramInt;
  }
  
  public static String a(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationLabel(paramContext.getApplicationInfo()).toString();
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return "";
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return false;
      try
      {
        paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
        if (paramContext != null) {
          return true;
        }
      }
      catch (Throwable paramContext) {}
    }
    return false;
  }
  
  public static a b(Context paramContext, String paramString)
  {
    if (paramString == null) {
      return null;
    }
    for (;;)
    {
      int i;
      try
      {
        Object localObject1 = new Intent("android.intent.action.MAIN");
        ((Intent)localObject1).addCategory("android.intent.category.LAUNCHER");
        paramContext = paramContext.getPackageManager();
        localObject1 = paramContext.queryIntentActivities((Intent)localObject1, 1);
        if (localObject1 != null)
        {
          i = 0;
          int j = ((List)localObject1).size();
          if (i < j) {
            try
            {
              Object localObject3 = (ResolveInfo)((List)localObject1).get(i);
              if ((localObject3 == null) || (!((ResolveInfo)localObject3).activityInfo.packageName.equals(paramString))) {
                break label171;
              }
              Object localObject2 = ((ResolveInfo)localObject3).loadLabel(paramContext).toString();
              j = ((ResolveInfo)localObject3).activityInfo.applicationInfo.icon;
              localObject3 = ((ResolveInfo)localObject3).activityInfo.name;
              if ((localObject3 == null) || ("".equals(((String)localObject3).trim()))) {
                break label171;
              }
              localObject2 = new a((String)localObject2, j, (String)localObject3);
              return localObject2;
            }
            catch (Throwable localThrowable) {}
          }
        }
        return null;
      }
      catch (Throwable paramContext) {}
      label171:
      i += 1;
    }
  }
  
  public static PackageInfo c(Context paramContext, String paramString)
  {
    Object localObject = null;
    if (paramString == null) {
      paramContext = localObject;
    }
    for (;;)
    {
      return paramContext;
      try
      {
        PackageManager localPackageManager = paramContext.getPackageManager();
        paramContext = localObject;
        if (localPackageManager != null)
        {
          paramString = localPackageManager.getPackageInfo(paramString, 0);
          paramContext = paramString;
          if (paramString == null) {
            return paramString;
          }
        }
      }
      catch (Throwable paramContext) {}
    }
    return null;
  }
  
  public static Intent d(Context paramContext, String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      paramContext = e(paramContext, "file://" + paramString);
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return null;
  }
  
  public static Intent e(Context paramContext, String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      paramContext = new Intent("android.intent.action.VIEW");
      paramContext.setDataAndType(Uri.parse(paramString), "application/vnd.android.package-archive");
      paramContext.addFlags(268435456);
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return null;
  }
  
  static void f(Context paramContext, String paramString)
  {
    try
    {
      paramString = e(paramContext, paramString);
      if (paramString != null) {
        paramContext.startActivity(paramString);
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static void g(Context paramContext, String paramString)
  {
    if (paramString == null) {
      return;
    }
    f(paramContext, "file://" + paramString);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.k.h
 * JD-Core Version:    0.7.0.1
 */