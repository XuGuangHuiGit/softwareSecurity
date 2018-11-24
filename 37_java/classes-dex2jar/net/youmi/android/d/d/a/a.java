package net.youmi.android.d.d.a;

import android.content.Context;
import android.content.Intent;
import java.io.Serializable;

public abstract class a
  implements Serializable
{
  public abstract void a(Context paramContext);
  
  public void a(Intent paramIntent)
  {
    try
    {
      paramIntent.putExtra("uMJpK6hDkTmz", this);
      return;
    }
    catch (Throwable paramIntent) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.d.a.a
 * JD-Core Version:    0.7.0.1
 */