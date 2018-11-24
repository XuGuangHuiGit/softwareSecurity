package net.youmi.android.a.k.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import net.youmi.android.a.h.c;
import net.youmi.android.a.h.r;
import net.youmi.android.a.h.s;
import net.youmi.android.a.h.w;
import net.youmi.android.a.h.y;

public final class j
  extends WebView
  implements c, y, e, f, h
{
  private boolean a = false;
  private boolean b = false;
  private String c;
  private String d;
  private String e;
  private f f;
  private h g;
  private Context h;
  private b i;
  private String j;
  private String k;
  private String l;
  private String m;
  
  public j(Context paramContext, b paramb)
  {
    super(paramContext);
    this.h = paramContext;
    this.i = paramb;
    net.youmi.android.a.h.h localh = new net.youmi.android.a.h.h(paramb.a(), paramb.b());
    localh.setYmWebBrowser(this);
    a(paramContext, paramb, localh);
  }
  
  public j(Context paramContext, b paramb, net.youmi.android.a.h.k paramk)
  {
    super(paramContext);
    this.h = paramContext;
    this.i = paramb;
    paramk = new net.youmi.android.a.h.h(paramb.a(), paramb.b(), paramk);
    paramk.setYmWebBrowser(this);
    a(paramContext, paramb, paramk);
  }
  
  public j(Context paramContext, b paramb, net.youmi.android.a.h.k paramk, net.youmi.android.a.h.a parama)
  {
    super(paramContext);
    this.h = paramContext;
    this.i = paramb;
    paramk = new net.youmi.android.a.h.h(paramb.a(), paramb.b(), paramk);
    paramk.setYmWebBrowser(this);
    paramk.setExtendJsObject(parama);
    a(paramContext, paramb, paramk);
  }
  
  private void a(int paramInt)
  {
    for (boolean bool = true;; bool = false)
    {
      try
      {
        localWebSettings = getSettings();
        localWebSettings.setCacheMode(-1);
        localWebSettings.setAllowFileAccess(true);
        localWebSettings.setJavaScriptEnabled(true);
        localWebSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        localWebSettings.setSupportMultipleWindows(false);
        localWebSettings.setUseWideViewPort(true);
        if ((paramInt & 0x2) != 0)
        {
          localWebSettings.setSupportZoom(bool);
          localWebSettings.setBuiltInZoomControls(bool);
          localWebSettings.setSavePassword(true);
          localWebSettings.setSaveFormData(true);
        }
      }
      catch (Throwable localThrowable1)
      {
        WebSettings localWebSettings;
        return;
      }
      try
      {
        net.youmi.android.a.c.a.a(this.h, localWebSettings);
        return;
      }
      catch (Throwable localThrowable2) {}
    }
  }
  
  private void a(Context paramContext, b paramb, net.youmi.android.a.h.g paramg)
  {
    try
    {
      this.c = paramb.d();
      this.e = paramb.e();
      this.f = paramb.f();
      this.g = paramb.g();
      c();
      a(paramb.c());
      d();
      a(this);
      a(this);
      a(paramg, paramb.c());
      setEnableOffersJsCodeLoader(true);
      setEnableOffersJsFileLoader(true);
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  private void a(net.youmi.android.a.h.g paramg, int paramInt)
  {
    if (((paramInt & 0x1) != 0) && (paramg != null)) {}
    try
    {
      addJavascriptInterface(paramg, "ymsdk");
      return;
    }
    catch (Throwable paramg) {}
  }
  
  private void a(f paramf)
  {
    try
    {
      paramf = net.youmi.android.a.c.a.a(this.h, this.i);
      if (paramf != null) {
        setWebChromeClient(paramf);
      }
      return;
    }
    catch (Throwable paramf) {}
  }
  
  private void a(h paramh)
  {
    try
    {
      paramh = net.youmi.android.a.c.a.a(paramh);
      if (paramh != null) {
        setWebViewClient(paramh);
      }
      return;
    }
    catch (Throwable paramh) {}
  }
  
  private void c()
  {
    setScrollBarStyle(33554432);
    setBackgroundColor(0);
  }
  
  private void d()
  {
    try
    {
      setDownloadListener(new k(this));
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void a(WebView paramWebView, int paramInt)
  {
    try
    {
      if (this.f != null) {
        this.f.a(paramWebView, paramInt);
      }
      return;
    }
    catch (Throwable paramWebView) {}
  }
  
  public void a(WebView paramWebView, String paramString)
  {
    try
    {
      if (this.f != null) {
        this.f.a(paramWebView, paramString);
      }
      return;
    }
    catch (Throwable paramWebView) {}
  }
  
  public void a(String paramString1, String paramString2)
  {
    try
    {
      if (!net.youmi.android.c.h.g.a(paramString1, getUrl())) {
        return;
      }
      loadUrl(paramString2);
      return;
    }
    catch (Throwable paramString1) {}
  }
  
  public void a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    try
    {
      paramString1 = net.youmi.android.c.b.e.b(paramString1);
      paramString2 = net.youmi.android.c.b.e.b(paramString2);
      paramString3 = net.youmi.android.c.b.e.b(paramString3);
      paramString4 = net.youmi.android.c.b.e.b(paramString4);
      if (paramString1 != null) {
        this.j = paramString1;
      }
      if (paramString2 != null) {
        this.k = paramString2;
      }
      if (paramString3 != null) {
        this.l = paramString3;
      }
      if (paramString4 != null) {
        this.m = paramString4;
      }
      return;
    }
    catch (Throwable paramString1) {}
  }
  
  public boolean a()
  {
    try
    {
      if (canGoBack())
      {
        goBack();
        return true;
      }
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public boolean b()
  {
    try
    {
      if (canGoForward())
      {
        goForward();
        return true;
      }
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public View getCurrentView()
  {
    return this;
  }
  
  public String getUserAgentString()
  {
    try
    {
      String str = getSettings().getUserAgentString();
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    try
    {
      net.youmi.android.a.h.c.b.a.a().a(this);
      try
      {
        label11:
        if (this.j != null) {
          loadUrl("javascript:" + this.j + "();");
        }
        return;
      }
      catch (Throwable localThrowable1) {}
    }
    catch (Throwable localThrowable2)
    {
      break label11;
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    try
    {
      net.youmi.android.a.h.c.b.a.a().b(this);
      try
      {
        label11:
        if (this.k != null) {
          loadUrl("javascript:" + this.k + "();");
        }
        return;
      }
      catch (Throwable localThrowable1) {}
    }
    catch (Throwable localThrowable2)
    {
      break label11;
    }
  }
  
  public void onWebPageFinished(WebView paramWebView, String paramString)
  {
    try
    {
      if (this.a) {
        r.a().a(this.h, this, paramString);
      }
      try
      {
        label19:
        if (this.b) {
          s.a().a(this.h, this, paramString);
        }
        for (;;)
        {
          try
          {
            label38:
            if (this.c != null)
            {
              if (this.d == null) {
                this.d = (net.youmi.android.c.b.e.a() + this.c);
              }
              paramWebView.loadUrl(this.d);
            }
          }
          catch (Throwable localThrowable2)
          {
            continue;
          }
          try
          {
            if (this.e != null) {
              w.a(this.h, paramWebView, this.e);
            }
            try
            {
              if (this.g != null) {
                this.g.onWebPageFinished(paramWebView, paramString);
              }
              return;
            }
            catch (Throwable paramWebView) {}
          }
          catch (Throwable localThrowable1) {}
        }
      }
      catch (Throwable localThrowable3)
      {
        break label38;
      }
    }
    catch (Throwable localThrowable4)
    {
      break label19;
    }
  }
  
  public void onWebPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    try
    {
      if (this.g != null) {
        this.g.onWebPageStarted(paramWebView, paramString, paramBitmap);
      }
      return;
    }
    catch (Throwable paramWebView) {}
  }
  
  public void onWebReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    try
    {
      if (this.g != null) {
        this.g.onWebReceivedError(paramWebView, paramInt, paramString1, paramString2);
      }
      return;
    }
    catch (Throwable paramWebView) {}
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    try
    {
      if (this.l != null) {
        if (!paramBoolean) {
          break label62;
        }
      }
      label62:
      for (int n = 1;; n = 0)
      {
        loadUrl("javascript:" + this.l + "(" + n + ");");
        return;
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    try
    {
      if (this.m != null) {
        loadUrl("javascript:" + this.m + "(" + paramInt + ");");
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  void setEnableOffersJsCodeLoader(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  void setEnableOffersJsFileLoader(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public void setUserAgentString(String paramString)
  {
    try
    {
      getSettings().setUserAgentString(paramString);
      return;
    }
    catch (Throwable paramString) {}
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (this.f != null) {
      return this.g.shouldOverrideUrlLoading(paramWebView, paramString);
    }
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.k.a.j
 * JD-Core Version:    0.7.0.1
 */