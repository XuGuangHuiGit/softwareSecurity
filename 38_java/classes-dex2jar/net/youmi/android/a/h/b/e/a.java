package net.youmi.android.a.h.b.e;

import net.youmi.android.a.h.b.c;
import net.youmi.android.a.h.e;
import net.youmi.android.c.h.j;
import net.youmi.android.c.k.i;
import org.json.JSONObject;

public final class a
  extends c
{
  protected JSONObject a(e parame, net.youmi.android.a.h.b paramb)
  {
    int m = 1;
    for (;;)
    {
      try
      {
        paramb = parame.a();
        if (paramb == null) {
          return a(3);
        }
        if (j.a(paramb))
        {
          i = 1;
          parame = net.youmi.android.c.h.b.a(paramb);
          if (!i.b(paramb)) {
            break label134;
          }
          j = 1;
          if (!i.d(paramb)) {
            break label140;
          }
          k = 1;
          if (!i.g(paramb)) {
            break label146;
          }
          paramb = new JSONObject();
          paramb.put("a", i);
          paramb.put("b", parame);
          paramb.put("c", j);
          paramb.put("d", k);
          paramb.put("e", m);
          parame = a(0);
          parame.put("d", paramb);
          return parame;
        }
      }
      catch (Throwable parame)
      {
        return null;
      }
      int i = 0;
      continue;
      label134:
      int j = 0;
      continue;
      label140:
      int k = 0;
      continue;
      label146:
      m = 0;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.e.a
 * JD-Core Version:    0.7.0.1
 */