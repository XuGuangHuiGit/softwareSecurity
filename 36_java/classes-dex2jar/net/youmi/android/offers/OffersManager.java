package net.youmi.android.offers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
import net.youmi.android.c.k.b;
import net.youmi.android.offers.b.b.c.h;

public class OffersManager
{
  public static final int STYLE_SPOT_CENTER = 0;
  public static final int STYLE_SPOT_TOP_DOWN_REVERSE = 1;
  private static OffersManager a;
  private Context b;
  
  private OffersManager(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
  }
  
  public static OffersManager getInstance(Context paramContext)
  {
    if (paramContext == null) {
      try
      {
        throw new NullPointerException("Context must not be null");
      }
      finally {}
    }
    if (a == null) {
      a = new OffersManager(paramContext);
    }
    paramContext = a;
    return paramContext;
  }
  
  public boolean checkOffersAdConfig()
  {
    return checkOffersAdConfig(false);
  }
  
  public boolean checkOffersAdConfig(boolean paramBoolean)
  {
    if (!net.youmi.android.dev.a.d(this.b)) {}
    Object localObject1;
    Object localObject2;
    do
    {
      do
      {
        return false;
        if (!b.c(this.b, OffersReceiver.class))
        {
          net.youmi.android.c.e.a.b("Check Ad Component Failure , Please Add \"%s\" To AndroidManifest.xml", new Object[] { OffersReceiver.class.getName() });
          return false;
        }
        if (!paramBoolean) {
          break;
        }
        localObject1 = this.b.getPackageManager();
        localObject2 = PointsReceiver.getActionName_EarnPoints(this.b);
      } while (localObject2 == null);
      localObject1 = ((PackageManager)localObject1).queryBroadcastReceivers(new Intent((String)localObject2), 0);
    } while (localObject1 == null);
    int i = 0;
    if (i < ((List)localObject1).size())
    {
      localObject2 = (ResolveInfo)((List)localObject1).get(i);
      if ((localObject2 == null) || (((ResolveInfo)localObject2).activityInfo == null)) {}
    }
    for (;;)
    {
      try
      {
        paramBoolean = PointsReceiver.class.isAssignableFrom(Class.forName(((ResolveInfo)localObject2).activityInfo.name));
        if (paramBoolean)
        {
          i = 1;
          if (i == 0) {
            break label163;
          }
          return true;
        }
      }
      catch (Throwable localThrowable) {}
      i += 1;
      break;
      label163:
      net.youmi.android.c.e.a.b("Check Ad Componet Failure , There Is Not Class Found Which Extends %s", new Object[] { PointsReceiver.class.getName() });
      return false;
      return true;
      i = 0;
    }
  }
  
  public String getCustomUserId()
  {
    return net.youmi.android.b.b.a.g(this.b);
  }
  
  public Intent getShowOffersWallIntent(int paramInt)
  {
    return net.youmi.android.offers.b.b.b.a.a(this.b, paramInt);
  }
  
  public void onAppExit()
  {
    try
    {
      h.b(this.b);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  /* Error */
  public void onAppLaunch()
  {
    // Byte code:
    //   0: invokestatic 150	java/lang/System:currentTimeMillis	()J
    //   3: pop2
    //   4: ldc 152
    //   6: iconst_0
    //   7: anewarray 4	java/lang/Object
    //   10: invokestatic 154	net/youmi/android/c/e/a:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   13: aload_0
    //   14: getfield 26	net/youmi/android/offers/OffersManager:b	Landroid/content/Context;
    //   17: invokestatic 158	net/youmi/android/offers/b/b/d/a:a	(Landroid/content/Context;)V
    //   20: aload_0
    //   21: getfield 26	net/youmi/android/offers/OffersManager:b	Landroid/content/Context;
    //   24: invokestatic 159	net/youmi/android/offers/b/b/c/h:a	(Landroid/content/Context;)V
    //   27: return
    //   28: astore_1
    //   29: aload_1
    //   30: athrow
    //   31: astore_1
    //   32: return
    //   33: astore_1
    //   34: goto -21 -> 13
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	this	OffersManager
    //   28	2	1	localObject	Object
    //   31	1	1	localThrowable1	Throwable
    //   33	1	1	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   4	13	28	finally
    //   13	27	28	finally
    //   13	27	31	java/lang/Throwable
    //   4	13	33	java/lang/Throwable
  }
  
  public void setCustomUserId(String paramString)
  {
    try
    {
      net.youmi.android.b.b.a.c(this.b, paramString);
      return;
    }
    catch (Throwable paramString) {}
  }
  
  /* Error */
  public boolean showOffersSpot()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 26	net/youmi/android/offers/OffersManager:b	Landroid/content/Context;
    //   4: invokestatic 169	net/youmi/android/offers/b/b/e/a:a	(Landroid/content/Context;)Lnet/youmi/android/offers/b/b/e/a;
    //   7: invokevirtual 171	net/youmi/android/offers/b/b/e/a:a	()V
    //   10: aload_0
    //   11: getfield 26	net/youmi/android/offers/OffersManager:b	Landroid/content/Context;
    //   14: invokestatic 159	net/youmi/android/offers/b/b/c/h:a	(Landroid/content/Context;)V
    //   17: iconst_1
    //   18: ireturn
    //   19: astore_1
    //   20: iconst_0
    //   21: ireturn
    //   22: astore_1
    //   23: goto -6 -> 17
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	26	0	this	OffersManager
    //   19	1	1	localThrowable1	Throwable
    //   22	1	1	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	10	19	java/lang/Throwable
    //   10	17	22	java/lang/Throwable
  }
  
  /* Error */
  public boolean showOffersSpot(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 26	net/youmi/android/offers/OffersManager:b	Landroid/content/Context;
    //   4: invokestatic 169	net/youmi/android/offers/b/b/e/a:a	(Landroid/content/Context;)Lnet/youmi/android/offers/b/b/e/a;
    //   7: iload_1
    //   8: invokevirtual 175	net/youmi/android/offers/b/b/e/a:a	(I)V
    //   11: aload_0
    //   12: getfield 26	net/youmi/android/offers/OffersManager:b	Landroid/content/Context;
    //   15: invokestatic 159	net/youmi/android/offers/b/b/c/h:a	(Landroid/content/Context;)V
    //   18: iconst_1
    //   19: ireturn
    //   20: astore_2
    //   21: iconst_0
    //   22: ireturn
    //   23: astore_2
    //   24: goto -6 -> 18
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	OffersManager
    //   0	27	1	paramInt	int
    //   20	1	2	localThrowable1	Throwable
    //   23	1	2	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	11	20	java/lang/Throwable
    //   11	18	23	java/lang/Throwable
  }
  
  /* Error */
  public void showOffersWall()
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 177
    //   3: invokevirtual 179	net/youmi/android/offers/OffersManager:getShowOffersWallIntent	(I)Landroid/content/Intent;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull +11 -> 19
    //   11: aload_0
    //   12: getfield 26	net/youmi/android/offers/OffersManager:b	Landroid/content/Context;
    //   15: aload_1
    //   16: invokevirtual 183	android/content/Context:startActivity	(Landroid/content/Intent;)V
    //   19: aload_0
    //   20: getfield 26	net/youmi/android/offers/OffersManager:b	Landroid/content/Context;
    //   23: invokestatic 159	net/youmi/android/offers/b/b/c/h:a	(Landroid/content/Context;)V
    //   26: return
    //   27: astore_1
    //   28: return
    //   29: astore_1
    //   30: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	this	OffersManager
    //   6	10	1	localIntent	Intent
    //   27	1	1	localThrowable1	Throwable
    //   29	1	1	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	7	27	java/lang/Throwable
    //   11	19	27	java/lang/Throwable
    //   19	26	29	java/lang/Throwable
  }
  
  public void showOffersWallDialog(Activity paramActivity)
  {
    try
    {
      net.youmi.android.offers.b.b.b.a.a(paramActivity, null);
      return;
    }
    catch (Throwable paramActivity)
    {
      try
      {
        h.a(this.b);
        return;
      }
      catch (Throwable paramActivity) {}
      paramActivity = paramActivity;
      return;
    }
  }
  
  public void showOffersWallDialog(Activity paramActivity, double paramDouble1, double paramDouble2)
  {
    try
    {
      net.youmi.android.offers.b.b.b.a.a(paramActivity, paramDouble1, paramDouble2, null);
      return;
    }
    catch (Throwable paramActivity)
    {
      try
      {
        h.a(this.b);
        return;
      }
      catch (Throwable paramActivity) {}
      paramActivity = paramActivity;
      return;
    }
  }
  
  public void showOffersWallDialog(Activity paramActivity, double paramDouble1, double paramDouble2, OffersWallDialogListener paramOffersWallDialogListener)
  {
    try
    {
      net.youmi.android.offers.b.b.b.a.a(paramActivity, paramDouble1, paramDouble2, paramOffersWallDialogListener);
      return;
    }
    catch (Throwable paramActivity)
    {
      try
      {
        h.a(this.b);
        return;
      }
      catch (Throwable paramActivity) {}
      paramActivity = paramActivity;
      return;
    }
  }
  
  public void showOffersWallDialog(Activity paramActivity, int paramInt1, int paramInt2)
  {
    try
    {
      net.youmi.android.offers.b.b.b.a.a(paramActivity, paramInt1, paramInt2, null);
      return;
    }
    catch (Throwable paramActivity)
    {
      try
      {
        h.a(this.b);
        return;
      }
      catch (Throwable paramActivity) {}
      paramActivity = paramActivity;
      return;
    }
  }
  
  public void showOffersWallDialog(Activity paramActivity, int paramInt1, int paramInt2, OffersWallDialogListener paramOffersWallDialogListener)
  {
    try
    {
      net.youmi.android.offers.b.b.b.a.a(paramActivity, paramInt1, paramInt2, paramOffersWallDialogListener);
      return;
    }
    catch (Throwable paramActivity)
    {
      try
      {
        h.a(this.b);
        return;
      }
      catch (Throwable paramActivity) {}
      paramActivity = paramActivity;
      return;
    }
  }
  
  public void showOffersWallDialog(Activity paramActivity, OffersWallDialogListener paramOffersWallDialogListener)
  {
    try
    {
      net.youmi.android.offers.b.b.b.a.a(paramActivity, paramOffersWallDialogListener);
      return;
    }
    catch (Throwable paramActivity)
    {
      try
      {
        h.a(this.b);
        return;
      }
      catch (Throwable paramActivity) {}
      paramActivity = paramActivity;
      return;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.OffersManager
 * JD-Core Version:    0.7.0.1
 */