package net.youmi.android.e.b.a;

import android.content.Context;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import net.youmi.android.e.b.b;

public class g
  extends WebView
  implements DownloadListener, Runnable
{
  private net.youmi.android.e.b.h a;
  private String b;
  private String c;
  private boolean d = false;
  
  public g(Context paramContext, net.youmi.android.e.b.h paramh, String paramString1, String paramString2)
  {
    super(paramContext);
    setDownloadListener(this);
    this.a = paramh;
    a();
    setWebChromeClient(new h());
    setWebViewClient(new i());
    this.c = paramString1;
    this.b = paramString2;
  }
  
  public void a()
  {
    try
    {
      WebSettings localWebSettings = getSettings();
      localWebSettings.setJavaScriptEnabled(true);
      localWebSettings.setJavaScriptCanOpenWindowsAutomatically(false);
      localWebSettings.setCacheMode(-1);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void b()
  {
    loadUrl(this.c);
  }
  
  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      if (this.a != null)
      {
        paramString1 = new e(paramString1, this.b, paramLong);
        paramString1.b(this.c);
        this.a.a(this, paramString1, paramString2, paramString3, paramString4);
      }
      label45:
      this.d = true;
      return;
    }
    catch (Throwable paramString1)
    {
      break label45;
    }
  }
  
  public void run()
  {
    try
    {
      Thread.sleep(60000L);
    }
    catch (Throwable localThrowable1)
    {
      for (;;)
      {
        try
        {
          if (this.a == null) {
            return;
          }
          if (this.d)
          {
            this.a.a(this);
            return;
          }
          e locale = new e(this.c, this.b);
          this.a.a(this, locale);
          return;
        }
        catch (Throwable localThrowable2) {}
        localThrowable1 = localThrowable1;
      }
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.e.b.a.g
 * JD-Core Version:    0.7.0.1
 */