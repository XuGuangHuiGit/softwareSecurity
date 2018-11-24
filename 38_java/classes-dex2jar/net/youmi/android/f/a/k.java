package net.youmi.android.f.a;

import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;

class k
  extends Handler
{
  k(j paramj) {}
  
  public void handleMessage(Message paramMessage)
  {
    try
    {
      if (j.a(this.a) != null)
      {
        j.a(this.a).setBackgroundDrawable(new BitmapDrawable(j.b(this.a)));
        return;
      }
      j.c(this.a);
      return;
    }
    catch (Exception paramMessage)
    {
      Log.e("GifView", paramMessage.toString());
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.f.a.k
 * JD-Core Version:    0.7.0.1
 */