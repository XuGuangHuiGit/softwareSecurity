package net.youmi.android.a.e.a;

import android.content.Context;
import net.youmi.android.a.d.a;
import net.youmi.android.e.a.f;

public class c
  extends f
{
  private static c a;
  
  public c(Context paramContext)
  {
    super(paramContext, "dTW3KThJ", a.c(paramContext));
  }
  
  /* Error */
  public static c a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 25	net/youmi/android/a/e/a/c:a	Lnet/youmi/android/a/e/a/c;
    //   6: ifnonnull +14 -> 20
    //   9: new 2	net/youmi/android/a/e/a/c
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 27	net/youmi/android/a/e/a/c:<init>	(Landroid/content/Context;)V
    //   17: putstatic 25	net/youmi/android/a/e/a/c:a	Lnet/youmi/android/a/e/a/c;
    //   20: getstatic 25	net/youmi/android/a/e/a/c:a	Lnet/youmi/android/a/e/a/c;
    //   23: astore_0
    //   24: ldc 2
    //   26: monitorexit
    //   27: aload_0
    //   28: areturn
    //   29: astore_0
    //   30: ldc 2
    //   32: monitorexit
    //   33: aload_0
    //   34: athrow
    //   35: astore_0
    //   36: goto -16 -> 20
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	paramContext	Context
    // Exception table:
    //   from	to	target	type
    //   3	20	29	finally
    //   20	24	29	finally
    //   3	20	35	java/lang/Throwable
  }
  
  public String a(String paramString1, String paramString2)
  {
    try
    {
      b localb = new b(paramString1);
      paramString1 = paramString2;
      if (b(localb))
      {
        paramString1 = paramString2;
        if (localb.a() != null) {
          paramString1 = localb.a();
        }
      }
      return paramString1;
    }
    catch (Throwable paramString1) {}
    return paramString2;
  }
  
  public boolean a(String paramString1, String paramString2, long paramLong)
  {
    try
    {
      paramString1 = new b(paramString1);
      paramString1.a(paramString2);
      paramString1.a(paramLong);
      boolean bool = a(paramString1);
      return bool;
    }
    catch (Throwable paramString1) {}
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.e.a.c
 * JD-Core Version:    0.7.0.1
 */