package net.youmi.android.offers.b.b.c;

import net.youmi.android.offers.PointsChangeNotify;

public class a
  implements Runnable
{
  private PointsChangeNotify a;
  private int b;
  
  public a(PointsChangeNotify paramPointsChangeNotify, int paramInt)
  {
    this.a = paramPointsChangeNotify;
    this.b = paramInt;
  }
  
  public void run()
  {
    try
    {
      if (this.a != null) {
        this.a.onPointBalanceChange(this.b);
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.b.b.c.a
 * JD-Core Version:    0.7.0.1
 */