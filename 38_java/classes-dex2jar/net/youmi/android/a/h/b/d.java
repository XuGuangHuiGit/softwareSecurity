package net.youmi.android.a.h.b;

import net.youmi.android.a.h.e;
import org.json.JSONObject;

public abstract class d
  extends b
{
  public String a(e parame, net.youmi.android.a.h.b paramb, String paramString)
  {
    if (paramString == null) {}
    try
    {
      return b(2);
    }
    catch (Throwable parame) {}
    paramString = net.youmi.android.c.b.b.a(paramString);
    if (paramString == null) {
      return b(2);
    }
    paramString = net.youmi.android.c.b.b.a(paramString, "a", null);
    if (paramString == null) {
      return b(2);
    }
    parame = a(a(parame, paramb, paramString));
    return parame;
    return b.b(3);
  }
  
  protected abstract JSONObject a(e parame, net.youmi.android.a.h.b paramb, JSONObject paramJSONObject);
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.d
 * JD-Core Version:    0.7.0.1
 */