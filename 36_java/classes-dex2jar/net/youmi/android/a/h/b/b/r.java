package net.youmi.android.a.h.b.b;

import net.youmi.android.a.h.b.d;
import net.youmi.android.a.h.e;
import net.youmi.android.a.h.l;
import net.youmi.android.a.h.n;
import net.youmi.android.a.h.s;
import org.json.JSONObject;

public final class r
  extends d
{
  protected JSONObject a(e parame, net.youmi.android.a.h.b paramb, JSONObject paramJSONObject)
  {
    int i = 3;
    if (parame == null) {}
    try
    {
      return a(3);
    }
    catch (Throwable parame)
    {
      Object localObject1;
      Object localObject2;
      String str2;
      String str1;
      return null;
    }
    paramb = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
    if (paramb == null) {
      return a(2);
    }
    localObject1 = net.youmi.android.c.b.b.a(paramJSONObject, "b", null);
    localObject2 = net.youmi.android.c.b.b.a((JSONObject)localObject1, "a", null);
    str2 = net.youmi.android.c.b.b.a((JSONObject)localObject1, "b", null);
    str1 = net.youmi.android.c.b.b.a((JSONObject)localObject1, "c", null);
    localObject1 = net.youmi.android.c.b.b.a((JSONObject)localObject1, "d", null);
    paramJSONObject = net.youmi.android.c.b.b.a(paramJSONObject, "c", null);
    if (localObject2 != null) {}
    try
    {
      net.youmi.android.a.h.r.a().a(paramb, (String)localObject2);
      if (str2 != null) {
        s.a().a(paramb, str2);
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;) {}
    }
    localObject2 = new l(parame.e(), parame.d());
    ((n)localObject2).b(str1);
    ((n)localObject2).c((String)localObject1);
    ((n)localObject2).e(paramb);
    ((n)localObject2).d(paramJSONObject);
    parame = parame.a((n)localObject2);
    switch (s.a[parame.ordinal()])
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


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.b.r
 * JD-Core Version:    0.7.0.1
 */