package net.youmi.android.a.h.b.c;

import net.youmi.android.a.h.b.d;
import net.youmi.android.a.h.e;
import org.json.JSONObject;

public final class a
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
    parame = net.youmi.android.a.h.a.b.a(parame).a(paramb);
    paramb = a(0);
    paramJSONObject = new JSONObject();
    if (parame == null)
    {
      paramJSONObject.put("a", "");
      paramJSONObject.put("b", 1);
    }
    for (;;)
    {
      paramb.put("d", paramJSONObject);
      return paramb;
      paramJSONObject.put("a", parame.b());
      paramJSONObject.put("b", 0);
    }
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.c.a
 * JD-Core Version:    0.7.0.1
 */