package net.youmi.android.e.b.b;

import android.content.Context;
import java.io.File;
import net.youmi.android.e.b.a.j;

public class b
  extends a
{
  public b(j paramj)
  {
    super(paramj);
  }
  
  public void a(Context paramContext)
  {
    super.a(paramContext);
    try
    {
      paramContext = this.b.a();
      if (paramContext == null)
      {
        this.b.a(this.b.g());
        return;
      }
      if (paramContext.exists())
      {
        if (this.b.o())
        {
          this.b.a(this.b.k());
          return;
        }
        this.b.a(this.b.n());
        return;
      }
      this.b.a(this.b.n());
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public void b(Context paramContext) {}
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.e.b.b.b
 * JD-Core Version:    0.7.0.1
 */