package net.youmi.android.d.c;

import android.content.Context;
import net.youmi.android.a.d.a;
import net.youmi.android.e.a.d;

class c
  extends Thread
{
  private Context a;
  
  public c(Context paramContext)
  {
    if (paramContext == null) {
      return;
    }
    try
    {
      this.a = paramContext.getApplicationContext();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public void run()
  {
    super.run();
    try
    {
      a.a(this.a).a();
      try
      {
        label14:
        a.d(this.a).a();
        try
        {
          label24:
          a.c(this.a).a();
          try
          {
            label34:
            a.b(this.a).a();
            try
            {
              label44:
              a.e(this.a).a();
              try
              {
                label54:
                a.f(this.a).a();
                return;
              }
              catch (Throwable localThrowable1) {}
            }
            catch (Throwable localThrowable2)
            {
              break label54;
            }
          }
          catch (Throwable localThrowable3)
          {
            break label44;
          }
        }
        catch (Throwable localThrowable4)
        {
          break label34;
        }
      }
      catch (Throwable localThrowable5)
      {
        break label24;
      }
    }
    catch (Throwable localThrowable6)
    {
      break label14;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.c.c
 * JD-Core Version:    0.7.0.1
 */