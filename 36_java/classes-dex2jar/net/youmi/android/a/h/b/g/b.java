package net.youmi.android.a.h.b.g;

import net.youmi.android.a.h.b.d;
import net.youmi.android.a.h.e;
import org.json.JSONObject;

public final class b
  extends d
{
  protected JSONObject a(e parame, net.youmi.android.a.h.b paramb, JSONObject paramJSONObject)
  {
    for (;;)
    {
      try
      {
        paramb = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
        String str1 = net.youmi.android.c.b.b.a(paramJSONObject, "b", null);
        String str2 = net.youmi.android.c.b.b.a(paramJSONObject, "c", null);
        if ((paramb == null) || (str1 == null) || (str2 == null)) {
          return a(2);
        }
        parame = parame.a(paramb, str1, str2, net.youmi.android.c.b.b.a(paramJSONObject, "d", 0L));
        switch (c.a[parame.ordinal()])
        {
        case 1: 
          parame = a(i);
          return parame;
        }
      }
      catch (Throwable parame)
      {
        return null;
      }
      int i = 4;
      continue;
      i = 0;
      continue;
      i = 3;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.g.b
 * JD-Core Version:    0.7.0.1
 */