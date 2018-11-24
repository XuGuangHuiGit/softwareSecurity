package net.youmi.android.e.b.b;

import android.content.Context;
import java.io.File;
import net.youmi.android.e.b.a.f;
import net.youmi.android.e.b.a.j;
import net.youmi.android.e.b.b;
import net.youmi.android.e.b.e;

public class d
  extends a
{
  public d(j paramj)
  {
    super(paramj);
  }
  
  public void a(Context paramContext)
  {
    super.a(paramContext);
    try
    {
      paramContext = this.b.b();
      if ((paramContext == null) || (!paramContext.exists()))
      {
        this.b.a(this.b.l());
        return;
      }
      b localb = this.b.c();
      try
      {
        if (localb.d() <= 0L) {
          localb.a(this.b.d().c());
        }
        label70:
        e locale = this.b.e();
        if (locale == null)
        {
          this.b.p();
          return;
        }
        int i = 1;
        if (!locale.c(localb, paramContext)) {
          i = 0;
        }
        if (i != 0)
        {
          this.b.p();
          return;
        }
        paramContext.delete();
        this.b.a(this.b.l());
        return;
      }
      catch (Throwable localThrowable)
      {
        break label70;
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public void b(Context paramContext) {}
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.e.b.b.d
 * JD-Core Version:    0.7.0.1
 */