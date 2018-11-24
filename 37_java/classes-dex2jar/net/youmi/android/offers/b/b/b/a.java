package net.youmi.android.offers.b.b.b;

import android.content.Context;
import android.content.Intent;
import net.youmi.android.AdBrowser;
import net.youmi.android.a.h.l;
import net.youmi.android.a.h.p;
import net.youmi.android.offers.OffersWallDialogListener;

public class a
{
  public static Intent a(Context paramContext, int paramInt)
  {
    try
    {
      paramContext = new Intent(paramContext, AdBrowser.class);
      l locall = new l(3, 405);
      locall.e(net.youmi.android.offers.a.a.a() + "?type=" + 1);
      locall.b(1);
      locall.a(new net.youmi.android.offers.b.a.a());
      paramContext.putExtra("aca5522945c72310f9f22b333c68f2b3", locall);
      paramContext.addFlags(paramInt);
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return null;
  }
  
  private static p a()
  {
    try
    {
      p localp = new p(3, 405);
      localp.a(1);
      localp.e(net.youmi.android.offers.a.a.a() + "?type=" + 32);
      localp.b(1);
      localp.a(new net.youmi.android.offers.b.a.a());
      return localp;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  public static boolean a(Context paramContext, double paramDouble1, double paramDouble2, OffersWallDialogListener paramOffersWallDialogListener)
  {
    try
    {
      p localp = a();
      if (localp == null) {
        return false;
      }
      localp.a(paramDouble1);
      localp.b(paramDouble2);
      paramContext = net.youmi.android.d.a.b(paramContext, localp);
      paramContext.a(paramOffersWallDialogListener);
      paramContext.show();
      return true;
    }
    catch (Throwable paramContext) {}
    return false;
  }
  
  public static boolean a(Context paramContext, int paramInt1, int paramInt2, OffersWallDialogListener paramOffersWallDialogListener)
  {
    try
    {
      p localp = a();
      if (localp == null) {
        return false;
      }
      localp.e(paramInt1);
      localp.f(paramInt2);
      paramContext = net.youmi.android.d.a.b(paramContext, localp);
      paramContext.a(paramOffersWallDialogListener);
      paramContext.show();
      return true;
    }
    catch (Throwable paramContext) {}
    return false;
  }
  
  public static boolean a(Context paramContext, OffersWallDialogListener paramOffersWallDialogListener)
  {
    try
    {
      p localp = a();
      if (localp == null) {
        return false;
      }
      localp.a(0.95D);
      localp.b(0.9D);
      paramContext = net.youmi.android.d.a.b(paramContext, localp);
      paramContext.a(paramOffersWallDialogListener);
      paramContext.show();
      return true;
    }
    catch (Throwable paramContext) {}
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.b.b.b.a
 * JD-Core Version:    0.7.0.1
 */