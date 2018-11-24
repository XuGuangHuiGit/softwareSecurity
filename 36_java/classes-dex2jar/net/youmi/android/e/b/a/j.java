package net.youmi.android.e.b.a;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;
import net.youmi.android.e.b.b.a;
import net.youmi.android.e.b.b.c;
import net.youmi.android.e.b.b.g;
import net.youmi.android.e.b.b.h;
import net.youmi.android.e.b.b.i;

public class j
  extends AsyncTask
{
  private boolean a = true;
  private net.youmi.android.e.b.b b;
  private f c;
  private File d;
  private File e;
  private Context f;
  private k g;
  private net.youmi.android.e.b.e h;
  private a i;
  private net.youmi.android.e.b.b.f j;
  private g k;
  private net.youmi.android.e.b.b.b l;
  private net.youmi.android.e.b.b.j m;
  private i n;
  private h o;
  private net.youmi.android.e.b.b.e p;
  private net.youmi.android.e.b.b.d q;
  private c r;
  
  public j(Context paramContext, net.youmi.android.e.b.b paramb, File paramFile, net.youmi.android.e.b.e parame)
  {
    this.e = paramFile;
    a(this.e);
    this.d = new File(paramFile.getPath() + ".ymtf");
    this.h = parame;
    this.f = paramContext.getApplicationContext();
    this.b = paramb;
    this.g = new k();
    this.i = t();
  }
  
  private void a(File paramFile)
  {
    try
    {
      if (paramFile.exists()) {
        return;
      }
      paramFile = paramFile.getParentFile();
      if ((paramFile != null) && (!paramFile.exists()))
      {
        paramFile.mkdirs();
        return;
      }
    }
    catch (Throwable paramFile) {}
  }
  
  private void a(k paramk)
  {
    if (paramk == null) {
      return;
    }
    try
    {
      switch (paramk.e)
      {
      case 0: 
        d.a().a(this.b, this.e);
        return;
      case 2: 
        d.a().a(this.b, paramk.c, paramk.d, paramk.a, paramk.b);
        return;
      case 1: 
        d.a().a(this.b);
        return;
      case 3: 
        d.a().b(this.b, this.e);
        return;
      case 4: 
        d.a().b(this.b);
        return;
      }
      return;
    }
    catch (Throwable paramk) {}
  }
  
  private a t()
  {
    try
    {
      if (this.j == null) {
        this.j = new net.youmi.android.e.b.b.f(this);
      }
      net.youmi.android.e.b.b.f localf = this.j;
      return localf;
    }
    finally {}
  }
  
  public File a()
  {
    return this.d;
  }
  
  protected Void a(Void... paramVarArgs)
  {
    try
    {
      if (this.i != null) {
        this.i.a(this.f);
      }
      label18:
      return null;
    }
    catch (Throwable paramVarArgs)
    {
      break label18;
    }
  }
  
  public void a(int paramInt, long paramLong1, long paramLong2, long paramLong3)
  {
    try
    {
      if (this.g == null) {
        this.g = new k();
      }
      this.g.e = 2;
      this.g.a = paramInt;
      this.g.b = paramLong1;
      this.g.c = paramLong2;
      this.g.d = paramLong3;
      publishProgress(new k[] { this.g });
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void a(a parama)
  {
    try
    {
      if (this.i != null) {
        this.i.b(this.f);
      }
      this.i = parama;
      if ((this.i != null) && (this.a)) {
        this.i.a(this.f);
      }
      return;
    }
    catch (Throwable parama) {}
  }
  
  protected void a(k... paramVarArgs)
  {
    super.onProgressUpdate(paramVarArgs);
    if (paramVarArgs != null)
    {
      int i1 = 0;
      try
      {
        while (i1 < paramVarArgs.length)
        {
          a(paramVarArgs[i1]);
          i1 += 1;
        }
        return;
      }
      catch (Throwable paramVarArgs) {}
    }
  }
  
  public File b()
  {
    return this.e;
  }
  
  public net.youmi.android.e.b.b c()
  {
    return this.b;
  }
  
  public f d()
  {
    return this.c;
  }
  
  public net.youmi.android.e.b.e e()
  {
    return this.h;
  }
  
  /* Error */
  public boolean f()
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore_1
    //   2: aload_0
    //   3: getfield 173	net/youmi/android/e/b/a/j:c	Lnet/youmi/android/e/b/a/f;
    //   6: ifnull +15 -> 21
    //   9: aload_0
    //   10: getfield 173	net/youmi/android/e/b/a/j:c	Lnet/youmi/android/e/b/a/f;
    //   13: invokevirtual 184	net/youmi/android/e/b/a/f:a	()Z
    //   16: ifeq +5 -> 21
    //   19: iconst_1
    //   20: ireturn
    //   21: aload_0
    //   22: invokevirtual 186	net/youmi/android/e/b/a/j:a	()Ljava/io/File;
    //   25: astore_3
    //   26: aload_3
    //   27: invokevirtual 190	java/io/File:length	()J
    //   30: lconst_0
    //   31: lcmp
    //   32: ifle +8 -> 40
    //   35: aload_3
    //   36: invokevirtual 190	java/io/File:length	()J
    //   39: lstore_1
    //   40: aload_0
    //   41: new 182	net/youmi/android/e/b/a/f
    //   44: dup
    //   45: aload_0
    //   46: getfield 84	net/youmi/android/e/b/a/j:f	Landroid/content/Context;
    //   49: aload_0
    //   50: getfield 86	net/youmi/android/e/b/a/j:b	Lnet/youmi/android/e/b/b;
    //   53: invokevirtual 194	net/youmi/android/e/b/b:b	()Ljava/lang/String;
    //   56: lload_1
    //   57: aload_3
    //   58: aload_0
    //   59: getfield 48	net/youmi/android/e/b/a/j:e	Ljava/io/File;
    //   62: iconst_5
    //   63: invokespecial 197	net/youmi/android/e/b/a/f:<init>	(Landroid/content/Context;Ljava/lang/String;JLjava/io/File;Ljava/io/File;I)V
    //   66: putfield 173	net/youmi/android/e/b/a/j:c	Lnet/youmi/android/e/b/a/f;
    //   69: aload_0
    //   70: getfield 173	net/youmi/android/e/b/a/j:c	Lnet/youmi/android/e/b/a/f;
    //   73: invokevirtual 200	net/youmi/android/e/b/a/f:start	()V
    //   76: iconst_1
    //   77: ireturn
    //   78: astore_3
    //   79: aload_3
    //   80: athrow
    //   81: astore_3
    //   82: iconst_0
    //   83: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	j
    //   1	56	1	l1	long
    //   25	33	3	localFile	File
    //   78	2	3	localObject	Object
    //   81	1	3	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   2	19	78	finally
    //   21	26	78	finally
    //   26	40	78	finally
    //   40	76	78	finally
    //   2	19	81	java/lang/Throwable
    //   21	26	81	java/lang/Throwable
    //   26	40	81	java/lang/Throwable
    //   40	76	81	java/lang/Throwable
  }
  
  public a g()
  {
    try
    {
      if (this.k == null) {
        this.k = new g(this);
      }
      g localg = this.k;
      return localg;
    }
    finally {}
  }
  
  public a h()
  {
    try
    {
      if (this.l == null) {
        this.l = new net.youmi.android.e.b.b.b(this);
      }
      net.youmi.android.e.b.b.b localb = this.l;
      return localb;
    }
    finally {}
  }
  
  public int hashCode()
  {
    if (this.b != null) {
      return this.b.hashCode();
    }
    return super.hashCode();
  }
  
  public a i()
  {
    try
    {
      if (this.m == null) {
        this.m = new net.youmi.android.e.b.b.j(this);
      }
      net.youmi.android.e.b.b.j localj = this.m;
      return localj;
    }
    finally {}
  }
  
  public a j()
  {
    try
    {
      if (this.n == null) {
        this.n = new i(this);
      }
      i locali = this.n;
      return locali;
    }
    finally {}
  }
  
  public a k()
  {
    try
    {
      if (this.o == null) {
        this.o = new h(this);
      }
      h localh = this.o;
      return localh;
    }
    finally {}
  }
  
  public a l()
  {
    try
    {
      if (this.p == null) {
        this.p = new net.youmi.android.e.b.b.e(this);
      }
      net.youmi.android.e.b.b.e locale = this.p;
      return locale;
    }
    finally {}
  }
  
  public a m()
  {
    try
    {
      if (this.q == null) {
        this.q = new net.youmi.android.e.b.b.d(this);
      }
      net.youmi.android.e.b.b.d locald = this.q;
      return locald;
    }
    finally {}
  }
  
  public a n()
  {
    try
    {
      if (this.r == null) {
        this.r = new c(this);
      }
      c localc = this.r;
      return localc;
    }
    finally {}
  }
  
  public boolean o()
  {
    try
    {
      if (this.d == null) {
        return false;
      }
      if (this.d.exists())
      {
        long l1 = System.currentTimeMillis();
        long l2 = this.d.lastModified();
        if (l1 - l2 < 16000L) {
          return true;
        }
      }
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public void p()
  {
    try
    {
      k localk = new k();
      localk.e = 0;
      publishProgress(new k[] { localk });
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void q()
  {
    try
    {
      k localk = new k();
      localk.e = 1;
      publishProgress(new k[] { localk });
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void r()
  {
    try
    {
      k localk = new k();
      localk.e = 4;
      publishProgress(new k[] { localk });
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void s()
  {
    try
    {
      k localk = new k();
      localk.e = 3;
      publishProgress(new k[] { localk });
      return;
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.e.b.a.j
 * JD-Core Version:    0.7.0.1
 */