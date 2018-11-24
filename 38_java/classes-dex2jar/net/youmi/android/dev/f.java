package net.youmi.android.dev;

import net.youmi.android.c.e.a;

class f
  implements Runnable
{
  f(e parame, String paramString) {}
  
  public void run()
  {
    try
    {
      if (this.a != null)
      {
        e.b(this.b).onGetOnlineConfigSuccessful(e.a(this.b), this.a);
        return;
      }
      e.b(this.b).onGetOnlineConfigFailed(e.a(this.b));
      return;
    }
    catch (Throwable localThrowable)
    {
      a.a(localThrowable);
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.dev.f
 * JD-Core Version:    0.7.0.1
 */