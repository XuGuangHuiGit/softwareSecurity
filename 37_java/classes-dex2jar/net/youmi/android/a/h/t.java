package net.youmi.android.a.h;

import android.content.Context;
import net.youmi.android.e.a.g;

public class t
{
  private static g a;
  
  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      if (net.youmi.android.c.b.e.b(paramString1) == null) {
        return paramString2;
      }
      paramString1 = net.youmi.android.c.c.e.a(paramString1);
      if (!net.youmi.android.c.b.e.a(paramString1))
      {
        paramContext = a(paramContext).a(paramString1, paramString2);
        return paramContext;
      }
    }
    catch (Throwable paramContext) {}
    return paramString2;
  }
  
  /* Error */
  private static g a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 33	net/youmi/android/a/h/t:a	Lnet/youmi/android/e/a/g;
    //   6: ifnonnull +20 -> 26
    //   9: new 27	net/youmi/android/e/a/g
    //   12: dup
    //   13: aload_0
    //   14: ldc 35
    //   16: aload_0
    //   17: invokestatic 41	net/youmi/android/e/a/d:e	(Landroid/content/Context;)Lnet/youmi/android/e/a/d;
    //   20: invokespecial 45	net/youmi/android/e/a/g:<init>	(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/e/a/d;)V
    //   23: putstatic 33	net/youmi/android/a/h/t:a	Lnet/youmi/android/e/a/g;
    //   26: getstatic 33	net/youmi/android/a/h/t:a	Lnet/youmi/android/e/a/g;
    //   29: astore_0
    //   30: ldc 2
    //   32: monitorexit
    //   33: aload_0
    //   34: areturn
    //   35: astore_0
    //   36: ldc 2
    //   38: monitorexit
    //   39: aload_0
    //   40: athrow
    //   41: astore_0
    //   42: goto -16 -> 26
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	paramContext	Context
    // Exception table:
    //   from	to	target	type
    //   3	26	35	finally
    //   26	30	35	finally
    //   3	26	41	java/lang/Throwable
  }
  
  public static boolean a(Context paramContext, String paramString1, String paramString2, long paramLong)
  {
    try
    {
      if (net.youmi.android.c.b.e.b(paramString1) == null) {
        return false;
      }
      paramString1 = net.youmi.android.c.c.e.a(paramString1);
      if ((!net.youmi.android.c.b.e.a(paramString1)) && (paramString2 != null))
      {
        boolean bool = a(paramContext).a(paramString1, paramString2, paramLong);
        return bool;
      }
    }
    catch (Throwable paramContext) {}
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.t
 * JD-Core Version:    0.7.0.1
 */