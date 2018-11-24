package net.youmi.android.d.c;

import android.content.Context;
import net.youmi.android.d.b.a;

class d
  extends Thread
{
  Context a;
  
  d(Context paramContext)
  {
    try
    {
      this.a = paramContext.getApplicationContext();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public void run()
  {
    super.run();
    try
    {
      if (this.a == null) {
        return;
      }
      String str = a.a(this.a);
      if (str != null)
      {
        a.a(this.a, str);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      localThrowable = localThrowable;
      return;
    }
    finally {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.c.d
 * JD-Core Version:    0.7.0.1
 */