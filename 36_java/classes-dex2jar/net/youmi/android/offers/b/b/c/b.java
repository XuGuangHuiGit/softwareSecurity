package net.youmi.android.offers.b.b.c;

import android.content.Context;
import java.util.List;
import net.youmi.android.offers.PointsChangeNotify;

public class b
  extends net.youmi.android.c.l.a
{
  private static b b;
  private Context a;
  
  public b(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
    if (this.a == null) {
      throw new NullPointerException("Context is null");
    }
  }
  
  public static b a(Context paramContext)
  {
    try
    {
      if (b == null) {
        b = new b(paramContext);
      }
      if (b == null) {
        throw new NullPointerException("Context is null");
      }
    }
    finally {}
    paramContext = b;
    return paramContext;
  }
  
  void a()
  {
    try
    {
      i = d.a(this.a).a();
      c.a().onPointBalanceChange(i);
      try
      {
        List localList = b();
        if ((localList != null) && (localList.size() > 0))
        {
          int j = d.a(this.a).a();
          i = 0;
          int k = localList.size();
          if (i < k) {
            try
            {
              PointsChangeNotify localPointsChangeNotify = (PointsChangeNotify)localList.get(i);
              if (localPointsChangeNotify == null) {
                break label133;
              }
              if (net.youmi.android.c.j.a.b()) {
                localPointsChangeNotify.onPointBalanceChange(j);
              } else {
                net.youmi.android.c.j.a.a().a(new a(localPointsChangeNotify, j));
              }
            }
            catch (Throwable localThrowable3) {}
          }
        }
        return;
      }
      catch (Throwable localThrowable1) {}
    }
    catch (Throwable localThrowable2)
    {
      for (;;)
      {
        int i;
        continue;
        label133:
        i += 1;
      }
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.b.b.c.b
 * JD-Core Version:    0.7.0.1
 */