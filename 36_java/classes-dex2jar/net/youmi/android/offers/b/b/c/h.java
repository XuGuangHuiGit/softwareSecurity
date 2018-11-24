package net.youmi.android.offers.b.b.c;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import net.youmi.android.offers.OffersReceiver;

public class h
{
  public static void a(Context paramContext)
  {
    try
    {
      i.a(paramContext);
      AlarmManager localAlarmManager = (AlarmManager)paramContext.getApplicationContext().getSystemService("alarm");
      paramContext = d(paramContext);
      if (paramContext == null) {
        return;
      }
      localAlarmManager.setInexactRepeating(1, System.currentTimeMillis() + 60000L, 60000L, paramContext);
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static void a(Context paramContext, long paramLong)
  {
    if (paramLong <= 0L) {}
    for (;;)
    {
      return;
      try
      {
        AlarmManager localAlarmManager = (AlarmManager)paramContext.getApplicationContext().getSystemService("alarm");
        paramContext = d(paramContext);
        if (paramContext != null)
        {
          localAlarmManager.setInexactRepeating(1, System.currentTimeMillis() + paramLong, 60000L, paramContext);
          return;
        }
      }
      catch (Throwable paramContext) {}
    }
  }
  
  public static void b(Context paramContext)
  {
    try
    {
      i.b(paramContext);
      AlarmManager localAlarmManager = (AlarmManager)paramContext.getApplicationContext().getSystemService("alarm");
      paramContext = d(paramContext);
      if (paramContext == null) {
        return;
      }
      localAlarmManager.cancel(paramContext);
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static void c(Context paramContext)
  {
    try
    {
      if (i.d(paramContext)) {
        b(paramContext);
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  private static PendingIntent d(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getApplicationContext();
      paramContext = PendingIntent.getBroadcast(paramContext, 115029712, new Intent(paramContext, OffersReceiver.class), 134217728);
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.b.b.c.h
 * JD-Core Version:    0.7.0.1
 */