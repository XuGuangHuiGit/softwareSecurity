package net.youmi.android.offers.b.b.c;

import android.content.Context;

public class g
  implements Runnable
{
  private Context a;
  private String b;
  private int c;
  private int d;
  
  public g(Context paramContext, String paramString, int paramInt1, int paramInt2)
  {
    this.a = paramContext;
    this.b = paramString;
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public void run()
  {
    try
    {
      if (this.a != null)
      {
        if (this.b == null) {
          return;
        }
        f.a(this.a, this.b, this.c, this.d);
        return;
      }
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.b.b.c.g
 * JD-Core Version:    0.7.0.1
 */