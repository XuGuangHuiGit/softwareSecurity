package net.youmi.android.offers.d;

public class g
  extends Thread
{
  private a a;
  private boolean b = false;
  
  public g(a parama)
  {
    this.a = parama;
  }
  
  public void a()
  {
    try
    {
      this.b = false;
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void run()
  {
    try
    {
      a locala = this.a;
      if (locala == null) {
        return;
      }
      this.b = true;
      int i = 0;
      while ((!this.a.a()) && (this.b))
      {
        i += 1;
        net.youmi.android.c.j.a.a().a(new h(this));
        try
        {
          Thread.sleep(20000L);
        }
        catch (Throwable localThrowable1) {}
      }
      return;
    }
    catch (Throwable localThrowable2) {}finally
    {
      this.b = false;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.d.g
 * JD-Core Version:    0.7.0.1
 */