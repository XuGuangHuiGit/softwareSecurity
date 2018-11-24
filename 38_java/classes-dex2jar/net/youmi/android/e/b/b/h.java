package net.youmi.android.e.b.b;

import android.content.Context;
import java.io.File;
import net.youmi.android.c.h.g;
import net.youmi.android.e.b.a.j;
import net.youmi.android.e.b.b;

public class h
  extends a
{
  private long c = 0L;
  private boolean d = false;
  private long e = 0L;
  private int f = 0;
  
  public h(j paramj)
  {
    super(paramj);
  }
  
  public void a(Context paramContext)
  {
    super.a(paramContext);
    for (;;)
    {
      try
      {
        this.d = true;
        localFile1 = this.b.a();
        localFile2 = this.b.b();
        if (localFile1.exists()) {
          this.e = (System.currentTimeMillis() + 16000L);
        }
        boolean bool = this.d;
        if (!bool) {
          break label314;
        }
      }
      catch (Throwable paramContext)
      {
        File localFile1;
        File localFile2;
        a locala;
        long l2;
        long l3;
        long l1;
        int i;
        return;
      }
      try
      {
        if (localFile2.exists())
        {
          locala = this.b.i();
          paramContext = locala;
          if (paramContext != null) {
            this.b.a(paramContext);
          }
          return;
        }
        if (!localFile1.exists())
        {
          locala = this.b.n();
          paramContext = locala;
          continue;
        }
        if (!this.b.o())
        {
          locala = this.b.n();
          paramContext = locala;
          continue;
        }
        l2 = this.b.c().d();
        l3 = System.currentTimeMillis();
        l1 = l2;
        if (l2 <= 0L)
        {
          l1 = l2;
          if (this.f < 3)
          {
            l1 = l2;
            if (l3 > this.e)
            {
              l1 = g.a(paramContext, this.b.c().b());
              this.b.c().a(l1);
              this.f += 1;
            }
          }
        }
        l2 = localFile1.length();
        i = 0;
        if (l1 > 0L) {
          i = (int)(100L * l2 / l1);
        }
        l3 = (l2 - this.c) * 1000L / 1500L;
        this.c = l2;
        this.b.a(i, l3, l1, l2);
      }
      catch (Throwable localThrowable2)
      {
        continue;
      }
      try
      {
        Thread.sleep(1500L);
      }
      catch (Throwable localThrowable1) {}
      continue;
      label314:
      paramContext = null;
    }
  }
  
  public void b(Context paramContext)
  {
    this.d = false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.e.b.b.h
 * JD-Core Version:    0.7.0.1
 */