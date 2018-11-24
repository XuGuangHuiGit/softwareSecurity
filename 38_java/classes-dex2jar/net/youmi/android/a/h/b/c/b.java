package net.youmi.android.a.h.b.c;

import net.youmi.android.a.h.b.d;
import net.youmi.android.a.h.e;
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
    if (str == null) {
      return a(2);
    }
    long l2 = net.youmi.android.c.b.b.a(paramJSONObject, "c", 0L) * 1000L;
    long l1 = l2;
    if (l2 < 0L) {
      l1 = -1L;
    }
    if (net.youmi.android.a.h.a.b.a(parame).a(paramb, str, l1)) {
      return a(0);
    }
    parame = a(3);
    return parame;
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.c.b
 * JD-Core Version:    0.7.0.1
 */