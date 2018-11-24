package net.youmi.android.a.a;

import android.content.Context;
import net.youmi.android.e.a.f;

public class d
  extends f
{
  private static d a;
  
  public d(Context paramContext)
  {
    super(paramContext, "aJoW5pml", net.youmi.android.a.d.a.a(paramContext));
  }
  
  /* Error */
  public static d a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 24	net/youmi/android/a/a/d:a	Lnet/youmi/android/a/a/d;
    //   6: ifnonnull +14 -> 20
    //   9: new 2	net/youmi/android/a/a/d
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 26	net/youmi/android/a/a/d:<init>	(Landroid/content/Context;)V
    //   17: putstatic 24	net/youmi/android/a/a/d:a	Lnet/youmi/android/a/a/d;
    //   20: getstatic 24	net/youmi/android/a/a/d:a	Lnet/youmi/android/a/a/d;
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
  
  public a a(Context paramContext, String paramString, b paramb)
  {
    try
    {
      paramContext = new a(paramString, paramb);
      boolean bool = b(paramContext);
      if (bool) {
        return paramContext;
      }
    }
    catch (Throwable paramContext) {}
    return null;
  }
  
  public boolean a(Context paramContext, a parama)
  {
    try
    {
      boolean bool = a(parama);
      return bool;
    }
    catch (Throwable paramContext) {}
    return false;
  }
  
  public boolean a(String paramString)
  {
    try
    {
      boolean bool = c(a.e(paramString));
      return bool;
    }
    catch (Throwable paramString) {}
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.a.d
 * JD-Core Version:    0.7.0.1
 */