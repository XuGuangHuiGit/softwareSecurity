package net.youmi.android.a.k.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import net.youmi.android.a.h.d;
import net.youmi.android.a.h.k;
import net.youmi.android.c.j.a;

public class i
  implements View.OnClickListener, net.youmi.android.a.h.b, e, f, h
{
  boolean a = false;
  boolean b = false;
  boolean c = true;
  String d;
  private e e;
  private m f;
  private l g;
  private g h;
  private RelativeLayout i;
  private d j;
  private String k;
  private String l = "连接服务器失败,请稍候重试";
  private Context m;
  
  public i(Context paramContext, net.youmi.android.a.h.e parame, int paramInt1, d paramd, String paramString1, String paramString2, int paramInt2, k paramk)
  {
    this.m = paramContext;
    this.j = paramd;
    this.i = new RelativeLayout(paramContext);
    this.i.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    paramd = new RelativeLayout.LayoutParams(-1, -1);
    b localb = new b();
    localb.a(paramInt1);
    localb.a(this);
    localb.a(paramString1);
    localb.b(paramString2);
    localb.a(parame);
    localb.a(this);
    localb.a(this);
    this.e = new j(this.m, localb, paramk);
    CookieManager.getInstance().setAcceptCookie(true);
    this.i.addView(this.e.getCurrentView(), paramd);
    this.f = new m(this.m);
    parame = new RelativeLayout.LayoutParams(-2, -2);
    parame.addRule(13);
    this.i.addView(this.f, parame);
    this.f.bringToFront();
    this.g = new l(paramContext);
    paramContext = new RelativeLayout.LayoutParams(-1, -1);
    this.i.addView(this.g, paramContext);
    this.g.getRefreshButton().setOnClickListener(this);
    this.g.getSetNetworkButton().setOnClickListener(this);
    this.g.bringToFront();
    this.g.setVisibility(8);
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
        this.f.a(this.k);
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
    if (this.j != null) {
      this.j.setWebTitle(paramString);
    }
  }
  
  public void a(String paramString)
  {
    this.k = paramString;
  }
  
  public void a(g paramg)
  {
    this.h = paramg;
  }
  
  public boolean a()
  {
    return this.e.a();
  }
  
  public boolean b()
  {
    return this.e.b();
  }
  
  public boolean c()
  {
    try
    {
      if (this.e != null)
      {
        boolean bool = this.e.a();
        return bool;
      }
    }
    catch (Throwable localThrowable) {}
    return false;
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
    return this.i;
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
      boolean bool = a.a().a(paramRunnable);
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
  
  public void onClick(View paramView)
  {
    try
    {
      if (paramView == this.g.getRefreshButton())
      {
        this.e.reload();
        this.g.setVisibility(8);
        this.e.getCurrentView().setVisibility(0);
        return;
      }
      if (paramView == this.g.getSetNetworkButton())
      {
        net.youmi.android.c.k.g.a(this.m);
        return;
      }
    }
    catch (Throwable paramView) {}
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
        if (this.h != null) {
          this.h.onWebPageFinished(paramWebView, paramString);
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
        if (this.h != null) {
          this.h.onWebPageStarted(paramWebView, paramString, paramBitmap);
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
      for (;;)
      {
        try
        {
          label16:
          if (this.l != null)
          {
            this.g.setErrTips(this.l);
            this.e.getCurrentView().setVisibility(8);
            this.g.setVisibility(0);
          }
        }
        catch (Throwable localThrowable1)
        {
          continue;
        }
        try
        {
          if (this.h != null) {
            this.h.onWebReceivedError(paramWebView, paramInt, paramString1, paramString2);
          }
          return;
        }
        catch (Throwable paramWebView)
        {
          return;
        }
        this.g.setErrTips("连接服务器失败,请稍候重试");
      }
    }
    catch (Throwable localThrowable2)
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
 * Qualified Name:     net.youmi.android.a.k.a.i
 * JD-Core Version:    0.7.0.1
 */