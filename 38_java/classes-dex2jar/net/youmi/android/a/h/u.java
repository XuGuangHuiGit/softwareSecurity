package net.youmi.android.a.h;

import android.content.Context;
import net.youmi.android.c.c.e;
import net.youmi.android.e.a.f;

public class u
{
  private static f a;
  
  public static String a(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (paramString == null)) {}
    for (;;)
    {
      return null;
      try
      {
        paramString = new q(e.a(paramString));
        if (a(paramContext).b(paramString))
        {
          paramContext = paramString.a();
          return paramContext;
        }
      }
      catch (Throwable paramContext) {}
    }
    return null;
  }
  
  /* Error */
  private static f a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 35	net/youmi/android/a/h/u:a	Lnet/youmi/android/e/a/f;
    //   6: ifnonnull +21 -> 27
    //   9: new 25	net/youmi/android/e/a/f
    //   12: dup
    //   13: aload_0
    //   14: ldc 37
    //   16: aload_0
    //   17: invokestatic 43	net/youmi/android/e/a/d:f	(Landroid/content/Context;)Lnet/youmi/android/e/a/d;
    //   20: iconst_0
    //   21: invokespecial 46	net/youmi/android/e/a/f:<init>	(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/e/a/d;I)V
    //   24: putstatic 35	net/youmi/android/a/h/u:a	Lnet/youmi/android/e/a/f;
    //   27: getstatic 35	net/youmi/android/a/h/u:a	Lnet/youmi/android/e/a/f;
    //   30: astore_0
    //   31: ldc 2
    //   33: monitorexit
    //   34: aload_0
    //   35: areturn
    //   36: astore_0
    //   37: ldc 2
    //   39: monitorexit
    //   40: aload_0
    //   41: athrow
    //   42: astore_0
    //   43: goto -16 -> 27
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	paramContext	Context
    // Exception table:
    //   from	to	target	type
    //   3	27	36	finally
    //   27	31	36	finally
    //   3	27	42	java/lang/Throwable
  }
  
  public static boolean a(Context paramContext, String paramString1, String paramString2, long paramLong)
  {
    if ((paramContext == null) || (paramString1 == null) || (paramString2 == null)) {
      return false;
    }
    try
    {
      paramString1 = new q(e.a(paramString1), paramLong);
      paramString1.a(paramString2);
      boolean bool = a(paramContext).a(paramString1);
      return bool;
    }
    catch (Throwable paramContext) {}
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.u
 * JD-Core Version:    0.7.0.1
 */