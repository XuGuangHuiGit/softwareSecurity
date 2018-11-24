package net.youmi.android.d.g;

import net.youmi.android.a.h.l;
import net.youmi.android.a.k.a.d;
import org.apache.http.util.EncodingUtils;

class c
  implements Runnable
{
  c(a parama) {}
  
  public void run()
  {
    try
    {
      this.a.c.proxyPostUrl(this.a.d.l(), EncodingUtils.getBytes(this.a.d.j(), "BASE64"));
      return;
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.g.c
 * JD-Core Version:    0.7.0.1
 */