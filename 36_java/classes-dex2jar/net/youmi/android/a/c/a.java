package net.youmi.android.a.c;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import net.youmi.android.a.k.a.h;

public class a
{
  public static int a()
  {
    try
    {
      int i = c.a();
      return i;
    }
    catch (Throwable localThrowable) {}
    return 1;
  }
  
  public static WebChromeClient a(Context paramContext, net.youmi.android.a.k.a.b paramb)
  {
    int i = 1;
    try
    {
      int j = c.a();
      i = j;
    }
    catch (Throwable paramContext)
    {
      label8:
      break label8;
    }
    if (i <= 4) {}
    try
    {
      return d.a(paramb);
    }
    catch (Throwable paramContext)
    {
      return null;
    }
    if (i < 7) {
      return e.b(paramb);
    }
    paramContext = i.c(paramb);
    return paramContext;
  }
  
  public static WebViewClient a(h paramh)
  {
    try
    {
      if (a() >= 8) {
        return k.a(paramh);
      }
      paramh = j.a(paramh);
      return paramh;
    }
    catch (Throwable paramh) {}
    return null;
  }
  
  public static void a(Context paramContext)
  {
    try
    {
      if (a() >= 5) {
        b.a(paramContext);
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static void a(Context paramContext, WebSettings paramWebSettings)
  {
    i = 1;
    try
    {
      int j = c.a();
      i = j;
    }
    catch (Throwable localThrowable1)
    {
      try
      {
        do
        {
          l.a(paramContext, paramWebSettings);
        } while (i < 7);
        try
        {
          m.a(paramContext, paramWebSettings);
          return;
        }
        catch (Throwable paramContext)
        {
          return;
        }
        localThrowable1 = localThrowable1;
      }
      catch (Throwable localThrowable2)
      {
        break label24;
      }
    }
    if (i <= 4) {
      return;
    }
    if (i < 5) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.c.a
 * JD-Core Version:    0.7.0.1
 */