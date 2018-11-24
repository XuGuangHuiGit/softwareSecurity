package net.youmi.android.banner;

import android.content.Context;
import net.youmi.android.c.k.d;

public class AdSize
{
  public static final int FILL_PARENT = -1;
  public static final AdSize FIT_SCREEN = new AdSize(-1, -2);
  public static final int LANDSPACE_AD_HEIGHT = 32;
  public static final int LARGE_AD_HEIGHT = 90;
  public static final int PORAIT_AD_HEIGHT = 50;
  public static final AdSize SIZE_300x250;
  public static final AdSize SIZE_320x50 = new AdSize(320, 50);
  public static final AdSize SIZE_468x60;
  public static final AdSize SIZE_728x90;
  public static final int WRAP_CONTENT = -2;
  private int a;
  private int b;
  private int c;
  private int d;
  
  static
  {
    SIZE_300x250 = new AdSize(300, 250);
    SIZE_468x60 = new AdSize(468, 60);
    SIZE_728x90 = new AdSize(728, 90);
  }
  
  public AdSize(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public int getAdHeight()
  {
    return this.b;
  }
  
  public int getAdWidth()
  {
    return this.a;
  }
  
  public int resizeHeight(Context paramContext)
  {
    paramContext = d.a(paramContext);
    if (this.b == -1) {
      this.d = 0;
    }
    for (;;)
    {
      float f = this.b;
      this.d = ((int)(paramContext.f() * f));
      return this.d;
      if (this.b == -2) {
        this.b = (this.a * 50 / 320);
      }
    }
  }
  
  public int resizeWidth(Context paramContext)
  {
    paramContext = d.a(paramContext);
    if (this.a == -2) {
      this.c = 0;
    }
    for (;;)
    {
      return this.c;
      if (this.a == -1)
      {
        this.c = paramContext.g();
        this.a = ((int)(this.c / paramContext.f()));
      }
      else
      {
        float f = this.a;
        this.c = ((int)(paramContext.f() * f));
      }
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.banner.AdSize
 * JD-Core Version:    0.7.0.1
 */