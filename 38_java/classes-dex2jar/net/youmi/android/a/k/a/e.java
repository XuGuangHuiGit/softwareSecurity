package net.youmi.android.a.k.a;

import android.view.View;

public abstract interface e
{
  public abstract boolean a();
  
  public abstract boolean b();
  
  public abstract boolean canGoBack();
  
  public abstract boolean canGoForward();
  
  public abstract void clearHistory();
  
  public abstract View getCurrentView();
  
  public abstract void loadUrl(String paramString);
  
  public abstract void postUrl(String paramString, byte[] paramArrayOfByte);
  
  public abstract void reload();
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.k.a.e
 * JD-Core Version:    0.7.0.1
 */