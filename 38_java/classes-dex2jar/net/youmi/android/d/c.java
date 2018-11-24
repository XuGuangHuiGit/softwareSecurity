package net.youmi.android.d;

import android.app.Activity;
import net.youmi.android.a.h.p;

public class c
  implements Runnable
{
  private Activity a;
  private p b;
  
  public c(Activity paramActivity, p paramp)
  {
    this.a = paramActivity;
    this.b = paramp;
  }
  
  public void run()
  {
    try
    {
      a.b(this.a, this.b).show();
      return;
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.c
 * JD-Core Version:    0.7.0.1
 */