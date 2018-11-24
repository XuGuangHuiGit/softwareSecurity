package net.youmi.android.a.k.a;

import android.graphics.Bitmap;
import android.webkit.WebView;

public abstract interface g
{
  public abstract void onWebPageFinished(WebView paramWebView, String paramString);
  
  public abstract void onWebPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap);
  
  public abstract void onWebReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2);
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.k.a.g
 * JD-Core Version:    0.7.0.1
 */