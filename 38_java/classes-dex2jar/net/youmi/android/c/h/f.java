package net.youmi.android.c.h;

import android.content.Context;
import java.util.List;
import net.youmi.android.c.g.c;
import net.youmi.android.c.g.d;
import net.youmi.android.c.g.e;
import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.json.JSONObject;

final class f
  implements Runnable
{
  f(net.youmi.android.c.g.b paramb, d paramd, Context paramContext, c paramc, List paramList) {}
  
  public void run()
  {
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
        Object localObject;
        continue;
        i += 1;
        continue;
        i += 1;
      }
    }
    if (i < this.a.b().length)
    {
      localObject = this.a.b()[i];
      if (localObject != null) {
        localJSONObject2.put(((Header)localObject).getName(), ((Header)localObject).getValue());
      }
    }
    else
    {
      localJSONObject1.put("req-header", localJSONObject2.toString());
      localJSONObject2 = new JSONObject();
      i = 0;
      if (i < this.a.g().length)
      {
        localObject = this.a.g()[i];
        if (localObject == null) {
          break label369;
        }
        localJSONObject2.put(((Header)localObject).getName(), ((Header)localObject).getValue());
        break label369;
      }
      localJSONObject1.put("rsp-header", localJSONObject2);
      localJSONObject1.put("exception", this.a.c());
      localJSONObject1.put("type", "post");
      localJSONObject2 = new JSONObject();
      i = 0;
      while (i < this.e.size())
      {
        localObject = (NameValuePair)this.e.get(i);
        localJSONObject2.put(((NameValuePair)localObject).getName(), ((NameValuePair)localObject).getValue());
        i += 1;
      }
      localJSONObject1.put("post-data", localJSONObject2.toString());
      e.a(this.c, localJSONObject1);
      return;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.h.f
 * JD-Core Version:    0.7.0.1
 */