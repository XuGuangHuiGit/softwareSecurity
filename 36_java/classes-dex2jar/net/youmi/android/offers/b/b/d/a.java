package net.youmi.android.offers.b.b.d;

import android.content.Context;

public class a
{
  private static b a;
  
  public static void a()
  {
    a = null;
  }
  
  public static void a(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getApplicationContext();
      if (a == null) {
        a = new b(paramContext);
      }
      a.a();
      return;
    }
    catch (Throwable paramContext) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.b.b.d.a
 * JD-Core Version:    0.7.0.1
 */