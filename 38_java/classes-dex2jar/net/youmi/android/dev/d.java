package net.youmi.android.dev;

import net.youmi.android.c.e.a;

class d
  implements Runnable
{
  d(c paramc, AppUpdateInfo paramAppUpdateInfo) {}
  
  public void run()
  {
    try
    {
      c.a(this.b).onCheckAppUpdateFinish(this.a);
      return;
    }
    catch (Throwable localThrowable)
    {
      a.a(localThrowable);
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.dev.d
 * JD-Core Version:    0.7.0.1
 */