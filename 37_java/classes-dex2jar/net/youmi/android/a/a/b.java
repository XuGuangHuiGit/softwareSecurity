package net.youmi.android.a.a;

import org.json.JSONObject;

public abstract class b
{
  protected abstract c a();
  
  final c a(JSONObject paramJSONObject, c paramc)
  {
    if (paramJSONObject == null) {}
    for (;;)
    {
      return paramc;
      try
      {
        c localc = a();
        boolean bool = localc.a(paramJSONObject);
        if (bool) {
          return localc;
        }
      }
      catch (Throwable paramJSONObject) {}
    }
    return paramc;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.a.b
 * JD-Core Version:    0.7.0.1
 */