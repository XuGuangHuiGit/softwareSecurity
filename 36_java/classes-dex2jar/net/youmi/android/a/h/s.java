package net.youmi.android.a.h;

import android.content.Context;
import android.webkit.WebView;
import java.util.Hashtable;

public class s
{
  private static s b;
  private Hashtable a = new Hashtable();
  
  public static s a()
  {
    if (b == null) {
      b = new s();
    }
    return b;
  }
  
  public String a(String paramString)
  {
    return net.youmi.android.c.c.e.a(paramString);
  }
  
  public void a(Context paramContext, WebView paramWebView, String paramString)
  {
    if (paramContext == null) {}
    for (;;)
    {
      return;
      if (paramWebView != null) {
        try
        {
          paramString = net.youmi.android.c.b.e.b(paramString);
          if (paramString != null)
          {
            if (this.a == null) {
              this.a = new Hashtable();
            }
            paramString = (String)this.a.get(a(paramString));
            if (paramString != null)
            {
              w.a(paramContext.getApplicationContext(), paramWebView, paramString);
              return;
            }
          }
        }
        catch (Throwable paramContext) {}
      }
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = net.youmi.android.c.b.e.b(paramString1);
      if (paramString1 != null)
      {
        paramString2 = net.youmi.android.c.b.e.b(paramString2);
        if (paramString2 != null)
        {
          if (this.a == null) {
            this.a = new Hashtable();
          }
          this.a.put(a(paramString1), paramString2);
        }
      }
      return;
    }
    catch (Throwable paramString1) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.s
 * JD-Core Version:    0.7.0.1
 */