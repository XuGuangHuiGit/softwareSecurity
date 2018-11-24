package net.youmi.android.a.h.b.b;

import net.youmi.android.a.h.b.d;
import net.youmi.android.a.h.e;
import net.youmi.android.a.h.m;
import net.youmi.android.a.h.r;
import net.youmi.android.a.h.s;
import org.json.JSONArray;
import org.json.JSONObject;

public final class l
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
      m localm;
      JSONObject localJSONObject;
      Object localObject1;
      Object localObject2;
      String str4;
      String str1;
      String str2;
      String str3;
      int k;
      int j;
      return null;
    }
    if (parame.b() == null) {
      return a(3);
    }
    paramb = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
    if (paramb == null) {
      return a(2);
    }
    localm = new m();
    paramJSONObject = net.youmi.android.c.b.b.a(paramJSONObject, "b", null);
    int i;
    if (paramJSONObject != null)
    {
      localm.a(paramJSONObject);
      break label397;
      if (i < paramb.length())
      {
        localJSONObject = net.youmi.android.c.b.b.a(paramb, i, null);
        if (localJSONObject == null) {
          break label403;
        }
        paramJSONObject = net.youmi.android.c.b.b.a(localJSONObject, "a", null);
        if (paramJSONObject == null) {
          return a(2);
        }
        localObject1 = net.youmi.android.c.b.b.a(localJSONObject, "b", null);
        localObject2 = net.youmi.android.c.b.b.a((JSONObject)localObject1, "a", null);
        str4 = net.youmi.android.c.b.b.a((JSONObject)localObject1, "b", null);
        str1 = net.youmi.android.c.b.b.a((JSONObject)localObject1, "c", null);
        localObject1 = net.youmi.android.c.b.b.a((JSONObject)localObject1, "d", null);
        str2 = net.youmi.android.c.b.b.a(localJSONObject, "e", "");
        str3 = net.youmi.android.c.b.b.a(localJSONObject, "f", null);
        k = net.youmi.android.c.b.b.a(localJSONObject, "c", 0);
        localJSONObject = net.youmi.android.c.b.b.a(localJSONObject, "d", null);
        j = 0;
        if (localJSONObject != null) {
          j = net.youmi.android.c.b.b.a(localJSONObject, "a", 0);
        }
        if (localObject2 == null) {}
      }
      try
      {
        r.a().a(paramJSONObject, (String)localObject2);
        if (str4 != null) {
          s.a().a(paramJSONObject, str4);
        }
      }
      catch (Throwable localThrowable)
      {
        label251:
        break label251;
      }
      localObject2 = new net.youmi.android.a.h.l(parame.e(), parame.d());
      ((net.youmi.android.a.h.l)localObject2).a(str2);
      ((net.youmi.android.a.h.l)localObject2).d(str3);
      ((net.youmi.android.a.h.l)localObject2).b(str1);
      ((net.youmi.android.a.h.l)localObject2).c((String)localObject1);
      ((net.youmi.android.a.h.l)localObject2).e(paramJSONObject);
      ((net.youmi.android.a.h.l)localObject2).b(k);
      ((net.youmi.android.a.h.l)localObject2).a(j);
      localm.a((net.youmi.android.a.h.l)localObject2);
      break label403;
      parame = parame.a(localm);
      switch (m.a[parame.ordinal()])
      {
      }
    }
    for (;;)
    {
      parame = a(i);
      return parame;
      i = 4;
      continue;
      i = 0;
      continue;
      label397:
      i = 0;
      break;
      label403:
      i += 1;
      break;
      i = 3;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.b.l
 * JD-Core Version:    0.7.0.1
 */