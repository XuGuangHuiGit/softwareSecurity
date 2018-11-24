package net.youmi.android.diy.banner;

import android.content.Context;
import net.youmi.android.diy.b;

public class DiyBanner
  extends b
{
  public static final int TYPE_BANNER = 2;
  public static final int TYPE_MINI_BANNER = 4;
  
  public DiyBanner(Context paramContext, DiyAdSize paramDiyAdSize)
  {
    super(paramContext, paramDiyAdSize, a(paramDiyAdSize));
  }
  
  private static String a(DiyAdSize paramDiyAdSize)
  {
    try
    {
      int i = paramDiyAdSize.getHeight();
      switch (i)
      {
      }
    }
    catch (Throwable paramDiyAdSize)
    {
      label32:
      break label32;
    }
    return "http://au.youmi.net/regular/aos/banner.html";
    return "http://au.youmi.net/regular/aos/banner.html?type=2&ft=2";
    return "http://au.youmi.net/regular/aos/banner.html?type=4&ft=2";
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.diy.banner.DiyBanner
 * JD-Core Version:    0.7.0.1
 */