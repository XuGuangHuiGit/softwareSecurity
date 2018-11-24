package net.youmi.android.a.h.b.g;

import net.youmi.android.a.h.b;
import net.youmi.android.a.h.b.c;
import net.youmi.android.a.h.e;
import org.json.JSONObject;

public final class a
  extends c
{
  protected JSONObject a(e parame, b paramb)
  {
    try
    {
      paramb = a(0);
      JSONObject localJSONObject1 = new JSONObject();
      localJSONObject1.put("a", 2013091001);
      JSONObject localJSONObject2 = new JSONObject();
      localJSONObject2.put("a", parame.e());
      localJSONObject2.put("b", parame.d());
      localJSONObject1.put("b", localJSONObject2);
      paramb.put("d", localJSONObject1);
      return paramb;
    }
    catch (Throwable parame) {}
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.g.a
 * JD-Core Version:    0.7.0.1
 */