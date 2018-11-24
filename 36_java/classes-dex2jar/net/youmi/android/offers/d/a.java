package net.youmi.android.offers.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import net.youmi.android.a.h.l;
import net.youmi.android.a.k.a.j;
import net.youmi.android.offers.OffersAdSize;

public class a
  extends RelativeLayout
  implements Runnable, net.youmi.android.a.h.a, net.youmi.android.a.h.b, net.youmi.android.a.k.a.d, net.youmi.android.a.k.a.h
{
  protected j a;
  protected boolean b = false;
  protected int c = 0;
  protected OffersAdSize d = OffersAdSize.SIZE_MATCH_SCREENx60;
  private f e;
  private RelativeLayout f;
  private l g;
  private boolean h = false;
  private Context i;
  private int j = 0;
  
  protected a(Context paramContext, OffersAdSize paramOffersAdSize, String paramString)
  {
    super(paramContext);
    try
    {
      this.i = paramContext.getApplicationContext();
      label40:
      this.d = paramOffersAdSize;
      paramOffersAdSize = new l(3, 405);
      paramOffersAdSize.b(1);
      paramOffersAdSize.e(paramString);
      this.g = paramOffersAdSize;
      paramOffersAdSize = new net.youmi.android.d.g.a(paramContext, this, paramOffersAdSize);
      paramString = new net.youmi.android.a.k.a.b();
      paramString.a(1);
      paramString.a(paramOffersAdSize);
      paramString.a(this);
      paramString.a(this);
      this.a = new j(paramContext, paramString, new net.youmi.android.offers.b.a.a(), this);
      a(paramContext);
      b(paramContext);
      this.a.setVisibility(8);
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
      this.a.setHorizontalScrollBarEnabled(false);
      this.a.setVerticalScrollBarEnabled(false);
      this.a.setBackgroundColor(0);
      setBackgroundColor(0);
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  private void b(Context paramContext)
  {
    this.f = new RelativeLayout(paramContext);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams.addRule(14);
    addView(this.f, localLayoutParams);
    paramContext = net.youmi.android.c.k.d.a(paramContext);
    int m = this.d.getWidth();
    int k;
    int n;
    if (m > 0)
    {
      k = paramContext.b(this.d.getWidth());
      n = this.d.getHeight();
      if (n <= 0) {
        break label146;
      }
      m = paramContext.b(this.d.getHeight());
    }
    for (;;)
    {
      paramContext = new RelativeLayout.LayoutParams(k, m);
      paramContext.addRule(14);
      this.f.addView(this.a, paramContext);
      return;
      k = m;
      if (m != -3) {
        break;
      }
      k = paramContext.b(paramContext.b());
      break;
      label146:
      m = n;
      if (n == -3) {
        m = paramContext.b(paramContext.c());
      }
    }
  }
  
  private void setCanShowAdNow(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  boolean a()
  {
    return this.b;
  }
  
  protected void b() {}
  
  void c()
  {
    try
    {
      if (!this.b)
      {
        if (this.c > 15)
        {
          this.b = true;
          b();
          return;
        }
        this.a.loadUrl(this.g.l());
        this.c += 1;
        return;
      }
    }
    catch (Throwable localThrowable) {}
  }
  
  public boolean canShowAdNow()
  {
    return this.h;
  }
  
  protected void d()
  {
    try
    {
      Object localObject = net.youmi.android.c.k.d.a(getContext());
      int k = this.d.getWidth();
      if (k > 0) {
        k = ((net.youmi.android.c.k.d)localObject).b(this.d.getWidth());
      }
      for (;;)
      {
        int n = this.d.getHeight();
        int m;
        if (n > 0) {
          m = ((net.youmi.android.c.k.d)localObject).b(this.d.getHeight());
        }
        for (;;)
        {
          localObject = this.a.getLayoutParams();
          ((ViewGroup.LayoutParams)localObject).width = k;
          ((ViewGroup.LayoutParams)localObject).height = m;
          return;
          if (k != -3) {
            break label126;
          }
          k = ((net.youmi.android.c.k.d)localObject).b(((net.youmi.android.c.k.d)localObject).b());
          break;
          m = n;
          if (n == -3) {
            m = ((net.youmi.android.c.k.d)localObject).b(((net.youmi.android.c.k.d)localObject).c());
          }
        }
      }
    }
    catch (Throwable localThrowable) {}
  }
  
  public net.youmi.android.a.h.f js_SDK_Handler_ClearCurrentBrowserHistory()
  {
    return net.youmi.android.a.h.f.a;
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
    this.e.a();
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
    d();
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
      if (this.a != null)
      {
        this.a.clearHistory();
        return true;
      }
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public boolean proxyCloseCurrentWindow()
  {
    this.e.a();
    this.b = false;
    return true;
  }
  
  public boolean proxyLoadUrl(String paramString)
  {
    try
    {
      net.youmi.android.offers.b.b.c.h.a(this.i);
      try
      {
        label7:
        if ((this.a != null) && (paramString != null))
        {
          this.a.loadUrl(paramString);
          return true;
        }
      }
      catch (Throwable paramString) {}
      return false;
    }
    catch (Throwable localThrowable)
    {
      break label7;
    }
  }
  
  public boolean proxyPostUrl(String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      net.youmi.android.offers.b.b.c.h.a(this.i);
      try
      {
        label7:
        if ((this.a != null) && (paramString != null))
        {
          this.a.postUrl(paramString, paramArrayOfByte);
          return true;
        }
      }
      catch (Throwable paramString) {}
      return false;
    }
    catch (Throwable localThrowable)
    {
      break label7;
    }
  }
  
  public boolean proxySetVisibility(int paramInt)
  {
    try
    {
      this.b = true;
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
      this.a.setVisibility(this.j);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    return false;
  }
  
  /* Error */
  public void startLoad()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 210	net/youmi/android/offers/d/a:e	Lnet/youmi/android/offers/d/f;
    //   6: ifnonnull +15 -> 21
    //   9: aload_0
    //   10: new 212	net/youmi/android/offers/d/f
    //   13: dup
    //   14: aload_0
    //   15: invokespecial 250	net/youmi/android/offers/d/f:<init>	(Lnet/youmi/android/offers/d/a;)V
    //   18: putfield 210	net/youmi/android/offers/d/a:e	Lnet/youmi/android/offers/d/f;
    //   21: aload_0
    //   22: iconst_0
    //   23: putfield 41	net/youmi/android/offers/d/a:b	Z
    //   26: aload_0
    //   27: getfield 210	net/youmi/android/offers/d/a:e	Lnet/youmi/android/offers/d/f;
    //   30: invokevirtual 251	net/youmi/android/offers/d/f:b	()V
    //   33: aload_0
    //   34: monitorexit
    //   35: return
    //   36: astore_1
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_1
    //   40: athrow
    //   41: astore_1
    //   42: goto -9 -> 33
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	a
    //   36	4	1	localObject	Object
    //   41	1	1	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   2	21	36	finally
    //   21	33	36	finally
    //   2	21	41	java/lang/Throwable
    //   21	33	41	java/lang/Throwable
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.d.a
 * JD-Core Version:    0.7.0.1
 */