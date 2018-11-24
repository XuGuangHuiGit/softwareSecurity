package net.youmi.android.d.a;

import net.youmi.android.a.a.b;
import net.youmi.android.a.a.c;

public class i
  extends b
{
  private static i a;
  
  /* Error */
  public static i b()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 17	net/youmi/android/d/a/i:a	Lnet/youmi/android/d/a/i;
    //   6: ifnonnull +13 -> 19
    //   9: new 2	net/youmi/android/d/a/i
    //   12: dup
    //   13: invokespecial 18	net/youmi/android/d/a/i:<init>	()V
    //   16: putstatic 17	net/youmi/android/d/a/i:a	Lnet/youmi/android/d/a/i;
    //   19: getstatic 17	net/youmi/android/d/a/i:a	Lnet/youmi/android/d/a/i;
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
    //   22	5	0	locali	i
    //   28	5	0	localObject	java.lang.Object
    //   34	1	0	localThrowable	java.lang.Throwable
    // Exception table:
    //   from	to	target	type
    //   3	19	28	finally
    //   19	23	28	finally
    //   3	19	34	java/lang/Throwable
  }
  
  protected c a()
  {
    return new h();
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.a.i
 * JD-Core Version:    0.7.0.1
 */