package net.youmi.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import net.youmi.android.a.h.b;
import net.youmi.android.a.h.e;
import net.youmi.android.a.h.k;
import net.youmi.android.a.h.p;
import org.apache.http.util.EncodingUtils;

public class SmartBannerActivity
  extends Activity
  implements View.OnClickListener, b, net.youmi.android.a.h.d, net.youmi.android.a.k.a.d
{
  protected net.youmi.android.g.a a;
  net.youmi.android.smart.f b;
  protected Context c;
  protected e d;
  private RelativeLayout e;
  private FrameLayout f;
  private p g;
  
  private void a()
  {
    try
    {
      this.g = ((p)getIntent().getSerializableExtra("aca5522945c72310f9f22b333c68f2b3"));
      if (this.g == null) {
        finish();
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  private void a(int paramInt)
  {
    int j = this.g.o();
    int i = this.g.p();
    this.e = new RelativeLayout(this.c);
    this.e.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    this.f = new FrameLayout(this.c);
    Object localObject1 = null;
    try
    {
      if (this.g != null) {
        localObject1 = this.g.g();
      }
      this.b = new net.youmi.android.smart.f(this.c, this.d, paramInt, this, this.g.h(), this.g.i(), 0, (k)localObject1);
      this.b.a("正在努力加载");
      localObject1 = new FrameLayout.LayoutParams(-2, -2);
      ((FrameLayout.LayoutParams)localObject1).gravity = 17;
      net.youmi.android.c.k.d locald = net.youmi.android.c.k.d.a(this.c);
      paramInt = locald.b(j);
      i = locald.b(i);
    }
    catch (Throwable localThrowable1)
    {
      try
      {
        this.f.addView(this.b.getCurrentView(), (ViewGroup.LayoutParams)localObject1);
        localObject1 = new RelativeLayout.LayoutParams(paramInt, i);
        ((RelativeLayout.LayoutParams)localObject1).addRule(13);
        this.e.setBackgroundColor(Color.parseColor("#99333333"));
        this.e.addView(this.f, (ViewGroup.LayoutParams)localObject1);
        label230:
        a(this.c, this.g);
        return;
        localThrowable1 = localThrowable1;
        Object localObject2 = null;
      }
      catch (Throwable localThrowable2)
      {
        break label230;
      }
    }
  }
  
  private void a(Context paramContext, p paramp, e parame, boolean paramBoolean)
  {
    this.g = paramp;
    this.c = paramContext;
    this.d = parame;
    if (this.d != null) {
      this.d.a(this);
    }
    a(paramp.d());
    if (!paramBoolean) {}
    try
    {
      this.b.getCurrentView().setBackgroundColor(-1);
      label56:
      if ((paramp.k() == 2) && (paramp.j() != null) && (paramp.l() != null))
      {
        this.b.postUrl(paramp.l(), EncodingUtils.getBytes(paramp.j(), "BASE64"));
        return;
      }
      this.b.loadUrl(paramp.l());
      return;
    }
    catch (Throwable paramContext)
    {
      break label56;
    }
  }
  
  void a(Context paramContext, p paramp)
  {
    Object localObject = net.youmi.android.c.k.d.a(paramContext);
    localObject = new FrameLayout.LayoutParams(((net.youmi.android.c.k.d)localObject).b(34), ((net.youmi.android.c.k.d)localObject).b(34));
    this.a = new net.youmi.android.g.a(paramContext);
    this.a.setOnClickListener(this);
    switch (paramp.c())
    {
    default: 
      ((FrameLayout.LayoutParams)localObject).gravity = 51;
    }
    for (;;)
    {
      this.f.addView(this.a, (ViewGroup.LayoutParams)localObject);
      this.a.bringToFront();
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
  
  public net.youmi.android.a.h.f js_SDK_Handler_ClearCurrentBrowserHistory()
  {
    try
    {
      if (this.b != null)
      {
        this.b.clearHistory();
        net.youmi.android.a.h.f localf = net.youmi.android.a.h.f.b;
        return localf;
      }
    }
    catch (Throwable localThrowable) {}
    return net.youmi.android.a.h.f.c;
  }
  
  public boolean js_SDK_Handler_RunOnUIThread(Runnable paramRunnable)
  {
    try
    {
      boolean bool = net.youmi.android.c.j.a.a().a(paramRunnable);
      return bool;
    }
    catch (Throwable paramRunnable) {}
    return false;
  }
  
  public void onClick(View paramView)
  {
    try
    {
      finish();
      overridePendingTransition(17432576, 17432577);
      return;
    }
    catch (Throwable paramView) {}
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a();
    paramBundle = new net.youmi.android.d.g.a(this, null, this.g);
    a(this, this.g, paramBundle, true);
    paramBundle = new RelativeLayout.LayoutParams(-1, -1);
    addContentView(this.e, paramBundle);
  }
  
  public boolean proxyClearWebViewHistory()
  {
    try
    {
      if (this.b != null)
      {
        this.b.clearHistory();
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
    try
    {
      if ((this.b != null) && (paramString != null))
      {
        this.b.loadUrl(paramString);
        return true;
      }
    }
    catch (Throwable paramString) {}
    return false;
  }
  
  public boolean proxyPostUrl(String paramString, byte[] paramArrayOfByte)
  {
    if (paramString != null) {
      try
      {
        if (this.b != null)
        {
          this.b.postUrl(paramString, paramArrayOfByte);
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


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.SmartBannerActivity
 * JD-Core Version:    0.7.0.1
 */