package net.youmi.android.d.a;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import net.youmi.android.a.a.a.g;
import net.youmi.android.a.h.i;
import net.youmi.android.c.k.h;

class c
{
  private int a;
  private Notification b;
  private PendingIntent c;
  private PendingIntent d;
  private NotificationManager e;
  private Context f;
  private g g;
  private net.youmi.android.a.a.a.a h;
  private String i;
  private String j;
  private String k;
  private String l;
  private String m;
  
  c(Context paramContext, i parami, int paramInt)
  {
    this.f = paramContext.getApplicationContext();
    this.a = paramInt;
    if (parami != null) {}
    try
    {
      this.h = parami.e();
      if (this.h != null) {
        this.g = this.h.g();
      }
      label47:
      b();
      return;
    }
    catch (Throwable paramContext)
    {
      break label47;
    }
  }
  
  private void b()
  {
    try
    {
      if (this.g != null)
      {
        String str = this.g.b();
        if (str != null)
        {
          this.k = String.format("正在下载《%s》", new Object[] { str });
          this.m = String.format("下载《%s》失败", new Object[] { str });
          this.l = String.format("成功下载《%s》", new Object[] { str });
        }
      }
      if (this.k == null) {
        this.k = "正在下载";
      }
      if (this.m == null) {
        this.m = "下载失败";
      }
      if (this.l == null) {
        this.l = "下载成功";
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  private String c()
  {
    try
    {
      if (this.i == null) {
        this.i = ((String)net.youmi.android.d.e.a.a().get("e"));
      }
      if (this.i != null)
      {
        String str = this.i;
        return str;
      }
    }
    catch (Throwable localThrowable) {}
    return "已完成: ";
  }
  
  private boolean c(String paramString)
  {
    boolean bool = false;
    try
    {
      paramString = h.d(this.f, paramString);
      this.d = PendingIntent.getActivity(this.f, this.a, paramString, 0);
      paramString = this.d;
      if (paramString != null) {
        bool = true;
      }
      return bool;
    }
    catch (Throwable paramString) {}
    return false;
  }
  
  private String d()
  {
    try
    {
      if (this.j == null) {
        this.j = ((String)net.youmi.android.d.e.a.a().get("f"));
      }
      if (this.j != null)
      {
        String str = this.j;
        return str;
      }
    }
    catch (Throwable localThrowable) {}
    return "下载速度: ";
  }
  
  private boolean e()
  {
    try
    {
      if (this.e == null) {
        this.e = ((NotificationManager)this.f.getSystemService("notification"));
      }
      NotificationManager localNotificationManager = this.e;
      return localNotificationManager != null;
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  private boolean f()
  {
    boolean bool = false;
    try
    {
      if (this.b == null)
      {
        this.b = new Notification();
        this.b.when = System.currentTimeMillis();
      }
      Notification localNotification = this.b;
      if (localNotification != null) {
        bool = true;
      }
      return bool;
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  private boolean g()
  {
    boolean bool = false;
    try
    {
      if (this.c == null)
      {
        localObject = new Intent();
        this.c = PendingIntent.getActivity(this.f, this.a, (Intent)localObject, 134217728);
      }
      Object localObject = this.c;
      if (localObject != null) {
        bool = true;
      }
      return bool;
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  /* Error */
  void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 157	net/youmi/android/d/a/c:e	()Z
    //   4: ifne +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: invokespecial 159	net/youmi/android/d/a/c:f	()Z
    //   12: ifeq +98 -> 110
    //   15: aload_0
    //   16: invokespecial 161	net/youmi/android/d/a/c:g	()Z
    //   19: istore_1
    //   20: iload_1
    //   21: ifeq +89 -> 110
    //   24: aload_0
    //   25: getfield 40	net/youmi/android/d/a/c:f	Landroid/content/Context;
    //   28: aload_0
    //   29: getfield 74	net/youmi/android/d/a/c:k	Ljava/lang/String;
    //   32: iconst_1
    //   33: invokestatic 167	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   36: invokevirtual 170	android/widget/Toast:show	()V
    //   39: aload_0
    //   40: getfield 136	net/youmi/android/d/a/c:b	Landroid/app/Notification;
    //   43: bipush 16
    //   45: putfield 173	android/app/Notification:flags	I
    //   48: aload_0
    //   49: getfield 136	net/youmi/android/d/a/c:b	Landroid/app/Notification;
    //   52: aload_0
    //   53: getfield 40	net/youmi/android/d/a/c:f	Landroid/content/Context;
    //   56: aload_0
    //   57: getfield 74	net/youmi/android/d/a/c:k	Ljava/lang/String;
    //   60: ldc 175
    //   62: aload_0
    //   63: getfield 151	net/youmi/android/d/a/c:c	Landroid/app/PendingIntent;
    //   66: invokevirtual 179	android/app/Notification:setLatestEventInfo	(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
    //   69: aload_0
    //   70: getfield 136	net/youmi/android/d/a/c:b	Landroid/app/Notification;
    //   73: invokestatic 145	java/lang/System:currentTimeMillis	()J
    //   76: putfield 149	android/app/Notification:when	J
    //   79: aload_0
    //   80: getfield 136	net/youmi/android/d/a/c:b	Landroid/app/Notification;
    //   83: ldc 180
    //   85: putfield 183	android/app/Notification:icon	I
    //   88: aload_0
    //   89: getfield 126	net/youmi/android/d/a/c:e	Landroid/app/NotificationManager;
    //   92: aload_0
    //   93: getfield 42	net/youmi/android/d/a/c:a	I
    //   96: aload_0
    //   97: getfield 136	net/youmi/android/d/a/c:b	Landroid/app/Notification;
    //   100: invokevirtual 187	android/app/NotificationManager:notify	(ILandroid/app/Notification;)V
    //   103: return
    //   104: astore_2
    //   105: return
    //   106: astore_2
    //   107: goto -68 -> 39
    //   110: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	111	0	this	c
    //   19	2	1	bool	boolean
    //   104	1	2	localThrowable1	Throwable
    //   106	1	2	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	7	104	java/lang/Throwable
    //   8	20	104	java/lang/Throwable
    //   39	103	104	java/lang/Throwable
    //   24	39	106	java/lang/Throwable
  }
  
  void a(int paramInt, long paramLong)
  {
    try
    {
      if (!e()) {
        return;
      }
      if ((f()) && (g()))
      {
        StringBuilder localStringBuilder = new StringBuilder(100);
        this.b.flags = 16;
        this.b.setLatestEventInfo(this.f, this.k, c() + paramInt + "% . " + d() + paramLong / 1024L + "KB/s", this.c);
        this.b.icon = 17301633;
        this.e.notify(this.a, this.b);
        return;
      }
    }
    catch (Throwable localThrowable) {}
  }
  
  /* Error */
  void a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 157	net/youmi/android/d/a/c:e	()Z
    //   4: ifne +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: invokespecial 159	net/youmi/android/d/a/c:f	()Z
    //   12: ifeq +94 -> 106
    //   15: aload_0
    //   16: invokespecial 161	net/youmi/android/d/a/c:g	()Z
    //   19: istore_2
    //   20: iload_2
    //   21: ifeq +85 -> 106
    //   24: aload_0
    //   25: getfield 40	net/youmi/android/d/a/c:f	Landroid/content/Context;
    //   28: aload_1
    //   29: iconst_1
    //   30: invokestatic 167	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   33: invokevirtual 170	android/widget/Toast:show	()V
    //   36: aload_0
    //   37: getfield 136	net/youmi/android/d/a/c:b	Landroid/app/Notification;
    //   40: bipush 16
    //   42: putfield 173	android/app/Notification:flags	I
    //   45: aload_0
    //   46: getfield 136	net/youmi/android/d/a/c:b	Landroid/app/Notification;
    //   49: aload_0
    //   50: getfield 40	net/youmi/android/d/a/c:f	Landroid/content/Context;
    //   53: aload_0
    //   54: getfield 78	net/youmi/android/d/a/c:m	Ljava/lang/String;
    //   57: aload_1
    //   58: aload_0
    //   59: getfield 151	net/youmi/android/d/a/c:c	Landroid/app/PendingIntent;
    //   62: invokevirtual 179	android/app/Notification:setLatestEventInfo	(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
    //   65: aload_0
    //   66: getfield 136	net/youmi/android/d/a/c:b	Landroid/app/Notification;
    //   69: invokestatic 145	java/lang/System:currentTimeMillis	()J
    //   72: putfield 149	android/app/Notification:when	J
    //   75: aload_0
    //   76: getfield 136	net/youmi/android/d/a/c:b	Landroid/app/Notification;
    //   79: ldc 218
    //   81: putfield 183	android/app/Notification:icon	I
    //   84: aload_0
    //   85: getfield 126	net/youmi/android/d/a/c:e	Landroid/app/NotificationManager;
    //   88: aload_0
    //   89: getfield 42	net/youmi/android/d/a/c:a	I
    //   92: aload_0
    //   93: getfield 136	net/youmi/android/d/a/c:b	Landroid/app/Notification;
    //   96: invokevirtual 187	android/app/NotificationManager:notify	(ILandroid/app/Notification;)V
    //   99: return
    //   100: astore_1
    //   101: return
    //   102: astore_3
    //   103: goto -67 -> 36
    //   106: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	this	c
    //   0	107	1	paramString	String
    //   19	2	2	bool	boolean
    //   102	1	3	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	7	100	java/lang/Throwable
    //   8	20	100	java/lang/Throwable
    //   36	99	100	java/lang/Throwable
    //   24	36	102	java/lang/Throwable
  }
  
  /* Error */
  void b(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_0
    //   6: invokespecial 157	net/youmi/android/d/a/c:e	()Z
    //   9: ifeq -5 -> 4
    //   12: aload_0
    //   13: invokespecial 159	net/youmi/android/d/a/c:f	()Z
    //   16: ifeq -12 -> 4
    //   19: aload_0
    //   20: aload_1
    //   21: invokespecial 220	net/youmi/android/d/a/c:c	(Ljava/lang/String;)Z
    //   24: istore_2
    //   25: iload_2
    //   26: ifeq -22 -> 4
    //   29: aload_0
    //   30: getfield 40	net/youmi/android/d/a/c:f	Landroid/content/Context;
    //   33: aload_0
    //   34: getfield 82	net/youmi/android/d/a/c:l	Ljava/lang/String;
    //   37: iconst_1
    //   38: invokestatic 167	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   41: invokevirtual 170	android/widget/Toast:show	()V
    //   44: aload_0
    //   45: getfield 136	net/youmi/android/d/a/c:b	Landroid/app/Notification;
    //   48: bipush 16
    //   50: putfield 173	android/app/Notification:flags	I
    //   53: aload_0
    //   54: getfield 136	net/youmi/android/d/a/c:b	Landroid/app/Notification;
    //   57: aload_0
    //   58: getfield 40	net/youmi/android/d/a/c:f	Landroid/content/Context;
    //   61: aload_0
    //   62: getfield 82	net/youmi/android/d/a/c:l	Ljava/lang/String;
    //   65: ldc 222
    //   67: aload_0
    //   68: getfield 118	net/youmi/android/d/a/c:d	Landroid/app/PendingIntent;
    //   71: invokevirtual 179	android/app/Notification:setLatestEventInfo	(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
    //   74: aload_0
    //   75: getfield 136	net/youmi/android/d/a/c:b	Landroid/app/Notification;
    //   78: invokestatic 145	java/lang/System:currentTimeMillis	()J
    //   81: putfield 149	android/app/Notification:when	J
    //   84: aload_0
    //   85: getfield 136	net/youmi/android/d/a/c:b	Landroid/app/Notification;
    //   88: ldc 218
    //   90: putfield 183	android/app/Notification:icon	I
    //   93: aload_0
    //   94: getfield 126	net/youmi/android/d/a/c:e	Landroid/app/NotificationManager;
    //   97: aload_0
    //   98: getfield 42	net/youmi/android/d/a/c:a	I
    //   101: aload_0
    //   102: getfield 136	net/youmi/android/d/a/c:b	Landroid/app/Notification;
    //   105: invokevirtual 187	android/app/NotificationManager:notify	(ILandroid/app/Notification;)V
    //   108: return
    //   109: astore_1
    //   110: return
    //   111: astore_1
    //   112: goto -68 -> 44
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	this	c
    //   0	115	1	paramString	String
    //   24	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   5	25	109	java/lang/Throwable
    //   44	108	109	java/lang/Throwable
    //   29	44	111	java/lang/Throwable
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.a.c
 * JD-Core Version:    0.7.0.1
 */