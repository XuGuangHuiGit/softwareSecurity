package net.youmi.android.a.h.b.a;

import android.content.Context;
import java.util.ArrayList;
import net.youmi.android.a.a.a.a;
import net.youmi.android.a.a.a.f;
import net.youmi.android.a.a.a.g;
import net.youmi.android.a.h.e;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c
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
      Context localContext;
      long l;
      String str;
      Object localObject1;
      int j;
      int i;
      Object localObject2;
      Object localObject3;
      int k;
      return null;
    }
    localContext = parame.a();
    if (localContext == null) {
      return a(3);
    }
    paramb = null;
    l = 0L;
    str = null;
    localObject1 = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
    if (localObject1 != null)
    {
      paramb = net.youmi.android.c.b.b.a((JSONObject)localObject1, "a", null);
      l = net.youmi.android.c.b.b.a((JSONObject)localObject1, "b", 0L);
      str = net.youmi.android.c.b.b.a((JSONObject)localObject1, "c", null);
    }
    paramJSONObject = net.youmi.android.c.b.b.a(paramJSONObject, "b", null);
    if (paramJSONObject == null) {
      return a(2);
    }
    j = paramJSONObject.length();
    if (j <= 0) {
      return a(2);
    }
    localObject1 = new ArrayList(j);
    i = 0;
    if (i < j)
    {
      localObject2 = net.youmi.android.c.b.b.a(paramJSONObject, i, null);
      if (localObject2 == null) {
        break label340;
      }
      localObject3 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "a", null);
      if (localObject3 == null) {
        break label340;
      }
      k = net.youmi.android.c.b.b.a((JSONObject)localObject2, "b", -1);
      if (net.youmi.android.c.b.b.a((JSONObject)localObject2, "c", 0) == 0) {
        break label352;
      }
    }
    label340:
    label352:
    for (boolean bool = true;; bool = false)
    {
      localObject2 = new a(net.youmi.android.c.b.b.a((JSONObject)localObject2, "d", -999), 1);
      g localg = new g();
      localg.b((String)localObject3);
      ((a)localObject2).a(localg);
      if (k > 0)
      {
        localObject3 = new net.youmi.android.a.a.a.d();
        ((net.youmi.android.a.a.a.d)localObject3).a(k);
        ((a)localObject2).a((net.youmi.android.a.a.a.d)localObject3);
      }
      localObject3 = new f();
      ((f)localObject3).a(bool);
      ((a)localObject2).a((f)localObject3);
      ((ArrayList)localObject1).add(localObject2);
      break label340;
      if (((ArrayList)localObject1).size() <= 0) {
        return a(2);
      }
      new Thread(new net.youmi.android.a.h.c.b.d(localContext, parame, (ArrayList)localObject1, paramb, l, str)).start();
      parame = a(0);
      return parame;
      i += 1;
      break;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.a.c
 * JD-Core Version:    0.7.0.1
 */