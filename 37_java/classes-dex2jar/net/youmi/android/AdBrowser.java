package net.youmi.android;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import net.youmi.android.a.h.l;
import net.youmi.android.a.k.a.g;
import net.youmi.android.a.k.a.i;
import net.youmi.android.g.b;
import net.youmi.android.g.c;
import org.apache.http.util.EncodingUtils;

public final class AdBrowser
  extends Activity
  implements View.OnClickListener, net.youmi.android.a.h.d, net.youmi.android.a.k.a.d, g, c
{
  protected i a;
  protected l b;
  protected net.youmi.android.g.a c;
  private RelativeLayout d;
  private b e;
  private net.youmi.android.d.g.a f;
  
  private void g()
  {
    try
    {
      this.b = ((l)getIntent().getSerializableExtra("aca5522945c72310f9f22b333c68f2b3"));
      if (this.b == null) {
        finish();
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  void a()
  {
    Object localObject = net.youmi.android.c.k.d.a(this);
    localObject = new FrameLayout.LayoutParams(((net.youmi.android.c.k.d)localObject).b(34), ((net.youmi.android.c.k.d)localObject).b(34));
    this.c = new net.youmi.android.g.a(this);
    this.c.setOnClickListener(this);
    if (this.b != null) {
      switch (this.b.c())
      {
      default: 
        this.c.setVisibility(8);
      }
    }
    for (;;)
    {
      addContentView(this.c, (ViewGroup.LayoutParams)localObject);
      this.c.bringToFront();
      return;
      ((FrameLayout.LayoutParams)localObject).gravity = 51;
      continue;
      ((FrameLayout.LayoutParams)localObject).gravity = 83;
      continue;
      ((FrameLayout.LayoutParams)localObject).gravity = 53;
      continue;
      ((FrameLayout.LayoutParams)localObject).gravity = 85;
    }
  }
  
  public void b()
  {
    try
    {
      if (this.a != null) {
        this.a.reload();
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void c()
  {
    try
    {
      if (this.a != null) {
        this.a.a();
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void d()
  {
    try
    {
      if (this.a != null) {
        this.a.b();
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void e() {}
  
  public void f()
  {
    try
    {
      finish();
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void onClick(View paramView)
  {
    try
    {
      finish();
      return;
    }
    catch (Throwable paramView) {}
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    g();
    this.d = new RelativeLayout(this);
    this.d.setBackgroundColor(-1);
    this.f = new net.youmi.android.d.g.a(this, this, this.b);
    this.a = new i(this, this.f, this.b.d(), this, this.b.h(), this.b.i(), 0, this.b.g());
    this.a.a("正在努力加载");
    this.a.a(this);
    paramBundle = new RelativeLayout.LayoutParams(-1, -1);
    this.a.getCurrentView().setId(3);
    if ((this.b.d() & 0x8) != 0) {}
    try
    {
      this.e = new b(this, this);
      this.e.setId(4);
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
      localLayoutParams.addRule(12);
      paramBundle.addRule(10);
      paramBundle.addRule(2, 4);
      this.d.addView(this.e, localLayoutParams);
      label205:
      this.d.addView(this.a.getCurrentView(), paramBundle);
      setContentView(this.d);
      a();
      paramBundle = this.b.j();
      if ((this.b.k() == 2) && (paramBundle != null))
      {
        this.a.postUrl(this.b.l(), EncodingUtils.getBytes(paramBundle, "BASE64"));
        return;
      }
      this.a.loadUrl(this.b.l());
      return;
    }
    catch (Throwable localThrowable)
    {
      break label205;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (this.a.a())) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onWebPageFinished(WebView paramWebView, String paramString)
  {
    try
    {
      if ((this.e != null) && (this.a != null))
      {
        this.e.setBackEnable(this.a.canGoBack());
        this.e.setForwardEnable(this.a.canGoForward());
      }
      return;
    }
    catch (Throwable paramWebView) {}
  }
  
  public void onWebPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    try
    {
      if ((this.e != null) && (this.a != null))
      {
        this.e.setBackEnable(this.a.canGoBack());
        this.e.setForwardEnable(this.a.canGoForward());
      }
      return;
    }
    catch (Throwable paramWebView) {}
  }
  
  public void onWebReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    try
    {
      if ((this.e != null) && (this.a != null))
      {
        this.e.setBackEnable(this.a.canGoBack());
        this.e.setForwardEnable(this.a.canGoForward());
      }
      return;
    }
    catch (Throwable paramWebView) {}
  }
  
  public boolean proxyClearWebViewHistory()
  {
    try
    {
      if (this.a != null)
      {
        this.a.clearHistory();
        return true;
      }
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public boolean proxyCloseCurrentWindow()
  {
    try
    {
      finish();
      return true;
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public boolean proxyLoadUrl(String paramString)
  {
    if (paramString != null) {
      try
      {
        if (this.a != null)
        {
          this.a.loadUrl(paramString);
          return true;
        }
      }
      catch (Throwable paramString) {}
    }
    return false;
  }
  
  public boolean proxyPostUrl(String paramString, byte[] paramArrayOfByte)
  {
    if (paramString != null) {
      try
      {
        if (this.a != null)
        {
          this.a.postUrl(paramString, paramArrayOfByte);
          return true;
        }
      }
      catch (Throwable paramString) {}
    }
    return false;
  }
  
  public boolean proxySetVisibility(int paramInt)
  {
    return false;
  }
  
  public void setWebTitle(String paramString) {}
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.AdBrowser
 * JD-Core Version:    0.7.0.1
 */