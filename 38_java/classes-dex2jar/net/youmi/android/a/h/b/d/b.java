package net.youmi.android.a.h.b.d;

import android.content.Context;
import java.io.File;
import net.youmi.android.a.h.e;
import org.json.JSONObject;

public final class b
  extends net.youmi.android.a.h.b.c
{
  protected JSONObject a(e parame, net.youmi.android.a.h.b paramb)
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
    parame = paramb.getCacheDir().getAbsolutePath();
    long l1 = net.youmi.android.c.k.c.a();
    long l2 = net.youmi.android.c.k.c.a(paramb);
    paramb = a(0);
    JSONObject localJSONObject = new JSONObject();
    if (parame != null) {
      localJSONObject.put("a", parame);
    }
    localJSONObject.put("b", l1);
    localJSONObject.put("c", l2);
    paramb.put("d", localJSONObject);
    return paramb;
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.d.b
 * JD-Core Version:    0.7.0.1
 */