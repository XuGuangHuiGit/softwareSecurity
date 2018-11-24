package net.youmi.android.d.a;

import android.content.Context;
import android.content.IntentFilter;
import net.youmi.android.AdReceiver;

public class f
{
  private static AdReceiver a;
  
  public static void a(Context paramContext)
  {
    if (paramContext == null) {}
    for (;;)
    {
      return;
      try
      {
        paramContext = paramContext.getApplicationContext();
        if ((paramContext == null) || (a != null)) {
          continue;
        }
        AdReceiver localAdReceiver = new AdReceiver();
        IntentFilter localIntentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        localIntentFilter.addDataScheme("package");
        paramContext.registerReceiver(localAdReceiver, localIntentFilter);
        a = localAdReceiver;
      }
      catch (Throwable paramContext) {}finally {}
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.a.f
 * JD-Core Version:    0.7.0.1
 */