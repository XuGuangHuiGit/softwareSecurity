package net.youmi.android.a.h.b.f;

import net.youmi.android.a.h.b.d;
import net.youmi.android.a.h.e;
import org.json.JSONObject;

public final class a
  extends d
{
  protected JSONObject a(e parame, net.youmi.android.a.h.b paramb, JSONObject paramJSONObject)
  {
    if (parame == null) {}
    for (;;)
    {
      return null;
      try
      {
        parame = parame.a();
        if (parame != null)
        {
          String str = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
          if (str == null) {
            return a(2);
          }
          if (paramb.js_SDK_Handler_RunOnUIThread(new b(this, parame, str, net.youmi.android.c.b.b.a(paramJSONObject, "b", 1))))
          {
            parame = a(0);
            return parame;
          }
        }
      }
      catch (Throwable parame) {}
    }
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.f.a
 * JD-Core Version:    0.7.0.1
 */