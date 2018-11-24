package net.youmi.android.a.h.b.a;

import net.youmi.android.a.h.b.d;
import net.youmi.android.a.h.e;
import net.youmi.android.c.k.i;
import org.json.JSONArray;
import org.json.JSONObject;

public class b
  extends d
{
  protected JSONObject a(e parame, net.youmi.android.a.h.b paramb, JSONObject paramJSONObject)
  {
    int i = 0;
    if (parame == null) {}
    for (;;)
    {
      return null;
      try
      {
        paramb = parame.a();
        if (paramb == null) {
          continue;
        }
        paramJSONObject = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
        if (paramJSONObject == null) {
          return a(2);
        }
        parame = new JSONArray();
        for (;;)
        {
          if (i < paramJSONObject.length())
          {
            String str = net.youmi.android.c.b.b.a(paramJSONObject, i, null);
            if (str != null)
            {
              JSONObject localJSONObject = new JSONObject();
              localJSONObject.put("a", str);
              if (i.a(paramb, str)) {
                localJSONObject.put("b", 1);
              }
              for (;;)
              {
                parame.put(localJSONObject);
                break;
                localJSONObject.put("b", 0);
              }
            }
          }
          else
          {
            paramb = a(0);
            paramJSONObject = new JSONObject();
            paramJSONObject.put("a", parame);
            paramb.put("d", paramJSONObject);
            return paramb;
          }
          i += 1;
        }
        return null;
      }
      catch (Throwable parame) {}
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.a.b
 * JD-Core Version:    0.7.0.1
 */