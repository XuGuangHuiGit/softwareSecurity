package net.youmi.android.a.c;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import net.youmi.android.a.k.a.b;

class i
  extends e
{
  i(b paramb)
  {
    super(paramb);
  }
  
  static i c(b paramb)
  {
    try
    {
      paramb = new i(paramb);
      return paramb;
    }
    catch (Throwable paramb) {}
    return null;
  }
  
  public Bitmap getDefaultVideoPoster()
  {
    return super.getDefaultVideoPoster();
  }
  
  public View getVideoLoadingProgressView()
  {
    return super.getVideoLoadingProgressView();
  }
  
  public void onHideCustomView()
  {
    super.onHideCustomView();
  }
  
  public void onReachedMaxAppCacheSize(long paramLong1, long paramLong2, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    try
    {
      paramQuotaUpdater.updateQuota(2L * paramLong1);
      return;
    }
    catch (Throwable paramQuotaUpdater) {}
  }
  
  public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    super.onShowCustomView(paramView, paramCustomViewCallback);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.c.i
 * JD-Core Version:    0.7.0.1
 */