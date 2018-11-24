package net.youmi.android.diy.banner;

public class a
  extends Thread
{
  private net.youmi.android.diy.b a;
  
  public a(net.youmi.android.diy.b paramb)
  {
    this.a = paramb;
  }
  
  public void run()
  {
    super.run();
    for (;;)
    {
      int i;
      try
      {
        if (this.a != null) {
          break label56;
        }
        return;
      }
      catch (Throwable localThrowable2) {}
      if (!this.a.isInited())
      {
        i += 1;
        net.youmi.android.c.j.a.a().a(new b(this));
        try
        {
          Thread.sleep(20000L);
        }
        catch (Throwable localThrowable1) {}
      }
      else
      {
        return;
        label56:
        i = 0;
      }
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.diy.banner.a
 * JD-Core Version:    0.7.0.1
 */