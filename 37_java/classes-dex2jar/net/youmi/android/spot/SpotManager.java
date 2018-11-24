package net.youmi.android.spot;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import net.youmi.android.f.a.c;
import net.youmi.android.f.a.p;
import net.youmi.android.f.a.u;
import org.json.JSONArray;
import org.json.JSONObject;

public class SpotManager
{
  public static final int GIF_PIC = 2;
  public static final int NORMAL_PIC = 1;
  public static final String PROTOCOLVERSION = "2";
  protected static b a;
  protected static boolean e = false;
  private static String f = "spotDataIT";
  private static long g = 0L;
  private static int h = 0;
  private static SpotManager i;
  protected String b;
  protected String c;
  protected int d;
  private Context j;
  
  private SpotManager(Context paramContext)
  {
    this.j = paramContext;
  }
  
  protected static int a(String paramString)
  {
    try
    {
      paramString = paramString.substring(paramString.lastIndexOf(".") + 1).toLowerCase();
      if ((!paramString.equals("jpg")) && (!paramString.equals("jpeg")))
      {
        if (paramString.equals("png")) {
          return 1;
        }
        boolean bool = paramString.equals("gif");
        if (bool) {
          return 2;
        }
      }
    }
    catch (Throwable paramString) {}
    return 1;
  }
  
  private void a(int paramInt, String paramString, SpotDialogLinstener paramSpotDialogLinstener)
  {
    if (paramInt == 1)
    {
      p.a(this.j, paramString, new j(this, paramSpotDialogLinstener));
      return;
    }
    c.a(this.j, paramString, new k(this, paramSpotDialogLinstener));
  }
  
  private void a(Context paramContext, int paramInt, SpotDialogLinstener paramSpotDialogLinstener)
  {
    try
    {
      this.j = paramContext;
      Activity localActivity = (Activity)paramContext;
      net.youmi.android.c.e.a.a(u.a, "Try to show spot Ads Dialog.", new Object[0]);
      this.d = paramInt;
      e = a();
      if (!e)
      {
        a(e, true, paramSpotDialogLinstener);
        d(paramContext);
        c(paramContext);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        net.youmi.android.c.e.a.b(u.a, localThrowable);
        continue;
        a(paramInt, paramSpotDialogLinstener);
      }
    }
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramBoolean1, paramBoolean2, null);
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2, SpotDialogLinstener paramSpotDialogLinstener)
  {
    if (!paramBoolean1) {
      try
      {
        if (Looper.getMainLooper() == Looper.myLooper())
        {
          new a(this, this.j, paramBoolean2, paramSpotDialogLinstener).execute(new Void[0]);
          return;
        }
        new Handler(Looper.getMainLooper()).post(new g(this, paramBoolean2, paramSpotDialogLinstener));
        return;
      }
      catch (Throwable paramSpotDialogLinstener)
      {
        return;
      }
    }
    try
    {
      new Thread(new h(this)).start();
      return;
    }
    catch (Throwable paramSpotDialogLinstener) {}
  }
  
  protected static void b(Context paramContext)
  {
    int k = 0;
    for (;;)
    {
      try
      {
        Object localObject = paramContext.getSharedPreferences(f, 0).getString("data", "");
        if (localObject != null)
        {
          if (((String)localObject).equals("")) {
            return;
          }
          localObject = net.youmi.android.c.b.b.a(net.youmi.android.c.b.b.a((String)localObject), "ad", null);
          if (localObject != null)
          {
            int m = ((JSONArray)localObject).length();
            if (k < m) {
              try
              {
                String str = net.youmi.android.c.b.b.a(((JSONArray)localObject).getJSONObject(k), "pic", "");
                if (a(str) == 2) {
                  p.a(paramContext, str);
                } else {
                  c.a(paramContext, str);
                }
              }
              catch (Throwable localThrowable) {}
            }
          }
        }
        return;
      }
      catch (Throwable paramContext)
      {
        net.youmi.android.c.e.b.b("SpotAD", paramContext);
      }
      k += 1;
    }
  }
  
  private static void b(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.getSharedPreferences(f, 0).edit();
      paramContext.putString("data", paramString);
      paramContext.commit();
      return;
    }
    catch (Throwable paramContext)
    {
      net.youmi.android.c.e.b.b("SpotAD", paramContext);
    }
  }
  
  protected static void c(Context paramContext)
  {
    try
    {
      new Thread(new l(paramContext)).start();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static boolean checkSpotAdConfig(Context paramContext)
  {
    return net.youmi.android.dev.a.d(paramContext);
  }
  
  protected static void d(Context paramContext)
  {
    try
    {
      new Thread(new m(paramContext)).start();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static SpotManager getInstance(Context paramContext)
  {
    try
    {
      if (i == null) {
        i = new SpotManager(paramContext);
      }
      if (net.youmi.android.b.b.a.b())
      {
        f = "spotDataIT";
        return i;
      }
    }
    catch (Throwable paramContext)
    {
      for (;;)
      {
        net.youmi.android.c.e.b.b("SpotAD", paramContext);
        continue;
        f = "spotData";
      }
    }
  }
  
  public static void setClk(Context paramContext, String paramString)
  {
    try
    {
      String str = net.youmi.android.b.a.a.a(4);
      paramContext = paramContext.getSharedPreferences("CLKDATA", 0).edit();
      paramContext.putString(str, paramString);
      paramContext.commit();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static void setShow(Context paramContext, String paramString)
  {
    try
    {
      String str = net.youmi.android.b.a.a.a(4);
      paramContext = paramContext.getSharedPreferences("SHOWDATA", 0).edit();
      paramContext.putString(str, paramString);
      paramContext.commit();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  protected void a(int paramInt, SpotDialogLinstener paramSpotDialogLinstener)
  {
    paramInt = 0;
    long l = System.currentTimeMillis() - g;
    if (l <= 0L) {}
    do
    {
      do
      {
        a(this.j);
        if ((this.c != null) && (!this.c.equals(""))) {
          break;
        }
        if (paramSpotDialogLinstener != null) {
          paramSpotDialogLinstener.onShowFailed();
        }
        return;
      } while (l > h * 1000);
      net.youmi.android.c.e.a.a(u.a, "插屏广告在%s秒内只能调用一次。", new Object[] { Integer.valueOf(h) });
    } while (paramSpotDialogLinstener == null);
    paramSpotDialogLinstener.onShowFailed();
    return;
    Object localObject = "";
    try
    {
      String str = net.youmi.android.c.b.b.a(net.youmi.android.c.b.b.a(this.c), "pic", "");
      localObject = str;
      int k = a(str);
      paramInt = k;
      localObject = str;
    }
    catch (Throwable localThrowable)
    {
      label139:
      break label139;
    }
    if (Looper.getMainLooper() == Looper.myLooper())
    {
      a(paramInt, (String)localObject, paramSpotDialogLinstener);
      return;
    }
    new Handler(Looper.getMainLooper()).post(new i(this, paramInt, (String)localObject, paramSpotDialogLinstener));
  }
  
  protected void a(Context paramContext)
  {
    JSONObject localJSONObject = net.youmi.android.c.b.b.a(this.b);
    int k = net.youmi.android.c.b.b.a(localJSONObject, "showNum", 0);
    JSONArray localJSONArray = net.youmi.android.c.b.b.a(localJSONObject, "ad", null);
    int n;
    if (localJSONArray != null)
    {
      n = localJSONArray.length();
      if (k <= n - 1) {
        break label154;
      }
      k = 0;
    }
    label154:
    for (;;)
    {
      try
      {
        this.c = localJSONArray.get(k).toString();
        net.youmi.android.c.e.b.a("SpotAD", "showAdString:" + this.c, new Object[0]);
        int m = k + 1;
        k = m;
        if (m >= n) {
          k = 0;
        }
      }
      catch (Throwable localThrowable1)
      {
        try
        {
          localJSONObject.put("showNum", k);
          b(paramContext, localJSONObject.toString());
          return;
          localThrowable1 = localThrowable1;
          net.youmi.android.c.e.b.b("SpotAD", localThrowable1);
        }
        catch (Throwable localThrowable2)
        {
          net.youmi.android.c.e.b.b("SpotAD", localThrowable2);
        }
      }
    }
  }
  
  protected void a(Context paramContext, String paramString)
  {
    try
    {
      paramString = net.youmi.android.c.b.b.a(paramString);
      int k = net.youmi.android.c.b.b.a(paramString, "c", -1);
      if (k == 0)
      {
        paramString.put("receiveTime", System.currentTimeMillis());
        paramContext = paramContext.getSharedPreferences(f, 0).edit();
        paramContext.putString("data", paramString.toString());
        paramContext.commit();
        return;
      }
      paramContext = net.youmi.android.f.a.b.a(k);
      net.youmi.android.c.e.a.a(u.a, "YoumiSpotAd request result code:%d, %s", new Object[] { Integer.valueOf(k), paramContext });
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  protected void a(SpotDialogLinstener paramSpotDialogLinstener)
  {
    if ((a == null) || (a.isShowing())) {}
    try
    {
      a.dismiss();
      try
      {
        label21:
        a = null;
        label25:
        if (this.d == 0) {}
        try
        {
          if ((((Activity)this.j).getWindow().getAttributes().flags & 0x400) == 1024) {}
          for (this.d = 16973841;; this.d = 16973840)
          {
            a = new b(this.j, this.d, this.c, paramSpotDialogLinstener);
            return;
          }
        }
        catch (Throwable localThrowable1)
        {
          for (;;)
          {
            this.d = 16973841;
          }
        }
      }
      catch (Throwable localThrowable2)
      {
        break label25;
      }
    }
    catch (Throwable localThrowable3)
    {
      break label21;
    }
  }
  
  protected boolean a()
  {
    Object localObject = this.j.getSharedPreferences(f, 0);
    this.b = ((SharedPreferences)localObject).getString("data", "");
    g = ((SharedPreferences)localObject).getLong("lastShowTime", 0L);
    long l;
    int k;
    if ((this.b != null) && (!this.b.equals("")))
    {
      localObject = net.youmi.android.c.b.b.a(this.b);
      l = net.youmi.android.c.b.b.a((JSONObject)localObject, "receiveTime", 0L);
      k = net.youmi.android.c.b.b.a((JSONObject)localObject, "exp", 0);
      h = net.youmi.android.c.b.b.a((JSONObject)localObject, "sg", 0);
    }
    return System.currentTimeMillis() - l <= k * 1000;
  }
  
  public Dialog getSpotDialog()
  {
    return a;
  }
  
  public void loadSpotAds()
  {
    try
    {
      e = a();
      net.youmi.android.c.e.a.a(u.a, "Try to load spot Ads resources.", new Object[0]);
      a(e, false);
      d(this.j);
      c(this.j);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void showSpotAds(Context paramContext)
  {
    showSpotAds(paramContext, 0);
  }
  
  public void showSpotAds(Context paramContext, int paramInt)
  {
    a(paramContext, paramInt, null);
  }
  
  public void showSpotAds(Context paramContext, int paramInt, SpotDialogLinstener paramSpotDialogLinstener)
  {
    a(paramContext, paramInt, paramSpotDialogLinstener);
  }
  
  public void showSpotAds(Context paramContext, SpotDialogLinstener paramSpotDialogLinstener)
  {
    showSpotAds(paramContext, 0, paramSpotDialogLinstener);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.spot.SpotManager
 * JD-Core Version:    0.7.0.1
 */