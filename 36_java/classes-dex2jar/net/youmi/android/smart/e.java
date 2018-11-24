package net.youmi.android.smart;

import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.ResolveInfo;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

final class e
  implements Runnable
{
  e(Context paramContext, net.youmi.android.smart.a.b paramb) {}
  
  public void run()
  {
    Object localObject1 = new StringBuffer();
    Object localObject3 = SmartBannerManager.a(this.a.getPackageManager()).iterator();
    Object localObject4;
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = ((ResolveInfo)((Iterator)localObject3).next()).activityInfo;
      if (this.b.a.a(((ComponentInfo)localObject4).packageName) <= 0L)
      {
        this.b.a.b(((ComponentInfo)localObject4).packageName, 0, 0, 0L, 0, 0L);
        ((StringBuffer)localObject1).append(((ComponentInfo)localObject4).packageName);
        ((StringBuffer)localObject1).append("|");
      }
    }
    localObject1 = net.youmi.android.f.a.a.a(this.a, ((StringBuffer)localObject1).toString(), 0L);
    if (localObject1 != null) {}
    for (;;)
    {
      int i;
      try
      {
        if (((String)localObject1).equals("")) {
          return;
        }
        localObject3 = net.youmi.android.c.b.b.a((String)localObject1);
        if (((JSONObject)localObject3).getInt("c") != 0) {
          break label324;
        }
        localObject1 = net.youmi.android.c.b.b.a((JSONObject)localObject3, "wl", null);
        if (localObject1 != null)
        {
          localObject1 = ((JSONObject)localObject1).names();
          if ((localObject1 != null) && (((JSONArray)localObject1).length() > 0))
          {
            i = 0;
            if (i < ((JSONArray)localObject1).length())
            {
              localObject4 = net.youmi.android.c.b.b.a((JSONArray)localObject1, i, "");
              if (((String)localObject4).equals("")) {
                break label325;
              }
              this.b.a.a((String)localObject4, 1, 0, 0L, 0, 0L);
              break label325;
            }
          }
          localObject1 = net.youmi.android.c.b.b.a((JSONObject)localObject3, "bl", null);
          if ((localObject1 != null) && (((JSONArray)localObject1).length() > 0))
          {
            i = 0;
            if (i < ((JSONArray)localObject1).length())
            {
              localObject4 = net.youmi.android.c.b.b.a((JSONArray)localObject1, i, "");
              if (!((String)localObject4).equals("")) {
                this.b.a.a((String)localObject4, 0, 1, 0L, 0, 0L);
              }
              i += 1;
              continue;
            }
          }
          try
          {
            i = net.youmi.android.c.b.b.a((JSONObject)localObject3, "lpc", 5);
            SmartBannerManager.a(this.a, i);
            return;
          }
          catch (Throwable localThrowable1)
          {
            return;
          }
        }
        Object localObject2 = null;
      }
      catch (Throwable localThrowable2)
      {
        return;
      }
      continue;
      label324:
      return;
      label325:
      i += 1;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.smart.e
 * JD-Core Version:    0.7.0.1
 */