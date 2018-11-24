package net.youmi.android.a.h.b.b;

import net.youmi.android.a.h.e;
import net.youmi.android.a.h.p;
import net.youmi.android.a.h.r;
import net.youmi.android.a.h.s;
import org.json.JSONObject;

public final class d
  extends net.youmi.android.a.h.b.d
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
      int i2;
      Object localObject;
      String str3;
      String str4;
      String str1;
      String str2;
      return null;
    }
    i2 = net.youmi.android.c.k.d.a(parame.a()).b();
    i1 = net.youmi.android.c.k.d.a(parame.a()).c();
    f = net.youmi.android.c.k.d.a(parame.a()).f();
    paramb = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
    if (paramb == null) {
      return a(3);
    }
    localObject = net.youmi.android.c.b.b.a(paramJSONObject, "b", null);
    str3 = net.youmi.android.c.b.b.a((JSONObject)localObject, "a", null);
    str4 = net.youmi.android.c.b.b.a((JSONObject)localObject, "b", null);
    str1 = net.youmi.android.c.b.b.a((JSONObject)localObject, "c", null);
    localObject = net.youmi.android.c.b.b.a((JSONObject)localObject, "d", null);
    str2 = net.youmi.android.c.b.b.a(paramJSONObject, "e", null);
    if (str3 != null) {}
    try
    {
      r.a().a(paramb, str3);
      if (str4 != null) {
        s.a().a(paramb, str4);
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        int k;
        int m;
        int n;
        int i;
        int j;
        boolean bool;
        double d1;
        double d2;
        continue;
        if (n > 0)
        {
          j = (int)(i1 - n - 20.0F * f);
          continue;
          i = 3;
        }
      }
    }
    k = net.youmi.android.c.b.b.a(paramJSONObject, "c", 0);
    paramJSONObject = net.youmi.android.c.b.b.a(paramJSONObject, "d", null);
    m = net.youmi.android.c.b.b.a(paramJSONObject, "a", -9999);
    n = net.youmi.android.c.b.b.a(paramJSONObject, "b", -9999);
    i = (int)(i2 - 40.0F * f);
    j = (int)(i1 - 40.0F * f);
    if (m > 0)
    {
      i = (int)(i2 - m - 20.0F * f);
      break label470;
      i = net.youmi.android.c.b.b.a(paramJSONObject, "c", i);
      j = net.youmi.android.c.b.b.a(paramJSONObject, "d", j);
      i1 = net.youmi.android.c.b.b.a(paramJSONObject, "e", 0);
      if (net.youmi.android.c.b.b.a(paramJSONObject, "f", 1) == 0)
      {
        bool = true;
        d1 = net.youmi.android.c.b.b.a(paramJSONObject, "g", 0.0D);
        d2 = net.youmi.android.c.b.b.a(paramJSONObject, "h", 0.0D);
        paramJSONObject = new p(parame.e(), parame.d());
        paramJSONObject.b(str1);
        paramJSONObject.c((String)localObject);
        paramJSONObject.e(paramb);
        paramJSONObject.b(k);
        paramJSONObject.c(m);
        paramJSONObject.d(n);
        paramJSONObject.e(i);
        paramJSONObject.f(j);
        paramJSONObject.a(d1);
        paramJSONObject.b(d2);
        paramJSONObject.a(i1);
        paramJSONObject.d(str2);
        paramJSONObject.a(bool);
        parame = parame.b(paramJSONObject);
      }
      switch (e.a[parame.ordinal()])
      {
      case 1: 
      case 2: 
        for (;;)
        {
          parame = a(i);
          return parame;
          bool = false;
          break;
          i = 4;
          continue;
          i = 0;
        }
      }
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.b.d
 * JD-Core Version:    0.7.0.1
 */