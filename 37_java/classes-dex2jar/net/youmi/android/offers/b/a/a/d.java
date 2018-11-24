package net.youmi.android.offers.b.a.a;

import net.youmi.android.a.h.e;
import net.youmi.android.offers.d.a;
import org.json.JSONObject;

public final class d
  extends net.youmi.android.a.h.b.d
{
  protected JSONObject a(e parame, net.youmi.android.a.h.b paramb, JSONObject paramJSONObject)
  {
    int i = 0;
    try
    {
      net.youmi.android.c.b.b.a(paramJSONObject, "a", -999);
      try
      {
        label13:
        if (this.b == null) {
          return a(4);
        }
        if (!(this.b instanceof a)) {
          return a(4);
        }
        if (((a)this.b).canShowAdNow()) {
          i = 1;
        }
        parame = a(0);
        paramb = new JSONObject();
        paramb.put("a", i);
        parame.put("d", paramb);
        return parame;
      }
      catch (Throwable parame)
      {
        return null;
      }
    }
    catch (Throwable parame)
    {
      break label13;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.b.a.a.d
 * JD-Core Version:    0.7.0.1
 */