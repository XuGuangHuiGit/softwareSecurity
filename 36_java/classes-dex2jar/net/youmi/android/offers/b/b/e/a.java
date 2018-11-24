package net.youmi.android.offers.b.b.e;

import android.content.Context;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import net.youmi.android.c.k.i;
import net.youmi.android.offers.b;

public class a
  implements Animation.AnimationListener, b
{
  private static a e;
  LinearLayout a;
  LinearLayout.LayoutParams b;
  private Context c;
  private net.youmi.android.offers.a d;
  private WindowManager f;
  private WindowManager.LayoutParams g;
  private Animation h;
  private Animation i;
  private int j;
  private Animation k;
  private Animation l;
  private Animation m;
  private Animation n;
  private boolean o = false;
  
  private a(Context paramContext)
  {
    this.c = paramContext.getApplicationContext();
    this.f = ((WindowManager)paramContext.getSystemService("window"));
    this.g = new WindowManager.LayoutParams();
    this.a = new LinearLayout(paramContext);
    this.b = new LinearLayout.LayoutParams(-2, -2);
    b();
    c();
  }
  
  public static a a(Context paramContext)
  {
    try
    {
      if (e == null) {
        e = new a(paramContext);
      }
      paramContext = e;
      return paramContext;
    }
    finally {}
  }
  
  private void b()
  {
    this.g.flags = 40;
    this.g.x = 0;
    this.g.y = 0;
    this.g.format = -2;
    try
    {
      if (i.i(this.c)) {}
      for (this.g.type = 2003;; this.g.type = 2005)
      {
        label54:
        this.g.height = -2;
        this.g.width = -2;
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      break label54;
    }
  }
  
  private void c()
  {
    this.k = net.youmi.android.c.a.a.c(this.c, 420);
    this.l = net.youmi.android.c.a.a.d(this.c, 330);
    this.l.setAnimationListener(this);
    this.m = net.youmi.android.c.a.a.a(this.c, 800);
    this.n = net.youmi.android.c.a.a.b(this.c, 950);
    this.n.setAnimationListener(this);
  }
  
  /* Error */
  private void d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 69	net/youmi/android/offers/b/b/e/a:a	Landroid/widget/LinearLayout;
    //   6: invokevirtual 141	android/widget/LinearLayout:removeAllViews	()V
    //   9: aload_0
    //   10: getfield 40	net/youmi/android/offers/b/b/e/a:o	Z
    //   13: ifeq +21 -> 34
    //   16: aload_0
    //   17: getfield 58	net/youmi/android/offers/b/b/e/a:f	Landroid/view/WindowManager;
    //   20: aload_0
    //   21: getfield 69	net/youmi/android/offers/b/b/e/a:a	Landroid/widget/LinearLayout;
    //   24: invokeinterface 145 2 0
    //   29: aload_0
    //   30: iconst_0
    //   31: putfield 40	net/youmi/android/offers/b/b/e/a:o	Z
    //   34: aload_0
    //   35: monitorexit
    //   36: return
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    //   42: astore_1
    //   43: goto -9 -> 34
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	this	a
    //   37	4	1	localObject	Object
    //   42	1	1	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   2	34	37	finally
    //   2	34	42	java/lang/Throwable
  }
  
  public void a()
  {
    try
    {
      a(0);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(int paramInt)
  {
    for (;;)
    {
      try
      {
        this.j = paramInt;
        switch (this.j)
        {
        case 1: 
          this.g.gravity = 17;
          this.h = this.k;
          this.i = this.l;
          if (this.d == null) {
            this.d = new net.youmi.android.offers.a(this.c, this);
          }
          if (!this.o) {
            break label128;
          }
          net.youmi.android.c.e.a.d("Spot has Showed on Screen", new Object[0]);
          return;
        }
      }
      finally {}
      this.g.gravity = 49;
      this.h = this.m;
      this.i = this.n;
      continue;
      label128:
      this.d.a();
    }
  }
  
  /* Error */
  public void a(Context paramContext, net.youmi.android.offers.a parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 180	java/lang/System:currentTimeMillis	()J
    //   5: pop2
    //   6: aload_0
    //   7: invokespecial 182	net/youmi/android/offers/b/b/e/a:d	()V
    //   10: aload_0
    //   11: iconst_1
    //   12: putfield 40	net/youmi/android/offers/b/b/e/a:o	Z
    //   15: aload_0
    //   16: getfield 69	net/youmi/android/offers/b/b/e/a:a	Landroid/widget/LinearLayout;
    //   19: aload_2
    //   20: aload_0
    //   21: getfield 76	net/youmi/android/offers/b/b/e/a:b	Landroid/widget/LinearLayout$LayoutParams;
    //   24: invokevirtual 186	android/widget/LinearLayout:addView	(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   27: aload_0
    //   28: getfield 58	net/youmi/android/offers/b/b/e/a:f	Landroid/view/WindowManager;
    //   31: aload_0
    //   32: getfield 69	net/youmi/android/offers/b/b/e/a:a	Landroid/widget/LinearLayout;
    //   35: aload_0
    //   36: getfield 63	net/youmi/android/offers/b/b/e/a:g	Landroid/view/WindowManager$LayoutParams;
    //   39: invokeinterface 187 3 0
    //   44: aload_0
    //   45: getfield 155	net/youmi/android/offers/b/b/e/a:h	Landroid/view/animation/Animation;
    //   48: ifnull +11 -> 59
    //   51: aload_2
    //   52: aload_0
    //   53: getfield 155	net/youmi/android/offers/b/b/e/a:h	Landroid/view/animation/Animation;
    //   56: invokevirtual 191	net/youmi/android/offers/a:startAnimation	(Landroid/view/animation/Animation;)V
    //   59: aload_0
    //   60: monitorexit
    //   61: return
    //   62: astore_1
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_1
    //   66: athrow
    //   67: astore_1
    //   68: goto -9 -> 59
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	this	a
    //   0	71	1	paramContext	Context
    //   0	71	2	parama	net.youmi.android.offers.a
    // Exception table:
    //   from	to	target	type
    //   2	59	62	finally
    //   2	59	67	java/lang/Throwable
  }
  
  public void b(Context paramContext, net.youmi.android.offers.a parama)
  {
    try
    {
      d();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    try
    {
      d();
      return;
    }
    catch (Throwable paramAnimation) {}
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.b.b.e.a
 * JD-Core Version:    0.7.0.1
 */