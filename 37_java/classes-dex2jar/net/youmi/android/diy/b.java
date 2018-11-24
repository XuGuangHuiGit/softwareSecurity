package net.youmi.android.diy;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import net.youmi.android.a.h.f;
import net.youmi.android.a.h.l;
import net.youmi.android.a.k.a.h;
import net.youmi.android.a.k.a.j;
import net.youmi.android.diy.banner.DiyAdSize;

public class b
  extends RelativeLayout
  implements Runnable, net.youmi.android.a.h.a, net.youmi.android.a.h.b, net.youmi.android.a.k.a.d, h
{
  private net.youmi.android.diy.banner.a a;
  private RelativeLayout b;
  private j c;
  private l d;
  private boolean e = false;
  private int f = 0;
  private boolean g = false;
  private Context h;
  private DiyAdSize i = DiyAdSize.SIZE_MATCH_SCREENx60;
  private int j = 0;
  
  protected b(Context paramContext, DiyAdSize paramDiyAdSize, String paramString)
  {
    super(paramContext);
    try
    {
      this.h = paramContext.getApplicationContext();
      label40:
      this.i = paramDiyAdSize;
      paramDiyAdSize = new l(7, 405);
      paramDiyAdSize.b(1);
      paramDiyAdSize.e(paramString);
      this.d = paramDiyAdSize;
      paramDiyAdSize = new net.youmi.android.d.g.a(paramContext, this, paramDiyAdSize);
      paramString = new net.youmi.android.a.k.a.b();
      paramString.a(1);
      paramString.a(paramDiyAdSize);
      paramString.a(this);
      paramString.a(this);
      this.c = new j(paramContext, paramString, new net.youmi.android.diy.a.a(), this);
      a(paramContext);
      b(paramContext);
      this.c.setVisibility(4);
      this.a = new net.youmi.android.diy.banner.a(this);
      this.a.start();
      return;
    }
    catch (Throwable localThrowable)
    {
      break label40;
    }
  }
  
  private void a(Context paramContext)
  {
    try
    {
      this.c.setHorizontalScrollBarEnabled(false);
      this.c.setVerticalScrollBarEnabled(false);
      this.c.setBackgroundColor(0);
      setBackgroundColor(0);
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  private void b(Context paramContext)
  {
    int k = -1;
    this.b = new RelativeLayout(paramContext);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams.addRule(14);
    addView(this.b, localLayoutParams);
    paramContext = net.youmi.android.c.k.d.a(paramContext);
    if (this.i.getWidth() > 0) {
      k = paramContext.b(this.i.getWidth());
    }
    paramContext = new RelativeLayout.LayoutParams(k, paramContext.b(this.i.getHeight()));
    paramContext.addRule(14);
    this.b.addView(this.c, paramContext);
  }
  
  private void setCanShowAdNow(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public boolean canShowAdNow()
  {
    return this.g;
  }
  
  public boolean isInited()
  {
    return this.e;
  }
  
  public f js_SDK_Handler_ClearCurrentBrowserHistory()
  {
    return f.a;
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
  
  public void maybeNeedToInit()
  {
    try
    {
      if (!this.e)
      {
        if (this.f > 15)
        {
          this.e = true;
          return;
        }
        this.c.loadUrl(this.d.l());
        this.f += 1;
        return;
      }
    }
    catch (Throwable localThrowable) {}
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    try
    {
      setCanShowAdNow(true);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.e = true;
    try
    {
      setCanShowAdNow(false);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void onWebPageFinished(WebView paramWebView, String paramString) {}
  
  public void onWebPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap) {}
  
  public void onWebReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2) {}
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    try
    {
      setCanShowAdNow(paramBoolean);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public boolean proxyClearWebViewHistory()
  {
    try
    {
      if (this.c != null)
      {
        this.c.clearHistory();
        return true;
      }
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public boolean proxyCloseCurrentWindow()
  {
    return true;
  }
  
  public boolean proxyLoadUrl(String paramString)
  {
    try
    {
      if ((this.c != null) && (paramString != null))
      {
        this.c.loadUrl(paramString);
        return true;
      }
    }
    catch (Throwable paramString) {}
    return false;
  }
  
  public boolean proxyPostUrl(String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      if ((this.c != null) && (paramString != null))
      {
        this.c.postUrl(paramString, paramArrayOfByte);
        return true;
      }
    }
    catch (Throwable paramString) {}
    return false;
  }
  
  public boolean proxySetVisibility(int paramInt)
  {
    try
    {
      this.e = true;
      boolean bool = net.youmi.android.c.j.a.a().a(this);
      return bool;
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public void run()
  {
    try
    {
      this.c.setVisibility(this.j);
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
 * Qualified Name:     net.youmi.android.diy.b
 * JD-Core Version:    0.7.0.1
 */