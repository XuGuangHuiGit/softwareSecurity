package net.youmi.android.a.h;

import android.content.Context;
import android.webkit.WebView;
import java.util.Hashtable;

public class r
{
  private static r b;
  private Hashtable a = new Hashtable();
  
  public static r a()
  {
    if (b == null) {
      b = new r();
    }
    return b;
  }
  
  public String a(String paramString)
  {
    return net.youmi.android.c.c.e.a(paramString);
  }
  
  public void a(Context paramContext, WebView paramWebView, String paramString)
  {
    if (paramWebView == null) {}
    for (;;)
    {
      return;
      try
      {
        paramContext = net.youmi.android.c.b.e.b(paramString);
        if (paramContext != null)
        {
          if (this.a == null)
          {
            this.a = new Hashtable();
            return;
          }
          paramContext = a(paramContext);
          paramContext = (String)this.a.get(paramContext);
          if (paramContext != null)
          {
            paramWebView.loadUrl(net.youmi.android.c.b.e.a() + paramContext);
            return;
          }
        }
      }
      catch (Throwable paramContext) {}
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = net.youmi.android.c.b.e.b(paramString1);
      if (paramString1 != null)
      {
        paramString1 = a(paramString1);
        paramString2 = net.youmi.android.c.b.e.b(paramString2);
        if (paramString2 != null)
        {
          if (this.a == null) {
            this.a = new Hashtable();
          }
          this.a.put(paramString1, paramString2);
        }
      }
      return;
    }
    catch (Throwable paramString1) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.r
 * JD-Core Version:    0.7.0.1
 */