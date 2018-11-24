package net.youmi.android.a.h.b.e;

import net.youmi.android.a.h.b.d;
import net.youmi.android.a.h.e;
import net.youmi.android.a.h.v;
import org.json.JSONObject;

public final class b
  extends d
{
  protected JSONObject a(e parame, net.youmi.android.a.h.b paramb, JSONObject paramJSONObject)
  {
    if (parame == null) {}
    try
    {
      return a(3);
    }
    catch (Throwable parame)
    {
      long l1;
      String str1;
      String str2;
      long l2;
      return null;
    }
    parame = parame.a();
    if (parame == null) {
      return a(3);
    }
    paramb = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
    if (paramb == null) {
      return a(2);
    }
    l1 = net.youmi.android.c.b.b.a(paramJSONObject, "b", 0L);
    str1 = net.youmi.android.c.b.b.a(paramJSONObject, "c", null);
    if (str1 == null) {
      return a(2);
    }
    str2 = net.youmi.android.c.b.b.a(paramJSONObject, "d", null);
    if (str2 == null) {
      return a(2);
    }
    l2 = net.youmi.android.c.b.b.a(paramJSONObject, "e", 0L);
    if (net.youmi.android.c.b.b.a(paramJSONObject, "f", 0) == 1) {}
    for (boolean bool = true;; bool = false)
    {
      if (l2 > 0L) {}
      for (parame = new v(parame, str2, paramb, str1, l1, l2 * 1000L, bool);; parame = new v(parame, str2, paramb, str1, l1, bool))
      {
        new Thread(parame).start();
        return a(0);
      }
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.e.b
 * JD-Core Version:    0.7.0.1
 */