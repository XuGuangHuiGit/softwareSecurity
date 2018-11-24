package net.youmi.android.c.j;

import android.os.Handler;
import android.os.Looper;

public class a
{
  private static a a;
  private Handler b = new Handler(Looper.getMainLooper());
  
  /* Error */
  public static a a()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 31	net/youmi/android/c/j/a:a	Lnet/youmi/android/c/j/a;
    //   6: ifnonnull +13 -> 19
    //   9: new 2	net/youmi/android/c/j/a
    //   12: dup
    //   13: invokespecial 32	net/youmi/android/c/j/a:<init>	()V
    //   16: putstatic 31	net/youmi/android/c/j/a:a	Lnet/youmi/android/c/j/a;
    //   19: getstatic 31	net/youmi/android/c/j/a:a	Lnet/youmi/android/c/j/a;
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
    //   22	5	0	locala	a
    //   28	5	0	localObject	Object
    //   34	1	0	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   3	19	28	finally
    //   19	23	28	finally
    //   3	19	34	java/lang/Throwable
  }
  
  public static boolean b()
  {
    boolean bool = false;
    try
    {
      Looper localLooper1 = Looper.myLooper();
      Looper localLooper2 = Looper.getMainLooper();
      if (localLooper1 == localLooper2) {
        bool = true;
      }
      return bool;
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public boolean a(Runnable paramRunnable)
  {
    if (paramRunnable == null) {
      return false;
    }
    try
    {
      boolean bool = this.b.post(paramRunnable);
      return bool;
    }
    catch (Throwable paramRunnable) {}
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.j.a
 * JD-Core Version:    0.7.0.1
 */