package net.youmi.android.a.c;

import android.content.Context;
import android.webkit.WebSettings;
import java.io.File;

class l
{
  static void a(Context paramContext, WebSettings paramWebSettings)
  {
    try
    {
      paramWebSettings.setDatabaseEnabled(true);
      paramWebSettings.setDatabasePath(paramContext.getDatabasePath("webviewDatabase").getAbsolutePath());
      paramWebSettings.setGeolocationEnabled(true);
      paramWebSettings.setGeolocationDatabasePath(paramContext.getDatabasePath("webviewGEODatabase").getAbsolutePath());
      return;
    }
    catch (Throwable paramContext) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.c.l
 * JD-Core Version:    0.7.0.1
 */