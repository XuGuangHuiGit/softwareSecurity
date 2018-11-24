package net.youmi.android.smart;

import android.content.Context;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.LinearLayout;
import net.youmi.android.c.k.i;
import net.youmi.android.f.a.u;

public class a
{
  protected WindowManager a;
  protected LinearLayout b;
  protected g c;
  protected int d = -1;
  private Context e;
  private WindowManager.LayoutParams f;
  private int g;
  private boolean h = false;
  
  public a(Context paramContext, g paramg, int paramInt)
  {
    this.e = paramContext;
    this.c = paramg;
    this.c.setClickableToast(this);
    this.g = paramInt;
    b();
  }
  
  public boolean a()
  {
    return this.h;
  }
  
  public void b()
  {
    this.b = new LinearLayout(this.e);
    this.b.setBackgroundColor(0);
    this.a = ((WindowManager)this.e.getSystemService("window"));
    this.f = new WindowManager.LayoutParams();
    this.f.height = -2;
    this.f.width = -2;
    this.f.alpha = 1.0F;
    this.f.format = -2;
    this.f.gravity = this.g;
    try
    {
      if (i.i(this.e)) {}
      for (this.f.type = 2003;; this.f.type = 2005)
      {
        label116:
        this.f.flags = 40;
        this.b.addView(this.c);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      break label116;
    }
  }
  
  public void c()
  {
    try
    {
      net.youmi.android.c.e.a.a(u.a, "展示SmartBanner", new Object[0]);
      this.a.addView(this.b, this.f);
      this.h = true;
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void d()
  {
    try
    {
      this.h = false;
      this.b.setVisibility(4);
      this.a.removeView(this.b);
      this.b.removeView(this.c);
      this.c = null;
      this.b = null;
      return;
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.smart.a
 * JD-Core Version:    0.7.0.1
 */