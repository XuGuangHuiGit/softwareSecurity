package net.youmi.android.a.f;

import android.content.Context;

public class b
  extends net.youmi.android.e.b.a.b
{
  private static b a;
  
  private b(Context paramContext, net.youmi.android.c.f.a parama)
  {
    super(paramContext, parama);
  }
  
  public static b a(Context paramContext)
  {
    try
    {
      if (a == null)
      {
        paramContext = paramContext.getApplicationContext();
        a = new b(paramContext, net.youmi.android.a.g.a.c(paramContext, 1));
      }
      label27:
      return a;
    }
    catch (Throwable paramContext)
    {
      break label27;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.f.b
 * JD-Core Version:    0.7.0.1
 */