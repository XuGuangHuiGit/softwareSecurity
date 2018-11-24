package net.youmi.android.a.h.b.b;

import android.content.Context;
import net.youmi.android.a.h.b.d;
import net.youmi.android.a.h.c.a.a;
import net.youmi.android.a.h.e;
import net.youmi.android.c.k.i;
import org.json.JSONObject;

public final class p
  extends d
{
  protected JSONObject a(e parame, net.youmi.android.a.h.b paramb, JSONObject paramJSONObject)
  {
    if (parame == null) {}
    try
    {
      return a(3);
    }
    catch (Throwable parame)
    {
      for (;;)
      {
        try
        {
          parame = net.youmi.android.c.b.b.a(paramJSONObject, "d", null);
          if (parame == null) {
            continue;
          }
          str1 = net.youmi.android.c.b.b.a(parame, "a", null);
          if (str1 == null) {
            continue;
          }
        }
        catch (Throwable parame)
        {
          Context localContext;
          String str2;
          String str3;
          String str4;
          String str1 = null;
          parame = null;
          continue;
        }
        try
        {
          parame = net.youmi.android.c.b.b.a(parame, "b", null);
          str5 = net.youmi.android.c.b.b.a(paramJSONObject, "e", null);
          paramJSONObject = net.youmi.android.c.b.b.a(paramJSONObject, "f", null);
          locala = new a();
          locala.d(str5);
          locala.f(str1);
          locala.e(parame);
          locala.c(str3);
          locala.a(str4);
          locala.b(str2);
          locala.g(paramJSONObject);
          if (!i.h(localContext)) {
            continue;
          }
          if (paramb.js_SDK_Handler_RunOnUIThread(new q(this, localContext, locala))) {
            return a(0);
          }
          parame = a(3);
          return parame;
        }
        catch (Throwable parame) {}
      }
      parame = parame;
      return null;
    }
    localContext = parame.a();
    if (localContext == null) {
      return a(3);
    }
    str2 = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
    if (str2 == null) {
      return a(2);
    }
    str3 = net.youmi.android.c.b.b.a(paramJSONObject, "b", null);
    str4 = net.youmi.android.c.b.b.a(paramJSONObject, "c", "网页快捷方式");
    for (;;)
    {
      String str5;
      a locala;
      parame = null;
      continue;
      parame = null;
      str1 = null;
    }
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.b.p
 * JD-Core Version:    0.7.0.1
 */