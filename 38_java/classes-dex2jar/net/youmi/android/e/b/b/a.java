package net.youmi.android.e.b.b;

import android.content.Context;
import net.youmi.android.e.b.a.j;

public abstract class a
{
  protected long a;
  protected j b;
  
  public a(j paramj)
  {
    this.b = paramj;
  }
  
  public void a(Context paramContext)
  {
    try
    {
      this.a = System.currentTimeMillis();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public abstract void b(Context paramContext);
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.e.b.b.a
 * JD-Core Version:    0.7.0.1
 */