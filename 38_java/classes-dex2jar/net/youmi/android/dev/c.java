package net.youmi.android.dev;

import android.content.Context;

public class c
  extends Thread
{
  private CheckAppUpdateCallBack a;
  private Context b;
  
  public c(Context paramContext, CheckAppUpdateCallBack paramCheckAppUpdateCallBack)
  {
    this.b = paramContext.getApplicationContext();
    if ((paramCheckAppUpdateCallBack == null) || (this.b == null)) {
      throw new NullPointerException();
    }
    this.a = paramCheckAppUpdateCallBack;
  }
  
  private void a(AppUpdateInfo paramAppUpdateInfo)
  {
    try
    {
      net.youmi.android.c.j.a.a().a(new d(this, paramAppUpdateInfo));
      return;
    }
    catch (Throwable paramAppUpdateInfo)
    {
      net.youmi.android.c.e.a.a(paramAppUpdateInfo);
    }
  }
  
  public void run()
  {
    super.run();
    try
    {
      a(b.b(this.b));
      return;
    }
    catch (Throwable localThrowable)
    {
      net.youmi.android.c.e.a.a(localThrowable);
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.dev.c
 * JD-Core Version:    0.7.0.1
 */