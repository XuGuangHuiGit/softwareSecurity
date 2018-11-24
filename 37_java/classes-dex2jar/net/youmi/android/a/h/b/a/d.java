package net.youmi.android.a.h.b.a;

import android.content.Context;
import net.youmi.android.a.a.a.a;
import net.youmi.android.a.a.a.c;
import net.youmi.android.a.a.a.f;
import net.youmi.android.a.a.a.g;
import net.youmi.android.a.h.e;
import net.youmi.android.a.h.i;
import net.youmi.android.a.h.j;
import net.youmi.android.a.h.o;
import org.json.JSONObject;

public final class d
  extends net.youmi.android.a.h.b.d
{
  protected JSONObject a(e parame, net.youmi.android.a.h.b paramb, JSONObject paramJSONObject)
  {
    if (parame == null) {
      return null;
    }
    for (;;)
    {
      try
      {
        Object localObject1 = parame.a();
        if (localObject1 == null) {
          return null;
        }
        Object localObject2 = net.youmi.android.c.b.b.a(paramJSONObject, "b", null);
        if (localObject2 == null) {
          return a(2);
        }
        paramb = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
        if (paramb == null) {
          break label702;
        }
        str1 = net.youmi.android.c.b.b.a(paramb, "a", null);
        l = net.youmi.android.c.b.b.a(paramb, "b", 0L);
        paramb = net.youmi.android.c.b.b.a(paramb, "c", null);
        paramJSONObject = net.youmi.android.c.b.b.a(paramJSONObject, "c", null);
        boolean bool2;
        if (paramJSONObject != null)
        {
          String str2 = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
          String str3 = net.youmi.android.c.b.b.a(paramJSONObject, "b", null);
          String str4 = net.youmi.android.c.b.b.a(paramJSONObject, "c", null);
          String str5 = net.youmi.android.c.b.b.a(paramJSONObject, "d", null);
          paramJSONObject = new j();
          paramJSONObject.a(str2);
          paramJSONObject.b(str3);
          paramJSONObject.c(str4);
          paramJSONObject.d(str5);
          if ((str1 != null) && (paramb == null)) {
            return a(2);
          }
          i = net.youmi.android.c.b.b.a((JSONObject)localObject2, "a", -1);
          if (i <= 0) {
            return a(2);
          }
          int j = net.youmi.android.c.b.b.a((JSONObject)localObject2, "b", 0);
          Object localObject5 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "c", null);
          if (localObject5 == null) {
            return a(2);
          }
          str5 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "d", null);
          if (str5 == null) {
            return a(2);
          }
          int k = net.youmi.android.c.b.b.a((JSONObject)localObject2, "e", 0);
          if (net.youmi.android.c.b.b.a((JSONObject)localObject2, "f", 1) != 1) {
            break label713;
          }
          bool1 = true;
          Object localObject3 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "g", null);
          if (localObject3 == null) {
            return a(2);
          }
          String str6 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "h", null);
          str2 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "i", null);
          int m = net.youmi.android.c.b.b.a((JSONObject)localObject2, "j", 0);
          str3 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "k", null);
          int n = net.youmi.android.c.b.b.a((JSONObject)localObject2, "l", -1);
          if (net.youmi.android.c.b.b.a((JSONObject)localObject2, "m", 1) == 1)
          {
            bool2 = true;
            str4 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "n", null);
            Object localObject4 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "o", null);
            String str7 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "p", null);
            boolean bool3 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "q", true);
            localObject2 = new a(i, j);
            g localg = new g();
            localg.a((String)localObject5);
            localg.b(str5);
            localg.c(str7);
            ((a)localObject2).a(localg);
            localObject5 = new c();
            ((c)localObject5).i((String)localObject4);
            ((a)localObject2).a((c)localObject5);
            localObject4 = new net.youmi.android.a.a.a.d();
            ((net.youmi.android.a.a.a.d)localObject4).a((String)localObject3);
            ((net.youmi.android.a.a.a.d)localObject4).b(str6);
            ((net.youmi.android.a.a.a.d)localObject4).b(m);
            ((net.youmi.android.a.a.a.d)localObject4).a(k);
            ((a)localObject2).a((net.youmi.android.a.a.a.d)localObject4);
            localObject3 = new f();
            ((f)localObject3).a(bool1);
            ((a)localObject2).a((f)localObject3);
            ((f)localObject3).a((Context)localObject1, str5);
            localObject1 = new i();
            ((i)localObject1).a((a)localObject2);
            ((i)localObject1).a(n);
            ((i)localObject1).b(str2);
            ((i)localObject1).d(str3);
            ((i)localObject1).a(bool2);
            ((i)localObject1).a(str4);
            ((i)localObject1).b(bool3);
            if ((paramJSONObject != null) && (paramJSONObject.e())) {
              ((i)localObject1).a(paramJSONObject);
            }
            parame = parame.a((i)localObject1, new o(l, paramb, str1));
          }
        }
        switch (e.a[parame.ordinal()])
        {
        case 1: 
          parame = a(i);
          return parame;
          bool2 = false;
          continue;
          i = 4;
          break;
        case 2: 
          i = 0;
          continue;
          paramJSONObject = null;
        }
      }
      catch (Throwable parame)
      {
        return null;
      }
      continue;
      label702:
      long l = 0L;
      String str1 = null;
      paramb = null;
      continue;
      label713:
      boolean bool1 = false;
      continue;
      int i = 3;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.a.d
 * JD-Core Version:    0.7.0.1
 */