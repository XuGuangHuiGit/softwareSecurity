package net.youmi.android.banner;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import net.youmi.android.a.h.e;
import net.youmi.android.a.k.a.h;
import net.youmi.android.a.k.a.j;

public class c
  implements net.youmi.android.a.h.b, net.youmi.android.a.k.a.f, h
{
  protected j a;
  protected e b;
  protected String c;
  private Context d;
  private d e;
  private int f = 0;
  private String g = "";
  private String h = "";
  
  public c(Context paramContext, e parame)
  {
    this.d = paramContext;
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
    this.a = new j(this.d, localb);
    this.a.getSettings().setCacheMode(1);
  }
  
  public void a(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.f = paramInt;
    this.g = paramString1;
    this.h = paramString2;
    this.c = paramString3;
  }
  
  public void a(WebView paramWebView, int paramInt) {}
  
  public void a(WebView paramWebView, String paramString) {}
  
  protected void a(d paramd)
  {
    this.e = paramd;
  }
  
  public void b()
  {
    net.youmi.android.c.e.b.a("adpreloadView loadData");
    this.a.loadDataWithBaseURL("", this.c, "text/html", "utf-8", "");
  }
  
  public j c()
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
      net.youmi.android.c.e.b.a("AdPreloadView onWebPageFinished", new Object[0]);
      if (this.e != null) {
        this.e.c(this.f);
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
 * Qualified Name:     net.youmi.android.banner.c
 * JD-Core Version:    0.7.0.1
 */