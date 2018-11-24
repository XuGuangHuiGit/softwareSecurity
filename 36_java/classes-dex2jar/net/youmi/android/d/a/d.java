package net.youmi.android.d.a;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import net.youmi.android.a.h.i;
import net.youmi.android.c.h.j;
import net.youmi.android.c.k.k;
import net.youmi.android.e.b.b;

class d
  implements net.youmi.android.e.b.c
{
  private a a;
  private Context b;
  private HashMap c = new HashMap();
  
  d(Context paramContext, a parama)
  {
    this.b = paramContext.getApplicationContext();
    this.a = parama;
  }
  
  /* Error */
  public static void a(Context paramContext, int paramInt, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 38
    //   3: invokevirtual 42	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   6: checkcast 44	android/app/NotificationManager
    //   9: astore 5
    //   11: aload 5
    //   13: iload_1
    //   14: invokevirtual 48	android/app/NotificationManager:cancel	(I)V
    //   17: aload_0
    //   18: aload_2
    //   19: invokestatic 53	net/youmi/android/c/k/f:a	(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    //   22: astore 6
    //   24: aload_0
    //   25: aload_2
    //   26: invokestatic 58	net/youmi/android/c/k/h:b	(Landroid/content/Context;Ljava/lang/String;)Lnet/youmi/android/c/k/a;
    //   29: invokevirtual 63	net/youmi/android/c/k/a:a	()Ljava/lang/String;
    //   32: astore_2
    //   33: aload_0
    //   34: iload_1
    //   35: aload 6
    //   37: ldc 64
    //   39: invokestatic 70	android/app/PendingIntent:getActivity	(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //   42: astore 6
    //   44: ldc 71
    //   46: istore_3
    //   47: aload_0
    //   48: aload_0
    //   49: invokevirtual 74	android/content/Context:getPackageName	()Ljava/lang/String;
    //   52: invokestatic 58	net/youmi/android/c/k/h:b	(Landroid/content/Context;Ljava/lang/String;)Lnet/youmi/android/c/k/a;
    //   55: invokevirtual 77	net/youmi/android/c/k/a:c	()I
    //   58: istore 4
    //   60: iload 4
    //   62: istore_3
    //   63: new 79	android/app/Notification
    //   66: dup
    //   67: invokespecial 80	android/app/Notification:<init>	()V
    //   70: astore 7
    //   72: aload 7
    //   74: bipush 16
    //   76: putfield 84	android/app/Notification:flags	I
    //   79: aload 7
    //   81: invokestatic 90	java/lang/System:currentTimeMillis	()J
    //   84: putfield 94	android/app/Notification:when	J
    //   87: aload 7
    //   89: ldc 96
    //   91: putfield 100	android/app/Notification:tickerText	Ljava/lang/CharSequence;
    //   94: aload 7
    //   96: iload_3
    //   97: putfield 103	android/app/Notification:icon	I
    //   100: aload 7
    //   102: aload_0
    //   103: aload_2
    //   104: ldc 96
    //   106: aload 6
    //   108: invokevirtual 107	android/app/Notification:setLatestEventInfo	(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
    //   111: aload 5
    //   113: iload_1
    //   114: aload 7
    //   116: invokevirtual 111	android/app/NotificationManager:notify	(ILandroid/app/Notification;)V
    //   119: return
    //   120: astore_2
    //   121: ldc 113
    //   123: astore_2
    //   124: goto -91 -> 33
    //   127: astore 6
    //   129: goto -112 -> 17
    //   132: astore_0
    //   133: return
    //   134: astore 7
    //   136: goto -73 -> 63
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	139	0	paramContext	Context
    //   0	139	1	paramInt	int
    //   0	139	2	paramString	String
    //   46	51	3	i	int
    //   58	3	4	j	int
    //   9	103	5	localNotificationManager	android.app.NotificationManager
    //   22	85	6	localObject	Object
    //   127	1	6	localThrowable1	Throwable
    //   70	45	7	localNotification	android.app.Notification
    //   134	1	7	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   24	33	120	java/lang/Throwable
    //   11	17	127	java/lang/Throwable
    //   0	11	132	java/lang/Throwable
    //   17	24	132	java/lang/Throwable
    //   33	44	132	java/lang/Throwable
    //   63	119	132	java/lang/Throwable
    //   47	60	134	java/lang/Throwable
  }
  
  public static int c(b paramb)
  {
    if (paramb != null) {
      try
      {
        int i = paramb.a().hashCode();
        return i;
      }
      catch (Throwable paramb) {}
    }
    return 0;
  }
  
  private c d(b paramb)
  {
    do
    {
      try
      {
        if (this.a != null) {
          continue;
        }
        return null;
      }
      catch (Throwable paramb)
      {
        String str;
        i locali;
        return null;
      }
      str = paramb.f();
      if (str == null) {
        return null;
      }
      locali = this.a.e(paramb);
      if (locali == null) {
        return null;
      }
      if (this.c.containsKey(str)) {
        return (c)this.c.get(str);
      }
      paramb = new c(this.b, locali, c(paramb));
      this.c.put(str, paramb);
      return paramb;
    } while (paramb != null);
    return null;
  }
  
  public void a(b paramb)
  {
    try
    {
      c localc = d(paramb);
      if (localc == null) {
        return;
      }
      if (j.a(this.b))
      {
        long l2 = paramb.d();
        long l1 = l2;
        if (l2 <= 0L) {
          l1 = 10485760L;
        }
        if (k.a(this.b, l1))
        {
          localc.a("下载失败,无法连接服务器");
          return;
        }
        localc.a("下载失败，请检查存储空间是否足够");
        return;
      }
      localc.a("下载失败,请检查网络设置");
      return;
    }
    catch (Throwable paramb) {}
  }
  
  public void a(b paramb, long paramLong1, long paramLong2, int paramInt, long paramLong3)
  {
    try
    {
      paramb = d(paramb);
      if (paramb == null) {
        return;
      }
      paramb.a(paramInt, paramLong3);
      return;
    }
    catch (Throwable paramb) {}
  }
  
  public void a(b paramb, File paramFile)
  {
    try
    {
      paramb = d(paramb);
      if (paramb == null) {
        return;
      }
      if ((paramFile != null) && (paramFile.getPath() != null) && (paramFile.exists()))
      {
        paramb.b(paramFile.getPath());
        return;
      }
    }
    catch (Throwable paramb) {}
  }
  
  public void b(b paramb)
  {
    try
    {
      paramb = d(paramb);
      if (paramb == null) {
        return;
      }
      paramb.a();
      return;
    }
    catch (Throwable paramb) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.a.d
 * JD-Core Version:    0.7.0.1
 */