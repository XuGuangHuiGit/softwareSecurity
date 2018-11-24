package net.youmi.android;

import android.app.IntentService;
import android.content.Intent;
import net.youmi.android.d.d.a.a;

public class AdService
  extends IntentService
{
  public AdService()
  {
    super("e298a29c3e4ed1313f3a82588d004ffa");
  }
  
  protected final void onHandleIntent(Intent paramIntent)
  {
    if (paramIntent == null) {}
    for (;;)
    {
      return;
      try
      {
        paramIntent = paramIntent.getSerializableExtra("uMJpK6hDkTmz");
        if ((paramIntent instanceof a))
        {
          ((a)paramIntent).a(this);
          return;
        }
      }
      catch (Throwable paramIntent) {}
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.AdService
 * JD-Core Version:    0.7.0.1
 */