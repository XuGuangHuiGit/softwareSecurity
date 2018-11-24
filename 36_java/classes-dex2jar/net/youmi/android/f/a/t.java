package net.youmi.android.f.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;

public class t
{
  public static boolean a(Context paramContext, String paramString)
  {
    try
    {
      Object localObject = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
      localObject = paramContext.getPackageManager().resolveActivity((Intent)localObject, 0);
      if ((((ResolveInfo)localObject).activityInfo.packageName.equals("android")) || (((ResolveInfo)localObject).activityInfo.name.equals("com.android.internal.app.ResolverActivity")))
      {
        paramString = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
        paramString.addFlags(268435456);
        paramString.setComponent(new ComponentName("com.android.browser", "com.android.browser.BrowserActivity"));
        paramContext.startActivity(paramString);
        return true;
      }
      paramString = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
      paramString.addFlags(268435456);
      paramString.setComponent(new ComponentName(((ResolveInfo)localObject).activityInfo.packageName, ((ResolveInfo)localObject).activityInfo.name));
      paramContext.startActivity(paramString);
      return true;
    }
    catch (Throwable paramContext) {}
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.f.a.t
 * JD-Core Version:    0.7.0.1
 */