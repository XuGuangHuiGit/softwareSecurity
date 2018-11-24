package net.youmi.android.a.h.b.a;

import net.youmi.android.a.h.b.d;
import net.youmi.android.a.h.e;
import net.youmi.android.c.k.f;
import org.json.JSONObject;

public final class i
  extends d
{
  protected JSONObject a(e parame, net.youmi.android.a.h.b paramb, JSONObject paramJSONObject)
  {
    int i = 0;
    if (parame == null) {}
    try
    {
      return a(3);
    }
    catch (Throwable parame) {}
    parame = parame.a();
    if (parame == null) {
      return a(3);
    }
    paramb = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
    if (paramb == null) {
      return a(2);
    }
    String str = net.youmi.android.c.b.b.a(paramJSONObject, "b", null);
    boolean bool = f.b(parame, paramb, net.youmi.android.c.b.b.a(paramJSONObject, "c", 0), str);
    parame = a(0);
    paramb = new JSONObject();
    if (bool) {
      i = 1;
    }
    paramb.put("a", i);
    parame.put("d", paramb);
    return parame;
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.a.i
 * JD-Core Version:    0.7.0.1
 */