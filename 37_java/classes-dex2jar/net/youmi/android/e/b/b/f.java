package net.youmi.android.e.b.b;

import android.content.Context;
import java.io.File;
import net.youmi.android.e.b.a.j;
import net.youmi.android.e.b.b;

public class f
  extends a
{
  public f(j paramj)
  {
    super(paramj);
  }
  
  public void a(Context paramContext)
  {
    super.a(paramContext);
    try
    {
      paramContext = this.b.c();
      if ((paramContext == null) || (!paramContext.c()))
      {
        this.b.a(this.b.g());
        return;
      }
      paramContext = this.b.b();
      File localFile = this.b.a();
      if ((paramContext == null) || (localFile == null))
      {
        this.b.a(this.b.g());
        return;
      }
      if (paramContext.exists())
      {
        this.b.a(this.b.i());
        return;
      }
      this.b.a(this.b.h());
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public void b(Context paramContext) {}
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.e.b.b.f
 * JD-Core Version:    0.7.0.1
 */