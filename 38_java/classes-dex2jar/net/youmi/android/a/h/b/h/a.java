package net.youmi.android.a.h.b.h;

import net.youmi.android.a.h.b.d;
import net.youmi.android.a.h.e;
import net.youmi.android.c.e.c;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a
  extends d
{
  protected JSONObject a(e parame, net.youmi.android.a.h.b paramb, JSONObject paramJSONObject)
  {
    int i = 0;
    for (;;)
    {
      try
      {
        c.a();
        parame = new JSONObject();
        paramb = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
        if (paramb != null)
        {
          int j = paramb.length();
          if (i >= j) {
            break;
          }
        }
      }
      catch (Throwable parame)
      {
        return null;
      }
      try
      {
        paramJSONObject = paramb.getString(i);
        if (paramJSONObject != null) {
          parame.put(paramJSONObject, null);
        }
      }
      catch (Throwable paramJSONObject)
      {
        continue;
      }
      i += 1;
    }
    paramb = a(0);
    paramb.put("d", parame);
    return paramb;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.h.a
 * JD-Core Version:    0.7.0.1
 */