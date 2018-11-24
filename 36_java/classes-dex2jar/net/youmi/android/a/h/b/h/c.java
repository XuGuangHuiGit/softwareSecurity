package net.youmi.android.a.h.b.h;

import android.content.Context;
import net.youmi.android.a.h.b.d;
import net.youmi.android.c.a;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c
  extends d
{
  String a(net.youmi.android.b.a.b paramb, String paramString)
  {
    if (paramString == null) {
      return "";
    }
    try
    {
      if ("a".equals(paramString)) {
        return paramb.d();
      }
      if ("b".equals(paramString)) {
        return paramb.c();
      }
      if ("c".equals(paramString)) {
        return paramb.b();
      }
      if ("d".equals(paramString))
      {
        paramb = paramb.a();
        return paramb;
      }
    }
    catch (Throwable paramb) {}
    return "";
  }
  
  protected JSONObject a(net.youmi.android.a.h.e parame, net.youmi.android.a.h.b paramb, JSONObject paramJSONObject)
  {
    if (parame == null) {}
    try
    {
      return a(3);
    }
    catch (Throwable parame)
    {
      try
      {
        Context localContext;
        net.youmi.android.b.a.b localb;
        String str = net.youmi.android.c.b.e.b(paramJSONObject.getString(i));
        if (str == null) {
          break label178;
        }
        if ("e".equals(str)) {
          parame = a.g(localContext);
        }
        while (parame != null)
        {
          paramb.put(str, parame);
          break;
          if ("f".equals(str)) {
            parame = a.b(localContext);
          } else {
            parame = a(localb, str);
          }
        }
        parame = a(0);
        parame.put("d", paramb);
        return parame;
      }
      catch (Throwable parame)
      {
        int i;
        i += 1;
      }
      parame = parame;
      return null;
    }
    localContext = parame.a();
    if (localContext == null) {
      return a(3);
    }
    localb = new net.youmi.android.b.a.b(localContext);
    net.youmi.android.c.e.c.a();
    paramb = new JSONObject();
    paramJSONObject = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
    if (paramJSONObject != null) {
      i = 0;
    }
    label178:
    for (;;)
    {
      int j = paramJSONObject.length();
      if (i >= j) {}
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.h.c
 * JD-Core Version:    0.7.0.1
 */