package net.youmi.android.a.h.b.b;

import net.youmi.android.a.h.b.d;
import net.youmi.android.a.h.e;
import net.youmi.android.a.h.l;
import net.youmi.android.a.h.m;
import net.youmi.android.a.h.r;
import net.youmi.android.a.h.s;
import org.json.JSONObject;

public final class j
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
      Object localObject1;
      Object localObject3;
      Object localObject4;
      String str;
      int j;
      Object localObject2;
      return null;
    }
    paramb = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
    if (paramb == null) {
      return a(2);
    }
    localObject1 = net.youmi.android.c.b.b.a(paramJSONObject, "b", null);
    localObject3 = net.youmi.android.c.b.b.a((JSONObject)localObject1, "a", null);
    localObject4 = net.youmi.android.c.b.b.a((JSONObject)localObject1, "b", null);
    str = net.youmi.android.c.b.b.a((JSONObject)localObject1, "c", null);
    localObject1 = net.youmi.android.c.b.b.a((JSONObject)localObject1, "d", null);
    j = net.youmi.android.c.b.b.a(paramJSONObject, "c", 0);
    localObject2 = net.youmi.android.c.b.b.a(paramJSONObject, "d", null);
    i = 0;
    if (localObject2 != null) {
      i = net.youmi.android.c.b.b.a((JSONObject)localObject2, "a", 0);
    }
    localObject2 = net.youmi.android.c.b.b.a(paramJSONObject, "e", "");
    paramJSONObject = net.youmi.android.c.b.b.a(paramJSONObject, "f", null);
    if (localObject3 != null) {}
    try
    {
      r.a().a(paramb, (String)localObject3);
      if (localObject4 != null) {
        s.a().a(paramb, (String)localObject4);
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        continue;
        i = 3;
      }
    }
    localObject3 = new m();
    localObject4 = new l(parame.e(), parame.d());
    ((l)localObject4).a((String)localObject2);
    ((l)localObject4).b(str);
    ((l)localObject4).c((String)localObject1);
    ((l)localObject4).e(paramb);
    ((l)localObject4).b(j);
    ((l)localObject4).d(paramJSONObject);
    ((l)localObject4).a(i);
    ((m)localObject3).a((l)localObject4);
    parame = parame.a((m)localObject3);
    switch (k.a[parame.ordinal()])
    {
    case 1: 
    case 2: 
      for (;;)
      {
        parame = a(i);
        return parame;
        i = 4;
        continue;
        i = 0;
      }
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.b.j
 * JD-Core Version:    0.7.0.1
 */