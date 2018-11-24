package net.youmi.android.a.h.b;

import net.youmi.android.a.h.e;
import org.json.JSONObject;

public abstract class c
  extends b
{
  public String a(e parame, net.youmi.android.a.h.b paramb, String paramString)
  {
    try
    {
      parame = a(a(parame, paramb));
      return parame;
    }
    catch (Throwable parame) {}
    return b.b(3);
  }
  
  protected abstract JSONObject a(e parame, net.youmi.android.a.h.b paramb);
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.c
 * JD-Core Version:    0.7.0.1
 */