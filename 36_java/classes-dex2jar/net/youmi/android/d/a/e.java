package net.youmi.android.d.a;

import java.io.File;
import net.youmi.android.a.h.i;
import net.youmi.android.a.h.o;
import net.youmi.android.c.h.j;
import net.youmi.android.c.k.k;
import net.youmi.android.e.b.b;
import net.youmi.android.e.b.c;
import org.json.JSONObject;

class e
  implements c
{
  private a a;
  
  e(a parama)
  {
    this.a = parama;
  }
  
  private void a(i parami, o paramo, int paramInt1, int paramInt2, long paramLong)
  {
    if (parami == null) {}
    for (;;)
    {
      return;
      if (paramo != null) {
        try
        {
          if (paramo.c() != null)
          {
            JSONObject localJSONObject = new JSONObject();
            localJSONObject.put("a", parami.e().a());
            localJSONObject.put("b", paramInt1);
            if (paramInt2 >= 0) {
              localJSONObject.put("c", paramInt2);
            }
            if (paramLong >= 0L) {
              localJSONObject.put("d", paramLong);
            }
            parami = new StringBuilder();
            parami.append("javascript:");
            parami.append(paramo.c()).append("(").append(paramo.b()).append(",").append(localJSONObject.toString()).append(")");
            net.youmi.android.a.h.c.b.a.a().a(paramo.a(), parami.toString());
            return;
          }
        }
        catch (Throwable parami) {}
      }
    }
  }
  
  private void a(b paramb, int paramInt1, int paramInt2, long paramLong)
  {
    try
    {
      if (this.a == null) {
        return;
      }
      a(this.a.e(paramb), this.a.d(paramb), paramInt1, paramInt2, paramLong);
      return;
    }
    catch (Throwable paramb) {}
  }
  
  public void a(i parami, o paramo)
  {
    try
    {
      a(parami, paramo, 3, -1, -1L);
      return;
    }
    catch (Throwable parami) {}
  }
  
  public void a(b paramb)
  {
    int j = 0;
    for (int i = j;; i = 6)
    {
      try
      {
        if (j.a(this.a.c()))
        {
          long l2 = paramb.d();
          long l1 = l2;
          if (l2 <= 0L) {
            l1 = 10485760L;
          }
          boolean bool = k.a(this.a.c(), l1);
          if (!bool) {
            break label71;
          }
          i = j;
        }
      }
      catch (Throwable localThrowable)
      {
        for (;;)
        {
          label71:
          i = 0;
        }
      }
      try
      {
        a(paramb, i, -1, -1L);
        return;
      }
      catch (Throwable paramb) {}
    }
  }
  
  public void a(b paramb, long paramLong1, long paramLong2, int paramInt, long paramLong3)
  {
    try
    {
      a(paramb, 2, paramInt, paramLong3);
      return;
    }
    catch (Throwable paramb) {}
  }
  
  public void a(b paramb, File paramFile)
  {
    try
    {
      a(paramb, 1, -1, -1L);
      return;
    }
    catch (Throwable paramb) {}
  }
  
  public void b(b paramb)
  {
    try
    {
      a(paramb, 5, -1, -1L);
      return;
    }
    catch (Throwable paramb) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.a.e
 * JD-Core Version:    0.7.0.1
 */