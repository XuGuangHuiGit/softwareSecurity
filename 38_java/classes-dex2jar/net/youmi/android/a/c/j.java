package net.youmi.android.a.c;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import net.youmi.android.a.k.a.h;

class j
  extends WebViewClient
{
  private h a;
  
  j(h paramh)
  {
    this.a = paramh;
  }
  
  static j a(h paramh)
  {
    try
    {
      paramh = new j(paramh);
      return paramh;
    }
    catch (Throwable paramh) {}
    return null;
  }
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    try
    {
      if (this.a != null) {
        this.a.onWebPageFinished(paramWebView, paramString);
      }
      return;
    }
    catch (Throwable paramWebView) {}
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    super.onPageStarted(paramWebView, paramString, paramBitmap);
    try
    {
      if (this.a != null) {
        this.a.onWebPageStarted(paramWebView, paramString, paramBitmap);
      }
      return;
    }
    catch (Throwable paramWebView) {}
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    try
    {
      if (this.a != null) {
        this.a.onWebReceivedError(paramWebView, paramInt, paramString1, paramString2);
      }
      return;
    }
    catch (Throwable paramWebView) {}
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    return this.a.shouldOverrideUrlLoading(paramWebView, paramString);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.c.j
 * JD-Core Version:    0.7.0.1
 */