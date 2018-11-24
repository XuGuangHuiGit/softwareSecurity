package net.youmi.android.e.b.a;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class i
  extends WebViewClient
{
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.e.b.a.i
 * JD-Core Version:    0.7.0.1
 */