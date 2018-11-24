package net.youmi.android.a.h.b.a;

import android.content.pm.PackageInfo;
import net.youmi.android.a.h.b.d;
import net.youmi.android.a.h.e;
import net.youmi.android.c.k.h;
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
    String str = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
    if (str == null) {
      return a(2);
    }
    paramb = a(0);
    paramJSONObject = new JSONObject();
    paramJSONObject.put("a", str);
    parame = h.c(parame, str);
    if (parame != null)
    {
      paramJSONObject.put("b", parame.versionCode);
      paramJSONObject.put("c", parame.versionName);
      paramJSONObject.put("d", 1);
    }
    for (;;)
    {
      paramb.put("d", paramJSONObject);
      return paramb;
      paramJSONObject.put("d", 0);
    }
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.a.a
 * JD-Core Version:    0.7.0.1
 */