package net.youmi.android.a.h.b.f;

import android.app.NotificationManager;
import android.content.Context;
import net.youmi.android.a.h.b.d;
import net.youmi.android.a.h.e;
import org.json.JSONObject;

public final class c
  extends d
{
  protected JSONObject a(e parame, net.youmi.android.a.h.b paramb, JSONObject paramJSONObject)
  {
    if (parame == null) {
      return null;
    }
    try
    {
      parame = parame.a();
      if (parame == null) {
        return null;
      }
      int i = net.youmi.android.c.b.b.a(paramJSONObject, "a", 0);
      ((NotificationManager)parame.getSystemService("notification")).cancel(i);
      parame = a(0);
      return parame;
    }
    catch (Throwable parame) {}
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.f.c
 * JD-Core Version:    0.7.0.1
 */