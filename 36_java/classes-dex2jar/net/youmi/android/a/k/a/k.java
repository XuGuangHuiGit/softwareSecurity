package net.youmi.android.a.k.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import net.youmi.android.a.c.a;
import net.youmi.android.c.e.b;

class k
  implements DownloadListener
{
  k(j paramj) {}
  
  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      paramString1 = new Intent("android.intent.action.VIEW", Uri.parse(paramString1));
      paramString1.addFlags(268435456);
      this.a.getContext().startActivity(paramString1);
      a.a(j.a(this.a));
      return;
    }
    catch (Throwable paramString1)
    {
      try
      {
        b.a("", paramString1);
        return;
      }
      catch (Throwable paramString1) {}
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.k.a.k
 * JD-Core Version:    0.7.0.1
 */