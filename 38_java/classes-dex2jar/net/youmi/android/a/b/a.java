package net.youmi.android.a.b;

import android.content.Context;
import net.youmi.android.e.a.f;
import net.youmi.android.e.a.g;

public class a
{
  private static g a;
  private static f b;
  
  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      a(paramContext);
      paramContext = a.a(paramString1, paramString2);
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return paramString2;
  }
  
  /* Error */
  private static void a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 16	net/youmi/android/a/b/a:a	Lnet/youmi/android/e/a/g;
    //   6: ifnonnull +37 -> 43
    //   9: new 18	net/youmi/android/e/a/g
    //   12: dup
    //   13: aload_0
    //   14: ldc 24
    //   16: aload_0
    //   17: invokestatic 30	net/youmi/android/e/a/d:d	(Landroid/content/Context;)Lnet/youmi/android/e/a/d;
    //   20: invokespecial 34	net/youmi/android/e/a/g:<init>	(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/e/a/d;)V
    //   23: putstatic 16	net/youmi/android/a/b/a:a	Lnet/youmi/android/e/a/g;
    //   26: new 36	net/youmi/android/e/a/f
    //   29: dup
    //   30: aload_0
    //   31: ldc 24
    //   33: aload_0
    //   34: invokestatic 30	net/youmi/android/e/a/d:d	(Landroid/content/Context;)Lnet/youmi/android/e/a/d;
    //   37: invokespecial 37	net/youmi/android/e/a/f:<init>	(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/e/a/d;)V
    //   40: putstatic 39	net/youmi/android/a/b/a:b	Lnet/youmi/android/e/a/f;
    //   43: ldc 2
    //   45: monitorexit
    //   46: return
    //   47: astore_0
    //   48: ldc 2
    //   50: monitorexit
    //   51: aload_0
    //   52: athrow
    //   53: astore_0
    //   54: goto -11 -> 43
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	paramContext	Context
    // Exception table:
    //   from	to	target	type
    //   3	43	47	finally
    //   3	43	53	java/lang/Throwable
  }
  
  public static boolean a(Context paramContext, String paramString1, String paramString2, long paramLong)
  {
    try
    {
      a(paramContext);
      boolean bool = a.a(paramString1, paramString2, paramLong);
      return bool;
    }
    catch (Throwable paramContext) {}
    return false;
  }
  
  public static boolean a(Context paramContext, String paramString, boolean paramBoolean)
  {
    try
    {
      a(paramContext);
      paramContext = a.a(paramString, null);
      if (paramContext == null) {
        return paramBoolean;
      }
      if ("1".equals(paramContext)) {
        return true;
      }
      boolean bool = "0".equals(paramContext);
      if (bool) {
        return false;
      }
    }
    catch (Throwable paramContext) {}
    return paramBoolean;
  }
  
  public static boolean a(Context paramContext, String paramString, boolean paramBoolean, long paramLong)
  {
    try
    {
      a(paramContext);
      if (paramBoolean) {}
      for (paramContext = "1";; paramContext = "0") {
        return a.a(paramString, paramContext, paramLong);
      }
      return false;
    }
    catch (Throwable paramContext) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.b.a
 * JD-Core Version:    0.7.0.1
 */