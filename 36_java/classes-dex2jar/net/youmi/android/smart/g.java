package net.youmi.android.smart;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import net.youmi.android.a.h.e;
import net.youmi.android.a.h.f;
import net.youmi.android.a.h.l;
import net.youmi.android.a.k.a.j;

public class g
  extends RelativeLayout
  implements Runnable, net.youmi.android.a.h.a, net.youmi.android.a.h.b, net.youmi.android.a.k.a.d, net.youmi.android.a.k.a.h
{
  private RelativeLayout a;
  private j b;
  private l c;
  private boolean d = false;
  private boolean e = false;
  private Context f;
  private int g;
  private int h;
  private String i;
  private a j;
  private int k = 0;
  
  public g(Context paramContext, int paramInt1, int paramInt2, String paramString1, String paramString2, int paramInt3)
  {
    super(paramContext);
    try
    {
      this.f = paramContext.getApplicationContext();
      label28:
      this.i = paramString2;
      this.g = paramInt1;
      this.h = paramInt2;
      Object localObject = new l(7, 405);
      ((l)localObject).b(1);
      ((l)localObject).e(paramString1);
      this.c = ((l)localObject);
      localObject = new net.youmi.android.smart.b.b(paramContext, this, (l)localObject, paramInt3);
      net.youmi.android.a.k.a.b localb = new net.youmi.android.a.k.a.b();
      localb.a(1);
      localb.a((e)localObject);
      localb.a(this);
      localb.a(this);
      localb.a(paramString2);
      this.b = new j(paramContext, localb, new net.youmi.android.smart.b.a(), this);
      a(paramContext);
      b(paramContext);
      this.b.setVisibility(4);
      proxyLoadUrl(paramString1);
      return;
    }
    catch (Throwable localThrowable)
    {
      break label28;
    }
  }
  
  private void a(Context paramContext)
  {
    try
    {
      this.b.setHorizontalScrollBarEnabled(false);
      this.b.setVerticalScrollBarEnabled(false);
      this.b.setBackgroundColor(0);
      setBackgroundColor(0);
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  private void b(Context paramContext)
  {
    this.a = new RelativeLayout(paramContext);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams.addRule(14);
    addView(this.a, localLayoutParams);
    net.youmi.android.c.k.d.a(paramContext);
    paramContext = new RelativeLayout.LayoutParams(this.g, this.h);
    paramContext.addRule(14);
    this.a.addView(this.b, paramContext);
  }
  
  private void setCanShowAdNow(boolean paramBoolean)
  {
    this.e = paramBoolean;
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
    this.d = true;
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
      if (this.b != null)
      {
        this.b.clearHistory();
        return true;
      }
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public boolean proxyCloseCurrentWindow()
  {
    try
    {
      new Handler(Looper.getMainLooper()).post(new h(this));
      return true;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        net.youmi.android.c.e.b.a("proxyCloseCurrentWindow : " + localThrowable);
      }
    }
  }
  
  public boolean proxyLoadUrl(String paramString)
  {
    try
    {
      if ((this.b != null) && (paramString != null))
      {
        this.b.loadUrl(paramString);
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
      if ((this.b != null) && (paramString != null))
      {
        this.b.postUrl(paramString, paramArrayOfByte);
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
      this.d = true;
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
      this.j.c();
      this.b.setVisibility(this.k);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void setClickableToast(a parama)
  {
    this.j = parama;
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.smart.g
 * JD-Core Version:    0.7.0.1
 */