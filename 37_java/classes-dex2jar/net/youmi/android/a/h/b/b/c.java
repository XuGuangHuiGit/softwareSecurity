package net.youmi.android.a.h.b.b;

import net.youmi.android.a.h.b.d;
import net.youmi.android.a.h.e;
import net.youmi.android.a.k.a.j;
import org.json.JSONObject;

public class c
  extends d
{
  protected JSONObject a(e parame, net.youmi.android.a.h.b paramb, JSONObject paramJSONObject)
  {
    try
    {
      if (this.a == null) {
        return a(4);
      }
      if ((this.a instanceof j))
      {
        parame = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
        paramb = net.youmi.android.c.b.b.a(paramJSONObject, "b", null);
        String str = net.youmi.android.c.b.b.a(paramJSONObject, "c", null);
        paramJSONObject = net.youmi.android.c.b.b.a(paramJSONObject, "d", null);
        ((j)this.a).a(parame, paramb, str, paramJSONObject);
        return a(0);
      }
      parame = a(4);
      return parame;
    }
    catch (Throwable parame) {}
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.b.c
 * JD-Core Version:    0.7.0.1
 */