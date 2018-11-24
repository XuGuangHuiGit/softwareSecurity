package net.youmi.android.d.d.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;

public class b
  extends BroadcastReceiver
{
  private static b a;
  private IntentFilter b = new IntentFilter("android.intent.action.PACKAGE_REMOVED");
  
  private b()
  {
    this.b.addDataScheme("package");
  }
  
  public static void a(Context paramContext)
  {
    for (;;)
    {
      try
      {
        b localb = a;
        if (localb == null) {
          continue;
        }
      }
      catch (Throwable paramContext)
      {
        continue;
      }
      finally {}
      return;
      if (paramContext != null)
      {
        paramContext = paramContext.getApplicationContext();
        if (paramContext != null)
        {
          a = new b();
          a.b(paramContext);
        }
      }
    }
  }
  
  private void b(Context paramContext)
  {
    try
    {
      paramContext.registerReceiver(this, this.b);
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      String str = paramIntent.getAction();
      if (str == null) {
        return;
      }
      paramIntent = paramIntent.getData().getSchemeSpecificPart();
      if (paramIntent != null)
      {
        paramIntent = paramIntent.trim();
        if (paramIntent.length() > 0)
        {
          if (str.trim().equals("android.intent.action.PACKAGE_REMOVED"))
          {
            c.a(paramContext, paramIntent);
            return;
          }
          boolean bool = str.trim().equals("android.intent.action.PACKAGE_REPLACED");
          if (!bool) {}
        }
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.d.a.b
 * JD-Core Version:    0.7.0.1
 */