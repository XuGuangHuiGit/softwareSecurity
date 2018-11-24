package net.youmi.android.offers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import net.youmi.android.AdService;

public class OffersReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      paramIntent = new c();
      Intent localIntent = new Intent(paramContext, AdService.class);
      paramIntent.a(localIntent);
      paramContext.startService(localIntent);
      return;
    }
    catch (Throwable paramContext) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.OffersReceiver
 * JD-Core Version:    0.7.0.1
 */