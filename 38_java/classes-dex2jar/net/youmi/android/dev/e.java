package net.youmi.android.dev;

import android.content.Context;

public class e
  extends Thread
{
  private OnlineConfigCallBack a;
  private Context b;
  private String c;
  
  public e(Context paramContext, OnlineConfigCallBack paramOnlineConfigCallBack, String paramString)
  {
    this.b = paramContext.getApplicationContext();
    paramContext = net.youmi.android.c.b.e.b(paramString);
    if ((paramOnlineConfigCallBack == null) || (this.b == null) || (paramContext == null)) {
      throw new NullPointerException();
    }
    this.a = paramOnlineConfigCallBack;
    this.c = paramContext;
  }
  
  private void a(String paramString)
  {
    try
    {
      net.youmi.android.c.j.a.a().a(new f(this, paramString));
      return;
    }
    catch (Throwable paramString)
    {
      net.youmi.android.c.e.a.a(paramString);
    }
  }
  
  public void run()
  {
    super.run();
    try
    {
      a(net.youmi.android.a.e.a.a.a(this.b, this.c, null));
      return;
    }
    catch (Throwable localThrowable)
    {
      net.youmi.android.c.e.a.a(localThrowable);
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.dev.e
 * JD-Core Version:    0.7.0.1
 */