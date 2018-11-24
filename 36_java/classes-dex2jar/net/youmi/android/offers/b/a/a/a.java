package net.youmi.android.offers.b.a.a;

import net.youmi.android.a.h.e;
import net.youmi.android.offers.b.b.c.c;
import org.json.JSONObject;

public final class a
  extends net.youmi.android.a.h.b.d
{
  protected JSONObject a(e parame, net.youmi.android.a.h.b paramb, JSONObject paramJSONObject)
  {
    try
    {
      paramb = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
      paramJSONObject = net.youmi.android.c.b.b.a(paramJSONObject, "b", null);
      c.a().a(paramJSONObject, paramb);
      try
      {
        label24:
        paramb = a(0);
        paramJSONObject = new JSONObject();
        paramJSONObject.put("a", net.youmi.android.offers.b.b.c.d.a(parame.a()).a());
        paramb.put("d", paramJSONObject);
        return paramb;
      }
      catch (Throwable parame)
      {
        return null;
      }
    }
    catch (Throwable paramb)
    {
      break label24;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.b.a.a.a
 * JD-Core Version:    0.7.0.1
 */