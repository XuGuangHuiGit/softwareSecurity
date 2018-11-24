package net.youmi.android.a.c;

import android.app.Activity;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import net.youmi.android.a.k.a.b;
import net.youmi.android.a.k.a.f;

class d
  extends WebChromeClient
{
  protected b a;
  
  d(b paramb)
  {
    this.a = paramb;
  }
  
  static d a(b paramb)
  {
    try
    {
      paramb = new d(paramb);
      return paramb;
    }
    catch (Throwable paramb) {}
    return null;
  }
  
  public boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    try
    {
      if (this.a.h() == null)
      {
        paramJsResult.cancel();
        return true;
      }
    }
    catch (Throwable localThrowable)
    {
      try
      {
        boolean bool = super.onJsAlert(paramWebView, paramString1, paramString2, paramJsResult);
        return bool;
      }
      catch (Throwable paramWebView)
      {
        try
        {
          paramJsResult.cancel();
          return true;
        }
        catch (Throwable paramWebView) {}
      }
    }
    return true;
  }
  
  public boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    try
    {
      if (this.a.h() == null)
      {
        paramJsResult.cancel();
        return true;
      }
    }
    catch (Throwable localThrowable)
    {
      try
      {
        boolean bool = super.onJsConfirm(paramWebView, paramString1, paramString2, paramJsResult);
        return bool;
      }
      catch (Throwable paramWebView)
      {
        try
        {
          paramJsResult.cancel();
          return true;
        }
        catch (Throwable paramWebView) {}
      }
    }
    return true;
  }
  
  public boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    try
    {
      Activity localActivity = this.a.h();
      if (localActivity == null) {}
      boolean bool;
      return true;
    }
    catch (Throwable localThrowable)
    {
      try
      {
        paramJsPromptResult.cancel();
        return true;
      }
      catch (Throwable paramWebView) {}
      localThrowable = localThrowable;
      try
      {
        bool = super.onJsPrompt(paramWebView, paramString1, paramString2, paramString3, paramJsPromptResult);
        return bool;
      }
      catch (Throwable paramWebView)
      {
        try
        {
          paramJsPromptResult.cancel();
          return true;
        }
        catch (Throwable paramWebView)
        {
          return true;
        }
      }
    }
  }
  
  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    super.onProgressChanged(paramWebView, paramInt);
    try
    {
      if ((this.a != null) && (this.a.f() != null)) {
        this.a.f().a(paramWebView, paramInt);
      }
      return;
    }
    catch (Throwable paramWebView) {}
  }
  
  public void onReceivedTitle(WebView paramWebView, String paramString)
  {
    super.onReceivedTitle(paramWebView, paramString);
    try
    {
      if ((this.a != null) && (this.a.f() != null)) {
        this.a.f().a(paramWebView, paramString);
      }
      return;
    }
    catch (Throwable paramWebView) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.c.d
 * JD-Core Version:    0.7.0.1
 */