package net.youmi.android.a.h;

import android.content.Context;
import android.webkit.WebView;
import net.youmi.android.a.k.a;
import net.youmi.android.c.b.e;
import net.youmi.android.c.h.d;

final class x
  implements Runnable
{
  x(Context paramContext, String paramString, WebView paramWebView) {}
  
  public void run()
  {
    do
    {
      try
      {
        String str2 = t.a(this.a, this.b, null);
        str1 = str2;
        if (str2 != null) {
          continue;
        }
        str2 = d.a(this.a, this.b);
        str1 = str2;
        if (str2 == null) {
          continue;
        }
        t.a(this.a, this.b, str2, 1296000000L);
        str1 = str2;
      }
      catch (Throwable localThrowable)
      {
        String str1;
        return;
      }
      str1 = e.a() + str1;
      this.c.post(new a(this.c, str1));
      return;
    } while (localThrowable != null);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.x
 * JD-Core Version:    0.7.0.1
 */