package net.youmi.android.a.c;

import android.content.Context;
import android.webkit.WebSettings;
import java.io.File;

class m
{
  static void a(Context paramContext, WebSettings paramWebSettings)
  {
    try
    {
      paramWebSettings.setDomStorageEnabled(true);
      paramWebSettings.setAppCacheEnabled(true);
      paramWebSettings.setAppCacheMaxSize(9223372036854775807L);
      paramWebSettings.setAppCachePath(paramContext.getCacheDir().getAbsolutePath());
      return;
    }
    catch (Throwable paramContext) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.c.m
 * JD-Core Version:    0.7.0.1
 */