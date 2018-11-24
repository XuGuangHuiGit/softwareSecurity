package net.youmi.android.d.c;

import android.content.Context;
import net.youmi.android.c.c.g;
import net.youmi.android.c.g.c;
import net.youmi.android.c.g.d;
import net.youmi.android.c.g.e;
import org.json.JSONObject;

class b
  extends Thread
{
  Context a;
  
  b(Context paramContext)
  {
    try
    {
      this.a = paramContext.getApplicationContext();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static String a()
  {
    try
    {
      String str = g.b("0d4d40490d1c170a544c544e1e1a0c475e0c1e0f06464b085b571542504409", "yKl76nGU1e7a");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  public void run()
  {
    super.run();
    try
    {
      if (this.a == null) {
        return;
      }
      Object localObject1 = a();
      if (localObject1 != null)
      {
        Object localObject3 = new c();
        ((c)localObject3).a((String)localObject1);
        localObject1 = new d(this.a, (c)localObject3);
        ((d)localObject1).c();
        localObject3 = ((d)localObject1).d();
        if (localObject3 != null) {
          try
          {
            ((d)localObject1).d();
            JSONObject localJSONObject = net.youmi.android.c.b.b.a(((d)localObject1).d());
            localObject1 = localJSONObject.getString("host");
            int i = localJSONObject.getInt("port");
            int j = localJSONObject.getInt("next");
            Object localObject4 = localJSONObject.getJSONObject("wifi");
            localObject3 = ((JSONObject)localObject4).getString("type");
            int k = ((JSONObject)localObject4).getInt("rate");
            Object localObject5 = localJSONObject.getJSONObject("3g");
            localObject4 = ((JSONObject)localObject5).getString("type");
            int m = ((JSONObject)localObject5).getInt("rate");
            localJSONObject = localJSONObject.getJSONObject("2g");
            localObject5 = localJSONObject.getString("type");
            int n = localJSONObject.getInt("rate");
            e.a(this.a, (String)localObject1, i, j, (String)localObject3, k, (String)localObject4, m, (String)localObject5, n);
            return;
          }
          catch (Throwable localThrowable1)
          {
            net.youmi.android.c.e.b.b(localThrowable1);
            return;
          }
        }
      }
      return;
    }
    catch (Throwable localThrowable2)
    {
      localThrowable2 = localThrowable2;
      return;
    }
    finally {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.c.b
 * JD-Core Version:    0.7.0.1
 */