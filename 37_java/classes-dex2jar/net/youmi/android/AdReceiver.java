package net.youmi.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import net.youmi.android.c.b.e;
import net.youmi.android.d.a.g;

public class AdReceiver
  extends BroadcastReceiver
{
  private static int a = 0;
  private int b;
  
  public AdReceiver()
  {
    int i = a + 1;
    a = i;
    this.b = i;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      Object localObject = paramIntent.getAction();
      if ("android.intent.action.PACKAGE_ADDED".equals(localObject))
      {
        paramIntent = e.b(paramIntent.getData().getSchemeSpecificPart());
        if (paramIntent != null) {}
      }
      boolean bool;
      do
      {
        return;
        try
        {
          paramIntent = new g(paramIntent);
          localObject = new Intent(paramContext, AdService.class);
          paramIntent.a((Intent)localObject);
          paramContext.startService((Intent)localObject);
          return;
        }
        catch (Throwable paramContext)
        {
          return;
        }
        bool = "android.intent.action.PACKAGE_REMOVED".equals(localObject);
      } while (!bool);
      return;
    }
    catch (Throwable paramContext) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.AdReceiver
 * JD-Core Version:    0.7.0.1
 */