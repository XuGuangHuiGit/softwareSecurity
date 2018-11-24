package net.youmi.android.banner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.widget.RelativeLayout.LayoutParams;
import java.util.List;
import java.util.Timer;
import net.youmi.android.AdBrowser;
import net.youmi.android.a.h.i;
import net.youmi.android.a.h.m;
import net.youmi.android.a.h.n;
import net.youmi.android.a.h.o;
import net.youmi.android.a.h.p;
import net.youmi.android.f.a.u;
import org.json.JSONObject;

public class e
  implements net.youmi.android.a.h.e, b, d
{
  public Context a;
  protected Handler b = new Handler();
  protected AdView c;
  int d = 0;
  public int e = 0;
  g f = new g(this);
  a g;
  c h;
  private int i = 30000;
  private int j = 0;
  private Timer k;
  private f l;
  
  protected e(Context paramContext, AdView paramAdView)
  {
    this.a = paramContext;
    this.c = paramAdView;
    this.k = new Timer();
  }
  
  private void b(String paramString)
  {
    if (paramString != null) {}
    int m;
    try
    {
      if (paramString.equals(""))
      {
        net.youmi.android.c.e.a.a(u.a, "网络连接失败，等待30s后再次请求", new Object[0]);
        this.i = 30000;
        if (this.c.a == null) {
          return;
        }
        this.c.a.onFailedToReceivedAd(this.c);
        return;
      }
      Object localObject = net.youmi.android.c.b.b.a(paramString);
      m = net.youmi.android.c.b.b.a((JSONObject)localObject, "c", -1);
      if (m == 0)
      {
        m = net.youmi.android.c.b.b.a((JSONObject)localObject, "bannerid", 0);
        paramString = net.youmi.android.c.b.b.a((JSONObject)localObject, "rsd", null);
        String str1 = net.youmi.android.c.b.b.a((JSONObject)localObject, "e", null);
        String str2 = net.youmi.android.c.b.b.a((JSONObject)localObject, "html", null);
        String str3 = net.youmi.android.c.b.b.a((JSONObject)localObject, "jsc", "");
        String str4 = net.youmi.android.c.b.b.a((JSONObject)localObject, "jsc", "");
        String str5 = net.youmi.android.c.b.b.a((JSONObject)localObject, "plc", "");
        int n = net.youmi.android.c.b.b.a((JSONObject)localObject, "st", 30);
        if ((paramString == null) || ("".equals(paramString)) || (str1 == null) || (str1.equals("")) || (str2 == null) || (str2.equals(""))) {
          return;
        }
        this.j = m;
        net.youmi.android.c.e.b.b(u.a, "bannerId is:" + m, new Object[0]);
        localObject = new h();
        ((h)localObject).a(m);
        ((h)localObject).b(str1);
        ((h)localObject).c(str2);
        ((h)localObject).d(str3);
        ((h)localObject).e(str4);
        ((h)localObject).a(paramString);
        ((h)localObject).b(n);
        ((h)localObject).f(str5);
        BannerManager.setBannerObject(m, (h)localObject);
        if (n > 0) {
          this.i = (n * 1000);
        }
        this.e = 1;
        this.f.sendEmptyMessage(1);
        if (this.c.a == null) {
          return;
        }
        this.c.a.onReceivedAd(this.c);
        return;
      }
    }
    catch (Throwable paramString)
    {
      paramString = paramString;
      net.youmi.android.c.e.b.c(paramString);
      return;
    }
    finally {}
    paramString = net.youmi.android.f.a.b.a(m);
    net.youmi.android.c.e.a.a(u.a, "YoumiAd request result code:%d, %s", new Object[] { Integer.valueOf(m), paramString });
    if (this.c.a != null) {
      this.c.a.onFailedToReceivedAd(this.c);
    }
  }
  
  private void b(h paramh)
  {
    try
    {
      int m = paramh.a();
      String str1 = paramh.b();
      String str2 = paramh.c();
      paramh = paramh.g();
      if (this.h == null)
      {
        this.h = new c(this.a, this);
        this.h.a();
        this.h.a(this);
      }
      this.h.a(m, str1, str2, paramh);
      this.h.b();
      return;
    }
    catch (Throwable paramh)
    {
      net.youmi.android.c.e.a.b(paramh);
    }
  }
  
  private String m()
  {
    try
    {
      String str = net.youmi.android.f.a.a.a(this.a, this.c.b);
      return str;
    }
    catch (Throwable localThrowable)
    {
      net.youmi.android.c.e.b.c(localThrowable);
    }
    return "";
  }
  
  public Context a()
  {
    return this.a.getApplicationContext();
  }
  
  public String a(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = net.youmi.android.d.b.a.a(a(), paramString1, paramString2, 405);
      return paramString1;
    }
    catch (Throwable paramString1) {}
    return null;
  }
  
  public String a(net.youmi.android.a.h.j paramj)
  {
    try
    {
      paramj = net.youmi.android.d.b.a.a(a(), paramj);
      return paramj;
    }
    catch (Throwable paramj) {}
    return null;
  }
  
  public net.youmi.android.a.h.f a(int paramInt)
  {
    try
    {
      this.g.a.setVisibility(paramInt);
      return net.youmi.android.a.h.f.b;
    }
    catch (Throwable localThrowable) {}
    return net.youmi.android.a.h.f.a;
  }
  
  public net.youmi.android.a.h.f a(int paramInt, net.youmi.android.a.h.j paramj)
  {
    try
    {
      new net.youmi.android.d.d.a.d(this.a, paramj, paramInt).start();
      paramj = net.youmi.android.a.h.f.b;
      return paramj;
    }
    catch (Throwable paramj) {}
    return net.youmi.android.a.h.f.c;
  }
  
  public net.youmi.android.a.h.f a(Context paramContext, List paramList)
  {
    try
    {
      net.youmi.android.d.d.a.c.a(paramContext, paramList);
      paramContext = net.youmi.android.a.h.f.b;
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return net.youmi.android.a.h.f.a;
  }
  
  public net.youmi.android.a.h.f a(String paramString)
  {
    return net.youmi.android.a.h.f.a;
  }
  
  public net.youmi.android.a.h.f a(String paramString1, String paramString2, String paramString3, long paramLong)
  {
    return net.youmi.android.a.h.f.a;
  }
  
  public net.youmi.android.a.h.f a(i parami, o paramo)
  {
    try
    {
      net.youmi.android.d.a.a.a(this.a).a(parami, paramo);
      return net.youmi.android.a.h.f.b;
    }
    catch (Throwable parami) {}
    return net.youmi.android.a.h.f.a;
  }
  
  public net.youmi.android.a.h.f a(m paramm)
  {
    try
    {
      net.youmi.android.c.e.a.a(u.a, "打开新的浏览器", new Object[0]);
      paramm = paramm.a(0);
      Intent localIntent = new Intent(this.a, AdBrowser.class);
      localIntent.putExtra("aca5522945c72310f9f22b333c68f2b3", paramm);
      localIntent.setFlags(268435456);
      this.a.startActivity(localIntent);
      return net.youmi.android.a.h.f.b;
    }
    catch (Throwable paramm) {}
    return net.youmi.android.a.h.f.c;
  }
  
  public net.youmi.android.a.h.f a(n paramn)
  {
    return net.youmi.android.a.h.f.a;
  }
  
  public net.youmi.android.a.h.f a(p paramp)
  {
    try
    {
      net.youmi.android.d.a.b(this.a, paramp).show();
      net.youmi.android.c.e.a.a(u.a, "不支持打开新的dialog", new Object[0]);
      label24:
      return net.youmi.android.a.h.f.a;
    }
    catch (Throwable paramp)
    {
      break label24;
    }
  }
  
  public void a(net.youmi.android.a.k.a.d paramd) {}
  
  public void a(h paramh)
  {
    for (;;)
    {
      try
      {
        net.youmi.android.c.e.b.b(u.a, "尝试读取 jsCacheManager CurrentBannerId:" + BannerManager.a(), new Object[0]);
        localObject = net.youmi.android.a.h.a.b.a(this.a).a("banner_state_" + BannerManager.a());
        if (localObject == null) {
          this.d = 0;
        }
      }
      catch (Throwable localThrowable)
      {
        Object localObject;
        int m;
        String str1;
        String str2;
        String str3;
        net.youmi.android.c.e.b.c(u.a, localThrowable);
        continue;
      }
      try
      {
        net.youmi.android.c.e.b.b(u.a, "jsCacheKey:" + this.d, new Object[0]);
        m = paramh.a();
        localObject = paramh.b();
        str1 = paramh.c();
        str2 = paramh.e();
        str3 = paramh.f();
        paramh = paramh.d();
        if (this.g == null)
        {
          this.g = new a(this.a, this);
          this.g.a();
          this.g.a(this);
        }
        this.g.a.setBackgroundColor(0);
        this.g.a(m, (String)localObject, str1, str2, str3, paramh);
        if (this.d != 1) {
          break label341;
        }
        net.youmi.android.a.h.a.b.a(this.a).b("banner_state_" + BannerManager.a());
        this.g.d();
        net.youmi.android.c.e.a.a(u.a, "切换广告", new Object[0]);
        if (this.c.a != null) {
          this.c.a.onSwitchedAd(this.c);
        }
        BannerManager.a(m);
        i();
        return;
      }
      catch (Throwable paramh)
      {
        net.youmi.android.c.e.a.b(paramh);
        return;
      }
      localObject = ((net.youmi.android.a.h.a.a)localObject).b();
      if (localObject != null)
      {
        this.d = Integer.valueOf((String)localObject).intValue();
        continue;
        label341:
        this.g.b();
        this.g.c();
        this.d = 1;
      }
    }
  }
  
  public Activity b()
  {
    return null;
  }
  
  public net.youmi.android.a.h.f b(p paramp)
  {
    return null;
  }
  
  public void b(int paramInt)
  {
    if (BannerManager.getBannerObject(paramInt) != null)
    {
      if (this.c.getChildCount() == 0)
      {
        RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(this.c.c, this.c.d);
        this.c.addView(this.g.e().getCurrentView(), localLayoutParams);
      }
      this.c.setVisibility(0);
      this.g.a.setVisibility(0);
      this.e = 1;
      net.youmi.android.c.e.a.a(u.a, "切换广告", new Object[0]);
      if (this.c.a != null) {
        this.c.a.onSwitchedAd(this.c);
      }
    }
  }
  
  public net.youmi.android.a.h.f c()
  {
    this.c.setVisibility(8);
    return net.youmi.android.a.h.f.b;
  }
  
  public void c(int paramInt)
  {
    h localh = BannerManager.getBannerObject(paramInt);
    if (localh != null) {
      a(localh);
    }
  }
  
  public int d()
  {
    return 405;
  }
  
  public int e()
  {
    return 1;
  }
  
  public net.youmi.android.a.h.f f()
  {
    try
    {
      this.g.e().reload();
      return net.youmi.android.a.h.f.b;
    }
    catch (Throwable localThrowable) {}
    return net.youmi.android.a.h.f.c;
  }
  
  protected void g()
  {
    try
    {
      this.e = 0;
      this.l = new f(this);
      if (this.k == null) {
        this.k = new Timer();
      }
      this.k.schedule(this.l, 0L, 30000L);
      return;
    }
    catch (Throwable localThrowable)
    {
      net.youmi.android.c.e.a.b(localThrowable);
    }
  }
  
  protected void h()
  {
    try
    {
      this.e = 3;
      this.k.cancel();
      this.l.cancel();
      this.k = null;
      this.l = null;
      j();
      return;
    }
    catch (Throwable localThrowable)
    {
      net.youmi.android.c.e.a.b(localThrowable);
    }
  }
  
  protected void i()
  {
    if (this.k != null)
    {
      this.k.cancel();
      this.k = null;
    }
    this.k = new Timer();
    this.l.cancel();
    this.l = null;
    this.l = new f(this);
    this.k.schedule(this.l, this.i, 30000L);
  }
  
  public void j()
  {
    try
    {
      if (this.c != null) {
        this.c.removeAllViews();
      }
      if (this.g != null)
      {
        this.g.e().destroy();
        this.g = null;
      }
      if (this.h != null)
      {
        this.h.c().destroy();
        this.h = null;
      }
      net.youmi.android.a.h.a.b.a(this.a).b("banner_state_" + BannerManager.a());
      return;
    }
    catch (Throwable localThrowable)
    {
      net.youmi.android.c.e.a.b(localThrowable);
    }
  }
  
  protected void k()
  {
    l();
  }
  
  protected void l()
  {
    b(m());
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.banner.e
 * JD-Core Version:    0.7.0.1
 */