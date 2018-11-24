package net.youmi.android.a.h.c.b;

import java.util.HashSet;
import java.util.Iterator;
import net.youmi.android.a.h.c;

public class a
  implements c
{
  private static a a;
  private HashSet b;
  
  public static a a()
  {
    if (a == null) {
      a = new a();
    }
    return a;
  }
  
  private HashSet b()
  {
    try
    {
      if (this.b == null) {
        this.b = new HashSet();
      }
      HashSet localHashSet = this.b;
      return localHashSet;
    }
    finally {}
  }
  
  public void a(String paramString1, String paramString2)
  {
    for (;;)
    {
      try
      {
        localIterator = b().iterator();
        i = 0;
      }
      catch (Throwable paramString1)
      {
        try
        {
          Iterator localIterator;
          boolean bool;
          c localc = (c)localIterator.next();
          int k = i + 1;
          i = k;
          if (localc == null) {
            continue;
          }
          j = k;
          if (net.youmi.android.c.j.a.b())
          {
            j = k;
            localc.a(paramString1, paramString2);
            i = k;
            continue;
          }
          j = k;
          net.youmi.android.c.j.a.a().a(new b(this, localc, paramString1, paramString2));
          i = k;
        }
        catch (Throwable localThrowable)
        {
          int j;
          int i = j;
        }
        paramString1 = paramString1;
      }
      bool = localIterator.hasNext();
      if (bool) {
        j = i;
      }
      return;
    }
  }
  
  public void a(c paramc)
  {
    if (paramc != null) {}
    try
    {
      HashSet localHashSet = b();
      if (localHashSet != null) {
        localHashSet.add(paramc);
      }
      return;
    }
    catch (Throwable paramc) {}
  }
  
  public void b(c paramc)
  {
    if (paramc != null) {}
    try
    {
      HashSet localHashSet = b();
      if (localHashSet != null) {
        localHashSet.remove(paramc);
      }
      return;
    }
    catch (Throwable paramc) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.c.b.a
 * JD-Core Version:    0.7.0.1
 */