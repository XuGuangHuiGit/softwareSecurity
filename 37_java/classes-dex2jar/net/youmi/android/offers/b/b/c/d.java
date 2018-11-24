package net.youmi.android.offers.b.b.c;

import android.content.Context;
import android.content.SharedPreferences;
import net.youmi.android.c.c.a;
import net.youmi.android.c.c.f;

public class d
{
  private static String a = "C306239E75034d979DB1957AC06E4612";
  private static String b = "C6B3C3CCC45547a19B55700AC7C85B9B";
  private static String c = "CEF2F5AD195541b7AD8E8B0E2F44B42D";
  private static d d;
  private Context e;
  
  d(Context paramContext)
  {
    if (paramContext == null) {
      throw new NullPointerException("Context must not be null");
    }
    this.e = paramContext.getApplicationContext();
  }
  
  public static d a(Context paramContext)
  {
    try
    {
      if (d == null) {
        d = new d(paramContext);
      }
      paramContext = d;
      return paramContext;
    }
    finally {}
  }
  
  /* Error */
  private boolean a(Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: invokestatic 59	net/youmi/android/c/c/f:a	()[B
    //   7: astore 6
    //   9: new 61	java/lang/String
    //   12: dup
    //   13: aload 6
    //   15: invokestatic 66	net/youmi/android/c/c/a:a	([B)[B
    //   18: invokespecial 69	java/lang/String:<init>	([B)V
    //   21: astore 5
    //   23: iload_2
    //   24: invokestatic 75	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   27: aload_1
    //   28: invokevirtual 79	android/content/Context:getPackageName	()Ljava/lang/String;
    //   31: invokevirtual 82	java/lang/String:trim	()Ljava/lang/String;
    //   34: aload 6
    //   36: invokestatic 85	net/youmi/android/c/c/f:a	(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;
    //   39: astore 6
    //   41: aload_1
    //   42: getstatic 18	net/youmi/android/offers/b/b/c/d:a	Ljava/lang/String;
    //   45: iconst_0
    //   46: invokevirtual 89	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   49: invokeinterface 95 1 0
    //   54: astore_1
    //   55: aload_1
    //   56: getstatic 22	net/youmi/android/offers/b/b/c/d:b	Ljava/lang/String;
    //   59: aload 6
    //   61: invokeinterface 101 3 0
    //   66: pop
    //   67: aload_1
    //   68: getstatic 26	net/youmi/android/offers/b/b/c/d:c	Ljava/lang/String;
    //   71: aload 5
    //   73: invokeinterface 101 3 0
    //   78: pop
    //   79: aload_1
    //   80: invokeinterface 105 1 0
    //   85: istore 4
    //   87: iload 4
    //   89: istore_3
    //   90: aload_0
    //   91: monitorexit
    //   92: iload_3
    //   93: ireturn
    //   94: astore_1
    //   95: aload_0
    //   96: monitorexit
    //   97: aload_1
    //   98: athrow
    //   99: astore_1
    //   100: goto -10 -> 90
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	103	0	this	d
    //   0	103	1	paramContext	Context
    //   0	103	2	paramInt	int
    //   1	92	3	bool1	boolean
    //   85	3	4	bool2	boolean
    //   21	51	5	str	String
    //   7	53	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	87	94	finally
    //   4	87	99	java/lang/Throwable
  }
  
  private int b(Context paramContext)
  {
    try
    {
      Object localObject = paramContext.getSharedPreferences(a, 0);
      if (localObject != null)
      {
        String str = ((SharedPreferences)localObject).getString(b, null);
        if (str == null) {
          return 0;
        }
        localObject = ((SharedPreferences)localObject).getString(c, null);
        if (localObject != null)
        {
          int i = Integer.parseInt(f.b(str, paramContext.getPackageName().trim(), a.b(((String)localObject).getBytes())));
          return i;
        }
      }
    }
    catch (Throwable paramContext) {}
    return 0;
  }
  
  /* Error */
  public int a()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: aload_0
    //   6: getfield 46	net/youmi/android/offers/b/b/c/d:e	Landroid/content/Context;
    //   9: invokespecial 124	net/youmi/android/offers/b/b/c/d:b	(Landroid/content/Context;)I
    //   12: istore_2
    //   13: iload_2
    //   14: istore_1
    //   15: aload_0
    //   16: monitorexit
    //   17: iload_1
    //   18: ireturn
    //   19: astore_3
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_3
    //   23: athrow
    //   24: astore_3
    //   25: goto -10 -> 15
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	28	0	this	d
    //   1	17	1	i	int
    //   12	2	2	j	int
    //   19	4	3	localObject	Object
    //   24	1	3	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   4	13	19	finally
    //   15	17	19	finally
    //   20	22	19	finally
    //   4	13	24	java/lang/Throwable
  }
  
  /* Error */
  public boolean a(int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iload_1
    //   3: ifgt +5 -> 8
    //   6: iload_3
    //   7: ireturn
    //   8: aload_0
    //   9: aload_0
    //   10: getfield 46	net/youmi/android/offers/b/b/c/d:e	Landroid/content/Context;
    //   13: invokespecial 124	net/youmi/android/offers/b/b/c/d:b	(Landroid/content/Context;)I
    //   16: istore_2
    //   17: iload_2
    //   18: iload_1
    //   19: isub
    //   20: iflt -14 -> 6
    //   23: aload_0
    //   24: aload_0
    //   25: getfield 46	net/youmi/android/offers/b/b/c/d:e	Landroid/content/Context;
    //   28: iload_2
    //   29: iload_1
    //   30: isub
    //   31: invokespecial 127	net/youmi/android/offers/b/b/c/d:a	(Landroid/content/Context;I)Z
    //   34: istore 4
    //   36: iload 4
    //   38: istore_3
    //   39: iload 4
    //   41: ifeq -35 -> 6
    //   44: aload_0
    //   45: getfield 46	net/youmi/android/offers/b/b/c/d:e	Landroid/content/Context;
    //   48: invokestatic 132	net/youmi/android/offers/b/b/c/b:a	(Landroid/content/Context;)Lnet/youmi/android/offers/b/b/c/b;
    //   51: invokevirtual 134	net/youmi/android/offers/b/b/c/b:a	()V
    //   54: iload 4
    //   56: ireturn
    //   57: astore 5
    //   59: iload 4
    //   61: ireturn
    //   62: astore 5
    //   64: aload 5
    //   66: athrow
    //   67: astore 5
    //   69: iconst_0
    //   70: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	this	d
    //   0	71	1	paramInt	int
    //   16	15	2	i	int
    //   1	38	3	bool1	boolean
    //   34	26	4	bool2	boolean
    //   57	1	5	localThrowable1	Throwable
    //   62	3	5	localObject	Object
    //   67	1	5	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   44	54	57	java/lang/Throwable
    //   8	17	62	finally
    //   23	36	62	finally
    //   8	17	67	java/lang/Throwable
    //   23	36	67	java/lang/Throwable
  }
  
  /* Error */
  public boolean b(int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: iload_1
    //   4: ifgt +6 -> 10
    //   7: iload 4
    //   9: ireturn
    //   10: aload_0
    //   11: aload_0
    //   12: getfield 46	net/youmi/android/offers/b/b/c/d:e	Landroid/content/Context;
    //   15: invokespecial 124	net/youmi/android/offers/b/b/c/d:b	(Landroid/content/Context;)I
    //   18: istore_3
    //   19: iload_3
    //   20: istore_2
    //   21: iload_3
    //   22: ifge +5 -> 27
    //   25: iconst_0
    //   26: istore_2
    //   27: aload_0
    //   28: aload_0
    //   29: getfield 46	net/youmi/android/offers/b/b/c/d:e	Landroid/content/Context;
    //   32: iload_2
    //   33: iload_1
    //   34: iadd
    //   35: invokespecial 127	net/youmi/android/offers/b/b/c/d:a	(Landroid/content/Context;I)Z
    //   38: istore 5
    //   40: iload 5
    //   42: istore 4
    //   44: iload 5
    //   46: ifeq -39 -> 7
    //   49: aload_0
    //   50: getfield 46	net/youmi/android/offers/b/b/c/d:e	Landroid/content/Context;
    //   53: invokestatic 132	net/youmi/android/offers/b/b/c/b:a	(Landroid/content/Context;)Lnet/youmi/android/offers/b/b/c/b;
    //   56: invokevirtual 134	net/youmi/android/offers/b/b/c/b:a	()V
    //   59: iload 5
    //   61: ireturn
    //   62: astore 6
    //   64: iload 5
    //   66: ireturn
    //   67: astore 6
    //   69: aload 6
    //   71: athrow
    //   72: astore 6
    //   74: iconst_0
    //   75: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	d
    //   0	76	1	paramInt	int
    //   20	15	2	i	int
    //   18	4	3	j	int
    //   1	42	4	bool1	boolean
    //   38	27	5	bool2	boolean
    //   62	1	6	localThrowable1	Throwable
    //   67	3	6	localObject	Object
    //   72	1	6	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   49	59	62	java/lang/Throwable
    //   10	19	67	finally
    //   27	40	67	finally
    //   10	19	72	java/lang/Throwable
    //   27	40	72	java/lang/Throwable
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.b.b.c.d
 * JD-Core Version:    0.7.0.1
 */