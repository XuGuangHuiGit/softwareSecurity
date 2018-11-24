package net.youmi.android.offers.d;

public class f
{
  g a;
  private a b;
  
  public f(a parama)
  {
    this.b = parama;
  }
  
  public void a()
  {
    try
    {
      if (this.a != null)
      {
        this.a.a();
        this.a = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 18	net/youmi/android/offers/d/f:a	Lnet/youmi/android/offers/d/g;
    //   6: ifnull +10 -> 16
    //   9: aload_0
    //   10: getfield 18	net/youmi/android/offers/d/f:a	Lnet/youmi/android/offers/d/g;
    //   13: invokevirtual 22	net/youmi/android/offers/d/g:a	()V
    //   16: aload_0
    //   17: new 20	net/youmi/android/offers/d/g
    //   20: dup
    //   21: aload_0
    //   22: getfield 15	net/youmi/android/offers/d/f:b	Lnet/youmi/android/offers/d/a;
    //   25: invokespecial 26	net/youmi/android/offers/d/g:<init>	(Lnet/youmi/android/offers/d/a;)V
    //   28: putfield 18	net/youmi/android/offers/d/f:a	Lnet/youmi/android/offers/d/g;
    //   31: aload_0
    //   32: getfield 18	net/youmi/android/offers/d/f:a	Lnet/youmi/android/offers/d/g;
    //   35: invokevirtual 29	net/youmi/android/offers/d/g:start	()V
    //   38: aload_0
    //   39: monitorexit
    //   40: return
    //   41: astore_1
    //   42: aload_0
    //   43: monitorexit
    //   44: aload_1
    //   45: athrow
    //   46: astore_1
    //   47: goto -9 -> 38
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	50	0	this	f
    //   41	4	1	localObject	Object
    //   46	1	1	localThrowable	java.lang.Throwable
    // Exception table:
    //   from	to	target	type
    //   2	16	41	finally
    //   16	38	41	finally
    //   2	16	46	java/lang/Throwable
    //   16	38	46	java/lang/Throwable
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.d.f
 * JD-Core Version:    0.7.0.1
 */