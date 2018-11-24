package net.youmi.android.smart.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import net.youmi.android.SmartBannerActivity;
import net.youmi.android.a.h.f;
import net.youmi.android.a.h.i;
import net.youmi.android.a.h.j;
import net.youmi.android.a.h.l;
import net.youmi.android.a.h.m;
import net.youmi.android.a.h.n;
import net.youmi.android.a.h.o;
import net.youmi.android.a.h.p;
import net.youmi.android.a.k.a.d;
import net.youmi.android.d.g.a;

public class b
  extends a
{
  private int e;
  
  public b(Context paramContext, d paramd, l paraml, int paramInt)
  {
    super(paramContext, paramd, paraml);
    this.e = paramInt;
  }
  
  public Context a()
  {
    return super.a();
  }
  
  public String a(String paramString1, String paramString2)
  {
    return super.a(paramString1, paramString2);
  }
  
  public String a(j paramj)
  {
    return super.a(paramj);
  }
  
  public f a(int paramInt)
  {
    return super.a(paramInt);
  }
  
  public f a(int paramInt, j paramj)
  {
    return super.a(paramInt, paramj);
  }
  
  public f a(Context paramContext, List paramList)
  {
    return super.a(paramContext, paramList);
  }
  
  public f a(String paramString)
  {
    return super.a(paramString);
  }
  
  public f a(String paramString1, String paramString2, String paramString3, long paramLong)
  {
    return super.a(paramString1, paramString2, paramString3, paramLong);
  }
  
  public f a(i parami, o paramo)
  {
    return super.a(parami, paramo);
  }
  
  public f a(m paramm)
  {
    return super.a(paramm);
  }
  
  public f a(n paramn)
  {
    return super.a(paramn);
  }
  
  public f a(p paramp)
  {
    return super.a(paramp);
  }
  
  public void a(d paramd)
  {
    super.a(paramd);
  }
  
  public Activity b()
  {
    return super.b();
  }
  
  public f b(p paramp)
  {
    if (paramp != null) {}
    try
    {
      if ((this.d != null) && (this.d.g() != null) && (paramp.g() == null)) {
        paramp.a(this.d.g());
      }
      try
      {
        label39:
        Intent localIntent;
        if (this.a != null)
        {
          localIntent = new Intent(this.a, SmartBannerActivity.class);
          localIntent.addFlags(268435456);
        }
        for (;;)
        {
          if (this.e == 0) {
            localIntent.addFlags(8388608);
          }
          localIntent.putExtra("aca5522945c72310f9f22b333c68f2b3", paramp);
          g().startActivity(localIntent);
          return f.b;
          localIntent = new Intent(this.b, SmartBannerActivity.class);
          localIntent.addFlags(268435456);
        }
        return f.c;
      }
      catch (Throwable paramp) {}
    }
    catch (Throwable localThrowable)
    {
      break label39;
    }
  }
  
  public f c()
  {
    return super.c();
  }
  
  public int d()
  {
    return super.d();
  }
  
  public int e()
  {
    return super.e();
  }
  
  public f f()
  {
    return super.f();
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.smart.b.b
 * JD-Core Version:    0.7.0.1
 */