package net.youmi.android.smart;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import net.youmi.android.a.h.d;
import net.youmi.android.a.h.k;
import net.youmi.android.a.k.a.g;
import net.youmi.android.a.k.a.h;
import net.youmi.android.a.k.a.j;
import net.youmi.android.a.k.a.m;
import net.youmi.android.f.a.u;

public class f
  implements net.youmi.android.a.h.b, net.youmi.android.a.k.a.e, net.youmi.android.a.k.a.f, h
{
  boolean a = false;
  boolean b = false;
  boolean c = true;
  String d;
  private net.youmi.android.a.k.a.e e;
  private m f;
  private g g;
  private RelativeLayout h;
  private d i;
  private String j;
  private String k = "连接服务器失败,请稍候重试";
  private Context l;
  
  public f(Context paramContext, net.youmi.android.a.h.e parame, int paramInt1, d paramd, String paramString1, String paramString2, int paramInt2, k paramk)
  {
    this.l = paramContext;
    this.i = paramd;
    this.h = new RelativeLayout(paramContext);
    this.h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    paramContext = new RelativeLayout.LayoutParams(-1, -1);
    paramd = new net.youmi.android.a.k.a.b();
    paramd.a(paramInt1);
    paramd.a(this);
    paramd.a(paramString1);
    paramd.b(paramString2);
    paramd.a(parame);
    paramd.a(this);
    paramd.a(this);
    this.e = new j(this.l, paramd, paramk);
    CookieManager.getInstance().setAcceptCookie(true);
    this.h.addView(this.e.getCurrentView(), paramContext);
    this.f = new m(this.l);
    paramContext = new RelativeLayout.LayoutParams(-2, -2);
    paramContext.addRule(13);
    this.h.addView(this.f, paramContext);
    this.f.bringToFront();
    a(false, 0);
  }
  
  private void a(boolean paramBoolean, int paramInt)
  {
    if (this.f != null)
    {
      if (!paramBoolean) {
        break label48;
      }
      if ((this.f.getVisibility() != 0) && (this.c))
      {
        this.f.a(this.j);
        this.f.setVisibility(0);
      }
    }
    label48:
    while (this.f.getVisibility() == 8) {
      return;
    }
    this.f.setVisibility(8);
  }
  
  public void a(WebView paramWebView, int paramInt)
  {
    if (paramInt < 100) {}
    try
    {
      a(true, paramInt);
      this.b = true;
      return;
    }
    catch (Throwable paramWebView) {}
    a(false, paramInt);
    this.b = false;
    return;
  }
  
  public void a(WebView paramWebView, String paramString)
  {
    if (this.i != null) {
      this.i.setWebTitle(paramString);
    }
  }
  
  public void a(String paramString)
  {
    this.j = paramString;
  }
  
  public boolean a()
  {
    return this.e.a();
  }
  
  public boolean b()
  {
    return this.e.b();
  }
  
  public boolean canGoBack()
  {
    return this.e.canGoBack();
  }
  
  public boolean canGoForward()
  {
    return this.e.canGoForward();
  }
  
  public void clearHistory()
  {
    this.e.clearHistory();
  }
  
  public View getCurrentView()
  {
    return this.h;
  }
  
  public net.youmi.android.a.h.f js_SDK_Handler_ClearCurrentBrowserHistory()
  {
    try
    {
      if (this.e != null)
      {
        this.e.clearHistory();
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
      boolean bool = net.youmi.android.c.j.a.a().a(paramRunnable);
      return bool;
    }
    catch (Throwable paramRunnable) {}
    return false;
  }
  
  public void loadUrl(String paramString)
  {
    if (paramString != null) {}
    try
    {
      if (this.e != null)
      {
        this.b = false;
        this.a = false;
        this.d = paramString;
        this.e.loadUrl(paramString);
      }
      return;
    }
    catch (Throwable paramString) {}
  }
  
  public void onWebPageFinished(WebView paramWebView, String paramString)
  {
    try
    {
      a(false, 0);
      this.b = false;
      try
      {
        label11:
        if (this.g != null) {
          this.g.onWebPageFinished(paramWebView, paramString);
        }
        return;
      }
      catch (Throwable paramWebView) {}
    }
    catch (Throwable localThrowable)
    {
      break label11;
    }
  }
  
  public void onWebPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    try
    {
      a(true, 0);
      this.b = true;
      try
      {
        label11:
        if (this.g != null) {
          this.g.onWebPageStarted(paramWebView, paramString, paramBitmap);
        }
        return;
      }
      catch (Throwable paramWebView) {}
    }
    catch (Throwable localThrowable)
    {
      break label11;
    }
  }
  
  public void onWebReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    try
    {
      a(false, 0);
      this.b = false;
      this.a = true;
      try
      {
        label16:
        if (this.g != null) {
          this.g.onWebReceivedError(paramWebView, paramInt, paramString1, paramString2);
        }
        try
        {
          label37:
          net.youmi.android.c.e.a.a(u.a, "网络情况不佳，无法展示对话框。", new Object[0]);
          return;
        }
        catch (Throwable paramWebView) {}
      }
      catch (Throwable paramWebView)
      {
        break label37;
      }
    }
    catch (Throwable localThrowable)
    {
      break label16;
    }
  }
  
  public void postUrl(String paramString, byte[] paramArrayOfByte)
  {
    if (paramString != null) {}
    try
    {
      if (this.e != null)
      {
        this.b = false;
        this.a = false;
        this.d = paramString;
        this.e.postUrl(this.d, paramArrayOfByte);
      }
      return;
    }
    catch (Throwable paramString) {}
  }
  
  public void reload()
  {
    try
    {
      if (this.e != null) {
        this.e.reload();
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.smart.f
 * JD-Core Version:    0.7.0.1
 */