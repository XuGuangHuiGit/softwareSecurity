package net.youmi.android.a.h.b.g;

import net.youmi.android.a.h.e;
import org.json.JSONObject;

public final class d
  extends net.youmi.android.a.h.b.d
{
  protected JSONObject a(e parame, net.youmi.android.a.h.b paramb, JSONObject paramJSONObject)
  {
    for (;;)
    {
      try
      {
        paramb = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
        if (paramb == null) {
          return a(2);
        }
        parame = parame.a(paramb);
        switch (e.a[parame.ordinal()])
        {
        case 1: 
          return a(3);
        }
      }
      catch (Throwable parame)
      {
        return null;
      }
      return a(0);
      parame = a(4);
      return parame;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.g.d
 * JD-Core Version:    0.7.0.1
 */