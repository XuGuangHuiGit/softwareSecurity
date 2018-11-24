package net.youmi.android.e.b.a;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import net.youmi.android.c.l.a;
import net.youmi.android.e.b.e;
import net.youmi.android.e.b.f;

class d
  extends a
{
  private static d a;
  private static int b = 0;
  private int c = 0;
  private HashMap d = new HashMap();
  
  private d()
  {
    b += 1;
    this.c = b;
  }
  
  /* Error */
  public static d a()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 31	net/youmi/android/e/b/a/d:a	Lnet/youmi/android/e/b/a/d;
    //   6: ifnonnull +13 -> 19
    //   9: new 2	net/youmi/android/e/b/a/d
    //   12: dup
    //   13: invokespecial 32	net/youmi/android/e/b/a/d:<init>	()V
    //   16: putstatic 31	net/youmi/android/e/b/a/d:a	Lnet/youmi/android/e/b/a/d;
    //   19: getstatic 31	net/youmi/android/e/b/a/d:a	Lnet/youmi/android/e/b/a/d;
    //   22: astore_0
    //   23: ldc 2
    //   25: monitorexit
    //   26: aload_0
    //   27: areturn
    //   28: astore_0
    //   29: ldc 2
    //   31: monitorexit
    //   32: aload_0
    //   33: athrow
    //   34: astore_0
    //   35: goto -16 -> 19
    // Local variable table:
    //   start	length	slot	name	signature
    //   22	5	0	locald	d
    //   28	5	0	localObject	java.lang.Object
    //   34	1	0	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   3	19	28	finally
    //   19	23	28	finally
    //   3	19	34	java/lang/Throwable
  }
  
  private void a(net.youmi.android.e.b.b paramb, j paramj)
  {
    try
    {
      paramj.execute(new Void[0]);
      return;
    }
    catch (Throwable paramb) {}
  }
  
  void a(net.youmi.android.e.b.b paramb)
  {
    try
    {
      List localList = b();
      int i = 0;
      for (;;)
      {
        int j = localList.size();
        if (i < j) {
          try
          {
            ((f)localList.get(i)).h(paramb);
            i += 1;
          }
          catch (Throwable localThrowable)
          {
            for (;;)
            {
              net.youmi.android.c.e.b.b(localThrowable);
            }
          }
        }
      }
      return;
    }
    catch (Throwable paramb) {}
  }
  
  void a(net.youmi.android.e.b.b paramb, long paramLong1, long paramLong2, int paramInt, long paramLong3)
  {
    try
    {
      List localList = b();
      int i = 0;
      for (;;)
      {
        int j = localList.size();
        if (i < j) {
          try
          {
            ((f)localList.get(i)).a(paramb, paramLong1, paramLong2, paramInt, paramLong3);
            i += 1;
          }
          catch (Throwable localThrowable)
          {
            for (;;)
            {
              net.youmi.android.c.e.b.b(localThrowable);
            }
          }
        }
      }
      return;
    }
    catch (Throwable paramb) {}
  }
  
  void a(net.youmi.android.e.b.b paramb, File paramFile)
  {
    try
    {
      List localList = b();
      int i = 0;
      for (;;)
      {
        int j = localList.size();
        if (i < j) {
          try
          {
            ((f)localList.get(i)).d(paramb, paramFile);
            i += 1;
          }
          catch (Throwable localThrowable)
          {
            for (;;)
            {
              net.youmi.android.c.e.b.b(localThrowable);
            }
          }
        }
      }
      this.d.remove(paramb);
      return;
    }
    catch (Throwable paramb) {}
  }
  
  public boolean a(Context paramContext, net.youmi.android.e.b.b paramb, File paramFile, e parame)
  {
    if (paramb == null) {}
    for (;;)
    {
      return false;
      try
      {
        if (paramb.c())
        {
          if (this.d.containsKey(paramb)) {
            return true;
          }
          paramContext = new j(paramContext, paramb, paramFile, parame);
          this.d.put(paramb, paramContext);
          a(paramb, paramContext);
          return true;
        }
      }
      catch (Throwable paramContext) {}
    }
    return false;
  }
  
  void b(net.youmi.android.e.b.b paramb)
  {
    try
    {
      List localList = b();
      int i = 0;
      for (;;)
      {
        int j = localList.size();
        if (i < j) {
          try
          {
            ((f)localList.get(i)).i(paramb);
            i += 1;
          }
          catch (Throwable localThrowable)
          {
            for (;;)
            {
              net.youmi.android.c.e.b.b(localThrowable);
            }
          }
        }
      }
      this.d.remove(paramb);
      return;
    }
    catch (Throwable paramb) {}
  }
  
  void b(net.youmi.android.e.b.b paramb, File paramFile)
  {
    try
    {
      List localList = b();
      int i = 0;
      for (;;)
      {
        int j = localList.size();
        if (i < j) {
          try
          {
            ((f)localList.get(i)).e(paramb, paramFile);
            i += 1;
          }
          catch (Throwable localThrowable)
          {
            for (;;)
            {
              net.youmi.android.c.e.b.b(localThrowable);
            }
          }
        }
      }
      this.d.remove(paramb);
      return;
    }
    catch (Throwable paramb) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.e.b.a.d
 * JD-Core Version:    0.7.0.1
 */