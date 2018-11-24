package net.youmi.android.a.h.b.d;

import net.youmi.android.a.h.b;
import net.youmi.android.a.h.b.c;
import net.youmi.android.a.h.e;
import net.youmi.android.c.k.k;
import org.json.JSONObject;

public final class a
  extends c
{
  protected JSONObject a(e parame, b paramb)
  {
    if (parame == null) {}
    try
    {
      return a(3);
    }
    catch (Throwable parame) {}
    paramb = parame.a();
    if (paramb == null) {
      return a(3);
    }
    parame = k.c();
    long l1 = k.b();
    long l2 = k.b(paramb);
    boolean bool1 = k.a();
    boolean bool2 = k.a(paramb);
    paramb = a(0);
    JSONObject localJSONObject = new JSONObject();
    if (parame != null) {
      localJSONObject.put("a", parame);
    }
    localJSONObject.put("b", l1);
    localJSONObject.put("c", l2);
    localJSONObject.put("d", bool1);
    localJSONObject.put("e", bool2);
    paramb.put("d", localJSONObject);
    return paramb;
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.d.a
 * JD-Core Version:    0.7.0.1
 */