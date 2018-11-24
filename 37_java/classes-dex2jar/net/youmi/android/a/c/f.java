package net.youmi.android.a.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.GeolocationPermissions.Callback;

class f
  implements DialogInterface.OnClickListener
{
  f(e parame, GeolocationPermissions.Callback paramCallback, String paramString) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      this.a.invoke(this.b, false, false);
      paramDialogInterface.cancel();
      return;
    }
    catch (Throwable paramDialogInterface) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.c.f
 * JD-Core Version:    0.7.0.1
 */