package net.youmi.android.a.h;

import android.webkit.JavascriptInterface;

public abstract class g
{
  private e a;
  private b b;
  private k c;
  private y d;
  private a e;
  
  public g(e parame, b paramb)
  {
    this.a = parame;
    this.b = paramb;
  }
  
  public g(e parame, b paramb, k paramk)
  {
    this.a = parame;
    this.b = paramb;
    this.c = paramk;
  }
  
  @JavascriptInterface
  public String a(int paramInt1, int paramInt2, String paramString)
  {
    switch (paramInt1)
    {
    }
    try
    {
      if ((this.c != null) && (this.c.a(paramInt1)))
      {
        localObject = this.c.a(paramInt1, paramInt2);
        if (localObject != null) {}
        try
        {
          if ((localObject instanceof net.youmi.android.a.h.b.b))
          {
            net.youmi.android.a.h.b.b localb = (net.youmi.android.a.h.b.b)localObject;
            if (this.d != null) {
              localb.a(this.d);
            }
            if (this.e != null) {
              localb.a(this.e);
            }
          }
        }
        catch (Throwable localThrowable)
        {
          label165:
          break label165;
        }
        for (paramString = ((net.youmi.android.a.h.b.a)localObject).a(this.a, this.b, paramString);; paramString = net.youmi.android.a.h.b.b.b(4))
        {
          localObject = paramString;
          if (paramString == null) {
            localObject = net.youmi.android.a.h.b.b.b(3);
          }
          return localObject;
          localObject = a(paramInt2);
          break;
          localObject = b(paramInt2);
          break;
          localObject = c(paramInt2);
          break;
          localObject = d(paramInt2);
          break;
          localObject = e(paramInt2);
          break;
          localObject = f(paramInt2);
          break;
          localObject = g(paramInt2);
          break;
          localObject = h(paramInt2);
          break;
        }
      }
    }
    catch (Throwable paramString)
    {
      for (;;)
      {
        paramString = null;
        continue;
        Object localObject = null;
        continue;
        localObject = null;
      }
    }
  }
  
  abstract net.youmi.android.a.h.b.a a(int paramInt);
  
  abstract net.youmi.android.a.h.b.a b(int paramInt);
  
  abstract net.youmi.android.a.h.b.a c(int paramInt);
  
  abstract net.youmi.android.a.h.b.a d(int paramInt);
  
  @JavascriptInterface
  public boolean d(String paramString)
  {
    try
    {
      net.youmi.android.c.e.a.d(paramString, new Object[0]);
      return true;
    }
    catch (Throwable paramString) {}
    return false;
  }
  
  @JavascriptInterface
  public boolean dd(String paramString)
  {
    return true;
  }
  
  @JavascriptInterface
  public boolean de(String paramString)
  {
    return true;
  }
  
  @JavascriptInterface
  public boolean di(String paramString)
  {
    return true;
  }
  
  @JavascriptInterface
  public boolean dw(String paramString)
  {
    return true;
  }
  
  abstract net.youmi.android.a.h.b.a e(int paramInt);
  
  @JavascriptInterface
  public boolean e(String paramString)
  {
    try
    {
      net.youmi.android.c.e.a.b(paramString, new Object[0]);
      return true;
    }
    catch (Throwable paramString) {}
    return false;
  }
  
  abstract net.youmi.android.a.h.b.a f(int paramInt);
  
  abstract net.youmi.android.a.h.b.a g(int paramInt);
  
  abstract net.youmi.android.a.h.b.a h(int paramInt);
  
  @JavascriptInterface
  public boolean i(String paramString)
  {
    try
    {
      net.youmi.android.c.e.a.a(paramString, new Object[0]);
      return true;
    }
    catch (Throwable paramString) {}
    return false;
  }
  
  public void setExtendJsObject(a parama)
  {
    this.e = parama;
  }
  
  public void setYmWebBrowser(y paramy)
  {
    this.d = paramy;
  }
  
  @JavascriptInterface
  public boolean w(String paramString)
  {
    try
    {
      net.youmi.android.c.e.a.c(paramString, new Object[0]);
      return true;
    }
    catch (Throwable paramString) {}
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.g
 * JD-Core Version:    0.7.0.1
 */