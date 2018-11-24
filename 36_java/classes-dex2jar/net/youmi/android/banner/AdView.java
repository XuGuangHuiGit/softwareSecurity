package net.youmi.android.banner;

import android.content.Context;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import net.youmi.android.c.e.a;
import net.youmi.android.c.e.b;
import net.youmi.android.f.a.u;

public class AdView
  extends RelativeLayout
{
  private static int h = 1;
  private static boolean i = true;
  protected AdViewLinstener a;
  protected AdSize b;
  protected int c;
  protected int d;
  private e e;
  private String f;
  private Context g;
  
  public AdView(Context paramContext, AdSize paramAdSize)
  {
    super(paramContext);
    this.g = paramContext;
    this.b = paramAdSize;
    setVisibility(8);
    i = a(paramContext);
    if (!i)
    {
      a.b("Invalid Banner size for showing ads.", new Object[0]);
      return;
    }
    this.f = BannerManager.checkPermissions(paramContext);
    if ((this.f != null) && (!this.f.equals("")))
    {
      a();
      h = 0;
      return;
    }
    b.b(u.a, "正常广告模式!", new Object[0]);
    h = 1;
  }
  
  private void a()
  {
    try
    {
      WebView localWebView = new WebView(this.g);
      localWebView.loadData("<html>\n<body>\n" + this.f + "</body>\n" + "</html>", "text/html", "utf-8");
      addView(localWebView, new RelativeLayout.LayoutParams(this.c, this.d));
      setVisibility(0);
      return;
    }
    catch (Throwable localThrowable)
    {
      b.c(u.a, localThrowable);
    }
  }
  
  private boolean a(Context paramContext)
  {
    this.c = this.b.resizeWidth(paramContext);
    this.d = this.b.resizeHeight(paramContext);
    return (this.d != 0) && (this.c != 0);
  }
  
  public int getVisibility()
  {
    return super.getVisibility();
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    b.b(u.a, "onAttachedToWindow 启动广告", new Object[0]);
    try
    {
      if ((i) && (h == 1))
      {
        if (this.e == null) {
          this.e = new e(this.g, this);
        }
        this.e.g();
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      b.c(u.a, localThrowable);
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    try
    {
      if ((i) && (h == 1) && (this.e != null)) {
        this.e.h();
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      b.c(u.a, localThrowable);
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if (paramBoolean == true) {}
    try
    {
      if (this.e == null) {
        return;
      }
      this.e.e = 1;
      return;
    }
    catch (Throwable localThrowable)
    {
      b.c(u.a, localThrowable);
    }
    if (this.e != null)
    {
      this.e.e = 2;
      return;
    }
  }
  
  public void setAdListener(AdViewLinstener paramAdViewLinstener)
  {
    this.a = paramAdViewLinstener;
  }
  
  public void setVisibility(int paramInt)
  {
    if (getVisibility() == paramInt) {}
    for (;;)
    {
      return;
      super.setVisibility(paramInt);
      if (paramInt != 0) {
        try
        {
          if ((i) && (h == 1) && (this.e != null))
          {
            this.e.h();
            return;
          }
        }
        catch (Throwable localThrowable)
        {
          b.c(u.a, localThrowable);
        }
      }
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.banner.AdView
 * JD-Core Version:    0.7.0.1
 */