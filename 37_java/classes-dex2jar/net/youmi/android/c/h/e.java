package net.youmi.android.c.h;

import android.content.Context;
import net.youmi.android.c.g.c;
import net.youmi.android.c.g.d;
import org.apache.http.Header;
import org.json.JSONObject;

final class e
  implements Runnable
{
  e(net.youmi.android.c.g.b paramb, d paramd, Context paramContext, c paramc) {}
  
  public void run()
  {
    int j = 0;
    JSONObject localJSONObject1 = new JSONObject();
    try
    {
      localJSONObject1.put("rt", System.currentTimeMillis());
      localJSONObject1.put("code", this.a.a());
      localJSONObject1.put("ert", this.b.a());
      localJSONObject1.put("sv", 405);
      localJSONObject1.put("apn", b.a(this.c));
      localJSONObject1.put("req", this.d.a());
      localJSONObject1.put("response", this.a.e());
      localJSONObject1.put("process", this.a.d());
      localJSONObject2 = new JSONObject();
      i = 0;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        JSONObject localJSONObject2;
        int i;
        Header localHeader;
        continue;
        i += 1;
        continue;
        i += 1;
      }
    }
    if (i < this.a.b().length)
    {
      localHeader = this.a.b()[i];
      if (localHeader != null) {
        localJSONObject2.put(localHeader.getName(), localHeader.getValue());
      }
    }
    else
    {
      localJSONObject1.put("req-header", localJSONObject2.toString());
      localJSONObject2 = new JSONObject();
      i = j;
      if (i < this.a.g().length)
      {
        localHeader = this.a.g()[i];
        if (localHeader == null) {
          break label303;
        }
        localJSONObject2.put(localHeader.getName(), localHeader.getValue());
        break label303;
      }
      localJSONObject1.put("rsp-header", localJSONObject2);
      localJSONObject1.put("exception", this.a.c());
      localJSONObject1.put("type", "get");
      net.youmi.android.c.g.e.a(this.c, localJSONObject1);
      return;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.h.e
 * JD-Core Version:    0.7.0.1
 */