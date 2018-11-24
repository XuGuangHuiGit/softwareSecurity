package net.youmi.android.offers.b.b.c;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.Random;
import net.youmi.android.c.k.d;
import net.youmi.android.c.k.h;
import net.youmi.android.offers.EarnPointsOrderInfo;
import net.youmi.android.offers.PointsManager;
import net.youmi.android.offers.PointsReceiver;

public class e
{
  public static void a(Context paramContext, EarnPointsOrderInfo paramEarnPointsOrderInfo)
  {
    if (paramEarnPointsOrderInfo == null) {}
    for (;;)
    {
      return;
      Object localObject1 = null;
      Object localObject2 = null;
      try
      {
        if (PointsManager.getInstance(paramContext).isEnableEarnPointsToastTips())
        {
          localObject1 = localObject2;
          if (0 == 0) {
            localObject1 = h.b(paramContext, paramContext.getPackageName());
          }
          b(paramContext, paramEarnPointsOrderInfo, (net.youmi.android.c.k.a)localObject1);
        }
        if (PointsManager.getInstance(paramContext).isEnableEarnPointsNotification())
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = h.b(paramContext, paramContext.getPackageName());
          }
          a(paramContext, paramEarnPointsOrderInfo, (net.youmi.android.c.k.a)localObject2);
          return;
        }
      }
      catch (Throwable paramContext) {}
    }
  }
  
  private static void a(Context paramContext, EarnPointsOrderInfo paramEarnPointsOrderInfo, net.youmi.android.c.k.a parama)
  {
    try
    {
      String str = paramEarnPointsOrderInfo.getMessage();
      paramEarnPointsOrderInfo = paramEarnPointsOrderInfo.getOrderID();
      if (paramEarnPointsOrderInfo != null) {}
      for (int i = paramEarnPointsOrderInfo.hashCode();; i = new Random(System.currentTimeMillis()).nextInt())
      {
        paramEarnPointsOrderInfo = (NotificationManager)paramContext.getSystemService("notification");
        Notification localNotification = new Notification();
        localNotification.flags = 16;
        localNotification.icon = parama.c();
        PendingIntent localPendingIntent = PendingIntent.getBroadcast(paramContext, i, new Intent(PointsReceiver.getActionName_ViewPoints(paramContext)), 134217728);
        localNotification.setLatestEventInfo(paramContext, parama.a() + " 温馨提示", str, localPendingIntent);
        paramEarnPointsOrderInfo.notify(i, localNotification);
        return;
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  private static void b(Context paramContext, EarnPointsOrderInfo paramEarnPointsOrderInfo, net.youmi.android.c.k.a parama)
  {
    try
    {
      paramEarnPointsOrderInfo = paramEarnPointsOrderInfo.getMessage();
      if (paramEarnPointsOrderInfo == null) {
        return;
      }
      i = 0;
    }
    catch (Throwable paramContext)
    {
      int i;
      int j;
      label30:
      return;
    }
    try
    {
      j = d.a(paramContext).b();
      i = (int)(j * 0.8D);
    }
    catch (Throwable parama)
    {
      break label30;
    }
    paramContext = new g(paramContext, paramEarnPointsOrderInfo, 3500, i);
    net.youmi.android.c.j.a.a().a(paramContext);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.b.b.c.e
 * JD-Core Version:    0.7.0.1
 */