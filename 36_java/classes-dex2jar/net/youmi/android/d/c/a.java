package net.youmi.android.d.c;

import android.content.Context;
import net.youmi.android.c.c.g;
import net.youmi.android.c.g.e;

public class a
{
  private static String a()
  {
    try
    {
      String str = g.b("3c5641545e", "yKl76nGU1e7a");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  public static void a(Context paramContext)
  {
    if (paramContext == null) {}
    for (;;)
    {
      return;
      try
      {
        b(paramContext);
      }
      catch (Throwable localThrowable2)
      {
        try
        {
          label9:
          net.youmi.android.d.d.a.b.a(paramContext);
        }
        catch (Throwable localThrowable2)
        {
          try
          {
            new c(paramContext).start();
            try
            {
              label24:
              new d(paramContext).start();
              try
              {
                label35:
                e.a(paramContext);
                if ((e.a != null) && (!e.a.equals(""))) {
                  continue;
                }
                new b(paramContext).start();
                return;
              }
              catch (Throwable paramContext)
              {
                return;
              }
              localThrowable1 = localThrowable1;
              break label9;
              localThrowable2 = localThrowable2;
            }
            catch (Throwable localThrowable3)
            {
              break label35;
            }
          }
          catch (Throwable localThrowable4)
          {
            break label24;
          }
        }
      }
    }
  }
  
  /* Error */
  private static void b(Context paramContext)
  {
    // Byte code:
    //   0: ldc 59
    //   2: iconst_0
    //   3: anewarray 4	java/lang/Object
    //   6: invokestatic 64	net/youmi/android/c/e/a:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   9: ldc 66
    //   11: iconst_2
    //   12: anewarray 4	java/lang/Object
    //   15: dup
    //   16: iconst_0
    //   17: invokestatic 68	net/youmi/android/d/c/a:a	()Ljava/lang/String;
    //   20: aastore
    //   21: dup
    //   22: iconst_1
    //   23: ldc 70
    //   25: aastore
    //   26: invokestatic 64	net/youmi/android/c/e/a:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   29: ldc 72
    //   31: iconst_1
    //   32: anewarray 4	java/lang/Object
    //   35: dup
    //   36: iconst_0
    //   37: aload_0
    //   38: invokestatic 77	net/youmi/android/b/b/a:a	(Landroid/content/Context;)Ljava/lang/String;
    //   41: aastore
    //   42: invokestatic 64	net/youmi/android/c/e/a:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   45: ldc 79
    //   47: iconst_1
    //   48: anewarray 4	java/lang/Object
    //   51: dup
    //   52: iconst_0
    //   53: aload_0
    //   54: invokestatic 81	net/youmi/android/b/b/a:b	(Landroid/content/Context;)Ljava/lang/String;
    //   57: aastore
    //   58: invokestatic 64	net/youmi/android/c/e/a:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   61: ldc 83
    //   63: iconst_1
    //   64: anewarray 4	java/lang/Object
    //   67: dup
    //   68: iconst_0
    //   69: aload_0
    //   70: invokestatic 86	net/youmi/android/c/k/h:a	(Landroid/content/Context;)Ljava/lang/String;
    //   73: aastore
    //   74: invokestatic 64	net/youmi/android/c/e/a:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   77: ldc 88
    //   79: iconst_1
    //   80: anewarray 4	java/lang/Object
    //   83: dup
    //   84: iconst_0
    //   85: aload_0
    //   86: invokevirtual 93	android/content/Context:getPackageName	()Ljava/lang/String;
    //   89: aastore
    //   90: invokestatic 64	net/youmi/android/c/e/a:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   93: ldc 95
    //   95: iconst_1
    //   96: anewarray 4	java/lang/Object
    //   99: dup
    //   100: iconst_0
    //   101: aload_0
    //   102: invokestatic 99	net/youmi/android/b/b/a:e	(Landroid/content/Context;)I
    //   105: invokestatic 105	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   108: aastore
    //   109: invokestatic 64	net/youmi/android/c/e/a:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   112: ldc 107
    //   114: iconst_1
    //   115: anewarray 4	java/lang/Object
    //   118: dup
    //   119: iconst_0
    //   120: aload_0
    //   121: invokestatic 110	net/youmi/android/b/b/a:d	(Landroid/content/Context;)Ljava/lang/String;
    //   124: aastore
    //   125: invokestatic 64	net/youmi/android/c/e/a:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   128: aload_0
    //   129: invokestatic 113	net/youmi/android/b/b/a:f	(Landroid/content/Context;)I
    //   132: istore_1
    //   133: iload_1
    //   134: ifle +19 -> 153
    //   137: ldc 115
    //   139: iconst_1
    //   140: anewarray 4	java/lang/Object
    //   143: dup
    //   144: iconst_0
    //   145: iload_1
    //   146: invokestatic 105	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   149: aastore
    //   150: invokestatic 64	net/youmi/android/c/e/a:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   153: ldc 117
    //   155: iconst_1
    //   156: anewarray 4	java/lang/Object
    //   159: dup
    //   160: iconst_0
    //   161: invokestatic 120	net/youmi/android/b/b/a:b	()Z
    //   164: invokestatic 126	java/lang/Boolean:toString	(Z)Ljava/lang/String;
    //   167: aastore
    //   168: invokestatic 64	net/youmi/android/c/e/a:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   171: ldc 128
    //   173: iconst_1
    //   174: anewarray 4	java/lang/Object
    //   177: dup
    //   178: iconst_0
    //   179: ldc 129
    //   181: invokestatic 105	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   184: aastore
    //   185: invokestatic 64	net/youmi/android/c/e/a:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   188: return
    //   189: astore_0
    //   190: return
    //   191: astore_0
    //   192: return
    //   193: astore_0
    //   194: goto -23 -> 171
    //   197: astore_0
    //   198: goto -45 -> 153
    //   201: astore_2
    //   202: goto -74 -> 128
    //   205: astore_2
    //   206: goto -129 -> 77
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	209	0	paramContext	Context
    //   132	14	1	i	int
    //   201	1	2	localThrowable1	Throwable
    //   205	1	2	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	61	189	java/lang/Throwable
    //   171	188	191	java/lang/Throwable
    //   153	171	193	java/lang/Throwable
    //   128	133	197	java/lang/Throwable
    //   137	153	197	java/lang/Throwable
    //   77	128	201	java/lang/Throwable
    //   61	77	205	java/lang/Throwable
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.c.a
 * JD-Core Version:    0.7.0.1
 */