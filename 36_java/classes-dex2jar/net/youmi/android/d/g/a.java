package net.youmi.android.d.g;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import net.youmi.android.a.h.f;
import net.youmi.android.a.h.i;
import net.youmi.android.a.h.j;
import net.youmi.android.a.h.l;
import net.youmi.android.a.h.m;
import net.youmi.android.a.h.n;
import net.youmi.android.a.h.o;
import net.youmi.android.a.h.p;
import org.apache.http.util.EncodingUtils;

public class a
  implements net.youmi.android.a.h.e
{
  protected Activity a;
  protected Context b;
  protected net.youmi.android.a.k.a.d c;
  protected l d;
  
  public a(Activity paramActivity, net.youmi.android.a.k.a.d paramd, l paraml)
  {
    this.a = paramActivity;
    this.b = this.a.getApplicationContext();
    this.c = paramd;
    this.d = paraml;
  }
  
  public a(Context paramContext, net.youmi.android.a.k.a.d paramd, l paraml)
  {
    if ((paramContext instanceof Activity)) {
      this.a = ((Activity)paramContext);
    }
    this.b = paramContext.getApplicationContext();
    this.c = paramd;
    this.d = paraml;
  }
  
  public Context a()
  {
    return this.b;
  }
  
  public String a(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = net.youmi.android.d.b.a.a(a(), paramString1, paramString2, d());
      return paramString1;
    }
    catch (Throwable paramString1) {}
    return null;
  }
  
  public String a(j paramj)
  {
    try
    {
      paramj = net.youmi.android.d.b.a.a(a(), paramj);
      return paramj;
    }
    catch (Throwable paramj) {}
    return null;
  }
  
  public f a(int paramInt)
  {
    try
    {
      if (this.c.proxySetVisibility(paramInt))
      {
        f localf = f.b;
        return localf;
      }
    }
    catch (Throwable localThrowable) {}
    return f.c;
  }
  
  public f a(int paramInt, j paramj)
  {
    try
    {
      new net.youmi.android.d.d.a.d(this.b, paramj, paramInt).start();
      paramj = f.b;
      return paramj;
    }
    catch (Throwable paramj) {}
    return f.c;
  }
  
  public f a(Context paramContext, List paramList)
  {
    try
    {
      net.youmi.android.d.d.a.c.a(paramContext, paramList);
      paramContext = f.b;
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return f.c;
  }
  
  public f a(String paramString)
  {
    return f.a;
  }
  
  public f a(String paramString1, String paramString2, String paramString3, long paramLong)
  {
    return f.a;
  }
  
  public f a(i parami, o paramo)
  {
    try
    {
      if (net.youmi.android.c.j.a.a().a(new e(this, parami, paramo)))
      {
        parami = f.b;
        return parami;
      }
    }
    catch (Throwable parami) {}
    return f.c;
  }
  
  /* Error */
  public f a(m paramm)
  {
    // Byte code:
    //   0: aload_1
    //   1: iconst_0
    //   2: invokevirtual 108	net/youmi/android/a/h/m:a	(I)Lnet/youmi/android/a/h/l;
    //   5: astore_2
    //   6: aload_2
    //   7: ifnull +75 -> 82
    //   10: aload_0
    //   11: getfield 33	net/youmi/android/d/g/a:d	Lnet/youmi/android/a/h/l;
    //   14: ifnull +31 -> 45
    //   17: aload_0
    //   18: getfield 33	net/youmi/android/d/g/a:d	Lnet/youmi/android/a/h/l;
    //   21: invokevirtual 114	net/youmi/android/a/h/l:g	()Lnet/youmi/android/a/h/k;
    //   24: ifnull +21 -> 45
    //   27: aload_2
    //   28: invokevirtual 114	net/youmi/android/a/h/l:g	()Lnet/youmi/android/a/h/k;
    //   31: ifnonnull +14 -> 45
    //   34: aload_2
    //   35: aload_0
    //   36: getfield 33	net/youmi/android/d/g/a:d	Lnet/youmi/android/a/h/l;
    //   39: invokevirtual 114	net/youmi/android/a/h/l:g	()Lnet/youmi/android/a/h/k;
    //   42: invokevirtual 117	net/youmi/android/a/h/l:a	(Lnet/youmi/android/a/h/k;)V
    //   45: aload_0
    //   46: getfield 21	net/youmi/android/d/g/a:a	Landroid/app/Activity;
    //   49: ifnull +37 -> 86
    //   52: new 119	android/content/Intent
    //   55: dup
    //   56: aload_0
    //   57: getfield 21	net/youmi/android/d/g/a:a	Landroid/app/Activity;
    //   60: ldc 121
    //   62: invokespecial 124	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   65: astore_1
    //   66: aload_1
    //   67: ldc 126
    //   69: aload_2
    //   70: invokevirtual 130	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
    //   73: pop
    //   74: aload_0
    //   75: invokevirtual 132	net/youmi/android/d/g/a:g	()Landroid/content/Context;
    //   78: aload_1
    //   79: invokevirtual 136	android/content/Context:startActivity	(Landroid/content/Intent;)V
    //   82: getstatic 67	net/youmi/android/a/h/f:b	Lnet/youmi/android/a/h/f;
    //   85: areturn
    //   86: new 119	android/content/Intent
    //   89: dup
    //   90: aload_0
    //   91: getfield 29	net/youmi/android/d/g/a:b	Landroid/content/Context;
    //   94: ldc 121
    //   96: invokespecial 124	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   99: astore_1
    //   100: aload_1
    //   101: ldc 137
    //   103: invokevirtual 141	android/content/Intent:addFlags	(I)Landroid/content/Intent;
    //   106: pop
    //   107: goto -41 -> 66
    //   110: astore_1
    //   111: goto -29 -> 82
    //   114: astore_1
    //   115: goto -70 -> 45
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	118	0	this	a
    //   0	118	1	paramm	m
    //   5	65	2	locall	l
    // Exception table:
    //   from	to	target	type
    //   0	6	110	java/lang/Throwable
    //   45	66	110	java/lang/Throwable
    //   66	82	110	java/lang/Throwable
    //   86	107	110	java/lang/Throwable
    //   10	45	114	java/lang/Throwable
  }
  
  public f a(n paramn)
  {
    if (paramn == null) {}
    try
    {
      return f.c;
    }
    catch (Throwable paramn) {}
    if ((this.d instanceof p))
    {
      localObject1 = (p)this.d;
      localObject2 = new p(e(), d());
      ((p)localObject2).f(((p)localObject1).p());
      ((p)localObject2).e(((p)localObject1).o());
      ((p)localObject2).c(((p)localObject1).m());
      ((p)localObject2).d(((p)localObject1).n());
      ((p)localObject2).a(((p)localObject1).r());
      ((p)localObject2).b(((p)localObject1).s());
      ((p)localObject2).a(((p)localObject1).c());
      ((p)localObject2).a(((p)localObject1).b());
      ((p)localObject2).b(((p)localObject1).d());
      ((p)localObject2).b(paramn.h());
      ((p)localObject2).c(paramn.i());
      ((p)localObject2).d(paramn.j());
      ((p)localObject2).a(((p)localObject1).q());
      ((p)localObject2).e(paramn.l());
      ((p)localObject2).a(((p)localObject1).g());
      a((p)localObject2);
      return f.b;
    }
    Object localObject2 = this.d;
    Object localObject1 = new l(e(), d());
    ((l)localObject1).a(((l)localObject2).c());
    ((l)localObject1).a(((l)localObject2).b());
    ((l)localObject1).b(((l)localObject2).d());
    ((l)localObject1).b(paramn.h());
    ((l)localObject1).c(paramn.i());
    ((l)localObject1).d(paramn.j());
    ((l)localObject1).e(paramn.l());
    ((l)localObject1).a(((l)localObject2).g());
    paramn = new m();
    paramn.a((l)localObject1);
    a(paramn);
    paramn = f.b;
    return paramn;
    return f.c;
  }
  
  /* Error */
  public f a(p paramp)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 21	net/youmi/android/d/g/a:a	Landroid/app/Activity;
    //   4: ifnonnull +9 -> 13
    //   7: getstatic 69	net/youmi/android/a/h/f:c	Lnet/youmi/android/a/h/f;
    //   10: astore_1
    //   11: aload_1
    //   12: areturn
    //   13: aload_0
    //   14: getfield 33	net/youmi/android/d/g/a:d	Lnet/youmi/android/a/h/l;
    //   17: ifnull +31 -> 48
    //   20: aload_0
    //   21: getfield 33	net/youmi/android/d/g/a:d	Lnet/youmi/android/a/h/l;
    //   24: invokevirtual 114	net/youmi/android/a/h/l:g	()Lnet/youmi/android/a/h/k;
    //   27: ifnull +21 -> 48
    //   30: aload_1
    //   31: invokevirtual 227	net/youmi/android/a/h/p:g	()Lnet/youmi/android/a/h/k;
    //   34: ifnonnull +14 -> 48
    //   37: aload_1
    //   38: aload_0
    //   39: getfield 33	net/youmi/android/d/g/a:d	Lnet/youmi/android/a/h/l;
    //   42: invokevirtual 114	net/youmi/android/a/h/l:g	()Lnet/youmi/android/a/h/k;
    //   45: invokevirtual 228	net/youmi/android/a/h/p:a	(Lnet/youmi/android/a/h/k;)V
    //   48: invokestatic 94	net/youmi/android/c/j/a:a	()Lnet/youmi/android/c/j/a;
    //   51: new 250	net/youmi/android/d/c
    //   54: dup
    //   55: aload_0
    //   56: getfield 21	net/youmi/android/d/g/a:a	Landroid/app/Activity;
    //   59: aload_1
    //   60: invokespecial 253	net/youmi/android/d/c:<init>	(Landroid/app/Activity;Lnet/youmi/android/a/h/p;)V
    //   63: invokevirtual 102	net/youmi/android/c/j/a:a	(Ljava/lang/Runnable;)Z
    //   66: ifeq +10 -> 76
    //   69: getstatic 67	net/youmi/android/a/h/f:b	Lnet/youmi/android/a/h/f;
    //   72: astore_1
    //   73: aload_1
    //   74: areturn
    //   75: astore_1
    //   76: getstatic 69	net/youmi/android/a/h/f:c	Lnet/youmi/android/a/h/f;
    //   79: areturn
    //   80: astore_2
    //   81: goto -33 -> 48
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	a
    //   0	84	1	paramp	p
    //   80	1	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	11	75	java/lang/Throwable
    //   48	73	75	java/lang/Throwable
    //   13	48	80	java/lang/Throwable
  }
  
  public void a(net.youmi.android.a.k.a.d paramd)
  {
    this.c = paramd;
  }
  
  public Activity b()
  {
    return this.a;
  }
  
  public f b(p paramp)
  {
    return f.a;
  }
  
  public f c()
  {
    try
    {
      if (this.c.proxyCloseCurrentWindow())
      {
        f localf = f.b;
        return localf;
      }
    }
    catch (Throwable localThrowable) {}
    return f.c;
  }
  
  public int d()
  {
    if (this.d != null) {
      return this.d.e();
    }
    return 0;
  }
  
  public int e()
  {
    if (this.d != null) {
      return this.d.f();
    }
    return 0;
  }
  
  public f f()
  {
    label140:
    try
    {
      if (this.d == null) {
        break label193;
      }
      Object localObject = this.c;
      if (localObject == null) {
        break label193;
      }
      try
      {
        if (net.youmi.android.c.j.a.b()) {
          this.c.proxyClearWebViewHistory();
        }
        for (;;)
        {
          label32:
          if ((this.d.k() != 2) || (this.d.j() == null)) {
            break label140;
          }
          if (!net.youmi.android.c.j.a.b()) {
            break;
          }
          if (!this.c.proxyPostUrl(this.d.l(), EncodingUtils.getBytes(this.d.j(), "BASE64"))) {
            break label193;
          }
          localObject = f.b;
          return localObject;
          net.youmi.android.c.j.a.a().a(new b(this));
        }
      }
      catch (Throwable localThrowable1)
      {
        break label32;
      }
      if (!net.youmi.android.c.j.a.a().a(new c(this))) {
        break label193;
      }
      return f.b;
    }
    catch (Throwable localThrowable2) {}
    if (net.youmi.android.c.j.a.b())
    {
      if (this.c.proxyLoadUrl(this.d.l())) {
        return f.b;
      }
    }
    else if (net.youmi.android.c.j.a.a().a(new d(this)))
    {
      f localf = f.b;
      return localf;
    }
    label193:
    return f.c;
  }
  
  protected Context g()
  {
    if (this.a != null) {
      return this.a;
    }
    return this.b;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.g.a
 * JD-Core Version:    0.7.0.1
 */