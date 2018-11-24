package net.youmi.android.e.b.b;

import android.content.Context;
import java.io.File;
import net.youmi.android.c.h.g;
import net.youmi.android.e.b.b;
import net.youmi.android.e.b.e;

public class j
  extends a
{
  public j(net.youmi.android.e.b.a.j paramj)
  {
    super(paramj);
  }
  
  public void a(Context paramContext)
  {
    int j = 0;
    super.a(paramContext);
    try
    {
      File localFile = this.b.b();
      b localb = this.b.c();
      e locale = this.b.e();
      if (locale == null)
      {
        this.b.s();
        return;
      }
      int k = 1;
      int i = k;
      long l1;
      long l2;
      if (locale.g(localb))
      {
        l1 = localFile.length();
        l2 = g.a(paramContext, localb.b());
        if (localb.d() > 0L) {
          break label159;
        }
        localb.a(l2);
      }
      for (;;)
      {
        if ((i != 0) && (!locale.c(localb, localFile))) {
          i = j;
        }
        for (;;)
        {
          if (i != 0)
          {
            this.b.s();
            return;
          }
          localFile.delete();
          this.b.a(this.b.h());
          return;
        }
        label159:
        i = k;
        if (l1 != l2) {
          i = 0;
        }
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public void b(Context paramContext) {}
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.e.b.b.j
 * JD-Core Version:    0.7.0.1
 */