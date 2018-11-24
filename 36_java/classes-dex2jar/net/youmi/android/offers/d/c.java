package net.youmi.android.offers.d;

import android.content.Context;
import net.youmi.android.offers.OffersAdSize;

public class c
  extends a
{
  boolean e = false;
  private e f;
  
  public c(Context paramContext, OffersAdSize paramOffersAdSize, String paramString, e parame)
  {
    super(paramContext, paramOffersAdSize, paramString);
    this.f = parame;
    e();
  }
  
  protected void b()
  {
    super.b();
    try
    {
      this.f.b(getContext(), this);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void e()
  {
    net.youmi.android.a.h.c.b.a.a().a(this.a);
  }
  
  protected void f()
  {
    for (;;)
    {
      int i;
      int j;
      int k;
      int m;
      try
      {
        net.youmi.android.c.k.d locald = net.youmi.android.c.k.d.a(getContext());
        i = this.d.getWidth();
        j = this.d.getHeight();
        k = locald.b();
        m = locald.c();
        if ((k <= m) || (i <= j)) {
          break label76;
        }
        return;
      }
      catch (Throwable localThrowable)
      {
        return;
      }
      ((b)this.d).a(j);
      ((b)this.d).b(i);
      return;
      label76:
      if (k < m) {
        if (i < j) {}
      }
    }
  }
  
  protected void onAttachedToWindow()
  {
    try
    {
      f();
      d();
      label8:
      super.onAttachedToWindow();
      return;
    }
    catch (Throwable localThrowable)
    {
      break label8;
    }
  }
  
  public boolean proxyCloseCurrentWindow()
  {
    this.e = false;
    boolean bool = super.proxyCloseCurrentWindow();
    net.youmi.android.c.j.a.a().a(new d(this));
    return bool;
  }
  
  public void run()
  {
    try
    {
      super.run();
      this.f.a(getContext(), this);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void startLoad()
  {
    try
    {
      this.c = 14;
      super.startLoad();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.d.c
 * JD-Core Version:    0.7.0.1
 */