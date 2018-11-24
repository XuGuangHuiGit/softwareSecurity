package net.youmi.android.c.m;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.LinearLayout;
import net.youmi.android.c.k.i;

public class a
  implements Animation.AnimationListener
{
  private WindowManager a;
  private WindowManager.LayoutParams b;
  private LinearLayout c;
  private View d;
  
  public a(Context paramContext, View paramView, int paramInt)
  {
    this.a = ((WindowManager)paramContext.getSystemService("window"));
    this.b = new WindowManager.LayoutParams();
    this.b.flags = 40;
    this.b.gravity = paramInt;
    this.b.x = 0;
    this.b.y = 0;
    this.b.format = -2;
    try
    {
      if (i.i(paramContext)) {}
      for (this.b.type = 2003;; this.b.type = 2005)
      {
        label87:
        this.b.height = -2;
        this.b.width = -2;
        this.c = new LinearLayout(paramContext);
        this.d = paramView;
        this.c.addView(this.d);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      break label87;
    }
  }
  
  public void a(Animation paramAnimation)
  {
    if (paramAnimation == null) {
      return;
    }
    try
    {
      a();
      paramAnimation.setAnimationListener(this);
      this.d.startAnimation(paramAnimation);
      return;
    }
    catch (Throwable paramAnimation) {}
  }
  
  public boolean a()
  {
    try
    {
      this.a.addView(this.c, this.b);
      return true;
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public boolean b()
  {
    try
    {
      this.a.removeView(this.c);
      return true;
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    try
    {
      b();
      return;
    }
    catch (Throwable paramAnimation) {}
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.m.a
 * JD-Core Version:    0.7.0.1
 */