package net.youmi.android.offers.b.b.c;

import java.util.HashSet;
import java.util.Iterator;
import net.youmi.android.a.h.c.b.a;
import net.youmi.android.a.h.o;
import net.youmi.android.offers.PointsChangeNotify;

public class c
  implements PointsChangeNotify
{
  private static c a;
  private HashSet b = new HashSet();
  
  public static c a()
  {
    try
    {
      if (a == null) {
        a = new c();
      }
      c localc = a;
      return localc;
    }
    finally {}
  }
  
  public void a(String paramString1, String paramString2)
  {
    if ((paramString2 == null) || (paramString1 == null)) {}
    for (;;)
    {
      return;
      try
      {
        paramString1 = new o(paramString1, paramString2);
        if (paramString1.d())
        {
          this.b.add(paramString1);
          return;
        }
      }
      catch (Throwable paramString1) {}
    }
  }
  
  public void onPointBalanceChange(int paramInt)
  {
    try
    {
      if (this.b == null) {
        return;
      }
      if (this.b.size() > 0)
      {
        Iterator localIterator = this.b.iterator();
        if (localIterator != null)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          for (;;)
          {
            boolean bool = localIterator.hasNext();
            if (!bool) {
              break;
            }
            try
            {
              if (localStringBuilder.length() > 0) {
                localStringBuilder.delete(0, localStringBuilder.length());
              }
              o localo = (o)localIterator.next();
              if (localo.d())
              {
                String str = "javascript:" + localo.c() + '(' + paramInt + ");";
                a.a().a(localo.a(), str);
              }
            }
            catch (Throwable localThrowable2) {}
          }
        }
      }
      return;
    }
    catch (Throwable localThrowable1) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.b.b.c.c
 * JD-Core Version:    0.7.0.1
 */