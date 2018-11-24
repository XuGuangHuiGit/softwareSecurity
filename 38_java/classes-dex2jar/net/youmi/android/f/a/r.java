package net.youmi.android.f.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;

final class r
  implements Runnable
{
  r(Context paramContext, String paramString, Handler paramHandler) {}
  
  public void run()
  {
    Bitmap localBitmap = p.a(this.a, this.b);
    Message localMessage = Message.obtain();
    localMessage.obj = localBitmap;
    this.c.sendMessage(localMessage);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.f.a.r
 * JD-Core Version:    0.7.0.1
 */