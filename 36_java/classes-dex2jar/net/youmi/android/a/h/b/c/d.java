package net.youmi.android.a.h.b.c;

import java.util.ArrayList;
import java.util.List;
import net.youmi.android.a.h.a.a;
import net.youmi.android.a.h.e;
import org.json.JSONArray;
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
    catch (Throwable parame) {}
    parame = parame.a();
    if (parame == null) {
      return a(3);
    }
    paramb = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
    if (paramb == null) {
      return a(2);
    }
    int j = paramb.length();
    if (j <= 0) {
      return a(2);
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    for (;;)
    {
      if (i < j)
      {
        Object localObject2 = net.youmi.android.c.b.b.a(paramb, i, null);
        if (localObject2 != null)
        {
          Object localObject1 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "a", null);
          if (localObject1 != null)
          {
            localObject2 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "b", null);
            if (localObject2 != null)
            {
              long l2 = net.youmi.android.c.b.b.a(paramJSONObject, "c", 0L) * 1000L;
              long l1 = l2;
              if (l2 < 0L) {
                l1 = -1L;
              }
              localObject1 = new a((String)localObject1);
              if (((a)localObject1).a())
              {
                ((a)localObject1).a((String)localObject2);
                ((a)localObject1).a(l1);
                localArrayList.add(localObject1);
              }
            }
          }
        }
      }
      else
      {
        if (net.youmi.android.a.h.a.b.a(parame).a(localArrayList)) {
          return a(0);
        }
        parame = a(3);
        return parame;
      }
      i += 1;
    }
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.c.d
 * JD-Core Version:    0.7.0.1
 */