package net.youmi.android.offers.b.b.d;

import android.content.Context;
import net.youmi.android.a.h.e;
import net.youmi.android.a.h.f;
import net.youmi.android.a.h.l;
import net.youmi.android.a.k.a.d;
import net.youmi.android.a.k.a.j;

public class b
  implements net.youmi.android.a.h.b, d
{
  private j a;
  private l b;
  
  public b(Context paramContext)
  {
    Object localObject = new l(3, 405);
    ((l)localObject).b(1);
    ((l)localObject).e(net.youmi.android.offers.a.a.c() + "?type=" + b());
    this.b = ((l)localObject);
    localObject = new net.youmi.android.d.g.a(paramContext, this, (l)localObject);
    net.youmi.android.a.k.a.b localb = new net.youmi.android.a.k.a.b();
    localb.a(1);
    localb.a((e)localObject);
    localb.a(this);
    this.a = new j(paramContext, localb);
    net.youmi.android.a.h.c.b.a.a().a(this.a);
  }
  
  private static int b()
  {
    return 39;
  }
  
  public void a()
  {
    try
    {
      String str = this.b.l();
      this.a.loadUrl(str);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public f js_SDK_Handler_ClearCurrentBrowserHistory()
  {
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
    a.a();
    return true;
  }
  
  public boolean proxyLoadUrl(String paramString)
  {
    try
    {
      if ((this.a != null) && (paramString != null))
      {
        this.a.loadUrl(paramString);
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
      if ((this.a != null) && (paramString != null))
      {
        this.a.postUrl(paramString, paramArrayOfByte);
        return true;
      }
    }
    catch (Throwable paramString) {}
    return false;
  }
  
  public boolean proxySetVisibility(int paramInt)
  {
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.b.b.d.b
 * JD-Core Version:    0.7.0.1
 */