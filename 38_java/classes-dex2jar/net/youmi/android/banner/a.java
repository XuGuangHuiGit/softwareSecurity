package net.youmi.android.banner;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import net.youmi.android.a.h.e;
import net.youmi.android.a.h.r;
import net.youmi.android.a.h.s;
import net.youmi.android.a.k.a.h;
import net.youmi.android.a.k.a.j;

public class a
  implements net.youmi.android.a.h.b, net.youmi.android.a.k.a.f, h
{
  protected j a;
  protected e b;
  protected String c;
  protected String d;
  protected String e;
  private Context f;
  private b g;
  private int h = 0;
  private String i = "";
  private String j = "";
  
  public a(Context paramContext, e parame)
  {
    this.f = paramContext;
    this.b = parame;
    net.youmi.android.c.e.b.a("onConstruct", new Object[0]);
  }
  
  public void a()
  {
    net.youmi.android.a.k.a.b localb = new net.youmi.android.a.k.a.b();
    localb.a(1);
    localb.a(this);
    localb.a(this.b);
    localb.a(this);
    localb.a(this);
    this.a = new j(this.f, localb);
    this.a.getSettings().setCacheMode(1);
  }
  
  public void a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.h = paramInt;
    this.i = paramString1;
    this.j = paramString2;
    this.d = paramString4;
    this.e = paramString3;
    this.c = paramString5;
  }
  
  public void a(WebView paramWebView, int paramInt) {}
  
  public void a(WebView paramWebView, String paramString) {}
  
  protected void a(b paramb)
  {
    this.g = paramb;
  }
  
  public void b()
  {
    if ((this.e != null) && (!this.e.equals(""))) {
      r.a().a(this.c, this.e);
    }
    if ((this.d != null) && (!this.d.equals(""))) {
      s.a().a(this.c, this.d);
    }
  }
  
  public void c()
  {
    this.a.loadUrl(this.c);
  }
  
  public void d()
  {
    this.a.loadUrl("javascript:" + this.e);
  }
  
  public j e()
  {
    return this.a;
  }
  
  public net.youmi.android.a.h.f js_SDK_Handler_ClearCurrentBrowserHistory()
  {
    try
    {
      if (this.a != null)
      {
        this.a.clearHistory();
        net.youmi.android.a.h.f localf = net.youmi.android.a.h.f.b;
        return localf;
      }
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  public boolean js_SDK_Handler_RunOnUIThread(Runnable paramRunnable)
  {
    try
    {
      if (this.a != null)
      {
        boolean bool = this.a.getCurrentView().post(paramRunnable);
        return bool;
      }
    }
    catch (Throwable paramRunnable) {}
    return false;
  }
  
  public void onWebPageFinished(WebView paramWebView, String paramString)
  {
    try
    {
      if (this.g != null) {
        this.g.b(this.h);
      }
      return;
    }
    catch (Throwable paramWebView)
    {
      net.youmi.android.c.e.b.a(paramWebView);
    }
  }
  
  public void onWebPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap) {}
  
  public void onWebReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2) {}
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.banner.a
 * JD-Core Version:    0.7.0.1
 */