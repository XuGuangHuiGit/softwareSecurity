package net.youmi.android.a.k;

import android.webkit.WebView;

public class a
  implements Runnable
{
  private WebView a;
  private String b;
  
  public a(WebView paramWebView, String paramString)
  {
    this.a = paramWebView;
    this.b = paramString;
  }
  
  public void run()
  {
    try
    {
      if ((this.a != null) && (this.b != null)) {
        this.a.loadUrl(this.b);
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.k.a
 * JD-Core Version:    0.7.0.1
 */