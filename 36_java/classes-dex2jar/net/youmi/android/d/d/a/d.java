package net.youmi.android.d.d.a;

import android.content.Context;
import net.youmi.android.a.h.j;
import net.youmi.android.d.b.a;

public class d
  extends Thread
{
  private Context a;
  private j b;
  private int[] c;
  
  public d(Context paramContext, j paramj, int paramInt)
  {
    this.a = paramContext.getApplicationContext();
    this.b = paramj;
    this.c = new int[] { paramInt };
  }
  
  public d(Context paramContext, j paramj, int[] paramArrayOfInt)
  {
    this.a = paramContext.getApplicationContext();
    this.b = paramj;
    this.c = paramArrayOfInt;
  }
  
  public void run()
  {
    super.run();
    for (;;)
    {
      try
      {
        if (this.c != null) {
          break label63;
        }
        return;
      }
      catch (Throwable localThrowable) {}
      if (i < this.c.length)
      {
        int j = this.c[i];
        String str = a.a(this.a, this.b, j);
        if (str != null)
        {
          a.a(this.a, str);
          i += 1;
          continue;
        }
      }
      return;
      label63:
      int i = 0;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.d.a.d
 * JD-Core Version:    0.7.0.1
 */