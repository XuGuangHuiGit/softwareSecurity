package net.youmi.android.offers;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import net.youmi.android.offers.d.c;
import net.youmi.android.offers.d.e;

public class a
  extends RelativeLayout
  implements e
{
  private c a;
  private b b;
  private boolean c = false;
  private long d = 0L;
  
  public a(Context paramContext, b paramb)
  {
    super(paramContext);
    if ((paramb == null) || (paramContext == null)) {
      throw new NullPointerException();
    }
    this.b = paramb;
    paramb = net.youmi.android.offers.a.a.d() + "?type=128";
    this.a = new c(paramContext, net.youmi.android.offers.d.b.a(paramContext, 0.95D), paramb, this);
    this.a.setVisibility(8);
    paramContext = new RelativeLayout.LayoutParams(-2, -2);
    addView(this.a, paramContext);
  }
  
  public void a()
  {
    for (;;)
    {
      try
      {
        if (this.c)
        {
          net.youmi.android.c.e.a.d("Offers Spot is Loading!", new Object[0]);
          return;
        }
        long l = System.currentTimeMillis();
        if (l - this.d < 5000L)
        {
          net.youmi.android.c.e.a.d("Offers Spot is Loading ! ", new Object[0]);
          continue;
        }
        this.d = l;
      }
      finally {}
      net.youmi.android.c.e.a.d("Start to Load Offers Spot!", new Object[0]);
      this.c = true;
      this.a.e();
      this.a.startLoad();
    }
  }
  
  public void a(Context paramContext, c paramc)
  {
    this.c = false;
    this.a.setVisibility(0);
    this.b.a(getContext(), this);
  }
  
  public void b(Context paramContext, c paramc)
  {
    this.c = false;
  }
  
  public void c(Context paramContext, c paramc)
  {
    this.b.b(getContext(), this);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      Toast.makeText(getContext(), "按什么后退键！--" + System.currentTimeMillis(), 0).show();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.a
 * JD-Core Version:    0.7.0.1
 */