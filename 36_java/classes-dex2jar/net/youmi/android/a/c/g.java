package net.youmi.android.a.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.GeolocationPermissions.Callback;

class g
  implements DialogInterface.OnClickListener
{
  g(e parame, GeolocationPermissions.Callback paramCallback, String paramString) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      this.a.invoke(this.b, true, true);
      paramDialogInterface.cancel();
      return;
    }
    catch (Throwable paramDialogInterface) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.c.g
 * JD-Core Version:    0.7.0.1
 */