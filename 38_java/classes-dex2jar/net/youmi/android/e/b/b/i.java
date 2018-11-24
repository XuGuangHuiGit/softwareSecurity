package net.youmi.android.e.b.b;

import android.content.Context;
import net.youmi.android.e.b.a.f;
import net.youmi.android.e.b.a.j;

public class i
  extends a
{
  private long c = 0L;
  private boolean d = false;
  
  public i(j paramj)
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
        boolean bool = this.d;
        if (!bool) {
          break label197;
        }
      }
      catch (Throwable paramContext)
      {
        Object localObject;
        long l1;
        long l2;
        int i;
        long l3;
        return;
      }
      try
      {
        localObject = this.b.d();
        if (localObject == null)
        {
          b(paramContext);
          localObject = this.b.l();
          paramContext = (Context)localObject;
          if (paramContext != null) {
            this.b.a(paramContext);
          }
          return;
        }
        if (((f)localObject).b())
        {
          this.d = false;
          localObject = this.b.m();
          paramContext = (Context)localObject;
          continue;
        }
        if (!((f)localObject).a())
        {
          this.d = false;
          localObject = this.b.l();
          paramContext = (Context)localObject;
          continue;
        }
        l1 = ((f)localObject).c();
        l2 = ((f)localObject).d();
        i = ((f)localObject).e();
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
      label197:
      paramContext = null;
    }
  }
  
  public void b(Context paramContext)
  {
    this.d = false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.e.b.b.i
 * JD-Core Version:    0.7.0.1
 */