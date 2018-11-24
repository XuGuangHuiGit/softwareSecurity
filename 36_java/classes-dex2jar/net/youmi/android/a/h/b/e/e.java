package net.youmi.android.a.h.b.e;

import net.youmi.android.a.h.b.d;
import net.youmi.android.a.h.j;
import org.json.JSONObject;

public final class e
  extends d
{
  protected JSONObject a(net.youmi.android.a.h.e parame, net.youmi.android.a.h.b paramb, JSONObject paramJSONObject)
  {
    if (parame == null) {}
    try
    {
      return a(3);
    }
    catch (Throwable parame) {}
    paramb = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
    if (paramb == null) {
      return a(2);
    }
    String str1 = net.youmi.android.c.b.b.a(paramJSONObject, "b", "");
    String str2 = net.youmi.android.c.b.b.a(paramJSONObject, "c", null);
    paramJSONObject = net.youmi.android.c.b.b.a(paramJSONObject, "d", null);
    j localj = new j();
    localj.a(paramb);
    localj.d(str1);
    localj.b(str2);
    localj.c(paramJSONObject);
    if (!localj.e()) {
      return a(2);
    }
    parame = parame.a(localj);
    if (parame == null) {
      return a(3);
    }
    paramb = a(0);
    paramb.put("d", parame);
    return paramb;
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.e.e
 * JD-Core Version:    0.7.0.1
 */