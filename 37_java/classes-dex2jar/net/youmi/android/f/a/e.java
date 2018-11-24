package net.youmi.android.f.a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import java.io.File;

final class e
  implements Runnable
{
  e(Context paramContext, String paramString, Handler paramHandler) {}
  
  public void run()
  {
    File localFile = c.a(this.a, this.b);
    Message localMessage = Message.obtain();
    localMessage.obj = localFile;
    this.c.sendMessage(localMessage);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.f.a.e
 * JD-Core Version:    0.7.0.1
 */