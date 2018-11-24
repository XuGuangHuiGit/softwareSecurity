package net.youmi.android.banner;

import android.os.Handler;
import android.os.Message;

class g
  extends Handler
{
  g(e parame) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      h localh = BannerManager.getBannerObject(e.a(this.a));
      String str = localh.g();
      if ((str == null) || (str.equals(""))) {
        this.a.a(localh);
      } else {
        e.a(this.a, localh);
      }
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.banner.g
 * JD-Core Version:    0.7.0.1
 */