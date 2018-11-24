package net.youmi.android.a.j;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;

public class a
{
  private net.youmi.android.c.m.a a;
  private Animation b;
  
  private a(Context paramContext, View paramView, int paramInt, Animation paramAnimation)
  {
    this.a = new net.youmi.android.c.m.a(paramContext, paramView, paramInt);
    this.b = paramAnimation;
  }
  
  public static a a(Context paramContext, View paramView, int paramInt)
  {
    return new a(paramContext, paramView, 49, net.youmi.android.c.a.a.a(paramContext, 800, paramInt, 950));
  }
  
  public static a b(Context paramContext, View paramView, int paramInt)
  {
    return new a(paramContext, paramView, 17, net.youmi.android.c.a.a.b(paramContext, 420, paramInt, 230));
  }
  
  public void a()
  {
    try
    {
      this.a.a(this.b);
      return;
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.j.a
 * JD-Core Version:    0.7.0.1
 */