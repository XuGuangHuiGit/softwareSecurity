package net.youmi.android.a.h;

import android.content.Context;
import android.webkit.WebView;

public class w
{
  public static void a(Context paramContext, WebView paramWebView, String paramString)
  {
    if (paramContext == null) {}
    while ((paramWebView == null) || (paramString == null)) {
      return;
    }
    try
    {
      new Thread(new x(paramContext, paramString, paramWebView)).start();
      return;
    }
    catch (Throwable paramContext) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.w
 * JD-Core Version:    0.7.0.1
 */