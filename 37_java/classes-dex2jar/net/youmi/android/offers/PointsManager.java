package net.youmi.android.offers;

import android.content.Context;
import net.youmi.android.a.b.a;
import net.youmi.android.offers.b.b.c.b;
import net.youmi.android.offers.b.b.c.d;

public class PointsManager
{
  private static PointsManager b;
  private Context a;
  private boolean c = true;
  private boolean d = true;
  
  private PointsManager(Context paramContext)
  {
    if (paramContext == null) {
      throw new NullPointerException("Context must not be null");
    }
    this.a = paramContext.getApplicationContext();
  }
  
  public static PointsManager getInstance(Context paramContext)
  {
    try
    {
      if (b == null) {
        b = new PointsManager(paramContext);
      }
      paramContext = b;
      return paramContext;
    }
    finally {}
  }
  
  public boolean awardPoints(int paramInt)
  {
    try
    {
      boolean bool = d.a(this.a).b(paramInt);
      return bool;
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public boolean isEnableEarnPointsNotification()
  {
    try
    {
      boolean bool = a.a(this.a, "bd11bfa4633e8a815169beeadf88eb29", this.c);
      return bool;
    }
    catch (Throwable localThrowable) {}
    return this.c;
  }
  
  public boolean isEnableEarnPointsToastTips()
  {
    try
    {
      boolean bool = a.a(this.a, "fa78813487152b8b05214f12dade66a2", this.d);
      return bool;
    }
    catch (Throwable localThrowable) {}
    return this.d;
  }
  
  public int queryPoints()
  {
    try
    {
      int i = d.a(this.a).a();
      return i;
    }
    catch (Throwable localThrowable) {}
    return 0;
  }
  
  public void registerNotify(PointsChangeNotify paramPointsChangeNotify)
  {
    if (paramPointsChangeNotify != null) {}
    try
    {
      b.a(this.a).a(paramPointsChangeNotify);
      return;
    }
    catch (Throwable paramPointsChangeNotify) {}
  }
  
  public void setEnableEarnPointsNotification(boolean paramBoolean)
  {
    this.c = paramBoolean;
    try
    {
      a.a(this.a, "bd11bfa4633e8a815169beeadf88eb29", paramBoolean, -1L);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void setEnableEarnPointsToastTips(boolean paramBoolean)
  {
    this.d = paramBoolean;
    try
    {
      a.a(this.a, "fa78813487152b8b05214f12dade66a2", paramBoolean, -1L);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public boolean spendPoints(int paramInt)
  {
    try
    {
      boolean bool = d.a(this.a).a(paramInt);
      return bool;
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public void unRegisterNotify(PointsChangeNotify paramPointsChangeNotify)
  {
    if (paramPointsChangeNotify != null) {}
    try
    {
      b.a(this.a).b(paramPointsChangeNotify);
      return;
    }
    catch (Throwable paramPointsChangeNotify) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.PointsManager
 * JD-Core Version:    0.7.0.1
 */