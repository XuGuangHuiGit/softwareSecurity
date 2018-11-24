package net.youmi.android.a.i;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import net.youmi.android.c.k.i;

public class a
{
  private static Location a;
  private static a b;
  private Context c;
  
  public a(Context paramContext)
  {
    this.c = paramContext.getApplicationContext();
    b(this.c);
  }
  
  public static a a(Context paramContext)
  {
    try
    {
      if (b == null) {
        b = new a(paramContext);
      }
      label17:
      return b;
    }
    catch (Throwable paramContext)
    {
      break label17;
    }
  }
  
  private void b(Context paramContext)
  {
    try
    {
      if (a != null) {
        return;
      }
      if ((i.f(paramContext)) || (i.e(paramContext)))
      {
        paramContext = (LocationManager)paramContext.getSystemService("location");
        if (paramContext != null) {
          try
          {
            paramContext = paramContext.getLastKnownLocation("network");
            if ((paramContext != null) && ((paramContext.getLongitude() != 0.0D) || (paramContext.getLatitude() != 0.0D)))
            {
              a(paramContext);
              return;
            }
          }
          catch (Throwable paramContext) {}
        }
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public Location a()
  {
    if ((a != null) && ((a.getLongitude() != 0.0D) || (a.getLatitude() != 0.0D))) {
      return a;
    }
    return null;
  }
  
  public void a(Location paramLocation)
  {
    if (paramLocation != null) {}
    try
    {
      if ((paramLocation.getLatitude() != 0.0D) || (paramLocation.getLongitude() != 0.0D)) {
        a = paramLocation;
      }
      return;
    }
    catch (Throwable paramLocation) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.i.a
 * JD-Core Version:    0.7.0.1
 */