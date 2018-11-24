package net.youmi.android.smart;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import net.youmi.android.SmartBannerService;
import net.youmi.android.f.a.u;
import org.json.JSONObject;

public class b
{
  protected static String a = "";
  protected static String b = "";
  private static int c;
  private static int d;
  
  public static final void a(Context paramContext, int paramInt)
  {
    try
    {
      Object localObject = ((ActivityManager.RunningTaskInfo)((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(2147483647).get(0)).topActivity;
      a = ((ComponentName)localObject).getPackageName();
      b = ((ComponentName)localObject).getClassName();
      localObject = net.youmi.android.smart.a.b.b(paramContext);
      if (paramContext.getPackageName().equals(a))
      {
        if (paramInt == 0)
        {
          ((net.youmi.android.smart.a.b)localObject).a.a(a, System.currentTimeMillis());
          return;
        }
        ((net.youmi.android.smart.a.b)localObject).a.a(a, 0, 0, System.currentTimeMillis(), 1, System.currentTimeMillis());
      }
      for (;;)
      {
        net.youmi.android.c.e.a.a(u.a, "请求SmartBanner", new Object[0]);
        int i;
        try
        {
          i = SmartBannerManager.e(paramContext);
          if (Looper.getMainLooper() != Looper.myLooper()) {
            break label391;
          }
          new d(paramContext, a, b, c, d, paramInt, i).execute(new Void[0]);
          return;
        }
        catch (Throwable paramContext)
        {
          net.youmi.android.c.e.b.c(u.a, paramContext);
          return;
        }
        ((net.youmi.android.smart.a.b)localObject).a.a(a, System.currentTimeMillis());
        net.youmi.android.smart.c.a locala = ((net.youmi.android.smart.a.b)localObject).a.b(a);
        if (locala != null)
        {
          long l1;
          long l2;
          try
          {
            l1 = locala.a();
            l2 = locala.b();
            if (locala.c() == 1L)
            {
              l1 = ((net.youmi.android.smart.a.b)localObject).a.c(a);
              if (((net.youmi.android.smart.a.b)localObject).a.c(paramContext.getPackageName()) >= l1) {
                break;
              }
              SmartBannerManager.c(paramContext);
              return;
            }
          }
          catch (Throwable paramContext)
          {
            return;
          }
          if ((l2 == 1L) || (l1 != 1L)) {
            break;
          }
          label391:
          try
          {
            localObject = SmartBannerService.cachePackage;
            if ((localObject == null) || (((String)localObject).equals("")) || (!((String)localObject).equals(a))) {
              continue;
            }
            l2 = SmartBannerService.cachePackageSM;
            i = SmartBannerService.nextTime;
            l1 = System.currentTimeMillis();
            if (l1 - l2 <= i * 1000) {
              break;
            }
            localObject = SmartBannerService.cacheActivity;
            l2 = SmartBannerService.cacheActivitySM;
            i = SmartBannerService.acNextTime;
            if ((localObject == null) || (((String)localObject).equals(""))) {
              continue;
            }
            boolean bool = ((String)localObject).equals(b);
            if (!bool) {
              continue;
            }
            if (l1 - l2 <= i * 1000) {
              break;
            }
          }
          catch (Throwable localThrowable) {}
          new Handler(Looper.getMainLooper()).post(new c(paramContext, paramInt, i));
          return;
        }
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  protected static void a(Context paramContext, String paramString, int paramInt)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    int i;
    for (int j = 48;; j = i)
    {
      try
      {
        localJSONObject = net.youmi.android.c.b.b.a(paramString);
        i = net.youmi.android.c.b.b.a(localJSONObject, "c", -1);
        if (i == 0)
        {
          net.youmi.android.c.b.b.a(localJSONObject, "id", 0);
          paramString = net.youmi.android.c.b.b.a(localJSONObject, "html", "");
          i = j;
          localObject1 = localObject2;
        }
      }
      catch (Throwable paramString)
      {
        JSONObject localJSONObject;
        int k;
        int m;
        paramString = null;
        i = j;
      }
      try
      {
        localObject2 = net.youmi.android.c.b.b.a(localJSONObject, "jsc", "");
        i = j;
        localObject1 = localObject2;
        k = net.youmi.android.c.b.b.a(localJSONObject, "nt", 300);
        i = j;
        localObject1 = localObject2;
        m = net.youmi.android.c.b.b.a(localJSONObject, "acnt", 0);
        i = j;
        localObject1 = localObject2;
        c = net.youmi.android.c.b.b.a(localJSONObject, "width", 320);
        i = j;
        localObject1 = localObject2;
        d = net.youmi.android.c.b.b.a(localJSONObject, "height", 60);
        i = j;
        localObject1 = localObject2;
        j = net.youmi.android.c.b.b.a(localJSONObject, "gravity", 48);
        i = j;
        localObject1 = localObject2;
        SmartBannerService.nextTime = k;
        i = j;
        localObject1 = localObject2;
        SmartBannerService.acNextTime = m;
        i = j;
        localObject1 = localObject2;
        SmartBannerService.cacheActivitySM = System.currentTimeMillis();
        i = j;
        localObject1 = localObject2;
        SmartBannerService.cachePackageSM = System.currentTimeMillis();
        i = j;
        localObject1 = localObject2;
        SmartBannerService.cachePackage = a;
        i = j;
        localObject1 = localObject2;
        SmartBannerService.cacheActivity = b;
        localObject1 = localObject2;
        localObject2 = net.youmi.android.c.k.d.a(paramContext);
        c = ((net.youmi.android.c.k.d)localObject2).b(c);
        d = ((net.youmi.android.c.k.d)localObject2).b(d);
        new a(paramContext, new g(paramContext, c, d, paramString, localObject1, paramInt), j);
        SmartBannerManager.a(paramContext, 3000L);
        return;
      }
      catch (Throwable localThrowable)
      {
        continue;
      }
      paramString = net.youmi.android.f.a.b.a(i);
      net.youmi.android.c.e.a.a(u.a, "SmartBanner request result code:%d, %s", new Object[] { Integer.valueOf(i), paramString });
      i = net.youmi.android.c.b.b.a(localJSONObject, "nt", 300);
      k = net.youmi.android.c.b.b.a(localJSONObject, "acnt", 0);
      SmartBannerService.nextTime = i;
      SmartBannerService.acNextTime = k;
      SmartBannerService.cacheActivitySM = System.currentTimeMillis();
      SmartBannerService.cachePackageSM = System.currentTimeMillis();
      SmartBannerService.cachePackage = a;
      SmartBannerService.cacheActivity = b;
      return;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.smart.b
 * JD-Core Version:    0.7.0.1
 */