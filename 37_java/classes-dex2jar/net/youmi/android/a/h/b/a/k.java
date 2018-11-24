package net.youmi.android.a.h.b.a;

import android.content.Context;
import net.youmi.android.a.h.b;
import net.youmi.android.a.h.b.c;
import net.youmi.android.a.h.e;
import net.youmi.android.c.k.h;
import org.json.JSONObject;

public class k
  extends c
{
  protected JSONObject a(e parame, b paramb)
  {
    if (parame == null) {}
    try
    {
      return a(3);
    }
    catch (Throwable parame)
    {
      JSONObject localJSONObject1;
      JSONObject localJSONObject2;
      return null;
    }
    parame = parame.a();
    if (parame == null) {
      return a(3);
    }
    paramb = a(0);
    localJSONObject1 = new JSONObject();
    localJSONObject2 = new JSONObject();
    localJSONObject2.put("pn", parame.getPackageName());
    localJSONObject2.put("vc", net.youmi.android.b.b.a.e(parame));
    localJSONObject2.put("vn", net.youmi.android.b.b.a.d(parame));
    try
    {
      net.youmi.android.c.k.a locala = h.b(parame, parame.getPackageName());
      if (locala != null) {
        localJSONObject2.put("an", locala.a());
      }
    }
    catch (Throwable localThrowable)
    {
      label111:
      break label111;
    }
    localJSONObject1.put("a", localJSONObject2);
    localJSONObject2 = new JSONObject();
    localJSONObject2.put("aid", net.youmi.android.b.b.a.a(parame));
    localJSONObject2.put("chn", net.youmi.android.b.b.a.f(parame));
    localJSONObject1.put("b", localJSONObject2);
    paramb.put("d", localJSONObject1);
    return paramb;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.a.k
 * JD-Core Version:    0.7.0.1
 */